package com.extend.erp.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.extend.erp.domain.ErpXsddmx;
import com.extend.erp.domain.ErpXsfp;

/**
 * 销售订单明细Service接口
 *
 * @author ruoyi
 * @date 2023-11-14
 */
public interface IErpXsddmxService extends IService<ErpXsddmx>
{
  /**
   * 查询销售订单明细
   *
   * @param xsddmxDdls 销售订单明细主键
   * @return 销售订单明细
   */
  public ErpXsddmx selectErpXsddmxByXsddmxDdls(String xsddmxDdls);

  /**
   * 查询销售订单明细列表
   *
   * @param erpXsddmx 销售订单明细
   * @return 销售订单明细集合
   */
  public List<ErpXsddmx> selectErpXsddmxList(ErpXsddmx erpXsddmx);

  /**
   * 新增销售订单明细
   *
   * @param erpXsddmx 销售订单明细
   * @return 结果
   */
  public int insertErpXsddmx(ErpXsddmx erpXsddmx);

  /**
   * 修改销售订单明细
   *
   * @param erpXsddmx 销售订单明细
   * @return 结果
   */
  public int updateErpXsddmx(ErpXsddmx erpXsddmx);

  /**
   * 批量删除销售订单明细
   *
   * @param xsddmxDdlss 需要删除的销售订单明细主键集合
   * @return 结果
   */
  public int deleteErpXsddmxByXsddmxDdlss(String[] xsddmxDdlss);

  /**
   * 删除销售订单明细信息
   *
   * @param xsddmxDdls 销售订单明细主键
   * @return 结果
   */
  public int deleteErpXsddmxByXsddmxDdls(String xsddmxDdls);
}
