package com.extend.erp.domain;

import java.util.List;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售发票对象 erp_xsfp
 * 
 * @author wcg
 * @date 2023-10-13
 */
@DataSource(value = DataSourceType.SLAVE)
@TableName("XSFP")
public class ErpXsfp
{
    private static final long serialVersionUID = 1L;

    /** 发票流水 */
    private String xsfpFpls;

    /** 发票编号 */
    @Excel(name = "发票编号")
    private String xsfpFpbh;

    /** 业务标识 */
    @Excel(name = "业务标识")
    private String xsfpYwbs;

    /**  */
    @Excel(name = "")
    private String xsfpPjlx;

    /**  */
    @Excel(name = "")
    private String xsfpZbpjlx;

    /**  */
    @Excel(name = "")
    private String xsfpHsdx;

    /** 单据日期日期 */
    @Excel(name = "单据日期日期")
    private String xsfpDjrq;

    /** 业务日期 */
    @Excel(name = "业务日期")
    private String xsfpYwrq;

    /** 修改时间 */
    @Excel(name = "修改时间")
    private String xsfpXgsj;

    /**  */
    @Excel(name = "")
    private String xsfpQcbz;

    /**  */
    @Excel(name = "")
    private String xsfpFpbz;

    /**  */
    @Excel(name = "")
    private String xsfpZfbz;

    /**  */
    @Excel(name = "")
    private String xsfpZfxm;

    /** 业务类型编号 */
    @Excel(name = "业务类型编号")
    private String xsfpYwbh;

    /** 发票种类 */
    @Excel(name = "发票种类")
    private String xsfpZlbh;

    /**  */
    @Excel(name = "")
    private String xsfpSfls;

    /** 售达客户编号 */
    @Excel(name = "售达客户编号")
    private String xsfpShdkh;

    /** 售达客户名称 */
    @Excel(name = "售达客户名称")
    private String xsfpShdkhmc;

    /** 送达客户编号 */
    @Excel(name = "送达客户编号")
    private String xsfpSodkh;

    /** 送达客户编号 */
    @Excel(name = "送达客户编号")
    private String xsfpSodkhmc;

    /** 收票客户编号 */
    @Excel(name = "收票客户编号")
    private String xsfpSpkh;

    /** 收票客户名称 */
    @Excel(name = "收票客户名称")
    private String xsfpSpkhmc;

    /** 付款客户编号 */
    @Excel(name = "付款客户编号")
    private String xsfpFkkh;

    /** 付款客户名称 */
    @Excel(name = "付款客户名称")
    private String xsfpFkkhmc;

    /** 部门编号 */
    @Excel(name = "部门编号")
    private String xsfpBmbh;

    /** 人员编号 */
    @Excel(name = "人员编号")
    private String xsfpRybh;

    /** 人员姓名 */
    @Excel(name = "人员姓名")
    private String xsfpRyxm;

    /** 币种 */
    @Excel(name = "币种")
    private String xsfpWbbh;

    /** 汇率 */
    @Excel(name = "汇率")
    private Integer xsfpHl;

    /** 折扣政策 */
    @Excel(name = "折扣政策")
    private String xsfpZkzc;

    /**  */
    @Excel(name = "")
    private String xsfpFsbh;

    /**  */
    @Excel(name = "")
    private String xsfpJsbh;

    /**  */
    @Excel(name = "")
    private String xsfpPjhm;

    /**  */
    @Excel(name = "")
    private String xsfpHkrq;

    /** 单位银行 */
    @Excel(name = "单位银行")
    private String xsfpYhbh;

    /** 到货地点 */
    @Excel(name = "到货地点")
    private String xsfpDhdd;

    /**  */
    @Excel(name = "")
    private String xsfpDzhm;

    /**  */
    @Excel(name = "")
    private String xsfpPznm;

    /**  */
    @Excel(name = "")
    private String xsfpPzrq;

    /**  */
    @Excel(name = "")
    private String xsfpPzbh;

    /**  */
    @Excel(name = "")
    private String xsfpPznd;

    /**  */
    @Excel(name = "")
    private String xsfpFwbz;

    /** 客户地址 */
    @Excel(name = "客户地址")
    private String xsfpAddr;

    /** 客户电话 */
    @Excel(name = "客户电话")
    private String xsfpTele;

    /** 开户行 */
    @Excel(name = "开户行")
    private String xsfpKhh;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String xsfpYhzh;

    /** 税号 */
    @Excel(name = "税号")
    private String xsfpSh;

    /**  */
    @Excel(name = "")
    private String xsfpDydate;

    /**  */
    @Excel(name = "")
    private String xsfpDyperson;

    /** 收款人 */
    @Excel(name = "收款人")
    private String xsfpSkbh;

    /** 付款人 */
    @Excel(name = "付款人")
    private String xsfpFhbh;

    /** 制单人 */
    @Excel(name = "制单人")
    private String xsfpZdxm;

