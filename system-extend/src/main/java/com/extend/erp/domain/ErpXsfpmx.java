package com.extend.erp.domain;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售发票明细对象 erp_xsfpmx
 * 
 * @author wcg
 * @date 2023-10-13
 */
@DataSource(value = DataSourceType.SLAVE)
@TableName("XSFPMX")
public class ErpXsfpmx
{
    private static final long serialVersionUID = 1L;

    /** 发票流水 */
    private String xsfpmxFpls;

    /** $column.columnComment */
    private String xsfpmxFpfl;

    /** $column.columnComment */
    private Long xsfpmxXsxh;

    /** 分录类型 */
    private String xsfpmxFllx;

    /** 分录来源 */
    private String xsfpmxFlly;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String xsfpmxCkbh;

    /** 物料编号 */
    @Excel(name = "物料编号")
    private String xsfpmxWlbh;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String xsfpmxWlmc;

    /** 批次号 */
    @Excel(name = "批次号")
    private String xsfpmxPch;

    /** 特别项目1 */
    private String xsfpmxZyx1;

    /** 特别项目2 */
    private String xsfpmxZyx2;

    /** 特别项目3 */
    private String xsfpmxZyx3;

    /** 特别项目4 */
    private String xsfpmxZyx4;

    /** 特别项目5 */
    private String xsfpmxZyx5;

    /** 物料状态 */
    @Excel(name = "物料状态")
    private String xsfpmxWlzt;

    /** $column.columnComment */
    private String xsfpmxWlbz;

    /** 收支项目 */
    @Excel(name = "收支项目")
    private String xsfpmxSzxm;

    /** $column.columnComment */
    private String xsfpmxDdls;

    /** $column.columnComment */
    private String xsfpmxDdfl;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String xsfpmxDdbh;

    /** $column.columnComment */
    private String xsfpmxTdls;

    /** $column.columnComment */
    private String xsfpmxTdfl;

    /** 提单编号 */
    @Excel(name = "提单编号")
    private String xsfpmxTdbh;

    /** $column.columnComment */
    private String xsfpmxHtls;

    /** $column.columnComment */
    private String xsfpmxHtfl;

    /** $column.columnComment */
    private String xsfpmxHtbh;

    /** $column.columnComment */
    private String xsfpmxPjls;

    /** $column.columnComment */
    private String xsfpmxPjfl;

    /** $column.columnComment */
    private String xsfpmxPjbh;

    /** $column.columnComment */
    private String xsfpmxHdls;

    /** $column.columnComment */
    private String xsfpmxHdfl;

    /** $column.columnComment */
    private String xsfpmxHdbh;

    /** $column.columnComment */
    private String xsfpmxFyls;

    /** $column.columnComment */
    private String xsfpmxFyfl;

    /** $column.columnComment */
    private String xsfpmxFybh;

    /** $column.columnComment */
    private String xsfpmxYfpls;

    /** $column.columnComment */
    private String xsfpmxYfpfl;

    /** 原发票编号 */
    private String xsfpmxYfpbh;

    /** 主数量 */
    @Excel(name = "主数量")
    private BigDecimal xsfpmxZsl;

    /** 销售数量 */
    @Excel(name = "销售数量")
    private BigDecimal xsfpmxFsl1;

    /** 辅助数量 */
    @Excel(name = "辅助数量")
    private BigDecimal xsfpmxFsl2;

    /** 开票价 */
    @Excel(name = "开票价")
    private BigDecimal xsfpmxYzhsj;

    /** 本主含税价 */
    private BigDecimal xsfpmxBzhsj;

    /** 单笔折扣比率 */
    @Excel(name = "单笔折扣比率")
    private Integer xsfpmxDbzkbl;

    /** 总额折扣比率 */
    @Excel(name = "总额折扣比率")
    private Integer xsfpmxZezkbl;

    /** 折扣金额 */
    @Excel(name = "折扣金额")
    private Integer xsfpmxYzkje;

    /** $column.columnComment */
    private Integer xsfpmxBzkje;

    /** 含税金额 */
    @Excel(name = "含税金额")
    private BigDecimal xsfpmxYhse;

    /** 本币含税额 */
    private BigDecimal xsfpmxBhse;

    /** 税率 */
    @Excel(name = "税率")
    private BigDecimal xsfpmxSl;

    /** 销售单价 */
    @Excel(name = "销售单价")
    private BigDecimal xsfpmxYzxsj;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal xsfpmxBzxsj;

    /** 销售金额 */
    @Excel(name = "销售金额")
    private BigDecimal xsfpmxYxse;

    /** 本主销售额 */
    private BigDecimal xsfpmxBxse;

    /** 税额 */
    @Excel(name = "税额")
    private BigDecimal xsfpmxYse;

    /** 本税额 */
    private BigDecimal xsfpmxBse;

    /** $column.columnComment */
    private String xsfpmxSfhk;

    /** $column.columnComment */
    private String xsfpmxHkbz;

    /** 回款额 */
    @Excel(name = "回款额")
    private Integer xsfpmxYhke;

    /** $column.columnComment */
    private Integer xsfpmxBhke;

    /** 回款数量 */
    @Excel(name = "回款数量")
    private Integer xsfpmxHksl;

    /** 回款数量1 */
    private Integer xsfpmxHkfsl1;

    /** 回款数量2 */
    private Integer xsfpmxHkfsl2;

    /** $column.columnComment */
    private String xsfpmxSfth;

    /** $column.columnComment */
    private String xsfpmxThbz;

    /** $column.columnComment */
    private Integer xsfpmxThsl;

    /** $column.columnComment */
    private Integer xsfpmxThfsl1;

    /** $column.columnComment */
    private Integer xsfpmxThfsl2;

