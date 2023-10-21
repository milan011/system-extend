package com.extend.erp.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售提单对象 erp_xstd
 * 
 * @author wcg
 * @date 2023-10-21
 */
@DataSource(value = DataSourceType.SLAVE)
@TableName("XSTD")
@Data
public class ErpXstd
{
    private static final long serialVersionUID = 1L;

    /** 提单流水 */
    @Excel(name = "提单流水")
    private String xstdTdls;

    /** 品级类型 */
    private String xstdPjlx;

    /** 业务标识 */
    private String xstdYwbs;

    /** 正品品级类型 */
    private String xstdZbpjlx;

    /** 提单编号 */
    @Excel(name = "提单编号")
    private String xstdTdbh;

    /** 单据日期 */
    @Excel(name = "单据日期")
    private String xstdDjrq;

    /** 业务日期 */
    @Excel(name = "业务日期")
    private String xstdYwrq;

    /** 修改时间 */
    private String xstdXgsj;

    /** 期初标志 */
    private String xstdQcbz;

    /** 提单标志 */
    private String xstdTdbz;

    /** 业务编号 */
    private String xstdYwbh;

    /** 发票种类 */
    private String xstdZlbh;

    /** 售达客户编号 */
    private String xstdShdkh;

    /** 售达客户 */
    @Excel(name = "售达客户")
    private String xstdShdkhmc;

    /** 送达客户编号 */
    private String xstdSodkh;

    /** 送达客户 */
    private String xstdSodkhmc;

    /** 收票客户编号 */
    private String xstdSpkh;

    /** 收票客户 */
    private String xstdSpkhmc;

    /** 付款客户编号 */
    private String xstdFkkh;

    /** 付款客户 */
    private String xstdFkkhmc;

    /** 客户地址 */
    @Excel(name = "客户地址")
    private String xstdAddr;

    /** 客户电话 */
    private String xstdTele;

    /** 联系人 */
    private String xstdLxr;

    /** 部门编号 */
    private String xstdBmbh;

    /** 人员编号 */
    private String xstdRybh;

    /** 币种 */
    private String xstdWbbh;

    /** 汇率 */
    private Integer xstdHl;

    /** HT编号 */
    private String xstdHtbh;

    /** 合同流水 */
    private String xstdHtls;

    /** 折扣政策 */
    private String xstdZkzc;

    /** 回款日期 */
    private String xstdHkrq;

    /** FS编号 */
    private String xstdFsbh;

    /** 到货地点 */
    @Excel(name = "到货地点")
    private String xstdDhdd;

    /** 制单人 */
    @Excel(name = "制单人")
    private String xstdZdxm;

    /** 记账标志 */
    private String xstdJzbz;

    /** 记账时间 */
    private String xstdJzsj;

    /** 记账人 */
    private String xstdJzxm;

    /** 凭证内码 */
    private String xstdPznm;

    /** 凭证日期 */
    private String xstdPzrq;

    /** 凭证编号 */
    private String xstdPzbh;

    /** 凭证ND */
    private String xstdPznd;

    /** 收发日期 */
    private String xstdSfqr;

    /** 收发截止 */
    private String xstdSfjz;

    /** 收发取消截止 */
    private String xstdSfqxjz;

    /** 收发修改 */
    private String xstdSfxg;

    /** 收发删除 */
    private String xstdSfsc;

    /** 收发流水 */
    private String xstdSfls;

    /** SFCZX */
    private String xstdSfczx;

    /** SFCDJ */
    private String xstdSfcdj;

    /** 打印日期 */
    private String xstdDydate;

    /** 打印人 */
    private String xstdDyperson;

    /** 审核流程 */
    private String xstdShlc;

    /** 审核标志 */
    private String xstdShbz;

    /** 审核日期 */
    private String xstdShrq;

    /** 审核人 */
    private String xstdShxm;

    /** $column.columnComment */
    private String xstdC1;

    /** 文本1 */
    private String xstdC2;

    /** $column.columnComment */
    private String xstdC3;

    /** $column.columnComment */
    private String xstdC4;

    /** $column.columnComment */
    private String xstdC5;

    /** $column.columnComment */
    private String xstdC6;

    /** $column.columnComment */
    private String xstdC7;

    /** $column.columnComment */
    private String xstdC8;