    /**  */
    @Excel(name = "")
    private String xsfpJzysbz;

    /**  */
    @Excel(name = "")
    private String xsfpJzysxm;

    /**  */
    @Excel(name = "")
    private String xsfpJzysrq;

    /**  */
    @Excel(name = "")
    private String xsfpJzbz;

    /**  */
    @Excel(name = "")
    private String xsfpJzxm;

    /** 记账时间 */
    @Excel(name = "记账时间")
    private String xsfpJzsj;

    /**  */
    @Excel(name = "")
    private String xsfpSfjz;

    /**  */
    @Excel(name = "")
    private String xsfpSfqxjz;

    /**  */
    @Excel(name = "")
    private String xsfpDqzk;

    /**  */
    @Excel(name = "")
    private String xsfpSfsc;

    /**  */
    @Excel(name = "")
    private String xsfpSfxg;

    /**  */
    @Excel(name = "")
    private String xsfpSfqr;

    /**  */
    @Excel(name = "")
    private String xsfpSfczx;

    /**  */
    @Excel(name = "")
    private String xsfpSfcdj;

    /**  */
    @Excel(name = "")
    private String xsfpHtbh;

    /**  */
    @Excel(name = "")
    private String xsfpHtls;

    /**  */
    @Excel(name = "")
    private String xsfpFzbh;

    /**  */
    @Excel(name = "")
    private String xsfpXzbh;

    /**  */
    @Excel(name = "")
    private String xsfpShlc;

    /** 审核标志 */
    @Excel(name = "审核标志")
    private String xsfpShbz;

    /**  */
    @Excel(name = "")
    private String xsfpShrq;

    /** 审核人 */
    @Excel(name = "审核人")
    private String xsfpShxm;

    /**  */
    @Excel(name = "")
    private String xsfpLybh;

    /**  */
    @Excel(name = "")
    private String xsfpLyls;

    /** 文本1 */
    @Excel(name = "文本1")
    private String xsfpC1;

    /**  */
    @Excel(name = "")
    private String xsfpC2;

    /**  */
    @Excel(name = "")
    private String xsfpC3;

    /**  */
    @Excel(name = "")
    private String xsfpC4;

    /**  */
    @Excel(name = "")
    private String xsfpC5;

    /**  */
    @Excel(name = "")
    private String xsfpC6;

    /**  */
    @Excel(name = "")
    private String xsfpC7;

    /**  */
    @Excel(name = "")
    private String xsfpC8;

    /**  */
    @Excel(name = "")
    private String xsfpC9;

    /**  */
    @Excel(name = "")
    private String xsfpC10;

    /**  */
    @Excel(name = "")
    private Integer xsfpU1;

    /**  */
    @Excel(name = "")
    private Integer xsfpU2;

    /**  */
    @Excel(name = "")
    private Integer xsfpU3;

    /**  */
    @Excel(name = "")
    private Integer xsfpU4;

    /**  */
    @Excel(name = "")
    private Integer xsfpU5;

    /**  */
    @Excel(name = "")
    private Integer xsfpU6;

    /** 备注 */
    @Excel(name = "备注")
    private String xsfpBz;

    /**  */
    @Excel(name = "")
    private String xsfpGsbh;

    /**  */
    @Excel(name = "")
    private String xsfpSybbh;

    /**  */
    @Excel(name = "")
    private String xsfpPqbh;

    /**  */
    @Excel(name = "")
    private String xsfpGsbhbak;

    /**  */
    @Excel(name = "")
    private String xsfpGsmcbak;

    /**  */
    @Excel(name = "")
    private String xsfpBmmc;

    /**  */
    @Excel(name = "")
    private String xsfpBmbhbak;

    /**  */
    @Excel(name = "")
    private String xsfpRybhbak;

    /**  */
    @Excel(name = "")
    private String xsfpRyxmbak;

    /**  */
    @Excel(name = "")
    private String xsfpSpdx;

    /**  */
    @Excel(name = "")
    private String xsfpDrbs;

    /**  */
    @Excel(name = "")
    private String xsfpHzbz;

    /**  */
    @Excel(name = "")
    private String xsfpHzr;

    /**  */
    @Excel(name = "")
    private String xsfpHzrq;

    /**  */
    @Excel(name = "")
    private String xsfpHzsm;

    /** 销售发票明细信息 */
    //private List<ErpXsfpmx> erpXsfpmxList;

    public void setXsfpFpls(String xsfpFpls) 
    {
        this.xsfpFpls = xsfpFpls;
    }

    public String getXsfpFpls() 
    {
        return xsfpFpls;
    }
    public void setXsfpFpbh(String xsfpFpbh) 
    {
        this.xsfpFpbh = xsfpFpbh;
    }

    public String getXsfpFpbh() 
    {
        return xsfpFpbh;
    }
    public void setXsfpYwbs(String xsfpYwbs) 
    {
        this.xsfpYwbs = xsfpYwbs;
    }

