package com.extend.erp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.extend.erp.domain.ErpXsfpmx;
import com.extend.erp.mapper.ErpXsfpMapper;
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.service.IErpXsfpService;

/**
 * 销售发票Service业务层处理
 * 
 * @author wcg
 * @date 2023-10-13
 */
@Service
public class ErpXsfpServiceImpl implements IErpXsfpService 
{
    @Autowired
    private ErpXsfpMapper erpXsfpMapper;

    /**
     * 查询销售发票
     * 
     * @param xsfpFpls 销售发票主键
     * @return 销售发票
     */
    @Override
    public ErpXsfp selectErpXsfpByXsfpFpls(String xsfpFpls)
    {
        return erpXsfpMapper.selectErpXsfpByXsfpFpls(xsfpFpls);
    }

    /**
     * 查询销售发票列表
     * 
     * @param erpXsfp 销售发票
     * @return 销售发票
     */
    @Override
    public List<ErpXsfp> selectErpXsfpList(ErpXsfp erpXsfp)
    {
        return erpXsfpMapper.selectErpXsfpList(erpXsfp);
    }

    /**
     * 新增销售发票
     * 
     * @param erpXsfp 销售发票
     * @return 结果
     */
    @Transactional
    @Override
    public int insertErpXsfp(ErpXsfp erpXsfp)
    {
        int rows = erpXsfpMapper.insertErpXsfp(erpXsfp);
        insertErpXsfpmx(erpXsfp);
        return rows;
    }

    /**
     * 修改销售发票
     * 
     * @param erpXsfp 销售发票
     * @return 结果
     */
    @Transactional
    @Override
    public int updateErpXsfp(ErpXsfp erpXsfp)
    {
        erpXsfpMapper.deleteErpXsfpmxByXsfpmxFpls(erpXsfp.getXsfpFpls());
        insertErpXsfpmx(erpXsfp);
        return erpXsfpMapper.updateErpXsfp(erpXsfp);
    }

    /**
     * 批量删除销售发票
     * 
     * @param xsfpFplss 需要删除的销售发票主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteErpXsfpByXsfpFplss(String[] xsfpFplss)
    {
        erpXsfpMapper.deleteErpXsfpmxByXsfpmxFplss(xsfpFplss);
        return erpXsfpMapper.deleteErpXsfpByXsfpFplss(xsfpFplss);
    }

    /**
     * 删除销售发票信息
     * 
     * @param xsfpFpls 销售发票主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteErpXsfpByXsfpFpls(String xsfpFpls)
    {
        erpXsfpMapper.deleteErpXsfpmxByXsfpmxFpls(xsfpFpls);
        return erpXsfpMapper.deleteErpXsfpByXsfpFpls(xsfpFpls);
    }

    /**
     * 新增销售发票明细信息
     * 
     * @param erpXsfp 销售发票对象
     */
    public void insertErpXsfpmx(ErpXsfp erpXsfp)
    {
        List<ErpXsfpmx> erpXsfpmxList = erpXsfp.getErpXsfpmxList();
        String xsfpFpls = erpXsfp.getXsfpFpls();
        if (StringUtils.isNotNull(erpXsfpmxList))
        {
            List<ErpXsfpmx> list = new ArrayList<ErpXsfpmx>();
            for (ErpXsfpmx erpXsfpmx : erpXsfpmxList)
            {
                erpXsfpmx.setXsfpmxFpls(xsfpFpls);
                list.add(erpXsfpmx);
            }
            if (list.size() > 0)
            {
                erpXsfpMapper.batchErpXsfpmx(list);
            }
        }
    }
}