    /** $column.columnComment */
    private String xstdC9;

    /** $column.columnComment */
    private String xstdC10;

    /** $column.columnComment */
    private Integer xstdU1;

    /** $column.columnComment */
    private Integer xstdU2;

    /** $column.columnComment */
    private Integer xstdU3;

    /** $column.columnComment */
    private Integer xstdU4;

    /** $column.columnComment */
    private Integer xstdU5;

    /** $column.columnComment */
    private Integer xstdU6;

    /** 备注 */
    private String xstdBz;

    /** $column.columnComment */
    private String xstdGsbh;

    /** $column.columnComment */
    private String xstdSybbh;

    /** $column.columnComment */
    private String xstdPqbh;

    /** $column.columnComment */
    private String xstdGsmc;

    /** $column.columnComment */
    private String xstdGsbhbak;

    /** $column.columnComment */
    private String xstdGsmcbak;

    /** $column.columnComment */
    private String xstdYwmc;

    /** $column.columnComment */
    private String xstdKhbhbak;

    /** $column.columnComment */
    private String xstdKhmcbak;

    /** $column.columnComment */
    private String xstdDzbh;

    /** $column.columnComment */
    private String xstdBmmc;

    /** $column.columnComment */
    private String xstdBmbhbak;

    /** $column.columnComment */
    private String xstdBmmcbak;

    /** $column.columnComment */
    private String xstdRyxm;

    /** $column.columnComment */
    private String xstdRybhbak;

    /** $column.columnComment */
    private String xstdRyxmbak;

    /** $column.columnComment */
    private String xstdCkbh;

    /** $column.columnComment */
    private String xstdCkmc;

    /** $column.columnComment */
    private String xstdSpdx;

    /** $column.columnComment */
    private String xstdDrbs;

    /** $column.columnComment */
    private String xstdHzr;

    /** $column.columnComment */
    private String xstdHzrq;

    public void setXstdTdls(String xstdTdls) 
    {
        this.xstdTdls = xstdTdls;
    }

    public String getXstdTdls() 
    {
        return xstdTdls;
    }
    public void setXstdPjlx(String xstdPjlx) 
    {
        this.xstdPjlx = xstdPjlx;
    }

    public String getXstdPjlx() 
    {
        return xstdPjlx;
    }
    public void setXstdYwbs(String xstdYwbs) 
    {
        this.xstdYwbs = xstdYwbs;
    }

    public String getXstdYwbs() 
    {
        return xstdYwbs;
    }
    public void setXstdZbpjlx(String xstdZbpjlx) 
    {
        this.xstdZbpjlx = xstdZbpjlx;
    }

    public String getXstdZbpjlx() 
    {
        return xstdZbpjlx;
    }
    public void setXstdTdbh(String xstdTdbh) 
    {
        this.xstdTdbh = xstdTdbh;
    }

    public String getXstdTdbh() 
    {
        return xstdTdbh;
    }
    public void setXstdDjrq(String xstdDjrq) 
    {
        this.xstdDjrq = xstdDjrq;
    }

    public String getXstdDjrq() 
    {
        return xstdDjrq;
    }
    public void setXstdYwrq(String xstdYwrq) 
    {
        this.xstdYwrq = xstdYwrq;
    }

    public String getXstdYwrq() 
    {
        return xstdYwrq;
    }
    public void setXstdXgsj(String xstdXgsj) 
    {
        this.xstdXgsj = xstdXgsj;
    }

    public String getXstdXgsj() 
    {
        return xstdXgsj;
    }
    public void setXstdQcbz(String xstdQcbz) 
    {
        this.xstdQcbz = xstdQcbz;
    }

    public String getXstdQcbz() 
    {
        return xstdQcbz;
    }
    public void setXstdTdbz(String xstdTdbz) 
    {
        this.xstdTdbz = xstdTdbz;
    }

    public String getXstdTdbz() 
    {
        return xstdTdbz;
    }
    public void setXstdYwbh(String xstdYwbh) 
    {
        this.xstdYwbh = xstdYwbh;
    }

    public String getXstdYwbh() 
    {
        return xstdYwbh;
    }
    public void setXstdZlbh(String xstdZlbh) 
    {
        this.xstdZlbh = xstdZlbh;
    }

