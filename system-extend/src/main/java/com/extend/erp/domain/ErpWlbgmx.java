package com.extend.erp.domain;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;


/**
 * 物料对象 erp_wlbgmx
 * 
 * @author wcg
 * @date 2023-07-11
 */
@DataSource(value = DataSourceType.SLAVE)
public class ErpWlbgmx extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 物料编号 */
    @Excel(name = "物料编号")
    private String WLBH;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String WLMC;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String GGXH;

    /** pch */
    @Excel(name = "pch")
    private String PCH;

    /** 备注 */
    @Excel(name = "备注")
    private String BZ;

    public void setWLBH(String WLBH) 
    {
        this.WLBH = WLBH;
    }

    public String getWLBH() 
    {
        return WLBH;
    }
    public void setWLMC(String WLMC) 
    {
        this.WLMC = WLMC;
    }

    public String getWLMC() 
    {
        return WLMC;
    }
    public void setGGXH(String GGXH) 
    {
        this.GGXH = GGXH;
    }

    public String getGGXH() 
    {
        return GGXH;
    }
    public void setPCH(String PCH) 
    {
        this.PCH = PCH;
    }

    public String getPCH() 
    {
        return PCH;
    }
    public void setBZ(String BZ) 
    {
        this.BZ = BZ;
    }

    public String getBZ() 
    {
        return BZ;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("WLBH", getWLBH())
            .append("WLMC", getWLMC())
            .append("GGXH", getGGXH())
            .append("PCH", getPCH())
            .append("BZ", getBZ())
            .toString();
    }
}
