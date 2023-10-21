package com.extend.erp.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.mapper.ErpXsfpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.extend.erp.mapper.ErpXstdMapper;
import com.extend.erp.domain.ErpXstd;
import com.extend.erp.service.IErpXstdService;

/**
 * 销售提单Service业务层处理
 * 
 * @author wcg
 * @date 2023-10-21
 */
@Service
public class ErpXstdServiceImpl extends ServiceImpl<ErpXstdMapper, ErpXstd> implements IErpXstdService
{
    @Autowired
    private ErpXstdMapper erpXstdMapper;

    /**
     * 查询销售提单
     * 
     * @param xstdTdls 销售提单主键
     * @return 销售提单
     */
    @Override
    public ErpXstd selectErpXstdByXstdTdls(String xstdTdls)
    {
        return erpXstdMapper.selectErpXstdByXstdTdls(xstdTdls);
    }

    /**
     * 查询销售提单列表
     * 
     * @param erpXstd 销售提单
     * @return 销售提单
     */
    @Override
    public List<ErpXstd> selectErpXstdList(ErpXstd erpXstd)
    {
        return erpXstdMapper.selectErpXstdList(erpXstd);
    }

    /**
     * 新增销售提单
     * 
     * @param erpXstd 销售提单
     * @return 结果
     */
    @Override
    public int insertErpXstd(ErpXstd erpXstd)
    {
        return erpXstdMapper.insertErpXstd(erpXstd);
    }

    /**
     * 修改销售提单
     * 
     * @param erpXstd 销售提单
     * @return 结果
     */
    @Override
    public int updateErpXstd(ErpXstd erpXstd)
    {
        return erpXstdMapper.updateErpXstd(erpXstd);
    }

    /**
     * 批量删除销售提单
     * 
     * @param xstdTdlss 需要删除的销售提单主键
     * @return 结果
     */
    @Override
    public int deleteErpXstdByXstdTdlss(String[] xstdTdlss)
    {
        return erpXstdMapper.deleteErpXstdByXstdTdlss(xstdTdlss);
    }

    /**
     * 删除销售提单信息
     * 
     * @param xstdTdls 销售提单主键
     * @return 结果
     */
    @Override
    public int deleteErpXstdByXstdTdls(String xstdTdls)
    {
        return erpXstdMapper.deleteErpXstdByXstdTdls(xstdTdls);
    }
}