    public String getXstdZlbh() 
    {
        return xstdZlbh;
    }
    public void setXstdShdkh(String xstdShdkh) 
    {
        this.xstdShdkh = xstdShdkh;
    }

    public String getXstdShdkh() 
    {
        return xstdShdkh;
    }
    public void setXstdShdkhmc(String xstdShdkhmc) 
    {
        this.xstdShdkhmc = xstdShdkhmc;
    }

    public String getXstdShdkhmc() 
    {
        return xstdShdkhmc;
    }
    public void setXstdSodkh(String xstdSodkh) 
    {
        this.xstdSodkh = xstdSodkh;
    }

    public String getXstdSodkh() 
    {
        return xstdSodkh;
    }
    public void setXstdSodkhmc(String xstdSodkhmc) 
    {
        this.xstdSodkhmc = xstdSodkhmc;
    }

    public String getXstdSodkhmc() 
    {
        return xstdSodkhmc;
    }
    public void setXstdSpkh(String xstdSpkh) 
    {
        this.xstdSpkh = xstdSpkh;
    }

    public String getXstdSpkh() 
    {
        return xstdSpkh;
    }
    public void setXstdSpkhmc(String xstdSpkhmc) 
    {
        this.xstdSpkhmc = xstdSpkhmc;
    }

    public String getXstdSpkhmc() 
    {
        return xstdSpkhmc;
    }
    public void setXstdFkkh(String xstdFkkh) 
    {
        this.xstdFkkh = xstdFkkh;
    }

    public String getXstdFkkh() 
    {
        return xstdFkkh;
    }
    public void setXstdFkkhmc(String xstdFkkhmc) 
    {
        this.xstdFkkhmc = xstdFkkhmc;
    }

    public String getXstdFkkhmc() 
    {
        return xstdFkkhmc;
    }
    public void setXstdAddr(String xstdAddr) 
    {
        this.xstdAddr = xstdAddr;
    }

    public String getXstdAddr() 
    {
        return xstdAddr;
    }
    public void setXstdTele(String xstdTele) 
    {
        this.xstdTele = xstdTele;
    }

    public String getXstdTele() 
    {
        return xstdTele;
    }
    public void setXstdLxr(String xstdLxr) 
    {
        this.xstdLxr = xstdLxr;
    }

    public String getXstdLxr() 
    {
        return xstdLxr;
    }
    public void setXstdBmbh(String xstdBmbh) 
    {
        this.xstdBmbh = xstdBmbh;
    }

    public String getXstdBmbh() 
    {
        return xstdBmbh;
    }
    public void setXstdRybh(String xstdRybh) 
    {
        this.xstdRybh = xstdRybh;
    }

    public String getXstdRybh() 
    {
        return xstdRybh;
    }
    public void setXstdWbbh(String xstdWbbh) 
    {
        this.xstdWbbh = xstdWbbh;
    }

    public String getXstdWbbh() 
    {
        return xstdWbbh;
    }
    public void setXstdHl(Integer xstdHl) 
    {
        this.xstdHl = xstdHl;
    }

    public Integer getXstdHl() 
    {
        return xstdHl;
    }
    public void setXstdHtbh(String xstdHtbh) 
    {
        this.xstdHtbh = xstdHtbh;
    }

    public String getXstdHtbh() 
    {
        return xstdHtbh;
    }
    public void setXstdHtls(String xstdHtls) 
    {
        this.xstdHtls = xstdHtls;
    }

    public String getXstdHtls() 
    {
        return xstdHtls;
    }
    public void setXstdZkzc(String xstdZkzc) 
    {
        this.xstdZkzc = xstdZkzc;
    }

    public String getXstdZkzc() 
    {
        return xstdZkzc;
    }
    public void setXstdHkrq(String xstdHkrq) 
    {
        this.xstdHkrq = xstdHkrq;
    }

    public String getXstdHkrq() 
    {
        return xstdHkrq;
    }
    public void setXstdFsbh(String xstdFsbh) 
    {
        this.xstdFsbh = xstdFsbh;
    }

    public String getXstdFsbh() 
    {
        return xstdFsbh;
    }
    public void setXstdDhdd(String xstdDhdd) 
    {
        this.xstdDhdd = xstdDhdd;
    }

