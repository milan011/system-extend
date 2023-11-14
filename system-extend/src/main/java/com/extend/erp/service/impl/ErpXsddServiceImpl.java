package com.extend.erp.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpXsddmx;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.mapper.ErpXsddmxMapper;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extend.erp.mapper.ErpXsddMapper;
import com.extend.erp.domain.ErpXsdd;
import com.extend.erp.service.IErpXsddService;

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
