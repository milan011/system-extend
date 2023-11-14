package com.extend.erp.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.extend.erp.domain.ErpXsdd;
import com.extend.erp.domain.ErpXsfp;

/**
 * 销售订单Mapper接口
 *
 * @author wcg
 * @date 2023-11-14
 */
public interface ErpXsddMapper extends BaseMapper<ErpXsdd> {
  /**
   * 查询销售订单
   *
   * @param xsddDdls 销售订单主键
   * @return 销售订单
   */
  public ErpXsdd selectErpXsddByXsddDdls(String xsddDdls);
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
   * 删除销售订单
   *
   * @param xsddDdls 销售订单主键
   * @return 结果
   */
  public int deleteErpXsddByXsddDdls(String xsddDdls);

  /**
   * 批量删除销售订单
   *
   * @param xsddDdlss 需要删除的数据主键集合
   * @return 结果
   */
  public int deleteErpXsddByXsddDdlss(String[] xsddDdlss);

  default List<ErpXsdd> selectErpXsddList(ErpXsdd erpXsdd){
    return selectList(new LambdaQueryWrapper<ErpXsdd>()
        .eq(erpXsdd.getXsddDdbh() != null, ErpXsdd::getXsddDdbh, erpXsdd.getXsddDdbh())
        .orderByDesc(ErpXsdd::getXsddDjrq));
  }
}
