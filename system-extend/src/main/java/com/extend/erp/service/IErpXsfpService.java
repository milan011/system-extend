package com.extend.erp.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.domain.ErpXsfpImport;

import java.util.List;

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

    public ErpXsfp getXsfpInfo();

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

    /**
     * 导入发票数据
     *
     * @param xsfpExcelList 发票数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    public String importXsfp(List<ErpXsfpImport> xsfpExcelList, Boolean isUpdateSupport, String operName);
}
