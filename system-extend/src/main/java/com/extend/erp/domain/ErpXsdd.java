package com.extend.erp.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * 销售订单对象 erp_xsdd
 * 
 * @author wcg
 * @date 2023-11-14
 */
@DataSource(value = DataSourceType.SLAVE)
@TableName("XSDD")
@Data
public class ErpXsdd
{
    private static final long serialVersionUID = 1L;

    /** 订单流水 */
    @Excel(name = "订单流水")
    private String xsddDdls;

    /** 单据日期 */
    @Excel(name = "单据日期")
    private String xsddDjrq;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String xsddDdbh;

    /** QC标志 */
    private String xsddQcbz;

    /** 品级类型 */
    private String xsddPjlx;

    /** 业务标识 */
    private String xsddYwbs;

    /** 订单标志 */
    private String xsddDdbz;

    /** 订单状态 */
    private String xsddDdzt;

    /** 类型编号 */
    private String xsddLxbh;

    /** 售达客户 */
    @Excel(name = "售达客户")
    private String xsddShdkh;

    /** 售达客户编号 */
    private String xsddShdkhmc;

    /** 送达客户 */
    private String xsddSodkh;

    /** 送达客户编号 */
    private String xsddSodkhmc;

    /** 收票客户 */
    private String xsddSpkh;

    /** 收票客户编号 */
    private String xsddSpkhmc;

    /** 付款客户 */
    private String xsddFkkh;

    /** 付款客户编号 */
    private String xsddFkkhmc;

    /** 收发流水 */
    @Excel(name = "收发流水")
    private String xsddSfls;

    /** 部门编号 */
    private String xsddBmbh;

    /** 人员编号 */
    private String xsddRybh;

    /** 币种 */
    private String xsddWbbh;

    /** 汇率 */
    private Integer xsddHl;

    /** 底价 */
    @Excel(name = "底价")
    private BigDecimal xsddXsdj;

    /** 在库政策 */
    private String xsddZkzc;

    /** 附属编号 */
    private String xsddFsbh;

    /** 业务日期 */
    private String xsddYwrq;

    /** SP日期 */
    private String xsddSprq;

    /** 修改时间 */
    private String xsddXgsj;

    /** XSDD_WFDB */
    private String xsddWfdb;

    /** XSDD_DFDB */
    private String xsddDfdb;

    /** XSDD_LXR */
    private String xsddLxr;

    /** 到货地点 */
    private String xsddDhdd;

    /** 调整日期 */
    private String xsddTzrq;

    /** 批准人 */
    private String xsddPzr;

    /** 制单人 */
    private String xsddZdxm;

    /** 审核流程 */
    private String xsddShlc;

    /** 审核标志 */
    private String xsddShbz;

    /** 审核日期 */
    private String xsddShrq;

    /** 审核人 */
    private String xsddShxm;

    /** 文本1 */
    private String xsddC1;

    /** $column.columnComment */
    private String xsddC2;

    /** $column.columnComment */
    private String xsddC3;

    /** $column.columnComment */
    private String xsddC4;

    /** $column.columnComment */
    private String xsddC5;

    /** $column.columnComment */
    private String xsddC6;

    /** $column.columnComment */
    private String xsddC7;

    /** $column.columnComment */
    private String xsddC8;

    /** $column.columnComment */
    private String xsddC9;

    /** $column.columnComment */
    private String xsddC10;

    /** $column.columnComment */
    private Integer xsddU1;

    /** $column.columnComment */
    private Integer xsddU2;

    /** $column.columnComment */
    private Integer xsddU3;

    /** $column.columnComment */
    private Integer xsddU4;

    /** $column.columnComment */
    private Integer xsddU5;

    /** $column.columnComment */
    private Integer xsddU6;

    /** 业务编号 */
    private String xsddYwbh;

    /** 打印原因 */
    private String xsddDyperson;

    /** 打印日期 */
    private String xsddDydate;

    /** XSDD_HTBH */
    private String xsddHtbh;

    /** XSDD_HTLS */
    private String xsddHtls;

    /** $column.columnComment */
    private String xsddSfczx;

    /** $column.columnComment */
    private String xsddSfcdj;

    /** $column.columnComment */
    private String xsddSfqr;

    /** $column.columnComment */
    private String xsddSfxg;

    /** $column.columnComment */
    private String xsddSfsc;

    /** $column.columnComment */
    private String xsddSfjz;

    /** $column.columnComment */
    private Integer xsddYhke;