    public String getXsfpYwbs() 
    {
        return xsfpYwbs;
    }
    public void setXsfpPjlx(String xsfpPjlx) 
    {
        this.xsfpPjlx = xsfpPjlx;
    }

    public String getXsfpPjlx() 
    {
        return xsfpPjlx;
    }
    public void setXsfpZbpjlx(String xsfpZbpjlx) 
    {
        this.xsfpZbpjlx = xsfpZbpjlx;
    }

    public String getXsfpZbpjlx() 
    {
        return xsfpZbpjlx;
    }
    public void setXsfpHsdx(String xsfpHsdx) 
    {
        this.xsfpHsdx = xsfpHsdx;
    }

    public String getXsfpHsdx() 
    {
        return xsfpHsdx;
    }
    public void setXsfpDjrq(String xsfpDjrq) 
    {
        this.xsfpDjrq = xsfpDjrq;
    }

    public String getXsfpDjrq() 
    {
        return xsfpDjrq;
    }
    public void setXsfpYwrq(String xsfpYwrq) 
    {
        this.xsfpYwrq = xsfpYwrq;
    }

    public String getXsfpYwrq() 
    {
        return xsfpYwrq;
    }
    public void setXsfpXgsj(String xsfpXgsj) 
    {
        this.xsfpXgsj = xsfpXgsj;
    }

    public String getXsfpXgsj() 
    {
        return xsfpXgsj;
    }
    public void setXsfpQcbz(String xsfpQcbz) 
    {
        this.xsfpQcbz = xsfpQcbz;
    }

    public String getXsfpQcbz() 
    {
        return xsfpQcbz;
    }
    public void setXsfpFpbz(String xsfpFpbz) 
    {
        this.xsfpFpbz = xsfpFpbz;
    }

    public String getXsfpFpbz() 
    {
        return xsfpFpbz;
    }
    public void setXsfpZfbz(String xsfpZfbz) 
    {
        this.xsfpZfbz = xsfpZfbz;
    }

    public String getXsfpZfbz() 
    {
        return xsfpZfbz;
    }
    public void setXsfpZfxm(String xsfpZfxm) 
    {
        this.xsfpZfxm = xsfpZfxm;
    }

    public String getXsfpZfxm() 
    {
        return xsfpZfxm;
    }
    public void setXsfpYwbh(String xsfpYwbh) 
    {
        this.xsfpYwbh = xsfpYwbh;
    }

    public String getXsfpYwbh() 
    {
        return xsfpYwbh;
    }
    public void setXsfpZlbh(String xsfpZlbh) 
    {
        this.xsfpZlbh = xsfpZlbh;
    }

    public String getXsfpZlbh() 
    {
        return xsfpZlbh;
    }
    public void setXsfpSfls(String xsfpSfls) 
    {
        this.xsfpSfls = xsfpSfls;
    }

    public String getXsfpSfls() 
    {
        return xsfpSfls;
    }
    public void setXsfpShdkh(String xsfpShdkh) 
    {
        this.xsfpShdkh = xsfpShdkh;
    }

    public String getXsfpShdkh() 
    {
        return xsfpShdkh;
    }
    public void setXsfpShdkhmc(String xsfpShdkhmc) 
    {
        this.xsfpShdkhmc = xsfpShdkhmc;
    }

    public String getXsfpShdkhmc() 
    {
        return xsfpShdkhmc;
    }
    public void setXsfpSodkh(String xsfpSodkh) 
    {
        this.xsfpSodkh = xsfpSodkh;
    }

    public String getXsfpSodkh() 
    {
        return xsfpSodkh;
    }
    public void setXsfpSodkhmc(String xsfpSodkhmc) 
    {
        this.xsfpSodkhmc = xsfpSodkhmc;
    }

    public String getXsfpSodkhmc() 
    {
        return xsfpSodkhmc;
    }
    public void setXsfpSpkh(String xsfpSpkh) 
    {
        this.xsfpSpkh = xsfpSpkh;
    }

    public String getXsfpSpkh() 
    {
        return xsfpSpkh;
    }
    public void setXsfpSpkhmc(String xsfpSpkhmc) 
    {
        this.xsfpSpkhmc = xsfpSpkhmc;
    }

    public String getXsfpSpkhmc() 
    {
        return xsfpSpkhmc;
    }
    public void setXsfpFkkh(String xsfpFkkh) 
    {
        this.xsfpFkkh = xsfpFkkh;
    }

    public String getXsfpFkkh() 
    {
        return xsfpFkkh;
    }
    public void setXsfpFkkhmc(String xsfpFkkhmc) 
    {
        this.xsfpFkkhmc = xsfpFkkhmc;
    }

    public String getXsfpFkkhmc() 
    {
        return xsfpFkkhmc;
    }
    public void setXsfpBmbh(String xsfpBmbh) 
    {
        this.xsfpBmbh = xsfpBmbh;
    }

