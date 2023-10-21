package com.extend.erp.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.domain.ErpXstd;

/**
 * 销售提单Service接口
 *
 * @author wcg
 * @date 2023-10-21
 */
public interface IErpXstdService extends IService<ErpXstd>
{
    /**
     * 查询销售提单
     * 
     * @param xstdTdls 销售提单主键
     * @return 销售提单
     */
    public ErpXstd selectErpXstdByXstdTdls(String xstdTdls);

    /**
     * 查询销售提单列表
     * 
     * @param erpXstd 销售提单
     * @return 销售提单集合
     */
    public List<ErpXstd> selectErpXstdList(ErpXstd erpXstd);

    /**
     * 新增销售提单
     * 
     * @param erpXstd 销售提单
     * @return 结果
     */
    public int insertErpXstd(ErpXstd erpXstd);

    /**
     * 修改销售提单
     * 
     * @param erpXstd 销售提单
     * @return 结果
     */
    public int updateErpXstd(ErpXstd erpXstd);

    /**
     * 批量删除销售提单
     * 
     * @param xstdTdlss 需要删除的销售提单主键集合
     * @return 结果
     */
    public int deleteErpXstdByXstdTdlss(String[] xstdTdlss);

    /**
     * 删除销售提单信息
     * 
     * @param xstdTdls 销售提单主键
     * @return 结果
     */
    public int deleteErpXstdByXstdTdls(String xstdTdls);
}