    /** $column.columnComment */
    private String xsfpmxDqzk;

    /** 是否出库 */
    @Excel(name = "是否出库")
    private String xsfpmxSfck;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxCkbz;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxCksl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxCkfsl1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxCkfsl2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxCkje;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxTdzhsj;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxTdzsl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxTdyhse;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxTdbhse;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxHzzsl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxHzfsl1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxHzfsl2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxYhze;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxBhze;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxDczsl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxDcfsl1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxDcfsl2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxYdce;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxBdce;

    /** 立账日期 */
    @Excel(name = "立账日期")
    private String xsfpmxLzrq;

    /** 预回款日期 */
    @Excel(name = "预回款日期")
    private String xsfpmxYhkrq;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxZxpdyj;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxZxtszc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxYywrq;

    /** 文本1 */
    @Excel(name = "文本1")
    private String xsfpmxC1;

    /** 文本2 */
    @Excel(name = "文本2")
    private String xsfpmxC2;

    /** 文本3 */
    @Excel(name = "文本3")
    private String xsfpmxC3;

    /** 文本4 */
    @Excel(name = "文本4")
    private String xsfpmxC4;

    /** 文本5 */
    @Excel(name = "文本5")
    private String xsfpmxC5;

    /** 文本6 */
    @Excel(name = "文本6")
    private String xsfpmxC6;

    /** 文本7 */
    @Excel(name = "文本7")
    private String xsfpmxC7;

    /** 文本8 */
    @Excel(name = "文本8")
    private String xsfpmxC8;

    /** 文本9 */
    @Excel(name = "文本9")
    private String xsfpmxC9;

    /** 文本10 */
    @Excel(name = "文本10")
    private String xsfpmxC10;

    /** 数字1 */
    @Excel(name = "数字1")
    private Integer xsfpmxU1;

    /** 数字2 */
    @Excel(name = "数字2")
    private Integer xsfpmxU2;

    /** 数字3 */
    @Excel(name = "数字3")
    private Integer xsfpmxU3;

    /** 数字4 */
    @Excel(name = "数字4")
    private Integer xsfpmxU4;

    /** 数字5 */
    @Excel(name = "数字5")
    private Integer xsfpmxU5;

    /** 数字6 */
    @Excel(name = "数字6")
    private Integer xsfpmxU6;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxYstdls;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxYstdfl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xsfpmxBcyhsl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxCkls;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxCkfl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxJgys;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxJgzc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xsfpmxWlbhbak;

    public void setXsfpmxFpls(String xsfpmxFpls) 
    {
        this.xsfpmxFpls = xsfpmxFpls;
    }

    public String getXsfpmxFpls() 
    {
        return xsfpmxFpls;
    }
    public void setXsfpmxFpfl(String xsfpmxFpfl) 
    {
        this.xsfpmxFpfl = xsfpmxFpfl;
    }

    public String getXsfpmxFpfl() 
    {
        return xsfpmxFpfl;
    }
    public void setXsfpmxXsxh(Long xsfpmxXsxh) 
    {
        this.xsfpmxXsxh = xsfpmxXsxh;
    }

    public Long getXsfpmxXsxh() 
    {
        return xsfpmxXsxh;
    }
    public void setXsfpmxFllx(String xsfpmxFllx) 
    {
        this.xsfpmxFllx = xsfpmxFllx;
    }

    public String getXsfpmxFllx() 
    {
        return xsfpmxFllx;
    }
    public void setXsfpmxFlly(String xsfpmxFlly) 
    {
        this.xsfpmxFlly = xsfpmxFlly;
    }

    public String getXsfpmxFlly() 
    {
        return xsfpmxFlly;
    }
    public void setXsfpmxCkbh(String xsfpmxCkbh) 
    {
        this.xsfpmxCkbh = xsfpmxCkbh;
    }

    public String getXsfpmxCkbh() 
    {
        return xsfpmxCkbh;
    }
    public void setXsfpmxWlbh(String xsfpmxWlbh) 
    {
        this.xsfpmxWlbh = xsfpmxWlbh;
    }

    public String getXsfpmxWlbh() 
    {
        return xsfpmxWlbh;
    }
    public void setXsfpmxWlmc(String xsfpmxWlmc) 
    {
        this.xsfpmxWlmc = xsfpmxWlmc;
    }

    public String getXsfpmxWlmc() 
    {
        return xsfpmxWlmc;
    }
    public void setXsfpmxPch(String xsfpmxPch) 
    {
        this.xsfpmxPch = xsfpmxPch;
    }

    public String getXsfpmxPch() 
    {
        return xsfpmxPch;
    }
    public void setXsfpmxZyx1(String xsfpmxZyx1) 
    {
        this.xsfpmxZyx1 = xsfpmxZyx1;
    }

    public String getXsfpmxZyx1() 
    {
        return xsfpmxZyx1;
    }
    public void setXsfpmxZyx2(String xsfpmxZyx2) 
    {
        this.xsfpmxZyx2 = xsfpmxZyx2;
    }

    public String getXsfpmxZyx2() 
    {
        return xsfpmxZyx2;
    }
    public void setXsfpmxZyx3(String xsfpmxZyx3) 
    {
        this.xsfpmxZyx3 = xsfpmxZyx3;
    }

    public String getXsfpmxZyx3() 
    {
        return xsfpmxZyx3;
    }
    public void setXsfpmxZyx4(String xsfpmxZyx4) 
    {
        this.xsfpmxZyx4 = xsfpmxZyx4;
    }

    public String getXsfpmxZyx4() 
    {
        return xsfpmxZyx4;
    }
    public void setXsfpmxZyx5(String xsfpmxZyx5) 
    {
        this.xsfpmxZyx5 = xsfpmxZyx5;
    }

