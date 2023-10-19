package com.extend.erp.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.extend.erp.domain.ErpXsfpmx;
import com.extend.erp.domain.ErpZwzgzd;

/**
 * 人员Mapper接口
 *
 * @author wcg
 * @date 2023-10-19
 */
public interface ErpZwzgzdMapper extends BaseMapper<ErpZwzgzd>
{
  /**
   * 查询人员
   *
   * @param zwzgzdZgbh 人员主键
   * @return 人员
   */
  public ErpZwzgzd selectErpZwzgzdByZwzgzdZgbh(String zwzgzdZgbh);

  /**
   * 查询人员列表
   *
   * @param erpZwzgzd 人员
   * @return 人员集合
   */
  public List<ErpZwzgzd> selectErpZwzgzdList(ErpZwzgzd erpZwzgzd);

  /**
   * 新增人员
   *
   * @param erpZwzgzd 人员
   * @return 结果
   */
  public int insertErpZwzgzd(ErpZwzgzd erpZwzgzd);

  /**
   * 修改人员
   *
   * @param erpZwzgzd 人员
   * @return 结果
   */
  public int updateErpZwzgzd(ErpZwzgzd erpZwzgzd);

  /**
   * 删除人员
   *
   * @param zwzgzdZgbh 人员主键
   * @return 结果
   */
  public int deleteErpZwzgzdByZwzgzdZgbh(String zwzgzdZgbh);

  /**
   * 批量删除人员
   *
   * @param zwzgzdZgbhs 需要删除的数据主键集合
   * @return 结果
   */
  public int deleteErpZwzgzdByZwzgzdZgbhs(String[] zwzgzdZgbhs);
}
