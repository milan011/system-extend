package com.extend.erp.service;

import java.util.List;
import com.extend.erp.domain.ErpWlbgmx;

/**
 * 物料Service接口
 * 
 * @author wcg
 * @date 2023-07-11
 */
public interface IErpWlbgmxService 
{
    /**
     * 查询物料
     * 
     * @param WLBH 物料主键
     * @return 物料
     */
    public ErpWlbgmx selectErpWlbgmxByWLBH(String WLBH);

    /**
     * 查询物料列表
     * 
     * @param erpWlbgmx 物料
     * @return 物料集合
     */
    public List<ErpWlbgmx> selectErpWlbgmxList(ErpWlbgmx erpWlbgmx);

    /**
     * 新增物料
     * 
     * @param erpWlbgmx 物料
     * @return 结果
     */
    public int insertErpWlbgmx(ErpWlbgmx erpWlbgmx);

    /**
     * 修改物料
     * 
     * @param erpWlbgmx 物料
     * @return 结果
     */
    public int updateErpWlbgmx(ErpWlbgmx erpWlbgmx);

    /**
     * 批量删除物料
     * 
     * @param WLBHs 需要删除的物料主键集合
     * @return 结果
     */
    public int deleteErpWlbgmxByWLBHs(String[] WLBHs);

    /**
     * 删除物料信息
     * 
     * @param WLBH 物料主键
     * @return 结果
     */
    public int deleteErpWlbgmxByWLBH(String WLBH);
}
