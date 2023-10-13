package com.extend.erp.service;

import java.util.List;
import com.extend.erp.domain.ErpXsfp;

/**
 * 销售发票Service接口
 * 
 * @author wcg
 * @date 2023-10-13
 */
public interface IErpXsfpService 
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
     * 批量删除销售发票
     * 
     * @param xsfpFplss 需要删除的销售发票主键集合
     * @return 结果
     */
    public int deleteErpXsfpByXsfpFplss(String[] xsfpFplss);

    /**
     * 删除销售发票信息
     * 
     * @param xsfpFpls 销售发票主键
     * @return 结果
     */
    public int deleteErpXsfpByXsfpFpls(String xsfpFpls);
}