    public String getXsfpmxZyx5() 
    {
        return xsfpmxZyx5;
    }
    public void setXsfpmxWlzt(String xsfpmxWlzt) 
    {
        this.xsfpmxWlzt = xsfpmxWlzt;
    }

    public String getXsfpmxWlzt() 
    {
        return xsfpmxWlzt;
    }
    public void setXsfpmxWlbz(String xsfpmxWlbz) 
    {
        this.xsfpmxWlbz = xsfpmxWlbz;
    }

    public String getXsfpmxWlbz() 
    {
        return xsfpmxWlbz;
    }
    public void setXsfpmxSzxm(String xsfpmxSzxm) 
    {
        this.xsfpmxSzxm = xsfpmxSzxm;
    }

    public String getXsfpmxSzxm() 
    {
        return xsfpmxSzxm;
    }
    public void setXsfpmxDdls(String xsfpmxDdls) 
    {
        this.xsfpmxDdls = xsfpmxDdls;
    }

    public String getXsfpmxDdls() 
    {
        return xsfpmxDdls;
    }
    public void setXsfpmxDdfl(String xsfpmxDdfl) 
    {
        this.xsfpmxDdfl = xsfpmxDdfl;
    }

    public String getXsfpmxDdfl() 
    {
        return xsfpmxDdfl;
    }
    public void setXsfpmxDdbh(String xsfpmxDdbh) 
    {
        this.xsfpmxDdbh = xsfpmxDdbh;
    }

    public String getXsfpmxDdbh() 
    {
        return xsfpmxDdbh;
    }
    public void setXsfpmxTdls(String xsfpmxTdls) 
    {
        this.xsfpmxTdls = xsfpmxTdls;
    }

    public String getXsfpmxTdls() 
    {
        return xsfpmxTdls;
    }
    public void setXsfpmxTdfl(String xsfpmxTdfl) 
    {
        this.xsfpmxTdfl = xsfpmxTdfl;
    }

    public String getXsfpmxTdfl() 
    {
        return xsfpmxTdfl;
    }
    public void setXsfpmxTdbh(String xsfpmxTdbh) 
    {
        this.xsfpmxTdbh = xsfpmxTdbh;
    }

    public String getXsfpmxTdbh() 
    {
        return xsfpmxTdbh;
    }
    public void setXsfpmxHtls(String xsfpmxHtls) 
    {
        this.xsfpmxHtls = xsfpmxHtls;
    }

    public String getXsfpmxHtls() 
    {
        return xsfpmxHtls;
    }
    public void setXsfpmxHtfl(String xsfpmxHtfl) 
    {
        this.xsfpmxHtfl = xsfpmxHtfl;
    }

    public String getXsfpmxHtfl() 
    {
        return xsfpmxHtfl;
    }
    public void setXsfpmxHtbh(String xsfpmxHtbh) 
    {
        this.xsfpmxHtbh = xsfpmxHtbh;
    }

    public String getXsfpmxHtbh() 
    {
        return xsfpmxHtbh;
    }
    public void setXsfpmxPjls(String xsfpmxPjls) 
    {
        this.xsfpmxPjls = xsfpmxPjls;
    }

    public String getXsfpmxPjls() 
    {
        return xsfpmxPjls;
    }
    public void setXsfpmxPjfl(String xsfpmxPjfl) 
    {
        this.xsfpmxPjfl = xsfpmxPjfl;
    }

    public String getXsfpmxPjfl() 
    {
        return xsfpmxPjfl;
    }
    public void setXsfpmxPjbh(String xsfpmxPjbh) 
    {
        this.xsfpmxPjbh = xsfpmxPjbh;
    }

    public String getXsfpmxPjbh() 
    {
        return xsfpmxPjbh;
    }
    public void setXsfpmxHdls(String xsfpmxHdls) 
    {
        this.xsfpmxHdls = xsfpmxHdls;
    }

    public String getXsfpmxHdls() 
    {
        return xsfpmxHdls;
    }
    public void setXsfpmxHdfl(String xsfpmxHdfl) 
    {
        this.xsfpmxHdfl = xsfpmxHdfl;
    }

    public String getXsfpmxHdfl() 
    {
        return xsfpmxHdfl;
    }
    public void setXsfpmxHdbh(String xsfpmxHdbh) 
    {
        this.xsfpmxHdbh = xsfpmxHdbh;
    }

    public String getXsfpmxHdbh() 
    {
        return xsfpmxHdbh;
    }
    public void setXsfpmxFyls(String xsfpmxFyls) 
    {
        this.xsfpmxFyls = xsfpmxFyls;
    }

    public String getXsfpmxFyls() 
    {
        return xsfpmxFyls;
    }
    public void setXsfpmxFyfl(String xsfpmxFyfl) 
    {
        this.xsfpmxFyfl = xsfpmxFyfl;
    }

    public String getXsfpmxFyfl() 
    {
        return xsfpmxFyfl;
    }
    public void setXsfpmxFybh(String xsfpmxFybh) 
    {
        this.xsfpmxFybh = xsfpmxFybh;
    }

    public String getXsfpmxFybh() 
    {
        return xsfpmxFybh;
    }
    public void setXsfpmxYfpls(String xsfpmxYfpls) 
    {
        this.xsfpmxYfpls = xsfpmxYfpls;
    }

    public String getXsfpmxYfpls() 
    {
        return xsfpmxYfpls;
    }
    public void setXsfpmxYfpfl(String xsfpmxYfpfl) 
    {
        this.xsfpmxYfpfl = xsfpmxYfpfl;
    }

