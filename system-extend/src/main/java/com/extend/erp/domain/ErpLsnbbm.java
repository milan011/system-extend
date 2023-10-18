package com.extend.erp.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 流水内部编码对象 erp_lsnbbm
 * 
 * @author wcg
 * @date 2023-10-18
 */
@DataSource(value = DataSourceType.SLAVE)
@TableName("LSNBBM")
public class ErpLsnbbm
{
    private static final long serialVersionUID = 1L;

    /** 系统编号 */
    @Excel(name = "系统编号")
    private String lsnbbmXtbh;

    /** 内码编号 */
    @Excel(name = "内码编号")
    private String lsnbbmNmbh;

    /** 内码名称 */
    @Excel(name = "内码名称")
    private String lsnbbmNmmc;

    /** 当前内码 */
    @Excel(name = "当前内码")
    private String lsnbbmDqnm;

    /** 内码菜单 */
    private Integer lsnbbmNmcd;

    /** 范围周期 */
    private String lsnbbmFwzq;

    public void setLsnbbmXtbh(String lsnbbmXtbh) 
    {
        this.lsnbbmXtbh = lsnbbmXtbh;
    }

    public String getLsnbbmXtbh() 
    {
        return lsnbbmXtbh;
    }
    public void setLsnbbmNmbh(String lsnbbmNmbh) 
    {
        this.lsnbbmNmbh = lsnbbmNmbh;
    }

    public String getLsnbbmNmbh() 
    {
        return lsnbbmNmbh;
    }
    public void setLsnbbmNmmc(String lsnbbmNmmc) 
    {
        this.lsnbbmNmmc = lsnbbmNmmc;
    }

    public String getLsnbbmNmmc() 
    {
        return lsnbbmNmmc;
    }
    public void setLsnbbmDqnm(String lsnbbmDqnm) 
    {
        this.lsnbbmDqnm = lsnbbmDqnm;
    }

    public String getLsnbbmDqnm() 
    {
        return lsnbbmDqnm;
    }
    public void setLsnbbmNmcd(Integer lsnbbmNmcd) 
    {
        this.lsnbbmNmcd = lsnbbmNmcd;
    }

    public Integer getLsnbbmNmcd() 
    {
        return lsnbbmNmcd;
    }
    public void setLsnbbmFwzq(String lsnbbmFwzq) 
    {
        this.lsnbbmFwzq = lsnbbmFwzq;
    }

    public String getLsnbbmFwzq() 
    {
        return lsnbbmFwzq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("lsnbbmXtbh", getLsnbbmXtbh())
            .append("lsnbbmNmbh", getLsnbbmNmbh())
            .append("lsnbbmNmmc", getLsnbbmNmmc())
            .append("lsnbbmDqnm", getLsnbbmDqnm())
            .append("lsnbbmNmcd", getLsnbbmNmcd())
            .append("lsnbbmFwzq", getLsnbbmFwzq())
            .toString();
    }
}
