package com.extend.erp.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpXstd;
import com.extend.erp.mapper.ErpXstdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extend.erp.mapper.ErpXstdmxMapper;
import com.extend.erp.domain.ErpXstdmx;
import com.extend.erp.service.IErpXstdmxService;

/**
 * 销售提单明细Service业务层处理
 * 
 * @author wcg
 * @date 2023-10-21
 */
@Service
public class ErpXstdmxServiceImpl extends ServiceImpl<ErpXstdmxMapper, ErpXstdmx> implements IErpXstdmxService
{
    @Autowired
    private ErpXstdmxMapper erpXstdmxMapper;

    /**
     * 查询销售提单明细
     * 
     * @param xstdmxTdls 销售提单明细主键
     * @return 销售提单明细
     */
    @Override
    public ErpXstdmx selectErpXstdmxByXstdmxTdls(String xstdmxTdls)
    {
        return erpXstdmxMapper.selectErpXstdmxByXstdmxTdls(xstdmxTdls);
    }

    /**
     * 查询销售提单明细列表
     * 
     * @param erpXstdmx 销售提单明细
     * @return 销售提单明细
     */
    @Override
    public List<ErpXstdmx> selectErpXstdmxList(ErpXstdmx erpXstdmx)
    {
        return erpXstdmxMapper.selectErpXstdmxList(erpXstdmx);
    }

    /**
     * 新增销售提单明细
     * 
     * @param erpXstdmx 销售提单明细
     * @return 结果
     */
    @Override
    public int insertErpXstdmx(ErpXstdmx erpXstdmx)
    {
        return erpXstdmxMapper.insertErpXstdmx(erpXstdmx);
    }

    /**
     * 修改销售提单明细
     * 
     * @param erpXstdmx 销售提单明细
     * @return 结果
     */
    @Override
    public int updateErpXstdmx(ErpXstdmx erpXstdmx)
    {
        return erpXstdmxMapper.updateErpXstdmx(erpXstdmx);
    }

    /**
     * 批量删除销售提单明细
     * 
     * @param xstdmxTdlss 需要删除的销售提单明细主键
     * @return 结果
     */
    @Override
    public int deleteErpXstdmxByXstdmxTdlss(String[] xstdmxTdlss)
    {
        return erpXstdmxMapper.deleteErpXstdmxByXstdmxTdlss(xstdmxTdlss);
    }

    /**
     * 删除销售提单明细信息
     * 
     * @param xstdmxTdls 销售提单明细主键
     * @return 结果
     */
    @Override
    public int deleteErpXstdmxByXstdmxTdls(String xstdmxTdls)
    {
        return erpXstdmxMapper.deleteErpXstdmxByXstdmxTdls(xstdmxTdls);
    }
}
