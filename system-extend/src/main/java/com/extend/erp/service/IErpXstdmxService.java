package com.extend.erp.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.extend.erp.domain.ErpXstd;
import com.extend.erp.domain.ErpXstdmx;

/**
 * 销售提单明细Service接口
 *
 * @author wcg
 * @date 2023-10-21
 */
public interface IErpXstdmxService extends IService<ErpXstdmx>
{
    /**
     * 查询销售提单明细
     * 
     * @param xstdmxTdls 销售提单明细主键
     * @return 销售提单明细
     */
    public ErpXstdmx selectErpXstdmxByXstdmxTdls(String xstdmxTdls);

    /**
     * 查询销售提单明细列表
     * 
     * @param erpXstdmx 销售提单明细
     * @return 销售提单明细集合
     */
    public List<ErpXstdmx> selectErpXstdmxList(ErpXstdmx erpXstdmx);

    /**
     * 新增销售提单明细
     * 
     * @param erpXstdmx 销售提单明细
     * @return 结果
     */
    public int insertErpXstdmx(ErpXstdmx erpXstdmx);

    /**
     * 修改销售提单明细
     * 
     * @param erpXstdmx 销售提单明细
     * @return 结果
     */
    public int updateErpXstdmx(ErpXstdmx erpXstdmx);

    /**
     * 批量删除销售提单明细
     * 
     * @param xstdmxTdlss 需要删除的销售提单明细主键集合
     * @return 结果
     */
    public int deleteErpXstdmxByXstdmxTdlss(String[] xstdmxTdlss);

    /**
     * 删除销售提单明细信息
     * 
     * @param xstdmxTdls 销售提单明细主键
     * @return 结果
     */
    public int deleteErpXstdmxByXstdmxTdls(String xstdmxTdls);
}