    public String getXsfpBmbh() 
    {
        return xsfpBmbh;
    }
    public void setXsfpRybh(String xsfpRybh) 
    {
        this.xsfpRybh = xsfpRybh;
    }

    public String getXsfpRybh() 
    {
        return xsfpRybh;
    }
    public void setXsfpRyxm(String xsfpRyxm) 
    {
        this.xsfpRyxm = xsfpRyxm;
    }

    public String getXsfpRyxm() 
    {
        return xsfpRyxm;
    }
    public void setXsfpWbbh(String xsfpWbbh) 
    {
        this.xsfpWbbh = xsfpWbbh;
    }

    public String getXsfpWbbh() 
    {
        return xsfpWbbh;
    }
    public void setXsfpHl(Integer xsfpHl) 
    {
        this.xsfpHl = xsfpHl;
    }

    public Integer getXsfpHl() 
    {
        return xsfpHl;
    }
    public void setXsfpZkzc(String xsfpZkzc) 
    {
        this.xsfpZkzc = xsfpZkzc;
    }

    public String getXsfpZkzc() 
    {
        return xsfpZkzc;
    }
    public void setXsfpFsbh(String xsfpFsbh) 
    {
        this.xsfpFsbh = xsfpFsbh;
    }

    public String getXsfpFsbh() 
    {
        return xsfpFsbh;
    }
    public void setXsfpJsbh(String xsfpJsbh) 
    {
        this.xsfpJsbh = xsfpJsbh;
    }

    public String getXsfpJsbh() 
    {
        return xsfpJsbh;
    }
    public void setXsfpPjhm(String xsfpPjhm) 
    {
        this.xsfpPjhm = xsfpPjhm;
    }

    public String getXsfpPjhm() 
    {
        return xsfpPjhm;
    }
    public void setXsfpHkrq(String xsfpHkrq) 
    {
        this.xsfpHkrq = xsfpHkrq;
    }

    public String getXsfpHkrq() 
    {
        return xsfpHkrq;
    }
    public void setXsfpYhbh(String xsfpYhbh) 
    {
        this.xsfpYhbh = xsfpYhbh;
    }

    public String getXsfpYhbh() 
    {
        return xsfpYhbh;
    }
    public void setXsfpDhdd(String xsfpDhdd) 
    {
        this.xsfpDhdd = xsfpDhdd;
    }

    public String getXsfpDhdd() 
    {
        return xsfpDhdd;
    }
    public void setXsfpDzhm(String xsfpDzhm) 
    {
        this.xsfpDzhm = xsfpDzhm;
    }

    public String getXsfpDzhm() 
    {
        return xsfpDzhm;
    }
    public void setXsfpPznm(String xsfpPznm) 
    {
        this.xsfpPznm = xsfpPznm;
    }

    public String getXsfpPznm() 
    {
        return xsfpPznm;
    }
    public void setXsfpPzrq(String xsfpPzrq) 
    {
        this.xsfpPzrq = xsfpPzrq;
    }

    public String getXsfpPzrq() 
    {
        return xsfpPzrq;
    }
    public void setXsfpPzbh(String xsfpPzbh) 
    {
        this.xsfpPzbh = xsfpPzbh;
    }

    public String getXsfpPzbh() 
    {
        return xsfpPzbh;
    }
    public void setXsfpPznd(String xsfpPznd) 
    {
        this.xsfpPznd = xsfpPznd;
    }

    public String getXsfpPznd() 
    {
        return xsfpPznd;
    }
    public void setXsfpFwbz(String xsfpFwbz) 
    {
        this.xsfpFwbz = xsfpFwbz;
    }

    public String getXsfpFwbz() 
    {
        return xsfpFwbz;
    }
    public void setXsfpAddr(String xsfpAddr) 
    {
        this.xsfpAddr = xsfpAddr;
    }

    public String getXsfpAddr() 
    {
        return xsfpAddr;
    }
    public void setXsfpTele(String xsfpTele) 
    {
        this.xsfpTele = xsfpTele;
    }

    public String getXsfpTele() 
    {
        return xsfpTele;
    }
    public void setXsfpKhh(String xsfpKhh) 
    {
        this.xsfpKhh = xsfpKhh;
    }

    public String getXsfpKhh() 
    {
        return xsfpKhh;
    }
    public void setXsfpYhzh(String xsfpYhzh) 
    {
        this.xsfpYhzh = xsfpYhzh;
    }

    public String getXsfpYhzh() 
    {
        return xsfpYhzh;
    }
    public void setXsfpSh(String xsfpSh) 
    {
        this.xsfpSh = xsfpSh;
    }

    public String getXsfpSh() 
    {
        return xsfpSh;
    }
    public void setXsfpDydate(String xsfpDydate) 
    {
        this.xsfpDydate = xsfpDydate;
    }