    public String getXsfpmxYfpfl() 
    {
        return xsfpmxYfpfl;
    }
    public void setXsfpmxYfpbh(String xsfpmxYfpbh) 
    {
        this.xsfpmxYfpbh = xsfpmxYfpbh;
    }

    public String getXsfpmxYfpbh() 
    {
        return xsfpmxYfpbh;
    }
    public void setXsfpmxZsl(BigDecimal xsfpmxZsl) 
    {
        this.xsfpmxZsl = xsfpmxZsl;
    }

    public BigDecimal getXsfpmxZsl() 
    {
        return xsfpmxZsl;
    }
    public void setXsfpmxFsl1(BigDecimal xsfpmxFsl1) 
    {
        this.xsfpmxFsl1 = xsfpmxFsl1;
    }

    public BigDecimal getXsfpmxFsl1() 
    {
        return xsfpmxFsl1;
    }
    public void setXsfpmxFsl2(BigDecimal xsfpmxFsl2) 
    {
        this.xsfpmxFsl2 = xsfpmxFsl2;
    }

    public BigDecimal getXsfpmxFsl2() 
    {
        return xsfpmxFsl2;
    }
    public void setXsfpmxYzhsj(BigDecimal xsfpmxYzhsj) 
    {
        this.xsfpmxYzhsj = xsfpmxYzhsj;
    }

    public BigDecimal getXsfpmxYzhsj() 
    {
        return xsfpmxYzhsj;
    }
    public void setXsfpmxBzhsj(BigDecimal xsfpmxBzhsj) 
    {
        this.xsfpmxBzhsj = xsfpmxBzhsj;
    }

    public BigDecimal getXsfpmxBzhsj() 
    {
        return xsfpmxBzhsj;
    }
    public void setXsfpmxDbzkbl(Integer xsfpmxDbzkbl) 
    {
        this.xsfpmxDbzkbl = xsfpmxDbzkbl;
    }

    public Integer getXsfpmxDbzkbl() 
    {
        return xsfpmxDbzkbl;
    }
    public void setXsfpmxZezkbl(Integer xsfpmxZezkbl) 
    {
        this.xsfpmxZezkbl = xsfpmxZezkbl;
    }

    public Integer getXsfpmxZezkbl() 
    {
        return xsfpmxZezkbl;
    }
    public void setXsfpmxYzkje(Integer xsfpmxYzkje) 
    {
        this.xsfpmxYzkje = xsfpmxYzkje;
    }

    public Integer getXsfpmxYzkje() 
    {
        return xsfpmxYzkje;
    }
    public void setXsfpmxBzkje(Integer xsfpmxBzkje) 
    {
        this.xsfpmxBzkje = xsfpmxBzkje;
    }

    public Integer getXsfpmxBzkje() 
    {
        return xsfpmxBzkje;
    }
    public void setXsfpmxYhse(BigDecimal xsfpmxYhse) 
    {
        this.xsfpmxYhse = xsfpmxYhse;
    }

    public BigDecimal getXsfpmxYhse() 
    {
        return xsfpmxYhse;
    }
    public void setXsfpmxBhse(BigDecimal xsfpmxBhse) 
    {
        this.xsfpmxBhse = xsfpmxBhse;
    }

    public BigDecimal getXsfpmxBhse() 
    {
        return xsfpmxBhse;
    }
    public void setXsfpmxSl(BigDecimal xsfpmxSl) 
    {
        this.xsfpmxSl = xsfpmxSl;
    }

    public BigDecimal getXsfpmxSl() 
    {
        return xsfpmxSl;
    }
    public void setXsfpmxYzxsj(BigDecimal xsfpmxYzxsj) 
    {
        this.xsfpmxYzxsj = xsfpmxYzxsj;
    }

    public BigDecimal getXsfpmxYzxsj() 
    {
        return xsfpmxYzxsj;
    }
    public void setXsfpmxBzxsj(BigDecimal xsfpmxBzxsj) 
    {
        this.xsfpmxBzxsj = xsfpmxBzxsj;
    }

    public BigDecimal getXsfpmxBzxsj() 
    {
        return xsfpmxBzxsj;
    }
    public void setXsfpmxYxse(BigDecimal xsfpmxYxse) 
    {
        this.xsfpmxYxse = xsfpmxYxse;
    }

    public BigDecimal getXsfpmxYxse() 
    {
        return xsfpmxYxse;
    }
    public void setXsfpmxBxse(BigDecimal xsfpmxBxse) 
    {
        this.xsfpmxBxse = xsfpmxBxse;
    }

    public BigDecimal getXsfpmxBxse() 
    {
        return xsfpmxBxse;
    }
    public void setXsfpmxYse(BigDecimal xsfpmxYse) 
    {
        this.xsfpmxYse = xsfpmxYse;
    }

    public BigDecimal getXsfpmxYse() 
    {
        return xsfpmxYse;
    }
    public void setXsfpmxBse(BigDecimal xsfpmxBse) 
    {
        this.xsfpmxBse = xsfpmxBse;
    }

    public BigDecimal getXsfpmxBse() 
    {
        return xsfpmxBse;
    }
    public void setXsfpmxSfhk(String xsfpmxSfhk) 
    {
        this.xsfpmxSfhk = xsfpmxSfhk;
    }

    public String getXsfpmxSfhk() 
    {
        return xsfpmxSfhk;
    }
    public void setXsfpmxHkbz(String xsfpmxHkbz) 
    {
        this.xsfpmxHkbz = xsfpmxHkbz;
    }

    public String getXsfpmxHkbz() 
    {
        return xsfpmxHkbz;
    }
    public void setXsfpmxYhke(Integer xsfpmxYhke) 
    {
        this.xsfpmxYhke = xsfpmxYhke;
    }

