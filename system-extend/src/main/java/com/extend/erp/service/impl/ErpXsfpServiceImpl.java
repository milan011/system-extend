package com.extend.erp.service.impl;

import java.util.List;
import cn.hutool.core.convert.Convert;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.extend.erp.convert.ErpXsfpConvert;
import com.extend.erp.domain.ErpXsfpImport;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.extend.erp.domain.ErpXsfpmx;
import com.extend.erp.mapper.ErpXsfpMapper;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.service.IErpXsfpService;

/**
 * 销售发票Service业务层处理
 *
 * @author wcg
 * @date 2023-10-13
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class ErpXsfpServiceImpl implements IErpXsfpService
{
  @Autowired
  private ErpXsfpMapper erpXsfpMapper;

  /**
   * 查询销售发票
   *
   * @param xsfpFpls 销售发票主键
   * @return 销售发票
   */
  @Override
  public ErpXsfp selectErpXsfpByXsfpFpls(String xsfpFpls)
  {
    return erpXsfpMapper.selectErpXsfpByXsfpFpls(xsfpFpls);
  }

  /**
   * 查询销售发票列表
   *
   * @param erpXsfp 销售发票
   * @return 销售发票
   */
  @Override
  public List<ErpXsfp> selectErpXsfpList(ErpXsfp erpXsfp)
  {
    return erpXsfpMapper.selectErpXsfpList(erpXsfp);
  }


  @Override
  public ErpXsfp getXsfpInfo(){
    return erpXsfpMapper.getXsfpInfo();

  }

  /**
   * 新增销售发票
   *
   * @param erpXsfp 销售发票
   * @return 结果
   */
  @Transactional
  @Override
  public int insertErpXsfp(ErpXsfp erpXsfp)
  {
    int rows = erpXsfpMapper.insertErpXsfp(erpXsfp);
    insertErpXsfpmx(erpXsfp);
    return rows;
  }

  /**
   * 修改销售发票
   *
   * @param erpXsfp 销售发票
   * @return 结果
   */
  @Transactional
  @Override
  public int updateErpXsfp(ErpXsfp erpXsfp)
  {
    erpXsfpMapper.deleteErpXsfpmxByXsfpmxFpls(erpXsfp.getXsfpFpls());
    insertErpXsfpmx(erpXsfp);
    return erpXsfpMapper.updateErpXsfp(erpXsfp);
  }

  /**
   * 批量删除销售发票
   *
   * @param xsfpFplss 需要删除的销售发票主键
   * @return 结果
   */
  @Transactional
  @Override
  public int deleteErpXsfpByXsfpFplss(String[] xsfpFplss)
  {
    erpXsfpMapper.deleteErpXsfpmxByXsfpmxFplss(xsfpFplss);
    return erpXsfpMapper.deleteErpXsfpByXsfpFplss(xsfpFplss);
  }

  /**
   * 删除销售发票信息
   *
   * @param xsfpFpls 销售发票主键
   * @return 结果
   */
  @Transactional
  @Override
  public int deleteErpXsfpByXsfpFpls(String xsfpFpls)
  {
    erpXsfpMapper.deleteErpXsfpmxByXsfpmxFpls(xsfpFpls);
    return erpXsfpMapper.deleteErpXsfpByXsfpFpls(xsfpFpls);
  }

  /**
   * 新增销售发票明细信息
   *
   * @param erpXsfp 销售发票对象
   */
  public void insertErpXsfpmx(ErpXsfp erpXsfp)
  {
    //List<ErpXsfpmx> erpXsfpmxList = erpXsfp.getErpXsfpmxList();
    List<ErpXsfpmx> erpXsfpmxList = new ArrayList<ErpXsfpmx>();
    String xsfpFpls = erpXsfp.getXsfpFpls();
    if (StringUtils.isNotNull(erpXsfpmxList))
    {
      List<ErpXsfpmx> list = new ArrayList<ErpXsfpmx>();
      for (ErpXsfpmx erpXsfpmx : erpXsfpmxList)
      {
        erpXsfpmx.setXsfpmxFpls(xsfpFpls);
        list.add(erpXsfpmx);
      }
      if (list.size() > 0)
      {
        erpXsfpMapper.batchErpXsfpmx(list);
      }
    }
  }

  /**
   * 导入发票数据
   *
   * @param xsfpExcelList 发票数据列表
   * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
   * @param operName 操作用户
   * @return 结果
   */
  @Override
  @Transactional
  public String importXsfp(List<ErpXsfpImport> xsfpExcelList, Boolean isUpdateSupport, String operName){

    // 发票相关
    List<ErpXsfp> xsfpList = new ArrayList<>(xsfpExcelList.size());

    /*List<Player> newList = new ArrayList<>();
    playerList.stream().filter(distinctByKey(p -> p.getName()))  //filter保留true的值
        .forEach(newList::add);*/
    Integer lastLs =  Convert.toInt("1418573");
    //根据发票编号确定导入的发票基本信息
    List<ErpXsfpImport> fpInfoList = new ArrayList<>();
    xsfpExcelList.stream()
                 .filter(distinctByKey(ErpXsfpImport::getXsfpFpbh))  //filter保留true的值
                 .forEach(fpInfoList::add);

    /*fpInfoList.forEach(xsfpExcel ->{
      ErpXsfp xsfpInfo = ErpXsfpConvert.INSTANCE.convert(xsfpExcel);
      xsfpList.add(xsfpInfo);
    });*/

    for (ErpXsfpImport xsfpExcel : fpInfoList) {
      fpInfoList.indexOf(xsfpExcel); //如果是Set还没有这个方法
      Integer currentLs = lastLs + fpInfoList.indexOf(xsfpExcel) + 1;
      ErpXsfp xsfpInfo = ErpXsfpConvert.INSTANCE.convert(xsfpExcel);
      xsfpInfo.setXsfpFpls(Convert.toStr(currentLs));
      xsfpList.add(xsfpInfo);
    }

    String message = "导入发票成功了";

    return message;
  }


  static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {

    Map<Object, Boolean> seen = new ConcurrentHashMap<>();

    //putIfAbsent方法添加键值对，如果map集合中没有该key对应的值，则直接添加，并返回null，如果已经存在对应的值，则依旧为原来的值。

    //如果返回null表示添加数据成功(不重复)，不重复(null==null :TRUE)

    return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;

  }

}