    public String getXsfpDydate() 
    {
        return xsfpDydate;
    }
    public void setXsfpDyperson(String xsfpDyperson) 
    {
        this.xsfpDyperson = xsfpDyperson;
    }

    public String getXsfpDyperson() 
    {
        return xsfpDyperson;
    }
    public void setXsfpSkbh(String xsfpSkbh) 
    {
        this.xsfpSkbh = xsfpSkbh;
    }

    public String getXsfpSkbh() 
    {
        return xsfpSkbh;
    }
    public void setXsfpFhbh(String xsfpFhbh) 
    {
        this.xsfpFhbh = xsfpFhbh;
    }

    public String getXsfpFhbh() 
    {
        return xsfpFhbh;
    }
    public void setXsfpZdxm(String xsfpZdxm) 
    {
        this.xsfpZdxm = xsfpZdxm;
    }

    public String getXsfpZdxm() 
    {
        return xsfpZdxm;
    }
    public void setXsfpJzysbz(String xsfpJzysbz) 
    {
        this.xsfpJzysbz = xsfpJzysbz;
    }

    public String getXsfpJzysbz() 
    {
        return xsfpJzysbz;
    }
    public void setXsfpJzysxm(String xsfpJzysxm) 
    {
        this.xsfpJzysxm = xsfpJzysxm;
    }

    public String getXsfpJzysxm() 
    {
        return xsfpJzysxm;
    }
    public void setXsfpJzysrq(String xsfpJzysrq) 
    {
        this.xsfpJzysrq = xsfpJzysrq;
    }

    public String getXsfpJzysrq() 
    {
        return xsfpJzysrq;
    }
    public void setXsfpJzbz(String xsfpJzbz) 
    {
        this.xsfpJzbz = xsfpJzbz;
    }

    public String getXsfpJzbz() 
    {
        return xsfpJzbz;
    }
    public void setXsfpJzxm(String xsfpJzxm) 
    {
        this.xsfpJzxm = xsfpJzxm;
    }

    public String getXsfpJzxm() 
    {
        return xsfpJzxm;
    }
    public void setXsfpJzsj(String xsfpJzsj) 
    {
        this.xsfpJzsj = xsfpJzsj;
    }

    public String getXsfpJzsj() 
    {
        return xsfpJzsj;
    }
    public void setXsfpSfjz(String xsfpSfjz) 
    {
        this.xsfpSfjz = xsfpSfjz;
    }

    public String getXsfpSfjz() 
    {
        return xsfpSfjz;
    }
    public void setXsfpSfqxjz(String xsfpSfqxjz) 
    {
        this.xsfpSfqxjz = xsfpSfqxjz;
    }

    public String getXsfpSfqxjz() 
    {
        return xsfpSfqxjz;
    }
    public void setXsfpDqzk(String xsfpDqzk) 
    {
        this.xsfpDqzk = xsfpDqzk;
    }

    public String getXsfpDqzk() 
    {
        return xsfpDqzk;
    }
    public void setXsfpSfsc(String xsfpSfsc) 
    {
        this.xsfpSfsc = xsfpSfsc;
    }

    public String getXsfpSfsc() 
    {
        return xsfpSfsc;
    }
    public void setXsfpSfxg(String xsfpSfxg) 
    {
        this.xsfpSfxg = xsfpSfxg;
    }

    public String getXsfpSfxg() 
    {
        return xsfpSfxg;
    }
    public void setXsfpSfqr(String xsfpSfqr) 
    {
        this.xsfpSfqr = xsfpSfqr;
    }

    public String getXsfpSfqr() 
    {
        return xsfpSfqr;
    }
    public void setXsfpSfczx(String xsfpSfczx) 
    {
        this.xsfpSfczx = xsfpSfczx;
    }

    public String getXsfpSfczx() 
    {
        return xsfpSfczx;
    }
    public void setXsfpSfcdj(String xsfpSfcdj) 
    {
        this.xsfpSfcdj = xsfpSfcdj;
    }

    public String getXsfpSfcdj() 
    {
        return xsfpSfcdj;
    }
    public void setXsfpHtbh(String xsfpHtbh) 
    {
        this.xsfpHtbh = xsfpHtbh;
    }

    public String getXsfpHtbh() 
    {
        return xsfpHtbh;
    }
    public void setXsfpHtls(String xsfpHtls) 
    {
        this.xsfpHtls = xsfpHtls;
    }

    public String getXsfpHtls() 
    {
        return xsfpHtls;
    }
    public void setXsfpFzbh(String xsfpFzbh) 
    {
        this.xsfpFzbh = xsfpFzbh;
    }

    public String getXsfpFzbh() 
    {
        return xsfpFzbh;
    }
    public void setXsfpXzbh(String xsfpXzbh) 
    {
        this.xsfpXzbh = xsfpXzbh;
    }