    public String getXstdDhdd() 
    {
        return xstdDhdd;
    }
    public void setXstdZdxm(String xstdZdxm) 
    {
        this.xstdZdxm = xstdZdxm;
    }

    public String getXstdZdxm() 
    {
        return xstdZdxm;
    }
    public void setXstdJzbz(String xstdJzbz) 
    {
        this.xstdJzbz = xstdJzbz;
    }

    public String getXstdJzbz() 
    {
        return xstdJzbz;
    }
    public void setXstdJzsj(String xstdJzsj) 
    {
        this.xstdJzsj = xstdJzsj;
    }

    public String getXstdJzsj() 
    {
        return xstdJzsj;
    }
    public void setXstdJzxm(String xstdJzxm) 
    {
        this.xstdJzxm = xstdJzxm;
    }

    public String getXstdJzxm() 
    {
        return xstdJzxm;
    }
    public void setXstdPznm(String xstdPznm) 
    {
        this.xstdPznm = xstdPznm;
    }

    public String getXstdPznm() 
    {
        return xstdPznm;
    }
    public void setXstdPzrq(String xstdPzrq) 
    {
        this.xstdPzrq = xstdPzrq;
    }

    public String getXstdPzrq() 
    {
        return xstdPzrq;
    }
    public void setXstdPzbh(String xstdPzbh) 
    {
        this.xstdPzbh = xstdPzbh;
    }

    public String getXstdPzbh() 
    {
        return xstdPzbh;
    }
    public void setXstdPznd(String xstdPznd) 
    {
        this.xstdPznd = xstdPznd;
    }

    public String getXstdPznd() 
    {
        return xstdPznd;
    }
    public void setXstdSfqr(String xstdSfqr) 
    {
        this.xstdSfqr = xstdSfqr;
    }

    public String getXstdSfqr() 
    {
        return xstdSfqr;
    }
    public void setXstdSfjz(String xstdSfjz) 
    {
        this.xstdSfjz = xstdSfjz;
    }

    public String getXstdSfjz() 
    {
        return xstdSfjz;
    }
    public void setXstdSfqxjz(String xstdSfqxjz) 
    {
        this.xstdSfqxjz = xstdSfqxjz;
    }

    public String getXstdSfqxjz() 
    {
        return xstdSfqxjz;
    }
    public void setXstdSfxg(String xstdSfxg) 
    {
        this.xstdSfxg = xstdSfxg;
    }

    public String getXstdSfxg() 
    {
        return xstdSfxg;
    }
    public void setXstdSfsc(String xstdSfsc) 
    {
        this.xstdSfsc = xstdSfsc;
    }

    public String getXstdSfsc() 
    {
        return xstdSfsc;
    }
    public void setXstdSfls(String xstdSfls) 
    {
        this.xstdSfls = xstdSfls;
    }

    public String getXstdSfls() 
    {
        return xstdSfls;
    }
    public void setXstdSfczx(String xstdSfczx) 
    {
        this.xstdSfczx = xstdSfczx;
    }

    public String getXstdSfczx() 
    {
        return xstdSfczx;
    }
    public void setXstdSfcdj(String xstdSfcdj) 
    {
        this.xstdSfcdj = xstdSfcdj;
    }

    public String getXstdSfcdj() 
    {
        return xstdSfcdj;
    }
    public void setXstdDydate(String xstdDydate) 
    {
        this.xstdDydate = xstdDydate;
    }

    public String getXstdDydate() 
    {
        return xstdDydate;
    }
    public void setXstdDyperson(String xstdDyperson) 
    {
        this.xstdDyperson = xstdDyperson;
    }

    public String getXstdDyperson() 
    {
        return xstdDyperson;
    }
    public void setXstdShlc(String xstdShlc) 
    {
        this.xstdShlc = xstdShlc;
    }

    public String getXstdShlc() 
    {
        return xstdShlc;
    }
    public void setXstdShbz(String xstdShbz) 
    {
        this.xstdShbz = xstdShbz;
    }

    public String getXstdShbz() 
    {
        return xstdShbz;
    }
    public void setXstdShrq(String xstdShrq) 
    {
        this.xstdShrq = xstdShrq;
    }

    public String getXstdShrq() 
    {
        return xstdShrq;
    }
    public void setXstdShxm(String xstdShxm) 
    {
        this.xstdShxm = xstdShxm;
    }