    public Integer getXsfpmxYhke() 
    {
        return xsfpmxYhke;
    }
    public void setXsfpmxBhke(Integer xsfpmxBhke) 
    {
        this.xsfpmxBhke = xsfpmxBhke;
    }

    public Integer getXsfpmxBhke() 
    {
        return xsfpmxBhke;
    }
    public void setXsfpmxHksl(Integer xsfpmxHksl) 
    {
        this.xsfpmxHksl = xsfpmxHksl;
    }

    public Integer getXsfpmxHksl() 
    {
        return xsfpmxHksl;
    }
    public void setXsfpmxHkfsl1(Integer xsfpmxHkfsl1) 
    {
        this.xsfpmxHkfsl1 = xsfpmxHkfsl1;
    }

    public Integer getXsfpmxHkfsl1() 
    {
        return xsfpmxHkfsl1;
    }
    public void setXsfpmxHkfsl2(Integer xsfpmxHkfsl2) 
    {
        this.xsfpmxHkfsl2 = xsfpmxHkfsl2;
    }

    public Integer getXsfpmxHkfsl2() 
    {
        return xsfpmxHkfsl2;
    }
    public void setXsfpmxSfth(String xsfpmxSfth) 
    {
        this.xsfpmxSfth = xsfpmxSfth;
    }

    public String getXsfpmxSfth() 
    {
        return xsfpmxSfth;
    }
    public void setXsfpmxThbz(String xsfpmxThbz) 
    {
        this.xsfpmxThbz = xsfpmxThbz;
    }

    public String getXsfpmxThbz() 
    {
        return xsfpmxThbz;
    }
    public void setXsfpmxThsl(Integer xsfpmxThsl) 
    {
        this.xsfpmxThsl = xsfpmxThsl;
    }

    public Integer getXsfpmxThsl() 
    {
        return xsfpmxThsl;
    }
    public void setXsfpmxThfsl1(Integer xsfpmxThfsl1) 
    {
        this.xsfpmxThfsl1 = xsfpmxThfsl1;
    }

    public Integer getXsfpmxThfsl1() 
    {
        return xsfpmxThfsl1;
    }
    public void setXsfpmxThfsl2(Integer xsfpmxThfsl2) 
    {
        this.xsfpmxThfsl2 = xsfpmxThfsl2;
    }

    public Integer getXsfpmxThfsl2() 
    {
        return xsfpmxThfsl2;
    }
    public void setXsfpmxDqzk(String xsfpmxDqzk) 
    {
        this.xsfpmxDqzk = xsfpmxDqzk;
    }

    public String getXsfpmxDqzk() 
    {
        return xsfpmxDqzk;
    }
    public void setXsfpmxSfck(String xsfpmxSfck) 
    {
        this.xsfpmxSfck = xsfpmxSfck;
    }

    public String getXsfpmxSfck() 
    {
        return xsfpmxSfck;
    }
    public void setXsfpmxCkbz(String xsfpmxCkbz) 
    {
        this.xsfpmxCkbz = xsfpmxCkbz;
    }

    public String getXsfpmxCkbz() 
    {
        return xsfpmxCkbz;
    }
    public void setXsfpmxCksl(Integer xsfpmxCksl) 
    {
        this.xsfpmxCksl = xsfpmxCksl;
    }

    public Integer getXsfpmxCksl() 
    {
        return xsfpmxCksl;
    }
    public void setXsfpmxCkfsl1(Integer xsfpmxCkfsl1) 
    {
        this.xsfpmxCkfsl1 = xsfpmxCkfsl1;
    }

    public Integer getXsfpmxCkfsl1() 
    {
        return xsfpmxCkfsl1;
    }
    public void setXsfpmxCkfsl2(Integer xsfpmxCkfsl2) 
    {
        this.xsfpmxCkfsl2 = xsfpmxCkfsl2;
    }

    public Integer getXsfpmxCkfsl2() 
    {
        return xsfpmxCkfsl2;
    }
    public void setXsfpmxCkje(Integer xsfpmxCkje) 
    {
        this.xsfpmxCkje = xsfpmxCkje;
    }

    public Integer getXsfpmxCkje() 
    {
        return xsfpmxCkje;
    }
    public void setXsfpmxTdzhsj(Integer xsfpmxTdzhsj) 
    {
        this.xsfpmxTdzhsj = xsfpmxTdzhsj;
    }

    public Integer getXsfpmxTdzhsj() 
    {
        return xsfpmxTdzhsj;
    }
    public void setXsfpmxTdzsl(Integer xsfpmxTdzsl) 
    {
        this.xsfpmxTdzsl = xsfpmxTdzsl;
    }

    public Integer getXsfpmxTdzsl() 
    {
        return xsfpmxTdzsl;
    }
    public void setXsfpmxTdyhse(Integer xsfpmxTdyhse) 
    {
        this.xsfpmxTdyhse = xsfpmxTdyhse;
    }

    public Integer getXsfpmxTdyhse() 
    {
        return xsfpmxTdyhse;
    }
    public void setXsfpmxTdbhse(Integer xsfpmxTdbhse) 
    {
        this.xsfpmxTdbhse = xsfpmxTdbhse;
    }

    public Integer getXsfpmxTdbhse() 
    {
        return xsfpmxTdbhse;
    }
    public void setXsfpmxHzzsl(Integer xsfpmxHzzsl) 
    {
        this.xsfpmxHzzsl = xsfpmxHzzsl;
    }

    public Integer getXsfpmxHzzsl() 
    {
        return xsfpmxHzzsl;
    }
    public void setXsfpmxHzfsl1(Integer xsfpmxHzfsl1) 
    {
        this.xsfpmxHzfsl1 = xsfpmxHzfsl1;
    }

