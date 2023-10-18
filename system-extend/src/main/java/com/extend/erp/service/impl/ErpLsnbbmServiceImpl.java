package com.extend.erp.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpXsfpmx;
import com.extend.erp.mapper.ErpXsfpMxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extend.erp.mapper.ErpLsnbbmMapper;
import com.extend.erp.domain.ErpLsnbbm;
import com.extend.erp.service.IErpLsnbbmService;

/**
 * 流水内部编码Service业务层处理
 *
 * @author wcg
 * @date 2023-10-18
 */
@Service
public class ErpLsnbbmServiceImpl extends ServiceImpl<ErpLsnbbmMapper, ErpLsnbbm> implements IErpLsnbbmService
{
  @Autowired
  private ErpLsnbbmMapper erpLsnbbmMapper;

  /**
   * 查询流水内部编码
   *
   * @param lsnbbmXtbh 流水内部编码主键
   * @return 流水内部编码
   */
  @Override
  public ErpLsnbbm selectErpLsnbbmByLsnbbmNmbh(String lsnbbmXtbh)
  {
    return erpLsnbbmMapper.selectErpLsnbbmByLsnbbmNmbh(lsnbbmXtbh);
  }

  /**
   * 查询流水内部编码列表
   *
   * @param erpLsnbbm 流水内部编码
   * @return 流水内部编码
   */
  @Override
  public List<ErpLsnbbm> selectErpLsnbbmList(ErpLsnbbm erpLsnbbm)
  {
    return erpLsnbbmMapper.selectErpLsnbbmList(erpLsnbbm);
  }

  /**
   * 新增流水内部编码
   *
   * @param erpLsnbbm 流水内部编码
   * @return 结果
   */
  @Override
  public int insertErpLsnbbm(ErpLsnbbm erpLsnbbm)
  {
    return erpLsnbbmMapper.insertErpLsnbbm(erpLsnbbm);
  }

  /**
   * 修改流水内部编码
   *
   * @param erpLsnbbm 流水内部编码
   * @return 结果
   */
  @Override
  public int updateErpLsnbbm(ErpLsnbbm erpLsnbbm)
  {
    return erpLsnbbmMapper.updateErpLsnbbm(erpLsnbbm);
  }

  /**
   * 批量删除流水内部编码
   *
   * @param lsnbbmXtbhs 需要删除的流水内部编码主键
   * @return 结果
   */
  @Override
  public int deleteErpLsnbbmByLsnbbmXtbhs(String[] lsnbbmXtbhs)
  {
    return erpLsnbbmMapper.deleteErpLsnbbmByLsnbbmXtbhs(lsnbbmXtbhs);
  }

  /**
   * 删除流水内部编码信息
   *
   * @param lsnbbmXtbh 流水内部编码主键
   * @return 结果
   */
  @Override
  public int deleteErpLsnbbmByLsnbbmXtbh(String lsnbbmXtbh)
  {
    return erpLsnbbmMapper.deleteErpLsnbbmByLsnbbmXtbh(lsnbbmXtbh);
  }
}
