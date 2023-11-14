package com.extend.erp.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.extend.erp.domain.ErpXsddmx;

/**
 * 销售订单明细Mapper接口
 *
 * @author ruoyi
 * @date 2023-11-14
 */
public interface ErpXsddmxMapper extends BaseMapper<ErpXsddmx> {
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
   * 删除销售订单明细
   *
   * @param xsddmxDdls 销售订单明细主键
   * @return 结果
   */
  public int deleteErpXsddmxByXsddmxDdls(String xsddmxDdls);

  /**
   * 批量删除销售订单明细
   *
   * @param xsddmxDdlss 需要删除的数据主键集合
   * @return 结果
   */
  public int deleteErpXsddmxByXsddmxDdlss(String[] xsddmxDdlss);
}