    public String getXsfpXzbh() 
    {
        return xsfpXzbh;
    }
    public void setXsfpShlc(String xsfpShlc) 
    {
        this.xsfpShlc = xsfpShlc;
    }

    public String getXsfpShlc() 
    {
        return xsfpShlc;
    }
    public void setXsfpShbz(String xsfpShbz) 
    {
        this.xsfpShbz = xsfpShbz;
    }

    public String getXsfpShbz() 
    {
        return xsfpShbz;
    }
    public void setXsfpShrq(String xsfpShrq) 
    {
        this.xsfpShrq = xsfpShrq;
    }

    public String getXsfpShrq() 
    {
        return xsfpShrq;
    }
    public void setXsfpShxm(String xsfpShxm) 
    {
        this.xsfpShxm = xsfpShxm;
    }

    public String getXsfpShxm() 
    {
        return xsfpShxm;
    }
    public void setXsfpLybh(String xsfpLybh) 
    {
        this.xsfpLybh = xsfpLybh;
    }

    public String getXsfpLybh() 
    {
        return xsfpLybh;
    }
    public void setXsfpLyls(String xsfpLyls) 
    {
        this.xsfpLyls = xsfpLyls;
    }

    public String getXsfpLyls() 
    {
        return xsfpLyls;
    }
    public void setXsfpC1(String xsfpC1) 
    {
        this.xsfpC1 = xsfpC1;
    }

    public String getXsfpC1() 
    {
        return xsfpC1;
    }
    public void setXsfpC2(String xsfpC2) 
    {
        this.xsfpC2 = xsfpC2;
    }

    public String getXsfpC2() 
    {
        return xsfpC2;
    }
    public void setXsfpC3(String xsfpC3) 
    {
        this.xsfpC3 = xsfpC3;
    }

    public String getXsfpC3() 
    {
        return xsfpC3;
    }
    public void setXsfpC4(String xsfpC4) 
    {
        this.xsfpC4 = xsfpC4;
    }

    public String getXsfpC4() 
    {
        return xsfpC4;
    }
    public void setXsfpC5(String xsfpC5) 
    {
        this.xsfpC5 = xsfpC5;
    }

    public String getXsfpC5() 
    {
        return xsfpC5;
    }
    public void setXsfpC6(String xsfpC6) 
    {
        this.xsfpC6 = xsfpC6;
    }

    public String getXsfpC6() 
    {
        return xsfpC6;
    }
    public void setXsfpC7(String xsfpC7) 
    {
        this.xsfpC7 = xsfpC7;
    }

    public String getXsfpC7() 
    {
        return xsfpC7;
    }
    public void setXsfpC8(String xsfpC8) 
    {
        this.xsfpC8 = xsfpC8;
    }

    public String getXsfpC8() 
    {
        return xsfpC8;
    }
    public void setXsfpC9(String xsfpC9) 
    {
        this.xsfpC9 = xsfpC9;
    }

    public String getXsfpC9() 
    {
        return xsfpC9;
    }
    public void setXsfpC10(String xsfpC10) 
    {
        this.xsfpC10 = xsfpC10;
    }

    public String getXsfpC10() 
    {
        return xsfpC10;
    }
    public void setXsfpU1(Integer xsfpU1) 
    {
        this.xsfpU1 = xsfpU1;
    }

    public Integer getXsfpU1() 
    {
        return xsfpU1;
    }
    public void setXsfpU2(Integer xsfpU2) 
    {
        this.xsfpU2 = xsfpU2;
    }

    public Integer getXsfpU2() 
    {
        return xsfpU2;
    }
    public void setXsfpU3(Integer xsfpU3) 
    {
        this.xsfpU3 = xsfpU3;
    }

    public Integer getXsfpU3() 
    {
        return xsfpU3;
    }
    public void setXsfpU4(Integer xsfpU4) 
    {
        this.xsfpU4 = xsfpU4;
    }

    public Integer getXsfpU4() 
    {
        return xsfpU4;
    }
    public void setXsfpU5(Integer xsfpU5) 
    {
        this.xsfpU5 = xsfpU5;
    }

    public Integer getXsfpU5() 
    {
        return xsfpU5;
    }
    public void setXsfpU6(Integer xsfpU6) 
    {
        this.xsfpU6 = xsfpU6;
    }

    public Integer getXsfpU6() 
    {
        return xsfpU6;
    }
    public void setXsfpBz(String xsfpBz) 
    {
        this.xsfpBz = xsfpBz;
    }

    public String getXsfpBz() 
    {
        return xsfpBz;
    }
    public void setXsfpGsbh(String xsfpGsbh) 
    {
        this.xsfpGsbh = xsfpGsbh;
    }

    public String getXsfpGsbh() 
    {
        return xsfpGsbh;
    }
    public void setXsfpSybbh(String xsfpSybbh) 
    {
        this.xsfpSybbh = xsfpSybbh;
    }