    public String getXstdShxm() 
    {
        return xstdShxm;
    }
    public void setXstdC1(String xstdC1) 
    {
        this.xstdC1 = xstdC1;
    }

    public String getXstdC1() 
    {
        return xstdC1;
    }
    public void setXstdC2(String xstdC2) 
    {
        this.xstdC2 = xstdC2;
    }

    public String getXstdC2() 
    {
        return xstdC2;
    }
    public void setXstdC3(String xstdC3) 
    {
        this.xstdC3 = xstdC3;
    }

    public String getXstdC3() 
    {
        return xstdC3;
    }
    public void setXstdC4(String xstdC4) 
    {
        this.xstdC4 = xstdC4;
    }

    public String getXstdC4() 
    {
        return xstdC4;
    }
    public void setXstdC5(String xstdC5) 
    {
        this.xstdC5 = xstdC5;
    }

    public String getXstdC5() 
    {
        return xstdC5;
    }
    public void setXstdC6(String xstdC6) 
    {
        this.xstdC6 = xstdC6;
    }

    public String getXstdC6() 
    {
        return xstdC6;
    }
    public void setXstdC7(String xstdC7) 
    {
        this.xstdC7 = xstdC7;
    }

    public String getXstdC7() 
    {
        return xstdC7;
    }
    public void setXstdC8(String xstdC8) 
    {
        this.xstdC8 = xstdC8;
    }

    public String getXstdC8() 
    {
        return xstdC8;
    }
    public void setXstdC9(String xstdC9) 
    {
        this.xstdC9 = xstdC9;
    }

    public String getXstdC9() 
    {
        return xstdC9;
    }
    public void setXstdC10(String xstdC10) 
    {
        this.xstdC10 = xstdC10;
    }

    public String getXstdC10() 
    {
        return xstdC10;
    }
    public void setXstdU1(Integer xstdU1) 
    {
        this.xstdU1 = xstdU1;
    }

    public Integer getXstdU1() 
    {
        return xstdU1;
    }
    public void setXstdU2(Integer xstdU2) 
    {
        this.xstdU2 = xstdU2;
    }

    public Integer getXstdU2() 
    {
        return xstdU2;
    }
    public void setXstdU3(Integer xstdU3) 
    {
        this.xstdU3 = xstdU3;
    }

    public Integer getXstdU3() 
    {
        return xstdU3;
    }
    public void setXstdU4(Integer xstdU4) 
    {
        this.xstdU4 = xstdU4;
    }

    public Integer getXstdU4() 
    {
        return xstdU4;
    }
    public void setXstdU5(Integer xstdU5) 
    {
        this.xstdU5 = xstdU5;
    }

    public Integer getXstdU5() 
    {
        return xstdU5;
    }
    public void setXstdU6(Integer xstdU6) 
    {
        this.xstdU6 = xstdU6;
    }

    public Integer getXstdU6() 
    {
        return xstdU6;
    }
    public void setXstdBz(String xstdBz) 
    {
        this.xstdBz = xstdBz;
    }

    public String getXstdBz() 
    {
        return xstdBz;
    }
    public void setXstdGsbh(String xstdGsbh) 
    {
        this.xstdGsbh = xstdGsbh;
    }

    public String getXstdGsbh() 
    {
        return xstdGsbh;
    }
    public void setXstdSybbh(String xstdSybbh) 
    {
        this.xstdSybbh = xstdSybbh;
    }

    public String getXstdSybbh() 
    {
        return xstdSybbh;
    }
    public void setXstdPqbh(String xstdPqbh) 
    {
        this.xstdPqbh = xstdPqbh;
    }

    public String getXstdPqbh() 
    {
        return xstdPqbh;
    }
    public void setXstdGsmc(String xstdGsmc) 
    {
        this.xstdGsmc = xstdGsmc;
    }

    public String getXstdGsmc() 
    {
        return xstdGsmc;
    }
    public void setXstdGsbhbak(String xstdGsbhbak) 
    {
        this.xstdGsbhbak = xstdGsbhbak;
    }

    public String getXstdGsbhbak() 
    {
        return xstdGsbhbak;
    }
    public void setXstdGsmcbak(String xstdGsmcbak) 
    {
        this.xstdGsmcbak = xstdGsmcbak;
    }