    /** 备注 */
    @Excel(name = "备注")
    private String xsddBz;

    /** $column.columnComment */
    private String xsddSffp;

    /** $column.columnComment */
    private String xsddGsbh;

    /** $column.columnComment */
    private String xsddXyls;

    public void setXsddDdls(String xsddDdls) 
    {
        this.xsddDdls = xsddDdls;
    }

    public String getXsddDdls() 
    {
        return xsddDdls;
    }
    public void setXsddDjrq(String xsddDjrq) 
    {
        this.xsddDjrq = xsddDjrq;
    }

    public String getXsddDjrq() 
    {
        return xsddDjrq;
    }
    public void setXsddDdbh(String xsddDdbh) 
    {
        this.xsddDdbh = xsddDdbh;
    }

    public String getXsddDdbh() 
    {
        return xsddDdbh;
    }
    public void setXsddQcbz(String xsddQcbz) 
    {
        this.xsddQcbz = xsddQcbz;
    }

    public String getXsddQcbz() 
    {
        return xsddQcbz;
    }
    public void setXsddPjlx(String xsddPjlx) 
    {
        this.xsddPjlx = xsddPjlx;
    }

    public String getXsddPjlx() 
    {
        return xsddPjlx;
    }
    public void setXsddYwbs(String xsddYwbs) 
    {
        this.xsddYwbs = xsddYwbs;
    }

    public String getXsddYwbs() 
    {
        return xsddYwbs;
    }
    public void setXsddDdbz(String xsddDdbz) 
    {
        this.xsddDdbz = xsddDdbz;
    }

    public String getXsddDdbz() 
    {
        return xsddDdbz;
    }
    public void setXsddDdzt(String xsddDdzt) 
    {
        this.xsddDdzt = xsddDdzt;
    }

    public String getXsddDdzt() 
    {
        return xsddDdzt;
    }
    public void setXsddLxbh(String xsddLxbh) 
    {
        this.xsddLxbh = xsddLxbh;
    }

    public String getXsddLxbh() 
    {
        return xsddLxbh;
    }
    public void setXsddShdkh(String xsddShdkh) 
    {
        this.xsddShdkh = xsddShdkh;
    }

    public String getXsddShdkh() 
    {
        return xsddShdkh;
    }
    public void setXsddShdkhmc(String xsddShdkhmc) 
    {
        this.xsddShdkhmc = xsddShdkhmc;
    }

    public String getXsddShdkhmc() 
    {
        return xsddShdkhmc;
    }
    public void setXsddSodkh(String xsddSodkh) 
    {
        this.xsddSodkh = xsddSodkh;
    }

    public String getXsddSodkh() 
    {
        return xsddSodkh;
    }
    public void setXsddSodkhmc(String xsddSodkhmc) 
    {
        this.xsddSodkhmc = xsddSodkhmc;
    }

    public String getXsddSodkhmc() 
    {
        return xsddSodkhmc;
    }
    public void setXsddSpkh(String xsddSpkh) 
    {
        this.xsddSpkh = xsddSpkh;
    }

    public String getXsddSpkh() 
    {
        return xsddSpkh;
    }
    public void setXsddSpkhmc(String xsddSpkhmc) 
    {
        this.xsddSpkhmc = xsddSpkhmc;
    }

    public String getXsddSpkhmc() 
    {
        return xsddSpkhmc;
    }
    public void setXsddFkkh(String xsddFkkh) 
    {
        this.xsddFkkh = xsddFkkh;
    }

    public String getXsddFkkh() 
    {
        return xsddFkkh;
    }
    public void setXsddFkkhmc(String xsddFkkhmc) 
    {
        this.xsddFkkhmc = xsddFkkhmc;
    }

    public String getXsddFkkhmc() 
    {
        return xsddFkkhmc;
    }
    public void setXsddSfls(String xsddSfls) 
    {
        this.xsddSfls = xsddSfls;
    }

    public String getXsddSfls() 
    {
        return xsddSfls;
    }
    public void setXsddBmbh(String xsddBmbh) 
    {
        this.xsddBmbh = xsddBmbh;
    }

    public String getXsddBmbh() 
    {
        return xsddBmbh;
    }
    public void setXsddRybh(String xsddRybh) 
    {
        this.xsddRybh = xsddRybh;
    }

    public String getXsddRybh() 
    {
        return xsddRybh;
    }
    public void setXsddWbbh(String xsddWbbh) 
    {
        this.xsddWbbh = xsddWbbh;
    }

