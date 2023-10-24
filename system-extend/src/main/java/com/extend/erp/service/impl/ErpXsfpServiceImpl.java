package com.extend.erp.service.impl;

import java.math.BigDecimal;
import java.util.*;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
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

  @Autowired
  private ErpXstdServiceImpl xstdService;
  @Autowired
  private ErpXstdmxServiceImpl xstdmxService;

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
    //销售提单List
    List<ErpXstd> xstdList = new ArrayList<ErpXstd>();
    //销售提单明细List
    List<ErpXstdmx> xstdmxList = new ArrayList<ErpXstdmx>();
    //当前销售发票流水号
    ErpLsnbbm lsnbbm = lsnbbmService.selectErpLsnbbmByLsnbbmNmbh("XSFPLS");
    Integer lastFpls = Convert.toInt(lsnbbm.getLsnbbmDqnm());

    //当前销售提单流水号
    ErpLsnbbm tidanInfo = lsnbbmService.selectErpLsnbbmByLsnbbmNmbh("XSTDLS");
    Integer lastTdls = Convert.toInt(tidanInfo.getLsnbbmDqnm());

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
    Map<String, String> fpLsToBhMap = MapUtil.newHashMap();
    xsfpList.forEach(fpItem->{
      fpLsMap.put(fpItem.getXsfpFpbh(), fpItem.getXsfpFpls());
      fpLsToBhMap.put(fpItem.getXsfpFpls(), fpItem.getXsfpFpbh());
    });
   /* xsfpList.forEach(fpItem-> fpLsMap.put(fpItem.getXsfpFpbh(), fpItem.getXsfpFpls()));
    xsfpList.forEach(fpItem-> fpLsToBhMap.put(fpItem.getXsfpFpls(), fpItem.getXsfpFpbh()));*/

    //发票明细分流号生生成
    fpInfoList.forEach(fpInfo->{
      List<ErpXsfpImport> repeatListByFpbh = new ArrayList<>();
      for (ErpXsfpImport fpmxInfo : xsfpExcelList) {
        if(fpmxInfo.getXsfpFpbh().equals(fpInfo.getXsfpFpbh())){
          repeatListByFpbh.add(fpmxInfo);
        }
      }
      for (ErpXsfpImport fpmxRepeatInfo : repeatListByFpbh) {
        Integer currentFlInt = repeatListByFpbh.indexOf(fpmxRepeatInfo) + 1;
        String currentFl = String.format("%010d", currentFlInt);	// 00000123
        fpmxRepeatInfo.setXsfpmxFpfl(currentFl);
      }
    });

    xsfpExcelList.forEach(fp->{
      ErpXsfpmx xsfpmxInfo = ErpXsfpMxConvert.INSTANCE.convert(fp);
      xsfpmxInfo.setXsfpmxFpls(fpLsMap.get(fp.getXsfpFpbh()));
      xsfpmxInfo.setXsfpmxLzrq(currentDate);
      //xsfpmxInfo.setXsfpmxFpfl(RandomUtil.randomNumbers(10)); //发票分类?  与流水均为主键
      erpXsfpmxList.add(xsfpmxInfo);
    });

    //销售发票-提单映射

    /*xsfpList.forEach(fp->{
      ErpXstd xstd = new ErpXstd();
    });*/
    for (ErpXsfp fpInfo : xsfpList) {
      Integer currentLs = lastTdls + xsfpList.indexOf(fpInfo);
      ErpXstd xstd = new ErpXstd();
      xstd.setXstdTdls(Convert.toStr(currentLs));
      xstd.setXstdPjlx("BZCPTD");
      xstd.setXstdYwbs("A");
      xstd.setXstdZbpjlx(fpInfo.getXsfpZbpjlx());
      xstd.setXstdTdbh("@" + fpInfo.getXsfpFpbh());
      xstd.setXstdDjrq(fpInfo.getXsfpDjrq());
      xstd.setXstdYwrq(fpInfo.getXsfpYwrq());
      xstd.setXstdXgsj(fpInfo.getXsfpXgsj());
      xstd.setXstdQcbz(fpInfo.getXsfpQcbz());
      xstd.setXstdTdbz(fpInfo.getXsfpFpbz());
      xstd.setXstdYwbh(fpInfo.getXsfpYwbh());
      xstd.setXstdZlbh(fpInfo.getXsfpZlbh());
      xstd.setXstdShdkh(fpInfo.getXsfpShdkh());
      xstd.setXstdShdkhmc(fpInfo.getXsfpShdkhmc());
      xstd.setXstdSodkh(fpInfo.getXsfpSodkh());
      xstd.setXstdSodkhmc(fpInfo.getXsfpSodkhmc());
      xstd.setXstdSpkh(fpInfo.getXsfpSpkh());
      xstd.setXstdSpkhmc(fpInfo.getXsfpSpkhmc());
      xstd.setXstdFkkh(fpInfo.getXsfpFkkh());
      xstd.setXstdFkkhmc(fpInfo.getXsfpFkkhmc());
      xstd.setXstdAddr(fpInfo.getXsfpAddr());
      xstd.setXstdTele(fpInfo.getXsfpTele());
      xstd.setXstdBmbh(fpInfo.getXsfpBmbh());
      xstd.setXstdRybh(fpInfo.getXsfpRybh());
      xstd.setXstdWbbh(fpInfo.getXsfpWbbh());
      xstd.setXstdHl(fpInfo.getXsfpHl());
      xstd.setXstdHtbh("");
      xstd.setXstdHtls("");
      xstd.setXstdZkzc(fpInfo.getXsfpZkzc());
      xstd.setXstdHkrq(fpInfo.getXsfpHkrq());
      xstd.setXstdFsbh(fpInfo.getXsfpFsbh());
      xstd.setXstdDhdd(fpInfo.getXsfpDhdd());
      xstd.setXstdZdxm(fpInfo.getXsfpZdxm());
      xstd.setXstdJzbz(fpInfo.getXsfpJzbz());
      xstd.setXstdJzsj(fpInfo.getXsfpJzsj());
      xstd.setXstdJzxm(fpInfo.getXsfpJzxm());
      xstd.setXstdPznm(fpInfo.getXsfpPznm());
      xstd.setXstdPzrq(fpInfo.getXsfpPzrq());
      xstd.setXstdPzbh(fpInfo.getXsfpPzbh());
      xstd.setXstdPznd(fpInfo.getXsfpPznd());
      xstd.setXstdSfqr(fpInfo.getXsfpSfqr());
      xstd.setXstdSfjz(fpInfo.getXsfpSfjz());
      xstd.setXstdSfqxjz(fpInfo.getXsfpSfqxjz());
      xstd.setXstdSfxg("0");
      xstd.setXstdSfsc("0");
      xstd.setXstdSfjz(fpInfo.getXsfpSfjz());
      xstd.setXstdSfls(fpInfo.getXsfpSfls());
      xstd.setXstdSfczx(fpInfo.getXsfpSfczx());
      xstd.setXstdSfcdj(fpInfo.getXsfpSfcdj());
      xstd.setXstdDydate(fpInfo.getXsfpDydate());
      xstd.setXstdDyperson(fpInfo.getXsfpDyperson());
      xstd.setXstdShlc(fpInfo.getXsfpShlc());
      xstd.setXstdShbz(fpInfo.getXsfpShbz());
      xstd.setXstdShrq(fpInfo.getXsfpShrq());
      xstd.setXstdShxm(fpInfo.getXsfpShxm());
      xstd.setXstdC1(fpInfo.getXsfpC1());
      xstd.setXstdC2(fpInfo.getXsfpC2());
      xstd.setXstdC3(fpInfo.getXsfpC3());
      xstd.setXstdC4(fpInfo.getXsfpC4());
      xstd.setXstdC5(fpInfo.getXsfpC5());
      xstd.setXstdC6(fpInfo.getXsfpC6());
      xstd.setXstdC7(fpInfo.getXsfpC7());
      xstd.setXstdC8(fpInfo.getXsfpC8());
      xstd.setXstdC9(fpInfo.getXsfpC9());
      xstd.setXstdC10(fpInfo.getXsfpC10());
      xstd.setXstdU1(fpInfo.getXsfpU1());
      xstd.setXstdU2(fpInfo.getXsfpU2());
      xstd.setXstdU3(fpInfo.getXsfpU3());
      xstd.setXstdU4(fpInfo.getXsfpU4());
      xstd.setXstdU5(fpInfo.getXsfpU5());
      xstd.setXstdU6(fpInfo.getXsfpU6());
      xstd.setXstdBz(fpInfo.getXsfpBz());
      xstdList.add(xstd);
    }


    /*销售提单-提单明细映射*/
    //销售提单明细-流水号对应
    Map<String, String> tdLsMap = MapUtil.newHashMap();
    xstdList.forEach(tdItem-> {
      //System.out.println(tdItem);
      tdLsMap.put(tdItem.getXstdTdbh(), tdItem.getXstdTdls());
    });
    erpXsfpmxList.forEach(mx->{
      ErpXstdmx tdmx = new ErpXstdmx();
      /*String tdbh = tdLsMap.get(mx.getXsfpmxFpls());
      String tdls = fpLsToBhMap.get(StrUtil.sub(tdbh, 1, (tdbh.length()-1)));*/
      String fpbh = "@" + fpLsToBhMap.get(mx.getXsfpmxFpls());
      String tdls = tdLsMap.get(fpbh);
      tdmx.setXstdmxTdls(tdls);
      tdmx.setXstdmxTdfl(mx.getXsfpmxFpfl());
      tdmx.setXstdmxXsxh(mx.getXsfpmxXsxh());
      tdmx.setXstdmxFllx(mx.getXsfpmxFllx());
      tdmx.setXstdmxFlly(mx.getXsfpmxFlly());
      tdmx.setXstdmxKcfs("T");
      tdmx.setXstdmxDdls(mx.getXsfpmxDdls());
      tdmx.setXstdmxDdfl(mx.getXsfpmxDdfl());
      tdmx.setXstdmxDdbh(mx.getXsfpmxDdbh());
      tdmx.setXstdmxYtdls("@");
      tdmx.setXstdmxYtdfl("@");
      tdmx.setXstdmxYtdbh("@");
      tdmx.setXstdmxHtls("");
      tdmx.setXstdmxHtfl("");
      tdmx.setXstdmxJhrq(mx.getXsfpmxLzrq());
      tdmx.setXstdmxCkbh(mx.getXsfpmxCkbh());
      tdmx.setXstdmxWlbh(mx.getXsfpmxWlbh());
      tdmx.setXstdmxPch(mx.getXsfpmxPch());
      tdmx.setXstdmxHwbh("");
      tdmx.setXstdmxZyx1(mx.getXsfpmxZyx1());
      tdmx.setXstdmxZyx2(mx.getXsfpmxZyx2());
      tdmx.setXstdmxZyx3(mx.getXsfpmxZyx3());
      tdmx.setXstdmxZyx4(mx.getXsfpmxZyx4());
      tdmx.setXstdmxZyx5(mx.getXsfpmxZyx5());
      tdmx.setXstdmxWlzt(mx.getXsfpmxWlzt());
      tdmx.setXstdmxWlbz(mx.getXsfpmxWlbz());
      tdmx.setXstdmxZsl(mx.getXsfpmxZsl());
      tdmx.setXstdmxFsl1(mx.getXsfpmxFsl1());
      tdmx.setXstdmxFsl2(mx.getXsfpmxFsl2());
      tdmx.setXstdmxYzhsj(mx.getXsfpmxYzhsj());
      tdmx.setXstdmxBzhsj(mx.getXsfpmxBzhsj());
      tdmx.setXstdmxSl(mx.getXsfpmxSl());
      tdmx.setXstdmxYxse(mx.getXsfpmxYxse());
      tdmx.setXstdmxBxse(mx.getXsfpmxBxse());
      tdmx.setXstdmxYse(mx.getXsfpmxYse());
      tdmx.setXstdmxBse(mx.getXsfpmxBse());
      tdmx.setXstdmxYhse(mx.getXsfpmxYhse());
      tdmx.setXstdmxBhse(mx.getXsfpmxBhse());
      tdmx.setXstdmxDbzkbl(mx.getXsfpmxDbzkbl());
      tdmx.setXstdmxZezkbl(mx.getXsfpmxZezkbl());
      tdmx.setXstdmxYzkje(mx.getXsfpmxYzkje());
      tdmx.setXstdmxBzkje(mx.getXsfpmxBzkje());
      tdmx.setXstdmxYzsl(0);
      tdmx.setXstdmxYfsl1(0);
      tdmx.setXstdmxYfsl2(0);
      tdmx.setXstdmxSfkp("1");
      tdmx.setXstdmxKpbz("1");
      tdmx.setXstdmxKpsl(mx.getXsfpmxZsl());
      tdmx.setXstdmxKpfsl1(mx.getXsfpmxFsl1());
      tdmx.setXstdmxKpfsl2(mx.getXsfpmxFsl2());
      tdmx.setXstdmxYkpe(mx.getXsfpmxYhse());
      tdmx.setXstdmxBkpe(mx.getXsfpmxBhse());
      tdmx.setXstdmxSfck(mx.getXsfpmxSfck());
      tdmx.setXstdmxCkbz("0");
      tdmx.setXstdmxCksl(0);
      tdmx.setXstdmxCkfsl1(0);
      tdmx.setXstdmxCkfsl2(0);
      tdmx.setXstdmxThsl(0);
      tdmx.setXstdmxThfsl1(0);
      tdmx.setXstdmxThfsl2(0);
      tdmx.setXstdmxBhsl(0);
      tdmx.setXstdmxBhfsl1(0);
      tdmx.setXstdmxBhfsl2(0);
      tdmx.setXstdmxSfth("1");
      tdmx.setXstdmxThbz("0");
      tdmx.setXstdmxKcyl("0");
      tdmx.setXstdmxDdkcyl("0");
      tdmx.setXstdmxYhkrq("");
      tdmx.setXstdmxC1(mx.getXsfpmxC1());
      tdmx.setXstdmxC2(mx.getXsfpmxC2());
      tdmx.setXstdmxC3(mx.getXsfpmxC3());
      tdmx.setXstdmxC4(mx.getXsfpmxC4());
      tdmx.setXstdmxC5(mx.getXsfpmxC5());
      tdmx.setXstdmxC6(mx.getXsfpmxC6());
      tdmx.setXstdmxC7(mx.getXsfpmxC7());
      tdmx.setXstdmxC8(mx.getXsfpmxC8());
      tdmx.setXstdmxC9(mx.getXsfpmxC9());
      tdmx.setXstdmxC10(mx.getXsfpmxC10());
      tdmx.setXstdmxU1(mx.getXsfpmxU1());
      tdmx.setXstdmxU2(mx.getXsfpmxU2());
      tdmx.setXstdmxU3(mx.getXsfpmxU3());
      tdmx.setXstdmxU4(mx.getXsfpmxU4());
      tdmx.setXstdmxU5(mx.getXsfpmxU5());
      tdmx.setXstdmxU6(mx.getXsfpmxU6());
      tdmx.setXstdmxDqzk("0");
      tdmx.setXstdmxYjbz("0");
      tdmx.setXstdmxYlzsl(0);
      tdmx.setXstdmxYlfsl1(0);
      tdmx.setXstdmxYlfsl2(0);
      tdmx.setXstdmxYhzsl(0);
      tdmx.setXstdmxYhfsl1(0);
      tdmx.setXstdmxYhfsl2(0);
      xstdmxList.add(tdmx);
    });
    //erpXsfpMapper.batchErpXsfpmx(erpXsfpmxList);

    //xsfpList.forEach(fp-> erpXsfpMapper.insert(fp));
    //xsfpList.forEach(this::save);

    this.saveBatch(xsfpList);
    xsfpmxService.saveBatch(erpXsfpmxList);
    xstdService.saveBatch(xstdList);
    xstdmxService.saveBatch(xstdmxList);

    //最后一条发票流水
    /*Map.Entry<String, String> needSetLsMap = fpLsMap.entrySet().stream().reduce((first, second) -> second).get();
    String needSetLs = Convert.toStr(Convert.toInt(needSetLsMap.getValue()) + 1);*/

    List<Integer> lsList = new ArrayList<>();
    fpLsMap.forEach((key, value)-> lsList.add(Convert.toInt(value)));
    Integer[] lsInt = Convert.toIntArray(lsList);
    Arrays.sort(lsInt);
    String needSetLs = Convert.toStr(lsInt[lsInt.length -1] + 1);

    lsnbbm.setLsnbbmDqnm(needSetLs);
    lsnbbmService.updateErpLsnbbm(lsnbbm);

    //最后一条提单流水
    /*Map.Entry<String, String> needSetTdLsMap = tdLsMap.entrySet().stream().reduce((first, second) -> first).get();
    String needSetTdLs = Convert.toStr(Convert.toInt(needSetTdLsMap.getValue()) + 1);*/
    List<Integer> tdList = new ArrayList<>();
    tdLsMap.forEach((key, value)-> tdList.add(Convert.toInt(value)));
    Integer[] tdInt = Convert.toIntArray(tdList);
    Arrays.sort(tdInt);
    String needSetTdLs = Convert.toStr(tdInt[tdInt.length -1] + 1);
    tidanInfo.setLsnbbmDqnm(needSetTdLs);
    lsnbbmService.updateErpLsnbbm(tidanInfo);


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
    returnMsg.append("校验失败: ");
    Map<String, String> checkResult = MapUtil.newHashMap();

    /*获取所有发票编号*/
    List<String> importBhList = new ArrayList<>();
    List<String> finalBhList = importBhList;
    xsfpExcelList.forEach(fp-> finalBhList.add(fp.getXsfpFpbh()));
    importBhList = CollUtil.distinct(finalBhList);

    /*非空校验:发票编号,客户编号,人员编号,数量,开票价,制单人*/
    Map<String, String> checkEmpty =  colEmptyValidate(xsfpExcelList);
    if(!checkEmpty.get("passed").equals("200")){
      throw new ServiceException(checkEmpty.get("msg"));
    }

    /*校验发票编号-客户编号,人员编号对应,同一编号不能对应不同客户及业务人员*/
    Set<String> fpbhConstraint = new HashSet<>();
    xsfpExcelList.forEach(colInfo->{
      String constraintStr = Convert.toStr(colInfo.getXsfpFpbh())
                             + Convert.toStr(colInfo.getXsfpShdkh())
                             + Convert.toStr(colInfo.getXsfpRybh());
      fpbhConstraint.add(constraintStr);
    });
    if(fpbhConstraint.size() != importBhList.size()){
      /*checkResult.put("passed", "500");
      checkResult.put("msg", "请注意:数据中存在同一发票编号对应不同客户或业务员");

      return checkResult;*/
      throw new ServiceException("请注意:数据中存在同一发票编号对应不同客户或业务员");
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

    /*校验客户是否存在*/
    //获取所有客户编号
    List<String> importKhList = new ArrayList<>();
    List<String> finalKhList = importKhList;
    xsfpExcelList.forEach(fp-> finalKhList.add(fp.getXsfpShdkh()));
    importKhList = CollUtil.distinct(finalKhList);

    importKhList = CollUtil.distinct(finalKhList);
    for (String kh : importKhList){
      try {
        //是否存在该客户
        ErpZwwldw xskh = zwwldwService.getKhInfoByKhbh(kh);
        if (StringUtils.isNull(xskh)){
          String msg = "<br/>" + "客户 " + kh + "不存在";
          returnMsg.append(msg);
          returnCode = "500";
        }
      }catch (Exception e) {
      }
    }

    /*校验人员是否存在*/
    //所有业务员
    List<String> importRyList = new ArrayList<>();
    List<String> finalRyList = importRyList;
    xsfpExcelList.forEach(fp-> finalRyList.add(fp.getXsfpRybh()));
    importRyList = CollUtil.distinct(finalRyList);
    for (String ry : importRyList){
      try {
        //是否存在该业务员
        ErpZwzgzd xsry = zwzgzdService.getKhInfoByRybh(ry);
        if (StringUtils.isNull(xsry)){
          String msg = "<br/>" + "人员 " + ry + "不存在";
          returnMsg.append(msg);
          returnCode = "500";
        }
      }catch (Exception e) {
      }
    }

    checkResult.put("passed", returnCode);
    checkResult.put("msg", returnMsg.toString());

    return checkResult;
  }

  private Map<String, String> colEmptyValidate(List<ErpXsfpImport> xsfpExcelList){
    String code = "200";
    StringBuilder msg  = new StringBuilder();
    msg.append("校验失败: ");
    Map<String, String> emptyValidataRsult = MapUtil.newHashMap();
    List<Object> fpbhList = new ArrayList<>();
    List<Object> khbhList = new ArrayList<>();
    List<Object> rybhList = new ArrayList<>();
    List<Object> zslList = new ArrayList<>();
    List<Object> yzhsjList = new ArrayList<>();
    List<Object> zdxmList = new ArrayList<>();
    xsfpExcelList.forEach(fp->{
      if(!StrUtil.isEmpty(fp.getXsfpFpbh())){
        fpbhList.add(fp.getXsfpFpbh());
      }
      if(!StrUtil.isEmpty(fp.getXsfpShdkh())){
        khbhList.add(fp.getXsfpShdkh());
      }
      if(!StrUtil.isEmpty(fp.getXsfpRybh())){
        rybhList.add(fp.getXsfpRybh());
      }
      if(!StrUtil.isEmpty(Convert.toStr(fp.getXsfpmxZsl()))){
        zslList.add(fp.getXsfpmxZsl());
      }
      if(!StrUtil.isEmpty(Convert.toStr(fp.getXsfpmxYzhsj()))){
        yzhsjList.add(fp.getXsfpmxYzhsj());
      }
      if(!StrUtil.isEmpty(fp.getXsfpZdxm())){
        zdxmList.add(fp.getXsfpZdxm());
      }
    });

    if(fpbhList.size() != xsfpExcelList.size()){
      code = "500";
      msg.append("<br/>" + "发票编号列存在空数据");
    }
    if(khbhList.size() != xsfpExcelList.size()){
      code = "500";
      msg.append("<br/>" + "客户编号列存在空数据");
    }
    if(rybhList.size() != xsfpExcelList.size()){
      code = "500";
      msg.append("<br/>" + "业务员编号列存在空数据");
    }
    if(zslList.size() != xsfpExcelList.size()){
      code = "500";
      msg.append("<br/>" + "发主数据列存在空数据");
    }
    if(yzhsjList.size() != xsfpExcelList.size()){
      code = "500";
      msg.append("<br/>" + "开票价列存在空数据");
    }
    if(zdxmList.size() != xsfpExcelList.size()){
      code = "500";
      msg.append("<br/>" + "制单人列存在空数据");
    }

    emptyValidataRsult.put("passed", code);
    emptyValidataRsult.put("msg", msg.toString());

    return emptyValidataRsult;
  }

}