    public Integer getXsfpmxHzfsl1() 
    {
        return xsfpmxHzfsl1;
    }
    public void setXsfpmxHzfsl2(Integer xsfpmxHzfsl2) 
    {
        this.xsfpmxHzfsl2 = xsfpmxHzfsl2;
    }

    public Integer getXsfpmxHzfsl2() 
    {
        return xsfpmxHzfsl2;
    }
    public void setXsfpmxYhze(Integer xsfpmxYhze) 
    {
        this.xsfpmxYhze = xsfpmxYhze;
    }

    public Integer getXsfpmxYhze() 
    {
        return xsfpmxYhze;
    }
    public void setXsfpmxBhze(Integer xsfpmxBhze) 
    {
        this.xsfpmxBhze = xsfpmxBhze;
    }

    public Integer getXsfpmxBhze() 
    {
        return xsfpmxBhze;
    }
    public void setXsfpmxDczsl(Integer xsfpmxDczsl) 
    {
        this.xsfpmxDczsl = xsfpmxDczsl;
    }

    public Integer getXsfpmxDczsl() 
    {
        return xsfpmxDczsl;
    }
    public void setXsfpmxDcfsl1(Integer xsfpmxDcfsl1) 
    {
        this.xsfpmxDcfsl1 = xsfpmxDcfsl1;
    }

    public Integer getXsfpmxDcfsl1() 
    {
        return xsfpmxDcfsl1;
    }
    public void setXsfpmxDcfsl2(Integer xsfpmxDcfsl2) 
    {
        this.xsfpmxDcfsl2 = xsfpmxDcfsl2;
    }

    public Integer getXsfpmxDcfsl2() 
    {
        return xsfpmxDcfsl2;
    }
    public void setXsfpmxYdce(Integer xsfpmxYdce) 
    {
        this.xsfpmxYdce = xsfpmxYdce;
    }

    public Integer getXsfpmxYdce() 
    {
        return xsfpmxYdce;
    }
    public void setXsfpmxBdce(Integer xsfpmxBdce) 
    {
        this.xsfpmxBdce = xsfpmxBdce;
    }

    public Integer getXsfpmxBdce() 
    {
        return xsfpmxBdce;
    }
    public void setXsfpmxLzrq(String xsfpmxLzrq) 
    {
        this.xsfpmxLzrq = xsfpmxLzrq;
    }

    public String getXsfpmxLzrq() 
    {
        return xsfpmxLzrq;
    }
    public void setXsfpmxYhkrq(String xsfpmxYhkrq) 
    {
        this.xsfpmxYhkrq = xsfpmxYhkrq;
    }

    public String getXsfpmxYhkrq() 
    {
        return xsfpmxYhkrq;
    }
    public void setXsfpmxZxpdyj(String xsfpmxZxpdyj) 
    {
        this.xsfpmxZxpdyj = xsfpmxZxpdyj;
    }

    public String getXsfpmxZxpdyj() 
    {
        return xsfpmxZxpdyj;
    }
    public void setXsfpmxZxtszc(String xsfpmxZxtszc) 
    {
        this.xsfpmxZxtszc = xsfpmxZxtszc;
    }

    public String getXsfpmxZxtszc() 
    {
        return xsfpmxZxtszc;
    }
    public void setXsfpmxYywrq(String xsfpmxYywrq) 
    {
        this.xsfpmxYywrq = xsfpmxYywrq;
    }

    public String getXsfpmxYywrq() 
    {
        return xsfpmxYywrq;
    }
    public void setXsfpmxC1(String xsfpmxC1) 
    {
        this.xsfpmxC1 = xsfpmxC1;
    }

    public String getXsfpmxC1() 
    {
        return xsfpmxC1;
    }
    public void setXsfpmxC2(String xsfpmxC2) 
    {
        this.xsfpmxC2 = xsfpmxC2;
    }

    public String getXsfpmxC2() 
    {
        return xsfpmxC2;
    }
    public void setXsfpmxC3(String xsfpmxC3) 
    {
        this.xsfpmxC3 = xsfpmxC3;
    }

    public String getXsfpmxC3() 
    {
        return xsfpmxC3;
    }
    public void setXsfpmxC4(String xsfpmxC4) 
    {
        this.xsfpmxC4 = xsfpmxC4;
    }

    public String getXsfpmxC4() 
    {
        return xsfpmxC4;
    }
    public void setXsfpmxC5(String xsfpmxC5) 
    {
        this.xsfpmxC5 = xsfpmxC5;
    }

    public String getXsfpmxC5() 
    {
        return xsfpmxC5;
    }
    public void setXsfpmxC6(String xsfpmxC6) 
    {
        this.xsfpmxC6 = xsfpmxC6;
    }

    public String getXsfpmxC6() 
    {
        return xsfpmxC6;
    }
    public void setXsfpmxC7(String xsfpmxC7) 
    {
        this.xsfpmxC7 = xsfpmxC7;
    }

    public String getXsfpmxC7() 
    {
        return xsfpmxC7;
    }
    public void setXsfpmxC8(String xsfpmxC8) 
    {
        this.xsfpmxC8 = xsfpmxC8;
    }

    public String getXsfpmxC8() 
    {
        return xsfpmxC8;
    }
    public void setXsfpmxC9(String xsfpmxC9) 
    {
        this.xsfpmxC9 = xsfpmxC9;
    }

    public String getXsfpmxC9() 
    {
        return xsfpmxC9;
    }
    public void setXsfpmxC10(String xsfpmxC10) 
    {
        this.xsfpmxC10 = xsfpmxC10;
    }

    public String getXsfpmxC10() 
    {
        return xsfpmxC10;
    }
    public void setXsfpmxU1(Integer xsfpmxU1) 
    {
        this.xsfpmxU1 = xsfpmxU1;
    }