    public String getXstdGsmcbak() 
    {
        return xstdGsmcbak;
    }
    public void setXstdYwmc(String xstdYwmc) 
    {
        this.xstdYwmc = xstdYwmc;
    }

    public String getXstdYwmc() 
    {
        return xstdYwmc;
    }
    public void setXstdKhbhbak(String xstdKhbhbak) 
    {
        this.xstdKhbhbak = xstdKhbhbak;
    }

    public String getXstdKhbhbak() 
    {
        return xstdKhbhbak;
    }
    public void setXstdKhmcbak(String xstdKhmcbak) 
    {
        this.xstdKhmcbak = xstdKhmcbak;
    }

    public String getXstdKhmcbak() 
    {
        return xstdKhmcbak;
    }
    public void setXstdDzbh(String xstdDzbh) 
    {
        this.xstdDzbh = xstdDzbh;
    }

    public String getXstdDzbh() 
    {
        return xstdDzbh;
    }
    public void setXstdBmmc(String xstdBmmc) 
    {
        this.xstdBmmc = xstdBmmc;
    }

    public String getXstdBmmc() 
    {
        return xstdBmmc;
    }
    public void setXstdBmbhbak(String xstdBmbhbak) 
    {
        this.xstdBmbhbak = xstdBmbhbak;
    }

    public String getXstdBmbhbak() 
    {
        return xstdBmbhbak;
    }
    public void setXstdBmmcbak(String xstdBmmcbak) 
    {
        this.xstdBmmcbak = xstdBmmcbak;
    }

    public String getXstdBmmcbak() 
    {
        return xstdBmmcbak;
    }
    public void setXstdRyxm(String xstdRyxm) 
    {
        this.xstdRyxm = xstdRyxm;
    }

    public String getXstdRyxm() 
    {
        return xstdRyxm;
    }
    public void setXstdRybhbak(String xstdRybhbak) 
    {
        this.xstdRybhbak = xstdRybhbak;
    }

    public String getXstdRybhbak() 
    {
        return xstdRybhbak;
    }
    public void setXstdRyxmbak(String xstdRyxmbak) 
    {
        this.xstdRyxmbak = xstdRyxmbak;
    }

    public String getXstdRyxmbak() 
    {
        return xstdRyxmbak;
    }
    public void setXstdCkbh(String xstdCkbh) 
    {
        this.xstdCkbh = xstdCkbh;
    }

    public String getXstdCkbh() 
    {
        return xstdCkbh;
    }
    public void setXstdCkmc(String xstdCkmc) 
    {
        this.xstdCkmc = xstdCkmc;
    }

    public String getXstdCkmc() 
    {
        return xstdCkmc;
    }
    public void setXstdSpdx(String xstdSpdx) 
    {
        this.xstdSpdx = xstdSpdx;
    }

    public String getXstdSpdx() 
    {
        return xstdSpdx;
    }
    public void setXstdDrbs(String xstdDrbs) 
    {
        this.xstdDrbs = xstdDrbs;
    }

    public String getXstdDrbs() 
    {
        return xstdDrbs;
    }
    public void setXstdHzr(String xstdHzr) 
    {
        this.xstdHzr = xstdHzr;
    }

    public String getXstdHzr() 
    {
        return xstdHzr;
    }
    public void setXstdHzrq(String xstdHzrq) 
    {
        this.xstdHzrq = xstdHzrq;
    }

