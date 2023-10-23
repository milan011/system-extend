package com.extend.erp.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpXsfpmx;
import com.extend.erp.mapper.ErpXsfpMxMapper;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extend.erp.mapper.ErpZwzgzdMapper;
import com.extend.erp.domain.ErpZwzgzd;
import com.extend.erp.service.IErpZwzgzdService;

/**
 * 人员Service业务层处理
 *
 * @author wcg
 * @date 2023-10-19
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class ErpZwzgzdServiceImpl extends ServiceImpl<ErpZwzgzdMapper, ErpZwzgzd> implements IErpZwzgzdService
{
  @Autowired
  private ErpZwzgzdMapper erpZwzgzdMapper;

  /**
   * 查询人员
   *
   * @param zwzgzdZgbh 人员主键
   * @return 人员
   */
  @Override
  public ErpZwzgzd selectErpZwzgzdByZwzgzdZgbh(String zwzgzdZgbh)
  {
    return erpZwzgzdMapper.selectErpZwzgzdByZwzgzdZgbh(zwzgzdZgbh);
  }

  /**
   * 查询人员列表
   *
   * @param erpZwzgzd 人员
   * @return 人员
   */
  @Override
  public List<ErpZwzgzd> selectErpZwzgzdList(ErpZwzgzd erpZwzgzd)
  {
    return erpZwzgzdMapper.selectErpZwzgzdList(erpZwzgzd);
  }

  @Override
  public List<ErpZwzgzd> selectErpZwzgzdListByZgbh(List<String> zgbhList) {
    return erpZwzgzdMapper.selectErpZwzgzdList(zgbhList);
  }

  /**
   * 新增人员
   *
   * @param erpZwzgzd 人员
   * @return 结果
   */
  @Override
  public int insertErpZwzgzd(ErpZwzgzd erpZwzgzd)
  {
    return erpZwzgzdMapper.insertErpZwzgzd(erpZwzgzd);
  }

  /**
   * 修改人员
   *
   * @param erpZwzgzd 人员
   * @return 结果
   */
  @Override
  public int updateErpZwzgzd(ErpZwzgzd erpZwzgzd)
  {
    return erpZwzgzdMapper.updateErpZwzgzd(erpZwzgzd);
  }

  /**
   * 批量删除人员
   *
   * @param zwzgzdZgbhs 需要删除的人员主键
   * @return 结果
   */
  @Override
  public int deleteErpZwzgzdByZwzgzdZgbhs(String[] zwzgzdZgbhs)
  {
    return erpZwzgzdMapper.deleteErpZwzgzdByZwzgzdZgbhs(zwzgzdZgbhs);
  }

  /**
   * 删除人员信息
   *
   * @param zwzgzdZgbh 人员主键
   * @return 结果
   */
  @Override
  public int deleteErpZwzgzdByZwzgzdZgbh(String zwzgzdZgbh)
  {
    return erpZwzgzdMapper.deleteErpZwzgzdByZwzgzdZgbh(zwzgzdZgbh);
  }

  public ErpZwzgzd getKhInfoByRybh(String kh) {
    return erpZwzgzdMapper.getKhInfoByRybh(kh);
  }
}