    public Integer getXsfpmxU1() 
    {
        return xsfpmxU1;
    }
    public void setXsfpmxU2(Integer xsfpmxU2) 
    {
        this.xsfpmxU2 = xsfpmxU2;
    }

    public Integer getXsfpmxU2() 
    {
        return xsfpmxU2;
    }
    public void setXsfpmxU3(Integer xsfpmxU3) 
    {
        this.xsfpmxU3 = xsfpmxU3;
    }

    public Integer getXsfpmxU3() 
    {
        return xsfpmxU3;
    }
    public void setXsfpmxU4(Integer xsfpmxU4) 
    {
        this.xsfpmxU4 = xsfpmxU4;
    }

    public Integer getXsfpmxU4() 
    {
        return xsfpmxU4;
    }
    public void setXsfpmxU5(Integer xsfpmxU5) 
    {
        this.xsfpmxU5 = xsfpmxU5;
    }

    public Integer getXsfpmxU5() 
    {
        return xsfpmxU5;
    }
    public void setXsfpmxU6(Integer xsfpmxU6) 
    {
        this.xsfpmxU6 = xsfpmxU6;
    }

    public Integer getXsfpmxU6() 
    {
        return xsfpmxU6;
    }
    public void setXsfpmxYstdls(String xsfpmxYstdls) 
    {
        this.xsfpmxYstdls = xsfpmxYstdls;
    }

    public String getXsfpmxYstdls() 
    {
        return xsfpmxYstdls;
    }
    public void setXsfpmxYstdfl(String xsfpmxYstdfl) 
    {
        this.xsfpmxYstdfl = xsfpmxYstdfl;
    }

    public String getXsfpmxYstdfl() 
    {
        return xsfpmxYstdfl;
    }
    public void setXsfpmxBcyhsl(Integer xsfpmxBcyhsl) 
    {
        this.xsfpmxBcyhsl = xsfpmxBcyhsl;
    }

    public Integer getXsfpmxBcyhsl() 
    {
        return xsfpmxBcyhsl;
    }
    public void setXsfpmxCkls(String xsfpmxCkls) 
    {
        this.xsfpmxCkls = xsfpmxCkls;
    }

    public String getXsfpmxCkls() 
    {
        return xsfpmxCkls;
    }
    public void setXsfpmxCkfl(String xsfpmxCkfl) 
    {
        this.xsfpmxCkfl = xsfpmxCkfl;
    }

    public String getXsfpmxCkfl() 
    {
        return xsfpmxCkfl;
    }
    public void setXsfpmxJgys(String xsfpmxJgys) 
    {
        this.xsfpmxJgys = xsfpmxJgys;
    }

    public String getXsfpmxJgys() 
    {
        return xsfpmxJgys;
    }
    public void setXsfpmxJgzc(String xsfpmxJgzc) 
    {
        this.xsfpmxJgzc = xsfpmxJgzc;
    }

    public String getXsfpmxJgzc() 
    {
        return xsfpmxJgzc;
    }
    public void setXsfpmxWlbhbak(String xsfpmxWlbhbak) 
    {
        this.xsfpmxWlbhbak = xsfpmxWlbhbak;
    }