    public String getXsddWbbh() 
    {
        return xsddWbbh;
    }
    public void setXsddHl(Integer xsddHl) 
    {
        this.xsddHl = xsddHl;
    }

    public Integer getXsddHl() 
    {
        return xsddHl;
    }
    public void setXsddXsdj(BigDecimal xsddXsdj)
    {
        this.xsddXsdj = xsddXsdj;
    }

    public BigDecimal getXsddXsdj()
    {
        return xsddXsdj;
    }
    public void setXsddZkzc(String xsddZkzc) 
    {
        this.xsddZkzc = xsddZkzc;
    }

    public String getXsddZkzc() 
    {
        return xsddZkzc;
    }
    public void setXsddFsbh(String xsddFsbh) 
    {
        this.xsddFsbh = xsddFsbh;
    }

    public String getXsddFsbh() 
    {
        return xsddFsbh;
    }
    public void setXsddYwrq(String xsddYwrq) 
    {
        this.xsddYwrq = xsddYwrq;
    }

    public String getXsddYwrq() 
    {
        return xsddYwrq;
    }
    public void setXsddSprq(String xsddSprq) 
    {
        this.xsddSprq = xsddSprq;
    }

    public String getXsddSprq() 
    {
        return xsddSprq;
    }
    public void setXsddXgsj(String xsddXgsj) 
    {
        this.xsddXgsj = xsddXgsj;
    }

    public String getXsddXgsj() 
    {
        return xsddXgsj;
    }
    public void setXsddWfdb(String xsddWfdb) 
    {
        this.xsddWfdb = xsddWfdb;
    }

    public String getXsddWfdb() 
    {
        return xsddWfdb;
    }
    public void setXsddDfdb(String xsddDfdb) 
    {
        this.xsddDfdb = xsddDfdb;
    }

    public String getXsddDfdb() 
    {
        return xsddDfdb;
    }
    public void setXsddLxr(String xsddLxr) 
    {
        this.xsddLxr = xsddLxr;
    }

    public String getXsddLxr() 
    {
        return xsddLxr;
    }
    public void setXsddDhdd(String xsddDhdd) 
    {
        this.xsddDhdd = xsddDhdd;
    }

    public String getXsddDhdd() 
    {
        return xsddDhdd;
    }
    public void setXsddTzrq(String xsddTzrq) 
    {
        this.xsddTzrq = xsddTzrq;
    }

    public String getXsddTzrq() 
    {
        return xsddTzrq;
    }
    public void setXsddPzr(String xsddPzr) 
    {
        this.xsddPzr = xsddPzr;
    }

    public String getXsddPzr() 
    {
        return xsddPzr;
    }
    public void setXsddZdxm(String xsddZdxm) 
    {
        this.xsddZdxm = xsddZdxm;
    }

    public String getXsddZdxm() 
    {
        return xsddZdxm;
    }
    public void setXsddShlc(String xsddShlc) 
    {
        this.xsddShlc = xsddShlc;
    }

    public String getXsddShlc() 
    {
        return xsddShlc;
    }
    public void setXsddShbz(String xsddShbz) 
    {
        this.xsddShbz = xsddShbz;
    }

    public String getXsddShbz() 
    {
        return xsddShbz;
    }
    public void setXsddShrq(String xsddShrq) 
    {
        this.xsddShrq = xsddShrq;
    }

    public String getXsddShrq() 
    {
        return xsddShrq;
    }
    public void setXsddShxm(String xsddShxm) 
    {
        this.xsddShxm = xsddShxm;
    }

    public String getXsddShxm() 
    {
        return xsddShxm;
    }
    public void setXsddC1(String xsddC1) 
    {
        this.xsddC1 = xsddC1;
    }

    public String getXsddC1() 
    {
        return xsddC1;
    }
    public void setXsddC2(String xsddC2) 
    {
        this.xsddC2 = xsddC2;
    }

    public String getXsddC2() 
    {
        return xsddC2;
    }
    public void setXsddC3(String xsddC3) 
    {
        this.xsddC3 = xsddC3;
    }

    public String getXsddC3() 
    {
        return xsddC3;
    }
    public void setXsddC4(String xsddC4) 
    {
        this.xsddC4 = xsddC4;
    }

    public String getXsddC4() 
    {
        return xsddC4;
    }
    public void setXsddC5(String xsddC5) 
    {
        this.xsddC5 = xsddC5;
    }