    public String getXsfpSybbh() 
    {
        return xsfpSybbh;
    }
    public void setXsfpPqbh(String xsfpPqbh) 
    {
        this.xsfpPqbh = xsfpPqbh;
    }

    public String getXsfpPqbh() 
    {
        return xsfpPqbh;
    }
    public void setXsfpGsbhbak(String xsfpGsbhbak) 
    {
        this.xsfpGsbhbak = xsfpGsbhbak;
    }

    public String getXsfpGsbhbak() 
    {
        return xsfpGsbhbak;
    }
    public void setXsfpGsmcbak(String xsfpGsmcbak) 
    {
        this.xsfpGsmcbak = xsfpGsmcbak;
    }

    public String getXsfpGsmcbak() 
    {
        return xsfpGsmcbak;
    }
    public void setXsfpBmmc(String xsfpBmmc) 
    {
        this.xsfpBmmc = xsfpBmmc;
    }

    public String getXsfpBmmc() 
    {
        return xsfpBmmc;
    }
    public void setXsfpBmbhbak(String xsfpBmbhbak) 
    {
        this.xsfpBmbhbak = xsfpBmbhbak;
    }

    public String getXsfpBmbhbak() 
    {
        return xsfpBmbhbak;
    }
    public void setXsfpRybhbak(String xsfpRybhbak) 
    {
        this.xsfpRybhbak = xsfpRybhbak;
    }

    public String getXsfpRybhbak() 
    {
        return xsfpRybhbak;
    }
    public void setXsfpRyxmbak(String xsfpRyxmbak) 
    {
        this.xsfpRyxmbak = xsfpRyxmbak;
    }

    public String getXsfpRyxmbak() 
    {
        return xsfpRyxmbak;
    }
    public void setXsfpSpdx(String xsfpSpdx) 
    {
        this.xsfpSpdx = xsfpSpdx;
    }

    public String getXsfpSpdx() 
    {
        return xsfpSpdx;
    }
    public void setXsfpDrbs(String xsfpDrbs) 
    {
        this.xsfpDrbs = xsfpDrbs;
    }

    public String getXsfpDrbs() 
    {
        return xsfpDrbs;
    }
    public void setXsfpHzbz(String xsfpHzbz) 
    {
        this.xsfpHzbz = xsfpHzbz;
    }

    public String getXsfpHzbz() 
    {
        return xsfpHzbz;
    }
    public void setXsfpHzr(String xsfpHzr) 
    {
        this.xsfpHzr = xsfpHzr;
    }

    public String getXsfpHzr() 
    {
        return xsfpHzr;
    }
    public void setXsfpHzrq(String xsfpHzrq) 
    {
        this.xsfpHzrq = xsfpHzrq;
    }

    public String getXsfpHzrq() 
    {
        return xsfpHzrq;
    }
    public void setXsfpHzsm(String xsfpHzsm) 
    {
        this.xsfpHzsm = xsfpHzsm;
    }

    public String getXsfpHzsm() 
    {
        return xsfpHzsm;
    }

    /*public List<ErpXsfpmx> getErpXsfpmxList()
    {
        return erpXsfpmxList;
    }*/