    public String getXsfpmxWlbhbak() 
    {
        return xsfpmxWlbhbak;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("xsfpmxFpls", getXsfpmxFpls())
            .append("xsfpmxFpfl", getXsfpmxFpfl())
            .append("xsfpmxXsxh", getXsfpmxXsxh())
            .append("xsfpmxFllx", getXsfpmxFllx())
            .append("xsfpmxFlly", getXsfpmxFlly())
            .append("xsfpmxCkbh", getXsfpmxCkbh())
            .append("xsfpmxWlbh", getXsfpmxWlbh())
            .append("xsfpmxWlmc", getXsfpmxWlmc())
            .append("xsfpmxPch", getXsfpmxPch())
            .append("xsfpmxZyx1", getXsfpmxZyx1())
            .append("xsfpmxZyx2", getXsfpmxZyx2())
            .append("xsfpmxZyx3", getXsfpmxZyx3())
            .append("xsfpmxZyx4", getXsfpmxZyx4())
            .append("xsfpmxZyx5", getXsfpmxZyx5())
            .append("xsfpmxWlzt", getXsfpmxWlzt())
            .append("xsfpmxWlbz", getXsfpmxWlbz())
            .append("xsfpmxSzxm", getXsfpmxSzxm())
            .append("xsfpmxDdls", getXsfpmxDdls())
            .append("xsfpmxDdfl", getXsfpmxDdfl())
            .append("xsfpmxDdbh", getXsfpmxDdbh())
            .append("xsfpmxTdls", getXsfpmxTdls())
            .append("xsfpmxTdfl", getXsfpmxTdfl())
            .append("xsfpmxTdbh", getXsfpmxTdbh())
            .append("xsfpmxHtls", getXsfpmxHtls())
            .append("xsfpmxHtfl", getXsfpmxHtfl())
            .append("xsfpmxHtbh", getXsfpmxHtbh())
            .append("xsfpmxPjls", getXsfpmxPjls())
            .append("xsfpmxPjfl", getXsfpmxPjfl())
            .append("xsfpmxPjbh", getXsfpmxPjbh())
            .append("xsfpmxHdls", getXsfpmxHdls())
            .append("xsfpmxHdfl", getXsfpmxHdfl())
            .append("xsfpmxHdbh", getXsfpmxHdbh())
            .append("xsfpmxFyls", getXsfpmxFyls())
            .append("xsfpmxFyfl", getXsfpmxFyfl())
            .append("xsfpmxFybh", getXsfpmxFybh())
            .append("xsfpmxYfpls", getXsfpmxYfpls())
            .append("xsfpmxYfpfl", getXsfpmxYfpfl())
            .append("xsfpmxYfpbh", getXsfpmxYfpbh())
            .append("xsfpmxZsl", getXsfpmxZsl())
            .append("xsfpmxFsl1", getXsfpmxFsl1())
            .append("xsfpmxFsl2", getXsfpmxFsl2())
            .append("xsfpmxYzhsj", getXsfpmxYzhsj())
            .append("xsfpmxBzhsj", getXsfpmxBzhsj())
            .append("xsfpmxDbzkbl", getXsfpmxDbzkbl())
            .append("xsfpmxZezkbl", getXsfpmxZezkbl())
            .append("xsfpmxYzkje", getXsfpmxYzkje())
            .append("xsfpmxBzkje", getXsfpmxBzkje())
            .append("xsfpmxYhse", getXsfpmxYhse())
            .append("xsfpmxBhse", getXsfpmxBhse())
            .append("xsfpmxSl", getXsfpmxSl())
            .append("xsfpmxYzxsj", getXsfpmxYzxsj())
            .append("xsfpmxBzxsj", getXsfpmxBzxsj())
            .append("xsfpmxYxse", getXsfpmxYxse())
            .append("xsfpmxBxse", getXsfpmxBxse())
            .append("xsfpmxYse", getXsfpmxYse())
            .append("xsfpmxBse", getXsfpmxBse())
            .append("xsfpmxSfhk", getXsfpmxSfhk())
            .append("xsfpmxHkbz", getXsfpmxHkbz())
            .append("xsfpmxYhke", getXsfpmxYhke())
            .append("xsfpmxBhke", getXsfpmxBhke())
            .append("xsfpmxHksl", getXsfpmxHksl())
            .append("xsfpmxHkfsl1", getXsfpmxHkfsl1())
            .append("xsfpmxHkfsl2", getXsfpmxHkfsl2())
            .append("xsfpmxSfth", getXsfpmxSfth())
            .append("xsfpmxThbz", getXsfpmxThbz())
            .append("xsfpmxThsl", getXsfpmxThsl())
            .append("xsfpmxThfsl1", getXsfpmxThfsl1())
            .append("xsfpmxThfsl2", getXsfpmxThfsl2())
            .append("xsfpmxDqzk", getXsfpmxDqzk())
            .append("xsfpmxSfck", getXsfpmxSfck())
            .append("xsfpmxCkbz", getXsfpmxCkbz())
            .append("xsfpmxCksl", getXsfpmxCksl())
            .append("xsfpmxCkfsl1", getXsfpmxCkfsl1())
            .append("xsfpmxCkfsl2", getXsfpmxCkfsl2())
            .append("xsfpmxCkje", getXsfpmxCkje())
            .append("xsfpmxTdzhsj", getXsfpmxTdzhsj())
            .append("xsfpmxTdzsl", getXsfpmxTdzsl())
            .append("xsfpmxTdyhse", getXsfpmxTdyhse())
            .append("xsfpmxTdbhse", getXsfpmxTdbhse())
            .append("xsfpmxHzzsl", getXsfpmxHzzsl())
            .append("xsfpmxHzfsl1", getXsfpmxHzfsl1())
            .append("xsfpmxHzfsl2", getXsfpmxHzfsl2())
            .append("xsfpmxYhze", getXsfpmxYhze())
            .append("xsfpmxBhze", getXsfpmxBhze())
            .append("xsfpmxDczsl", getXsfpmxDczsl())
            .append("xsfpmxDcfsl1", getXsfpmxDcfsl1())
            .append("xsfpmxDcfsl2", getXsfpmxDcfsl2())
            .append("xsfpmxYdce", getXsfpmxYdce())
            .append("xsfpmxBdce", getXsfpmxBdce())
            .append("xsfpmxLzrq", getXsfpmxLzrq())
            .append("xsfpmxYhkrq", getXsfpmxYhkrq())
            .append("xsfpmxZxpdyj", getXsfpmxZxpdyj())
            .append("xsfpmxZxtszc", getXsfpmxZxtszc())
            .append("xsfpmxYywrq", getXsfpmxYywrq())
            .append("xsfpmxC1", getXsfpmxC1())
            .append("xsfpmxC2", getXsfpmxC2())
            .append("xsfpmxC3", getXsfpmxC3())
            .append("xsfpmxC4", getXsfpmxC4())
            .append("xsfpmxC5", getXsfpmxC5())
            .append("xsfpmxC6", getXsfpmxC6())
            .append("xsfpmxC7", getXsfpmxC7())
            .append("xsfpmxC8", getXsfpmxC8())
            .append("xsfpmxC9", getXsfpmxC9())
            .append("xsfpmxC10", getXsfpmxC10())
            .append("xsfpmxU1", getXsfpmxU1())
            .append("xsfpmxU2", getXsfpmxU2())
            .append("xsfpmxU3", getXsfpmxU3())
            .append("xsfpmxU4", getXsfpmxU4())
            .append("xsfpmxU5", getXsfpmxU5())
            .append("xsfpmxU6", getXsfpmxU6())
            .append("xsfpmxYstdls", getXsfpmxYstdls())
            .append("xsfpmxYstdfl", getXsfpmxYstdfl())
            .append("xsfpmxBcyhsl", getXsfpmxBcyhsl())
            .append("xsfpmxCkls", getXsfpmxCkls())
            .append("xsfpmxCkfl", getXsfpmxCkfl())
            .append("xsfpmxJgys", getXsfpmxJgys())
            .append("xsfpmxJgzc", getXsfpmxJgzc())
            .append("xsfpmxWlbhbak", getXsfpmxWlbhbak())
            .toString();
    }
}
