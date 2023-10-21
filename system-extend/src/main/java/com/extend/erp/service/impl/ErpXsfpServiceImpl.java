package com.extend.erp.service.impl;

import java.util.*;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.convert.ErpXsfpConvert;
import com.extend.erp.convert.ErpXsfpMxConvert;
import com.extend.erp.domain.*;
import com.extend.erp.mapper.ErpXsfpMxMapper;
import com.extend.erp.service.IErpXsfpMxService;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.extend.erp.mapper.ErpXsfpMapper;
import com.extend.erp.service.IErpXsfpService;

/**
 * 销售发票Service业务层处理
 *
 * @author wcg
 * @date 2023-10-13
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class ErpXsfpServiceImpl extends ServiceImpl<ErpXsfpMapper, ErpXsfp> implements IErpXsfpService
{

  private static final Logger log = LoggerFactory.getLogger(ErpXsfpServiceImpl.class);

  @Autowired
  private ErpXsfpMapper erpXsfpMapper;

  @Autowired
  private EprXsfpMxServiceImpl xsfpmxService;

  @Autowired
  private ErpLsnbbmServiceImpl lsnbbmService;

  @Autowired
  private ErpZwwldwServiceImpl zwwldwService;

  @Autowired
  private ErpZwzgzdServiceImpl zwzgzdService;

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

    if (StringUtils.isNull(xsfpExcelList) || xsfpExcelList.size() == 0)
    {
      throw new ServiceException("导入发票数据不能为空！");
    }

    //校验导入数据是否合规
    Map<String, String> importDataCheck = importValidate(xsfpExcelList);

    if(!importDataCheck.get("passed").equals("200")){
      throw new ServiceException(importDataCheck.get("msg"));
    }

    // 发票list
    List<ErpXsfp> xsfpList = new ArrayList<>(xsfpExcelList.size());
    //发票明细list
    List<ErpXsfpmx> erpXsfpmxList = new ArrayList<ErpXsfpmx>();
    //当前销售发票流水号
    ErpLsnbbm lsnbbm = lsnbbmService.selectErpLsnbbmByLsnbbmNmbh("XSFPLS");
    Integer lastFpls = Convert.toInt(lsnbbm.getLsnbbmDqnm());

    //日期设置
    String currentDate = DateUtil.format(DateUtil.date(), "yyyyMMdd");
    String currentTime = StrUtil.subSufByLength(Convert.toStr(DateUtil.date().getTime()), 6);

    /*List<Player> newList = new ArrayList<>();
    playerList.stream().filter(distinctByKey(p -> p.getName()))  //filter保留true的值
        .forEach(newList::add);*/

    //根据发票编号确定导入的发票基本信息
    List<ErpXsfpImport> fpInfoList = new ArrayList<>();
    xsfpExcelList.stream()
                 .filter(distinctByKey(ErpXsfpImport::getXsfpFpbh))  //filter保留true的值
                 .forEach(fpInfoList::add);

    //获取数据中所有客户
    Map<String, ErpZwwldw> customMap = getCustomMap(xsfpExcelList);
    //获取数据中所有业务员
    Map<String, ErpZwzgzd> salesmanMap = getSalesmanMap(xsfpExcelList);


    /*fpInfoList.forEach(xsfpExcel ->{
      ErpXsfp xsfpInfo = ErpXsfpConvert.INSTANCE.convert(xsfpExcel);
      xsfpList.add(xsfpInfo);
    });*/

    for (ErpXsfpImport xsfpExcel : fpInfoList) {
      fpInfoList.indexOf(xsfpExcel); //如果是Set还没有这个方法
      Integer currentLs = lastFpls + fpInfoList.indexOf(xsfpExcel);
      ErpXsfp xsfpInfo = ErpXsfpConvert.INSTANCE.convert(xsfpExcel);
      xsfpInfo.setXsfpFpls(Convert.toStr(currentLs));
      xsfpInfo.setXsfpDjrq(currentDate);
      xsfpInfo.setXsfpYwrq(currentDate);
      xsfpInfo.setXsfpXgsj(currentDate + ' ' + currentTime);
      xsfpInfo.setXsfpShbz("1");
      xsfpInfo.setXsfpShxm(" ");
      xsfpInfo.setXsfpShlc("免审");
      xsfpInfo.setXsfpShrq(currentDate);
      xsfpInfo.setXsfpShdkhmc(customMap.get(xsfpExcel.getXsfpShdkh()).getZwwldwDwmc());
      xsfpInfo.setXsfpSodkh(xsfpExcel.getXsfpShdkh());
      xsfpInfo.setXsfpSodkhmc(customMap.get(xsfpExcel.getXsfpShdkh()).getZwwldwDwmc());
      xsfpInfo.setXsfpSpkh(xsfpExcel.getXsfpShdkh());
      xsfpInfo.setXsfpSpkhmc(customMap.get(xsfpExcel.getXsfpShdkh()).getZwwldwDwmc());
      xsfpInfo.setXsfpFkkh(xsfpExcel.getXsfpShdkh());
      xsfpInfo.setXsfpFkkhmc(customMap.get(xsfpExcel.getXsfpShdkh()).getZwwldwDwmc());
      xsfpInfo.setXsfpAddr(customMap.get(xsfpExcel.getXsfpShdkh()).getZwwldwAddr());
      xsfpInfo.setXsfpTele(customMap.get(xsfpExcel.getXsfpShdkh()).getZwwldwTele());
      xsfpInfo.setXsfpKhh(customMap.get(xsfpExcel.getXsfpShdkh()).getZwwldwKhh());
      xsfpInfo.setXsfpYhzh(customMap.get(xsfpExcel.getXsfpShdkh()).getZwwldwYhzh());
      xsfpInfo.setXsfpSh(customMap.get(xsfpExcel.getXsfpShdkh()).getZwwldwSh());
      xsfpInfo.setXsfpRyxm(salesmanMap.get(xsfpExcel.getXsfpRybh()).getZwzgzdZgxm());
      xsfpInfo.setXsfpPjlx("BZCPFP");
      xsfpInfo.setXsfpZbpjlx("BZYW");
      xsfpInfo.setXsfpFpbz("LD");
      xsfpInfo.setXsfpYwbh("02");
      xsfpInfo.setXsfpZlbh("05");
      xsfpInfo.setXsfpWbbh("RMB");
      xsfpInfo.setXsfpFwbz("1");
      xsfpList.add(xsfpInfo);
    }

    //发票明细-流水号对应
    Map<String, String> fpLsMap = MapUtil.newHashMap();

    xsfpList.forEach(fpItem-> fpLsMap.put(fpItem.getXsfpFpbh(), fpItem.getXsfpFpls()));
    xsfpExcelList.forEach(fp->{
      ErpXsfpmx xsfpmxInfo = ErpXsfpMxConvert.INSTANCE.convert(fp);
      xsfpmxInfo.setXsfpmxFpls(fpLsMap.get(fp.getXsfpFpbh()));
      xsfpmxInfo.setXsfpmxLzrq(currentDate);
      xsfpmxInfo.setXsfpmxFpfl(RandomUtil.randomNumbers(10)); //发票分类?  与流水均为主键
      erpXsfpmxList.add(xsfpmxInfo);
    });

    //erpXsfpMapper.batchErpXsfpmx(erpXsfpmxList);

    //xsfpList.forEach(fp-> erpXsfpMapper.insert(fp));
    //xsfpList.forEach(this::save);

    /*this.saveBatch(xsfpList);
    xsfpmxService.saveBatch(erpXsfpmxList);

    //String needSetLs = String.valueOf(fpLsMap.entrySet().stream().reduce((first, second) -> second).get());

    //最后一条发票流水
    Map.Entry<String, String> needSetLsMap = fpLsMap.entrySet().stream().reduce((first, second) -> second).get();
    String needSetLs = Convert.toStr(Convert.toInt(needSetLsMap.getValue()) + 1);
    lsnbbm.setLsnbbmDqnm(needSetLs);
    lsnbbmService.updateErpLsnbbm(lsnbbm);*/

    String message = "导入发票成功了";

    return message;
  }


  static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {

    Map<Object, Boolean> seen = new ConcurrentHashMap<>();

    //putIfAbsent方法添加键值对，如果map集合中没有该key对应的值，则直接添加，并返回null，如果已经存在对应的值，则依旧为原来的值。

    //如果返回null表示添加数据成功(不重复)，不重复(null==null :TRUE)

    return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;

  }

  private Map<String, ErpZwwldw> getCustomMap(List<ErpXsfpImport> xsfpExcelList){

    Map<String, ErpZwwldw> customMap = MapUtil.newHashMap();
    List<String> customList = new ArrayList<>();
    List<String> finalCustomList = customList;
    xsfpExcelList.forEach(fp-> finalCustomList.add(fp.getXsfpShdkh()));

    customList = CollUtil.distinct(finalCustomList);

    //String[] customArr = Convert.toStrArray(customList);

    List<ErpZwwldw> customInfoList = zwwldwService.selectErpZwwldwListByDwbh(customList);

    customInfoList.forEach(custom-> customMap.put(custom.getZwwldwDwbh(), custom));

    return customMap;
  }

  private Map<String, ErpZwzgzd> getSalesmanMap(List<ErpXsfpImport> xsfpExcelList) {
    Map<String, ErpZwzgzd> salesmanMap = MapUtil.newHashMap();
    List<String> salesmanList = new ArrayList<>();
    List<String> finalSalesmanList = salesmanList;
    xsfpExcelList.forEach(fp-> finalSalesmanList.add(fp.getXsfpRybh()));

    salesmanList = CollUtil.distinct(finalSalesmanList);

    List<ErpZwzgzd> salesmanInfoList = zwzgzdService.selectErpZwzgzdListByZgbh(salesmanList);

    salesmanInfoList.forEach(salesman-> salesmanMap.put(salesman.getZwzgzdZgbh(), salesman));

    return salesmanMap;
  }

  private Map<String, String> importValidate(List<ErpXsfpImport> xsfpExcelList){
    String returnCode = "200";
    StringBuilder returnMsg  = new StringBuilder();
    returnMsg.append("校验结果: ");
    Map<String, String> checkResult = MapUtil.newHashMap();

    /*获取所有发票编号*/
    List<String> importBhList = new ArrayList<>();
    List<String> finalBhList = importBhList;
    xsfpExcelList.forEach(fp-> finalBhList.add(fp.getXsfpFpbh()));

    importBhList = CollUtil.distinct(finalBhList);

    /*校验发票编号-客户编号,人员编号对应,同一编号不能对应不同客户及业务人员*/
    Set<String> fpbhConstraint = new HashSet<>();
    xsfpExcelList.forEach(colInfo->{
      fpbhConstraint.add(Convert.toStr(colInfo.getXsfpFpbh()) + Convert.toStr(colInfo.getXsfpShdkh()) + Convert.toStr(colInfo.getXsfpRybh()));
    });

    if(fpbhConstraint.size() != importBhList.size()){
      checkResult.put("passed", "500");
      checkResult.put("msg", "请注意:数据中存在同一发票编号对应不同客户或业务员");

      return checkResult;
    }


    /*校验发票编号是否存在*/
    for (String bh : importBhList){
      try {
        //是否存在该编号
        ErpXsfp xsfp = baseMapper.getXsfpInfoByFpbh(bh);
        if (StringUtils.isNotNull(xsfp)){
          String msg = "<br/>" + "发票编号 " + bh + " 已经存在";
          returnMsg.append(msg);
          returnCode = "500";
        }
      }catch (Exception e) {
        /*String msg = "<br/>" + "、发票编号 " + bh + " 已经存在：";
        returnMsg.append(msg);
        log.error(msg, e);*/
      }
    }

    checkResult.put("passed", returnCode);
    checkResult.put("msg", returnMsg.toString());

    return checkResult;
  }

}