    public String getXstdHzrq() 
    {
        return xstdHzrq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("xstdTdls", getXstdTdls())
            .append("xstdPjlx", getXstdPjlx())
            .append("xstdYwbs", getXstdYwbs())
            .append("xstdZbpjlx", getXstdZbpjlx())
            .append("xstdTdbh", getXstdTdbh())
            .append("xstdDjrq", getXstdDjrq())
            .append("xstdYwrq", getXstdYwrq())
            .append("xstdXgsj", getXstdXgsj())
            .append("xstdQcbz", getXstdQcbz())
            .append("xstdTdbz", getXstdTdbz())
            .append("xstdYwbh", getXstdYwbh())
            .append("xstdZlbh", getXstdZlbh())
            .append("xstdShdkh", getXstdShdkh())
            .append("xstdShdkhmc", getXstdShdkhmc())
            .append("xstdSodkh", getXstdSodkh())
            .append("xstdSodkhmc", getXstdSodkhmc())
            .append("xstdSpkh", getXstdSpkh())
            .append("xstdSpkhmc", getXstdSpkhmc())
            .append("xstdFkkh", getXstdFkkh())
            .append("xstdFkkhmc", getXstdFkkhmc())
            .append("xstdAddr", getXstdAddr())
            .append("xstdTele", getXstdTele())
            .append("xstdLxr", getXstdLxr())
            .append("xstdBmbh", getXstdBmbh())
            .append("xstdRybh", getXstdRybh())
            .append("xstdWbbh", getXstdWbbh())
            .append("xstdHl", getXstdHl())
            .append("xstdHtbh", getXstdHtbh())
            .append("xstdHtls", getXstdHtls())
            .append("xstdZkzc", getXstdZkzc())
            .append("xstdHkrq", getXstdHkrq())
            .append("xstdFsbh", getXstdFsbh())
            .append("xstdDhdd", getXstdDhdd())
            .append("xstdZdxm", getXstdZdxm())
            .append("xstdJzbz", getXstdJzbz())
            .append("xstdJzsj", getXstdJzsj())
            .append("xstdJzxm", getXstdJzxm())
            .append("xstdPznm", getXstdPznm())
            .append("xstdPzrq", getXstdPzrq())
            .append("xstdPzbh", getXstdPzbh())
            .append("xstdPznd", getXstdPznd())
            .append("xstdSfqr", getXstdSfqr())
            .append("xstdSfjz", getXstdSfjz())
            .append("xstdSfqxjz", getXstdSfqxjz())
            .append("xstdSfxg", getXstdSfxg())
            .append("xstdSfsc", getXstdSfsc())
            .append("xstdSfls", getXstdSfls())
            .append("xstdSfczx", getXstdSfczx())
            .append("xstdSfcdj", getXstdSfcdj())
            .append("xstdDydate", getXstdDydate())
            .append("xstdDyperson", getXstdDyperson())
            .append("xstdShlc", getXstdShlc())
            .append("xstdShbz", getXstdShbz())
            .append("xstdShrq", getXstdShrq())
            .append("xstdShxm", getXstdShxm())
            .append("xstdC1", getXstdC1())
            .append("xstdC2", getXstdC2())
            .append("xstdC3", getXstdC3())
            .append("xstdC4", getXstdC4())
            .append("xstdC5", getXstdC5())
            .append("xstdC6", getXstdC6())
            .append("xstdC7", getXstdC7())
            .append("xstdC8", getXstdC8())
            .append("xstdC9", getXstdC9())
            .append("xstdC10", getXstdC10())
            .append("xstdU1", getXstdU1())
            .append("xstdU2", getXstdU2())
            .append("xstdU3", getXstdU3())
            .append("xstdU4", getXstdU4())
            .append("xstdU5", getXstdU5())
            .append("xstdU6", getXstdU6())
            .append("xstdBz", getXstdBz())
            .append("xstdGsbh", getXstdGsbh())
            .append("xstdSybbh", getXstdSybbh())
            .append("xstdPqbh", getXstdPqbh())
            .append("xstdGsmc", getXstdGsmc())
            .append("xstdGsbhbak", getXstdGsbhbak())
            .append("xstdGsmcbak", getXstdGsmcbak())
            .append("xstdYwmc", getXstdYwmc())
            .append("xstdKhbhbak", getXstdKhbhbak())
            .append("xstdKhmcbak", getXstdKhmcbak())
            .append("xstdDzbh", getXstdDzbh())
            .append("xstdBmmc", getXstdBmmc())
            .append("xstdBmbhbak", getXstdBmbhbak())
            .append("xstdBmmcbak", getXstdBmmcbak())
            .append("xstdRyxm", getXstdRyxm())
            .append("xstdRybhbak", getXstdRybhbak())
            .append("xstdRyxmbak", getXstdRyxmbak())
            .append("xstdCkbh", getXstdCkbh())
            .append("xstdCkmc", getXstdCkmc())
            .append("xstdSpdx", getXstdSpdx())
            .append("xstdDrbs", getXstdDrbs())
            .append("xstdHzr", getXstdHzr())
            .append("xstdHzrq", getXstdHzrq())
            .toString();
    }
}
