package com.extend.erp.mapper;

import java.util.List;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.domain.ErpXsfpmx;

/**
 * 销售发票Mapper接口
 * 
 * @author wcg
 * @date 2023-10-13
 */
public interface ErpXsfpMapper 
{
    /**
     * 查询销售发票
     * 
     * @param xsfpFpls 销售发票主键
     * @return 销售发票
     */
    public ErpXsfp selectErpXsfpByXsfpFpls(String xsfpFpls);

    /**
     * 查询销售发票列表
     * 
     * @param erpXsfp 销售发票
     * @return 销售发票集合
     */
    public List<ErpXsfp> selectErpXsfpList(ErpXsfp erpXsfp);

    /**
     * 新增销售发票
     * 
     * @param erpXsfp 销售发票
     * @return 结果
     */
    public int insertErpXsfp(ErpXsfp erpXsfp);

    /**
     * 修改销售发票
     * 
     * @param erpXsfp 销售发票
     * @return 结果
     */
    public int updateErpXsfp(ErpXsfp erpXsfp);

    /**
     * 删除销售发票
     * 
     * @param xsfpFpls 销售发票主键
     * @return 结果
     */
    public int deleteErpXsfpByXsfpFpls(String xsfpFpls);

    /**
     * 批量删除销售发票
     * 
     * @param xsfpFplss 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteErpXsfpByXsfpFplss(String[] xsfpFplss);

    /**
     * 批量删除销售发票明细
     * 
     * @param xsfpFplss 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteErpXsfpmxByXsfpmxFplss(String[] xsfpFplss);
    
    /**
     * 批量新增销售发票明细
     * 
     * @param erpXsfpmxList 销售发票明细列表
     * @return 结果
     */
    public int batchErpXsfpmx(List<ErpXsfpmx> erpXsfpmxList);
    

    /**
     * 通过销售发票主键删除销售发票明细信息
     * 
     * @param xsfpFpls 销售发票ID
     * @return 结果
     */
    public int deleteErpXsfpmxByXsfpmxFpls(String xsfpFpls);
}
