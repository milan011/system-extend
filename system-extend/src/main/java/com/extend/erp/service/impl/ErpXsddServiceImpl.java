package com.extend.erp.service.impl;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpLsnbbm;
import com.extend.erp.domain.ErpXsddmx;
import com.extend.erp.domain.ErpXsfp;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extend.erp.mapper.ErpXsddMapper;
import com.extend.erp.domain.ErpXsdd;
import com.extend.erp.service.IErpXsddService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 销售订单Service业务层处理
 *
 * @author wcg
 * @date 2023-11-14
 */
@DataSource(value = DataSourceType.SLAVE)
@Service
public class ErpXsddServiceImpl extends ServiceImpl<ErpXsddMapper, ErpXsdd> implements IErpXsddService
{
  @Autowired
  private ErpXsddMapper erpXsddMapper;

  @Autowired
  private ErpLsnbbmServiceImpl lsnbbmService;

  @Autowired
  private ErpXsddmxServiceImpl erpXsddmxService;

  /**
   * 查询销售订单
   *
   * @param xsddDdls 销售订单主键
   * @return 销售订单
   */
  @Override
  public ErpXsdd selectErpXsddByXsddDdls(String xsddDdls)
  {
    return erpXsddMapper.selectErpXsddByXsddDdls(xsddDdls);
  }

  /**
   * 查询销售订单列表
   *
   * @param erpXsdd 销售订单
   * @return 销售订单
   */
  @Override
  public List<ErpXsdd> selectErpXsddList(ErpXsdd erpXsdd)
  {
    return erpXsddMapper.selectErpXsddList(erpXsdd);
  }

  /**
   * 新增销售订单
   *
   * @param erpXsdd 销售订单
   * @return 结果
   */
  @Override
  public int insertErpXsdd(ErpXsdd erpXsdd)
  {
    return erpXsddMapper.insertErpXsdd(erpXsdd);
  }