    public String getXsddC5() 
    {
        return xsddC5;
    }
    public void setXsddC6(String xsddC6) 
    {
        this.xsddC6 = xsddC6;
    }

    public String getXsddC6() 
    {
        return xsddC6;
    }
    public void setXsddC7(String xsddC7) 
    {
        this.xsddC7 = xsddC7;
    }

    public String getXsddC7() 
    {
        return xsddC7;
    }
    public void setXsddC8(String xsddC8) 
    {
        this.xsddC8 = xsddC8;
    }

    public String getXsddC8() 
    {
        return xsddC8;
    }
    public void setXsddC9(String xsddC9) 
    {
        this.xsddC9 = xsddC9;
    }

    public String getXsddC9() 
    {
        return xsddC9;
    }
    public void setXsddC10(String xsddC10) 
    {
        this.xsddC10 = xsddC10;
    }

    public String getXsddC10() 
    {
        return xsddC10;
    }
    public void setXsddU1(Integer xsddU1) 
    {
        this.xsddU1 = xsddU1;
    }

    public Integer getXsddU1() 
    {
        return xsddU1;
    }
    public void setXsddU2(Integer xsddU2) 
    {
        this.xsddU2 = xsddU2;
    }

    public Integer getXsddU2() 
    {
        return xsddU2;
    }
    public void setXsddU3(Integer xsddU3) 
    {
        this.xsddU3 = xsddU3;
    }

    public Integer getXsddU3() 
    {
        return xsddU3;
    }
    public void setXsddU4(Integer xsddU4) 
    {
        this.xsddU4 = xsddU4;
    }

    public Integer getXsddU4() 
    {
        return xsddU4;
    }
    public void setXsddU5(Integer xsddU5) 
    {
        this.xsddU5 = xsddU5;
    }

    public Integer getXsddU5() 
    {
        return xsddU5;
    }
    public void setXsddU6(Integer xsddU6) 
    {
        this.xsddU6 = xsddU6;
    }

    public Integer getXsddU6() 
    {
        return xsddU6;
    }
    public void setXsddYwbh(String xsddYwbh) 
    {
        this.xsddYwbh = xsddYwbh;
    }

    public String getXsddYwbh() 
    {
        return xsddYwbh;
    }
    public void setXsddDyperson(String xsddDyperson) 
    {
        this.xsddDyperson = xsddDyperson;
    }

    public String getXsddDyperson() 
    {
        return xsddDyperson;
    }
    public void setXsddDydate(String xsddDydate) 
    {
        this.xsddDydate = xsddDydate;
    }

    public String getXsddDydate() 
    {
        return xsddDydate;
    }
    public void setXsddHtbh(String xsddHtbh) 
    {
        this.xsddHtbh = xsddHtbh;
    }

    public String getXsddHtbh() 
    {
        return xsddHtbh;
    }
    public void setXsddHtls(String xsddHtls) 
    {
        this.xsddHtls = xsddHtls;
    }

    public String getXsddHtls() 
    {
        return xsddHtls;
    }
    public void setXsddSfczx(String xsddSfczx) 
    {
        this.xsddSfczx = xsddSfczx;
    }

    public String getXsddSfczx() 
    {
        return xsddSfczx;
    }
    public void setXsddSfcdj(String xsddSfcdj) 
    {
        this.xsddSfcdj = xsddSfcdj;
    }

    public String getXsddSfcdj() 
    {
        return xsddSfcdj;
    }
    public void setXsddSfqr(String xsddSfqr) 
    {
        this.xsddSfqr = xsddSfqr;
    }

    public String getXsddSfqr() 
    {
        return xsddSfqr;
    }
    public void setXsddSfxg(String xsddSfxg) 
    {
        this.xsddSfxg = xsddSfxg;
    }

    public String getXsddSfxg() 
    {
        return xsddSfxg;
    }
    public void setXsddSfsc(String xsddSfsc) 
    {
        this.xsddSfsc = xsddSfsc;
    }

    public String getXsddSfsc() 
    {
        return xsddSfsc;
    }
    public void setXsddSfjz(String xsddSfjz) 
    {
        this.xsddSfjz = xsddSfjz;
    }

    public String getXsddSfjz() 
    {
        return xsddSfjz;
    }
    public void setXsddYhke(Integer xsddYhke) 
    {
        this.xsddYhke = xsddYhke;
    }

    public Integer getXsddYhke() 
    {
        return xsddYhke;
    }
    public void setXsddBz(String xsddBz) 
    {
        this.xsddBz = xsddBz;
    }

