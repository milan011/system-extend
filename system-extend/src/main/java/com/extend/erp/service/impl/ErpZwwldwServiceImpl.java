package com.extend.erp.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpXsfpmx;
import com.extend.erp.mapper.ErpXsfpMxMapper;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extend.erp.mapper.ErpZwwldwMapper;
import com.extend.erp.domain.ErpZwwldw;
import com.extend.erp.service.IErpZwwldwService;

/**
 * 往来单位Service业务层处理
 *
 * @author wcg
 * @date 2023-10-19
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class ErpZwwldwServiceImpl extends ServiceImpl<ErpZwwldwMapper, ErpZwwldw> implements IErpZwwldwService
{
  @Autowired
  private ErpZwwldwMapper erpZwwldwMapper;

  /**
   * 查询往来单位
   *
   * @param zwwldwDwbh 往来单位主键
   * @return 往来单位
   */
  @Override
  public ErpZwwldw selectErpZwwldwByZwwldwDwbh(String zwwldwDwbh)
  {
    return erpZwwldwMapper.selectErpZwwldwByZwwldwDwbh(zwwldwDwbh);
  }

  /**
   * 查询往来单位列表
   *
   * @param erpZwwldw 往来单位
   * @return 往来单位
   */
  @Override
  public List<ErpZwwldw> selectErpZwwldwList(ErpZwwldw erpZwwldw)
  {
    return erpZwwldwMapper.selectErpZwwldwList(erpZwwldw);
  }

  @Override
  public List<ErpZwwldw> selectErpZwwldwListByDwbh(List<String> dwbhArr) {
    return erpZwwldwMapper.selectErpZwwldwListByDwbh(dwbhArr);
  }

  /**
   * 新增往来单位
   *
   * @param erpZwwldw 往来单位
   * @return 结果
   */
  @Override
  public int insertErpZwwldw(ErpZwwldw erpZwwldw)
  {
    return erpZwwldwMapper.insertErpZwwldw(erpZwwldw);
  }

  /**
   * 修改往来单位
   *
   * @param erpZwwldw 往来单位
   * @return 结果
   */
  @Override
  public int updateErpZwwldw(ErpZwwldw erpZwwldw)
  {
    return erpZwwldwMapper.updateErpZwwldw(erpZwwldw);
  }

  /**
   * 批量删除往来单位
   *
   * @param zwwldwDwbhs 需要删除的往来单位主键
   * @return 结果
   */
  @Override
  public int deleteErpZwwldwByZwwldwDwbhs(String[] zwwldwDwbhs)
  {
    return erpZwwldwMapper.deleteErpZwwldwByZwwldwDwbhs(zwwldwDwbhs);
  }

  /**
   * 删除往来单位信息
   *
   * @param zwwldwDwbh 往来单位主键
   * @return 结果
   */
  @Override
  public int deleteErpZwwldwByZwwldwDwbh(String zwwldwDwbh)
  {
    return erpZwwldwMapper.deleteErpZwwldwByZwwldwDwbh(zwwldwDwbh);
  }

  @Override
  public ErpZwwldw getKhInfoByKhbh(String kh) {
    return erpZwwldwMapper.getKhInfoByKhbh(kh);
  }
}
