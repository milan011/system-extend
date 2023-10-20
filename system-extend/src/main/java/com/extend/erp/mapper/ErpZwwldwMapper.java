package com.extend.erp.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.domain.ErpXsfpmx;
import com.extend.erp.domain.ErpZwwldw;

/**
 * 往来单位Mapper接口
 *
 * @author wcg
 * @date 2023-10-19
 */
public interface ErpZwwldwMapper extends BaseMapper<ErpZwwldw>
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
   * 删除往来单位
   *
   * @param zwwldwDwbh 往来单位主键
   * @return 结果
   */
  public int deleteErpZwwldwByZwwldwDwbh(String zwwldwDwbh);

  /**
   * 批量删除往来单位
   *
   * @param zwwldwDwbhs 需要删除的数据主键集合
   * @return 结果
   */
  public int deleteErpZwwldwByZwwldwDwbhs(String[] zwwldwDwbhs);


  default List<ErpZwwldw> selectErpZwwldwListByDwbh(List<String> dwbhArr){
    return selectList(new LambdaQueryWrapper<ErpZwwldw>()
        .in(ErpZwwldw::getZwwldwDwbh, dwbhArr));
  }
}