    public String getXsddBz() 
    {
        return xsddBz;
    }
    public void setXsddSffp(String xsddSffp) 
    {
        this.xsddSffp = xsddSffp;
    }

    public String getXsddSffp() 
    {
        return xsddSffp;
    }
    public void setXsddGsbh(String xsddGsbh) 
    {
        this.xsddGsbh = xsddGsbh;
    }

    public String getXsddGsbh() 
    {
        return xsddGsbh;
    }
    public void setXsddXyls(String xsddXyls) 
    {
        this.xsddXyls = xsddXyls;
    }

    public String getXsddXyls() 
    {
        return xsddXyls;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("xsddDdls", getXsddDdls())
            .append("xsddDjrq", getXsddDjrq())
            .append("xsddDdbh", getXsddDdbh())
            .append("xsddQcbz", getXsddQcbz())
            .append("xsddPjlx", getXsddPjlx())
            .append("xsddYwbs", getXsddYwbs())
            .append("xsddDdbz", getXsddDdbz())
            .append("xsddDdzt", getXsddDdzt())
            .append("xsddLxbh", getXsddLxbh())
            .append("xsddShdkh", getXsddShdkh())
            .append("xsddShdkhmc", getXsddShdkhmc())
            .append("xsddSodkh", getXsddSodkh())
            .append("xsddSodkhmc", getXsddSodkhmc())
            .append("xsddSpkh", getXsddSpkh())
            .append("xsddSpkhmc", getXsddSpkhmc())
            .append("xsddFkkh", getXsddFkkh())
            .append("xsddFkkhmc", getXsddFkkhmc())
            .append("xsddSfls", getXsddSfls())
            .append("xsddBmbh", getXsddBmbh())
            .append("xsddRybh", getXsddRybh())
            .append("xsddWbbh", getXsddWbbh())
            .append("xsddHl", getXsddHl())
            .append("xsddXsdj", getXsddXsdj())
            .append("xsddZkzc", getXsddZkzc())
            .append("xsddFsbh", getXsddFsbh())
            .append("xsddYwrq", getXsddYwrq())
            .append("xsddSprq", getXsddSprq())
            .append("xsddXgsj", getXsddXgsj())
            .append("xsddWfdb", getXsddWfdb())
            .append("xsddDfdb", getXsddDfdb())
            .append("xsddLxr", getXsddLxr())
            .append("xsddDhdd", getXsddDhdd())
            .append("xsddTzrq", getXsddTzrq())
            .append("xsddPzr", getXsddPzr())
            .append("xsddZdxm", getXsddZdxm())
            .append("xsddShlc", getXsddShlc())
            .append("xsddShbz", getXsddShbz())
            .append("xsddShrq", getXsddShrq())
            .append("xsddShxm", getXsddShxm())
            .append("xsddC1", getXsddC1())
            .append("xsddC2", getXsddC2())
            .append("xsddC3", getXsddC3())
            .append("xsddC4", getXsddC4())
            .append("xsddC5", getXsddC5())
            .append("xsddC6", getXsddC6())
            .append("xsddC7", getXsddC7())
            .append("xsddC8", getXsddC8())
            .append("xsddC9", getXsddC9())
            .append("xsddC10", getXsddC10())
            .append("xsddU1", getXsddU1())
            .append("xsddU2", getXsddU2())
            .append("xsddU3", getXsddU3())
            .append("xsddU4", getXsddU4())
            .append("xsddU5", getXsddU5())
            .append("xsddU6", getXsddU6())
            .append("xsddYwbh", getXsddYwbh())
            .append("xsddDyperson", getXsddDyperson())
            .append("xsddDydate", getXsddDydate())
            .append("xsddHtbh", getXsddHtbh())
            .append("xsddHtls", getXsddHtls())
            .append("xsddSfczx", getXsddSfczx())
            .append("xsddSfcdj", getXsddSfcdj())
            .append("xsddSfqr", getXsddSfqr())
            .append("xsddSfxg", getXsddSfxg())
            .append("xsddSfsc", getXsddSfsc())
            .append("xsddSfjz", getXsddSfjz())
            .append("xsddYhke", getXsddYhke())
            .append("xsddBz", getXsddBz())
            .append("xsddSffp", getXsddSffp())
            .append("xsddGsbh", getXsddGsbh())
            .append("xsddXyls", getXsddXyls())
            .toString();
    }
}
