package com.extend.erp.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpLsnbbm;
import com.extend.erp.domain.ErpXsddmx;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
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
    erpXsdd.setXsddShdkhmc(Convert.toStr(map.get("customerSell")));
    erpXsdd.setXsddShdkh(Convert.toStr(map.get("customerSellCode")));
    erpXsdd.setXsddSodkhmc(Convert.toStr(map.get("customerSell")));
    erpXsdd.setXsddSodkh(Convert.toStr(map.get("customerSellCode")));
    erpXsdd.setXsddFkkhmc(Convert.toStr(map.get("customerSell")));
    erpXsdd.setXsddFkkh(Convert.toStr(map.get("customerSellCode")));
    erpXsdd.setXsddBmbh(Convert.toStr(map.get("depCode")));
    erpXsdd.setXsddRybh(Convert.toStr(map.get("salesmanCode")));
    erpXsdd.setXsddWbbh("RMB");
    erpXsdd.setXsddHl(1);
    erpXsdd.setXsddXsdj(Convert.toBigDecimal(map.get("lowPrice")));
    erpXsdd.setXsddYwrq(Convert.toStr(map.get("busDate")));
    erpXsdd.setXsddZdxm(Convert.toStr(map.get("creater")));
    erpXsdd.setXsddZkzc(Convert.toStr(map.get("policy")));
    erpXsdd.setXsddHtbh(Convert.toStr(map.get("contractCode")));
    erpXsdd.setXsddBz(Convert.toStr(map.get("remark")));

    /*销售订单明细*/
    //map.get("goodsList").stream().forEach();
    List<?> goodsList = Convert.toList(map.get("goodsList"));
    goodsList.forEach(goods->{
      ErpXsddmx erpXsddmx = new ErpXsddmx();
      //Map<String, Object> goodsInfo = (Map<String, Object>) goods;
      //erpXsddmx.setXsddmxWlbh(Convert.toStr(goods.get("materialCode")));
      Map<?, ?> goodsMap = new HashMap<>();
      goodsMap = Convert.convert(goodsMap.getClass(), goods);

      erpXsddmx.setXsddmxDdls(erpXsdd.getXsddDdls());
      erpXsddmx.setXsddmxWlbh(Convert.toStr(goodsMap.get("materialCode")));
      erpXsddmx.setXsddmxHtbh(Convert.toStr(goodsMap.get("contractCode")));
      erpXsddmx.setXsddmxPch(Convert.toStr(goodsMap.get("batch")));
      erpXsddmx.setXsddmxZsl(Convert.toInt(goodsMap.get("mainNum")));
      erpXsddmx.setXsddmxFsl1(Convert.toInt(goodsMap.get("auxNum")));
      erpXsddmx.setXsddmxYzhsj(Convert.toBigDecimal(goodsMap.get("priceWithTax")));
      erpXsddmx.setXsddmxYzxsj(Convert.toBigDecimal(goodsMap.get("priceSold")));
      erpXsddmx.setXsddmxYse(Convert.toBigDecimal(goodsMap.get("priceTax")));

      erpXsddmxList.add(erpXsddmx);
    });

    this.save(erpXsdd);
    //erpXsddmxService.saveBatch(erpXsddmxList);

    return 0;
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
