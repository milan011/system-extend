package com.extend.erp.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extend.erp.mapper.ErpWlbgmxMapper;
import com.extend.erp.domain.ErpWlbgmx;
import com.extend.erp.service.IErpWlbgmxService;

/**
 * 物料Service业务层处理
 * 
 * @author wcg
 * @date 2023-07-11
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class ErpWlbgmxServiceImpl implements IErpWlbgmxService 
{
    @Autowired
    private ErpWlbgmxMapper erpWlbgmxMapper;

    /**
     * 查询物料
     * 
     * @param WLBH 物料主键
     * @return 物料
     */
    @Override
    public ErpWlbgmx selectErpWlbgmxByWLBH(String WLBH)
    {
        return erpWlbgmxMapper.selectErpWlbgmxByWLBH(WLBH);
    }

    /**
     * 查询物料列表
     * 
     * @param erpWlbgmx 物料
     * @return 物料
     */
    @Override
    public List<ErpWlbgmx> selectErpWlbgmxList(ErpWlbgmx erpWlbgmx)
    {
        return erpWlbgmxMapper.selectErpWlbgmxList(erpWlbgmx);
    }

    /**
     * 新增物料
     * 
     * @param erpWlbgmx 物料
     * @return 结果
     */
    @Override
    public int insertErpWlbgmx(ErpWlbgmx erpWlbgmx)
    {
        return erpWlbgmxMapper.insertErpWlbgmx(erpWlbgmx);
    }

    /**
     * 修改物料
     * 
     * @param erpWlbgmx 物料
     * @return 结果
     */
    @Override
    public int updateErpWlbgmx(ErpWlbgmx erpWlbgmx)
    {
        return erpWlbgmxMapper.updateErpWlbgmx(erpWlbgmx);
    }

    /**
     * 批量删除物料
     * 
     * @param WLBHs 需要删除的物料主键
     * @return 结果
     */
    @Override
    public int deleteErpWlbgmxByWLBHs(String[] WLBHs)
    {
        return erpWlbgmxMapper.deleteErpWlbgmxByWLBHs(WLBHs);
    }

    /**
     * 删除物料信息
     * 
     * @param WLBH 物料主键
     * @return 结果
     */
    @Override
    public int deleteErpWlbgmxByWLBH(String WLBH)
    {
        return erpWlbgmxMapper.deleteErpWlbgmxByWLBH(WLBH);
    }
}
