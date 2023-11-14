package com.extend.erp.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.extend.erp.domain.ErpXsdd;
import com.extend.erp.domain.ErpXsfp;

/**
 * 销售订单Service接口
 *
 * @author wcg
 * @date 2023-11-14
 */
public interface IErpXsddService extends IService<ErpXsdd>
{
  /**
   * 查询销售订单
   *
   * @param xsddDdls 销售订单主键
   * @return 销售订单
   */
  public ErpXsdd selectErpXsddByXsddDdls(String xsddDdls);

  /**
   * 查询销售订单列表
   *
   * @param erpXsdd 销售订单
   * @return 销售订单集合
   */
  public List<ErpXsdd> selectErpXsddList(ErpXsdd erpXsdd);

  /**
   * 新增销售订单
   *
   * @param erpXsdd 销售订单
   * @return 结果
   */
  public int insertErpXsdd(ErpXsdd erpXsdd);

  /**
   * 修改销售订单
   *
   * @param erpXsdd 销售订单
   * @return 结果
   */
  public int updateErpXsdd(ErpXsdd erpXsdd);

  /**
   * 批量删除销售订单
   *
   * @param xsddDdlss 需要删除的销售订单主键集合
   * @return 结果
   */
  public int deleteErpXsddByXsddDdlss(String[] xsddDdlss);

  /**
   * 删除销售订单信息
   *
   * @param xsddDdls 销售订单主键
   * @return 结果
   */
  public int deleteErpXsddByXsddDdls(String xsddDdls);

}