    /*public void setErpXsfpmxList(List<ErpXsfpmx> erpXsfpmxList)
    {
        this.erpXsfpmxList = erpXsfpmxList;
    }*/

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("xsfpFpls", getXsfpFpls())
            .append("xsfpFpbh", getXsfpFpbh())
            .append("xsfpYwbs", getXsfpYwbs())
            .append("xsfpPjlx", getXsfpPjlx())
            .append("xsfpZbpjlx", getXsfpZbpjlx())
            .append("xsfpHsdx", getXsfpHsdx())
            .append("xsfpDjrq", getXsfpDjrq())
            .append("xsfpYwrq", getXsfpYwrq())
            .append("xsfpXgsj", getXsfpXgsj())
            .append("xsfpQcbz", getXsfpQcbz())
            .append("xsfpFpbz", getXsfpFpbz())
            .append("xsfpZfbz", getXsfpZfbz())
            .append("xsfpZfxm", getXsfpZfxm())
            .append("xsfpYwbh", getXsfpYwbh())
            .append("xsfpZlbh", getXsfpZlbh())
            .append("xsfpSfls", getXsfpSfls())
            .append("xsfpShdkh", getXsfpShdkh())
            .append("xsfpShdkhmc", getXsfpShdkhmc())
            .append("xsfpSodkh", getXsfpSodkh())
            .append("xsfpSodkhmc", getXsfpSodkhmc())
            .append("xsfpSpkh", getXsfpSpkh())
            .append("xsfpSpkhmc", getXsfpSpkhmc())
            .append("xsfpFkkh", getXsfpFkkh())
            .append("xsfpFkkhmc", getXsfpFkkhmc())
            .append("xsfpBmbh", getXsfpBmbh())
            .append("xsfpRybh", getXsfpRybh())
            .append("xsfpRyxm", getXsfpRyxm())
            .append("xsfpWbbh", getXsfpWbbh())
            .append("xsfpHl", getXsfpHl())
            .append("xsfpZkzc", getXsfpZkzc())
            .append("xsfpFsbh", getXsfpFsbh())
            .append("xsfpJsbh", getXsfpJsbh())
            .append("xsfpPjhm", getXsfpPjhm())
            .append("xsfpHkrq", getXsfpHkrq())
            .append("xsfpYhbh", getXsfpYhbh())
            .append("xsfpDhdd", getXsfpDhdd())
            .append("xsfpDzhm", getXsfpDzhm())
            .append("xsfpPznm", getXsfpPznm())
            .append("xsfpPzrq", getXsfpPzrq())
            .append("xsfpPzbh", getXsfpPzbh())
            .append("xsfpPznd", getXsfpPznd())
            .append("xsfpFwbz", getXsfpFwbz())
            .append("xsfpAddr", getXsfpAddr())
            .append("xsfpTele", getXsfpTele())
            .append("xsfpKhh", getXsfpKhh())
            .append("xsfpYhzh", getXsfpYhzh())
            .append("xsfpSh", getXsfpSh())
            .append("xsfpDydate", getXsfpDydate())
            .append("xsfpDyperson", getXsfpDyperson())
            .append("xsfpSkbh", getXsfpSkbh())
            .append("xsfpFhbh", getXsfpFhbh())
            .append("xsfpZdxm", getXsfpZdxm())
            .append("xsfpJzysbz", getXsfpJzysbz())
            .append("xsfpJzysxm", getXsfpJzysxm())
            .append("xsfpJzysrq", getXsfpJzysrq())
            .append("xsfpJzbz", getXsfpJzbz())
            .append("xsfpJzxm", getXsfpJzxm())
            .append("xsfpJzsj", getXsfpJzsj())
            .append("xsfpSfjz", getXsfpSfjz())
            .append("xsfpSfqxjz", getXsfpSfqxjz())
            .append("xsfpDqzk", getXsfpDqzk())
            .append("xsfpSfsc", getXsfpSfsc())
            .append("xsfpSfxg", getXsfpSfxg())
            .append("xsfpSfqr", getXsfpSfqr())
            .append("xsfpSfczx", getXsfpSfczx())
            .append("xsfpSfcdj", getXsfpSfcdj())
            .append("xsfpHtbh", getXsfpHtbh())
            .append("xsfpHtls", getXsfpHtls())
            .append("xsfpFzbh", getXsfpFzbh())
            .append("xsfpXzbh", getXsfpXzbh())
            .append("xsfpShlc", getXsfpShlc())
            .append("xsfpShbz", getXsfpShbz())
            .append("xsfpShrq", getXsfpShrq())
            .append("xsfpShxm", getXsfpShxm())
            .append("xsfpLybh", getXsfpLybh())
            .append("xsfpLyls", getXsfpLyls())
            .append("xsfpC1", getXsfpC1())
            .append("xsfpC2", getXsfpC2())
            .append("xsfpC3", getXsfpC3())
            .append("xsfpC4", getXsfpC4())
            .append("xsfpC5", getXsfpC5())
            .append("xsfpC6", getXsfpC6())
            .append("xsfpC7", getXsfpC7())
            .append("xsfpC8", getXsfpC8())
            .append("xsfpC9", getXsfpC9())
            .append("xsfpC10", getXsfpC10())
            .append("xsfpU1", getXsfpU1())
            .append("xsfpU2", getXsfpU2())
            .append("xsfpU3", getXsfpU3())
            .append("xsfpU4", getXsfpU4())
            .append("xsfpU5", getXsfpU5())
            .append("xsfpU6", getXsfpU6())
            .append("xsfpBz", getXsfpBz())
            .append("xsfpGsbh", getXsfpGsbh())
            .append("xsfpSybbh", getXsfpSybbh())
            .append("xsfpPqbh", getXsfpPqbh())
            .append("xsfpGsbhbak", getXsfpGsbhbak())
            .append("xsfpGsmcbak", getXsfpGsmcbak())
            .append("xsfpBmmc", getXsfpBmmc())
            .append("xsfpBmbhbak", getXsfpBmbhbak())
            .append("xsfpRybhbak", getXsfpRybhbak())
            .append("xsfpRyxmbak", getXsfpRyxmbak())
            .append("xsfpSpdx", getXsfpSpdx())
            .append("xsfpDrbs", getXsfpDrbs())
            .append("xsfpHzbz", getXsfpHzbz())
            .append("xsfpHzr", getXsfpHzr())
            .append("xsfpHzrq", getXsfpHzrq())
            .append("xsfpHzsm", getXsfpHzsm())
            //.append("erpXsfpmxList", getErpXsfpmxList())
            .toString();
    }
}
