package com.extend.erp.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.mapper.ErpXsfpMapper;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extend.erp.mapper.ErpXsddmxMapper;
import com.extend.erp.domain.ErpXsddmx;
import com.extend.erp.service.IErpXsddmxService;

/**
 * 销售订单明细Service业务层处理
 *
 * @author ruoyi
 * @date 2023-11-14
 */
@DataSource(value = DataSourceType.SLAVE)
@Service
public class ErpXsddmxServiceImpl extends ServiceImpl<ErpXsddmxMapper, ErpXsddmx> implements IErpXsddmxService
{
  @Autowired
  private ErpXsddmxMapper erpXsddmxMapper;

  /**
   * 查询销售订单明细
   *
   * @param xsddmxDdls 销售订单明细主键
   * @return 销售订单明细
   */
  @Override
  public ErpXsddmx selectErpXsddmxByXsddmxDdls(String xsddmxDdls)
  {
    return erpXsddmxMapper.selectErpXsddmxByXsddmxDdls(xsddmxDdls);
  }

  /**
   * 查询销售订单明细列表
   *
   * @param erpXsddmx 销售订单明细
   * @return 销售订单明细
   */
  @Override
  public List<ErpXsddmx> selectErpXsddmxList(ErpXsddmx erpXsddmx)
  {
    return erpXsddmxMapper.selectErpXsddmxList(erpXsddmx);
  }

  /**
   * 新增销售订单明细
   *
   * @param erpXsddmx 销售订单明细
   * @return 结果
   */
  @Override
  public int insertErpXsddmx(ErpXsddmx erpXsddmx)
  {
    return erpXsddmxMapper.insertErpXsddmx(erpXsddmx);
  }

  /**
   * 修改销售订单明细
   *
   * @param erpXsddmx 销售订单明细
   * @return 结果
   */
  @Override
  public int updateErpXsddmx(ErpXsddmx erpXsddmx)
  {
    return erpXsddmxMapper.updateErpXsddmx(erpXsddmx);
  }

  /**
   * 批量删除销售订单明细
   *
   * @param xsddmxDdlss 需要删除的销售订单明细主键
   * @return 结果
   */
  @Override
  public int deleteErpXsddmxByXsddmxDdlss(String[] xsddmxDdlss)
  {
    return erpXsddmxMapper.deleteErpXsddmxByXsddmxDdlss(xsddmxDdlss);
  }

  /**
   * 删除销售订单明细信息
   *
   * @param xsddmxDdls 销售订单明细主键
   * @return 结果
   */
  @Override
  public int deleteErpXsddmxByXsddmxDdls(String xsddmxDdls)
  {
    return erpXsddmxMapper.deleteErpXsddmxByXsddmxDdls(xsddmxDdls);
  }
}