  @Override
  @Transactional
  public int createXsddByOms(Map<String, Object> map) {
    ErpXsdd erpXsdd = new ErpXsdd();
    List<ErpXsddmx> erpXsddmxList = new ArrayList<ErpXsddmx>();

    //是否存在该订单编号
    ErpXsdd xsdd = baseMapper.getXsddInfoByDdbh(Convert.toStr(map.get("code")));
    if (StringUtils.isNotNull(xsdd)){
      throw new ServiceException("订单重复！");
    }

    //当前销售订单流水号
    ErpLsnbbm lsnbbm = lsnbbmService.selectErpLsnbbmByLsnbbmNmbh("XSDDLS");
    Integer lastDdls = Convert.toInt(lsnbbm.getLsnbbmDqnm());


    //日期设置
    String currentDate = DateUtil.format(DateUtil.date(), "yyyyMMdd");
    String currentTime = StrUtil.subSufByLength(Convert.toStr(DateUtil.date().getTime()), 6);

    /*销售订单*/
    erpXsdd.setXsddDdls(Convert.toStr(lastDdls+1));
    erpXsdd.setXsddDdbh(Convert.toStr(map.get("code")));
    erpXsdd.setXsddDjrq(Convert.toStr(map.get("orderDate")));
    erpXsdd.setXsddSprq(Convert.toStr(map.get("orderDate")));
    erpXsdd.setXsddXgsj(currentDate + ' ' + currentTime);
    erpXsdd.setXsddPjlx("BZYWDD");
    erpXsdd.setXsddDdbz("LD");
    erpXsdd.setXsddLxbh("01");
    erpXsdd.setXsddLxr("原件");
    erpXsdd.setXsddShlc("免审");
    erpXsdd.setXsddShbz("1");
    erpXsdd.setXsddDdzt("2");
    erpXsdd.setXsddYwbh("02");
    erpXsdd.setXsddDhdd(Convert.toStr(map.get("address")));
    erpXsdd.setXsddShrq(Convert.toStr(map.get("orderDate")));
    erpXsdd.setXsddShdkhmc(Convert.toStr(map.get("customerSell")));
    erpXsdd.setXsddShdkh(Convert.toStr(map.get("customerSellCode")));
    erpXsdd.setXsddSodkhmc(Convert.toStr(map.get("customerSell")));
    erpXsdd.setXsddSodkh(Convert.toStr(map.get("customerSellCode")));
    erpXsdd.setXsddFkkhmc(Convert.toStr(map.get("customerSell")));
    erpXsdd.setXsddFkkh(Convert.toStr(map.get("customerSellCode")));
    erpXsdd.setXsddSpkhmc(Convert.toStr(map.get("customerSell")));
    erpXsdd.setXsddSpkh(Convert.toStr(map.get("customerSellCode")));
    erpXsdd.setXsddBmbh(Convert.toStr(map.get("depCode")));
    erpXsdd.setXsddRybh(Convert.toStr(map.get("salesmanCode")));
    erpXsdd.setXsddWbbh("RMB");
    erpXsdd.setXsddHl(1);
    erpXsdd.setXsddXsdj(Convert.toBigDecimal(map.get("lowPrice")));
    erpXsdd.setXsddYwrq(Convert.toStr(map.get("busDate")));
    erpXsdd.setXsddZdxm(Convert.toStr(map.get("creater")));
    erpXsdd.setXsddZkzc(Convert.toStr(map.get("policy")));
    erpXsdd.setXsddC1(Convert.toStr(map.get("contractCode")));
    erpXsdd.setXsddC2(Convert.toStr(map.get("agent")));
    erpXsdd.setXsddC3(Convert.toStr(map.get("freightSettlement")));
    erpXsdd.setXsddC5(Convert.toStr(map.get("printPrice")));
    erpXsdd.setXsddC6(Convert.toStr(map.get("sendProvince")));
    erpXsdd.setXsddC8(Convert.toStr(map.get("sendUnit")));
    erpXsdd.setXsddC9(Convert.toStr(map.get("sendware")));
    erpXsdd.setXsddBz(Convert.toStr(map.get("remark")));

    /*销售订单明细*/
    //map.get("goodsList").stream().forEach();
    List<?> goodsList = Convert.toList(map.get("goodsList"));
    //goodsList.forEach(goods->{
    for (Object goods: goodsList){
      ErpXsddmx erpXsddmx = new ErpXsddmx();
      //Map<String, Object> goodsInfo = (Map<String, Object>) goods;
      //erpXsddmx.setXsddmxWlbh(Convert.toStr(goods.get("materialCode")));
      Map<?, ?> goodsMap = new HashMap<>();
      goodsMap = Convert.convert(goodsMap.getClass(), goods);

      //订单分流号
      Integer currentFlInt = goodsList.indexOf(goods) + 1;
      String currentFl = String.format("%010d", currentFlInt);	// 00000123
      System.out.println(currentFlInt);
      System.out.println(currentFl);
      erpXsddmx.setXsddmxDdls(erpXsdd.getXsddDdls());
      erpXsddmx.setXsddmxDdfl(currentFl);
      erpXsddmx.setXsddmxXsxh(Convert.toLong(currentFlInt));
      erpXsddmx.setXsddmxFllx(Convert.toStr(goodsMap.get("switchEnterType")));
      erpXsddmx.setXsddmxWlbh(Convert.toStr(goodsMap.get("materialCode")));
      erpXsddmx.setXsddmxZyx1(Convert.toStr(goodsMap.get("zyx1")));
      erpXsddmx.setXsddmxZsl(Convert.toBigDecimal(goodsMap.get("mainNum")));
      erpXsddmx.setXsddmxFsl1(Convert.toBigDecimal(goodsMap.get("auxNum1")));
      erpXsddmx.setXsddmxFsl2(Convert.toBigDecimal(goodsMap.get("auxNum2")));
      erpXsddmx.setXsddmxYzhsj(Convert.toBigDecimal(goodsMap.get("priceWithTax")));
      erpXsddmx.setXsddmxYzxsj(Convert.toBigDecimal(goodsMap.get("priceSold")));
      erpXsddmx.setXsddmxBzhsj(Convert.toBigDecimal(goodsMap.get("priceWithTaxRmb")));
      erpXsddmx.setXsddmxBzxsj(Convert.toBigDecimal(goodsMap.get("priceSoldRmb")));
      erpXsddmx.setXsddmxYse(Convert.toBigDecimal(goodsMap.get("priceTax")));
      erpXsddmx.setXsddmxBse(Convert.toBigDecimal(goodsMap.get("priceTaxRmb")));
      erpXsddmx.setXsddmxSl(Convert.toBigDecimal(goodsMap.get("taxRate")));
      erpXsddmx.setXsddmxYhse(Convert.toBigDecimal(goodsMap.get("priceTotalWithTax")));
      erpXsddmx.setXsddmxBhse(Convert.toBigDecimal(goodsMap.get("priceTotalWithTaxRmb")));
      erpXsddmx.setXsddmxYxse(Convert.toBigDecimal(goodsMap.get("priceTotal")));
      erpXsddmx.setXsddmxBxse(Convert.toBigDecimal(goodsMap.get("priceTotalRmb")));
      erpXsddmx.setXsddmxYfsl(Convert.toBigDecimal(goodsMap.get("yfsl")));
      erpXsddmx.setXsddmxYffsl1(Convert.toBigDecimal(goodsMap.get("yffsl1")));
      erpXsddmx.setXsddmxYffsl2(Convert.toBigDecimal(goodsMap.get("yffsl2")));
      erpXsddmx.setXsddmxYyfe(Convert.toBigDecimal(goodsMap.get("yyfe")));
      erpXsddmx.setXsddmxByfe(Convert.toBigDecimal(goodsMap.get("byfe")));
      erpXsddmx.setXsddmxC1(Convert.toStr(goodsMap.get("pircePolicyCode")));
      erpXsddmx.setXsddmxJgzc(Convert.toStr(goodsMap.get("pircePolicyFlow")));
      erpXsddmx.setXsddmxU1(Convert.toBigDecimal(goodsMap.get("basePrice")));
      erpXsddmx.setXsddmxJgys(Convert.toStr(goodsMap.get("Jgys")));
      erpXsddmx.setXsddmxGhbm(Convert.toStr(goodsMap.get("Ghbm")));
      erpXsddmx.setXsddmxJhrq(Convert.toStr(map.get("orderDate")));

      erpXsddmxList.add(erpXsddmx);
    }

    this.save(erpXsdd);
    erpXsddmxService.saveBatch(erpXsddmxList);

    //最后一条销售订单流水
    String needSetLs = Convert.toStr(lastDdls + 1);
    lsnbbm.setLsnbbmDqnm(needSetLs);
    lsnbbmService.updateErpLsnbbm(lsnbbm);

    return 1;
  }


  /**
   * 修改销售订单
   *
   * @param erpXsdd 销售订单
   * @return 结果
   */
  @Override
  public int updateErpXsdd(ErpXsdd erpXsdd)
  {
    return erpXsddMapper.updateErpXsdd(erpXsdd);
  }

  /**
   * 批量删除销售订单
   *
   * @param xsddDdlss 需要删除的销售订单主键
   * @return 结果
   */
  @Override
  public int deleteErpXsddByXsddDdlss(String[] xsddDdlss)
  {
    return erpXsddMapper.deleteErpXsddByXsddDdlss(xsddDdlss);
  }

  /**
   * 删除销售订单信息
   *
   * @param xsddDdls 销售订单主键
   * @return 结果
   */
  @Override
  public int deleteErpXsddByXsddDdls(String xsddDdls)
  {
    return erpXsddMapper.deleteErpXsddByXsddDdls(xsddDdls);
  }
}
