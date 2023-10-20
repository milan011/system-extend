package com.extend.erp.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.domain.ErpZwwldw;

/**
 * 往来单位Service接口
 *
 * @author wcg
 * @date 2023-10-19
 */
public interface IErpZwwldwService extends IService<ErpZwwldw>
{
  /**
   * 查询往来单位
   *
   * @param zwwldwDwbh 往来单位主键
   * @return 往来单位
   */
  public ErpZwwldw selectErpZwwldwByZwwldwDwbh(String zwwldwDwbh);

  /**
   * 查询往来单位列表
   *
   * @param erpZwwldw 往来单位
   * @return 往来单位集合
   */
  public List<ErpZwwldw> selectErpZwwldwList(ErpZwwldw erpZwwldw);

  /**
   * 获取往来单位列表-根据编号数组
   */

  public List<ErpZwwldw> selectErpZwwldwListByDwbh(List<String> dwbhArr);

  /**
   * 新增往来单位
   *
   * @param erpZwwldw 往来单位
   * @return 结果
   */
  public int insertErpZwwldw(ErpZwwldw erpZwwldw);

  /**
   * 修改往来单位
   *
   * @param erpZwwldw 往来单位
   * @return 结果
   */
  public int updateErpZwwldw(ErpZwwldw erpZwwldw);

  /**
   * 批量删除往来单位
   *
   * @param zwwldwDwbhs 需要删除的往来单位主键集合
   * @return 结果
   */
  public int deleteErpZwwldwByZwwldwDwbhs(String[] zwwldwDwbhs);

  /**
   * 删除往来单位信息
   *
   * @param zwwldwDwbh 往来单位主键
   * @return 结果
   */
  public int deleteErpZwwldwByZwwldwDwbh(String zwwldwDwbh);
}
