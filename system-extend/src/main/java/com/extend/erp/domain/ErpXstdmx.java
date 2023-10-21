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
 * 销售提单明细对象 erp_xstdmx
 * 
 * @author wcg
 * @date 2023-10-21
 */
@DataSource(value = DataSourceType.SLAVE)
@TableName("XSTDMX")
@Data
public class ErpXstdmx
{
    private static final long serialVersionUID = 1L;

    /** 提单流水 */
    @Excel(name = "提单流水")
    private String xstdmxTdls;

    /** 提单分类 */
    private String xstdmxTdfl;

    /** 销售序号 */
    private Long xstdmxXsxh;

    /** 分类类型 */
    private String xstdmxFllx;

    /** 分类来源 */
    private String xstdmxFlly;

    /** KCFS */
    private String xstdmxKcfs;

    /** 订单流水 */
    @Excel(name = "订单流水")
    private String xstdmxDdls;

    /** 订单分类 */
    private String xstdmxDdfl;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String xstdmxDdbh;

    /** Y提单流水 */
    @Excel(name = "Y提单流水")
    private String xstdmxYtdls;

    /** Y提单分类 */
    private String xstdmxYtdfl;

    /** Y提单编号 */
    private String xstdmxYtdbh;

    /** 合同类型 */
    private String xstdmxHtls;

    /** 合同分类 */
    private String xstdmxHtfl;

    /** 计划日期 */
    private String xstdmxJhrq;

    /** 仓库编号 */
    private String xstdmxCkbh;

    /** 物料编号 */
    @Excel(name = "物料编号")
    private String xstdmxWlbh;

    /** PCH */
    private String xstdmxPch;

    /** HWBH */
    private String xstdmxHwbh;

    /** ZYX1 */
    private String xstdmxZyx1;

    /** ZYX2 */
    private String xstdmxZyx2;

    /** ZYX3 */
    private String xstdmxZyx3;

    /** ZYX4 */
    private String xstdmxZyx4;

    /** ZYX5 */
    private String xstdmxZyx5;

    /** WLZT */
    private String xstdmxWlzt;

    /** WLBZ */
    private String xstdmxWlbz;

    /** ZSL */
    private Integer xstdmxZsl;

    /** FSL1 */
    private Integer xstdmxFsl1;

    /** FSL2 */
    private Integer xstdmxFsl2;

    /** 验收时间 */
    private Integer xstdmxYzhsj;

    /** BZHSJ */
    private Integer xstdmxBzhsj;

    /** YZXSJ */
    private Integer xstdmxYzxsj;

    /** BZXSJ */
    private Integer xstdmxBzxsj;

    /** SL */
    private Integer xstdmxSl;

    /** YXSE */
    private Integer xstdmxYxse;

    /** BXSE */
    private Integer xstdmxBxse;

    /** YSE */
    private Integer xstdmxYse;

    /** BSE */
    private Integer xstdmxBse;

    /** YHSE */
    private Integer xstdmxYhse;

    /** BHSE */
    private Integer xstdmxBhse;

    /** DBZKBL */
    private Integer xstdmxDbzkbl;

    /** ZEZKBL */
    private Integer xstdmxZezkbl;

    /** YZKJE */
    private Integer xstdmxYzkje;

    /** BZKJE */
    private Integer xstdmxBzkje;

    /** YZSL */
    private Integer xstdmxYzsl;

    /** YFSL */
    private Integer xstdmxYfsl;

    /** YFSL1 */
    private Integer xstdmxYfsl1;

    /** YFSL1 */
    private Integer xstdmxYfsl2;

    /** SFFY */
    private String xstdmxSffy;

    /** SFKP */
    private String xstdmxSfkp;

    /** KPBZ */
    private String xstdmxKpbz;

    /** KPSL */
    private Integer xstdmxKpsl;

    /** KPSL1 */
    private Integer xstdmxKpfsl1;

    /** KPSL2 */
    private Integer xstdmxKpfsl2;

    /** YKPE */
    private Integer xstdmxYkpe;

    /** BKPE */
    private Integer xstdmxBkpe;

    /** SFCK */
    private String xstdmxSfck;

    /** CKBZ */
    private String xstdmxCkbz;

    /** CKSL */
    private Integer xstdmxCksl;

    /** CKSL1 */
    private Integer xstdmxCkfsl1;

    /** CKSL2 */
    private Integer xstdmxCkfsl2;

    /** THSL */
    private Integer xstdmxThsl;

    /** THSL1 */
    private Integer xstdmxThfsl1;

    /** THSL2 */
    private Integer xstdmxThfsl2;

    /** BHSL */
    private Integer xstdmxBhsl;

    /** BHSL1 */
    private Integer xstdmxBhfsl1;

    /** BHSL2 */
    private Integer xstdmxBhfsl2;

    /** SFTH */
    private String xstdmxSfth;

    /** THBZ */
    private String xstdmxThbz;

    /** KCYL */
    private String xstdmxKcyl;

    /** DDKCYL */
    private String xstdmxDdkcyl;

    /** 文本1 */
    private String xstdmxC1;

    /** $column.columnComment */
    private String xstdmxC2;

    /** $column.columnComment */
    private String xstdmxC3;

    /** $column.columnComment */
    private String xstdmxC4;

    /** $column.columnComment */
    private String xstdmxC5;

    /** $column.columnComment */
    private String xstdmxC6;

    /** $column.columnComment */
    private String xstdmxC7;

    /** $column.columnComment */
    private String xstdmxC8;

    /** $column.columnComment */
    private String xstdmxC9;

    /** $column.columnComment */
    private String xstdmxC10;

    /** $column.columnComment */
    private Integer xstdmxU1;

    /** $column.columnComment */
    private Integer xstdmxU2;

    /** $column.columnComment */
    private Integer xstdmxU3;

    /** $column.columnComment */
    private Integer xstdmxU4;

    /** $column.columnComment */
    private Integer xstdmxU5;

    /** $column.columnComment */
    private Integer xstdmxU6;

    /** DQZK */
    private String xstdmxDqzk;

    /** YJBZ */
    private String xstdmxYjbz;

    /** YLZSL */
    private Integer xstdmxYlzsl;

    /** YLZSL1 */
    private Integer xstdmxYlfsl1;

    /** YLZSL2 */
    private Integer xstdmxYlfsl2;

    /** YHZSL */
    private Integer xstdmxYhzsl;

    /** YHZSL1 */
    private Integer xstdmxYhfsl1;

    /** YHZSL2 */
    private Integer xstdmxYhfsl2;

    /** YSTDLS */
    private String xstdmxYstdls;

    /** YSTDFL */
    private String xstdmxYstdfl;

    /** LZRQ */
    private String xstdmxLzrq;

    /** YHKRQ */
    private String xstdmxYhkrq;

    /** ZXPDYJ */
    private String xstdmxZxpdyj;

    /** ZXTSZC */
    private String xstdmxZxtszc;

    /** YYWRQ */
    private String xstdmxYywrq;

    /** DCZSL */
    private Integer xstdmxDczsl;

    /** DCZSL1 */
    private Integer xstdmxDcfsl1;

    /** DCZSL2 */
    private Integer xstdmxDcfsl2;

    /** YDCE */
    private Integer xstdmxYdce;

    /** BDCE */
    private Integer xstdmxBdce;

    /** SFHK */
    private String xstdmxSfhk;

    /** HKBZ */
    private String xstdmxHkbz;

    /** HKSL */
    private Integer xstdmxHksl;

    /** YHKE */
    private Integer xstdmxYhke;

    /** BHKE */
    private Integer xstdmxBhke;

    /** HKFSL1 */
    private Integer xstdmxHkfsl1;

    /** HKFSL2 */
    private Integer xstdmxHkfsl2;

    /** YKPCE */
    private Integer xstdmxYkpce;

    /** BKPCE */
    private Integer xstdmxBkpce;

    /** YCEHXE */
    private Integer xstdmxYcehxe;

    /** BCEHXE */
    private Integer xstdmxBcehxe;

    /** $column.columnComment */
    private Integer xstdmxBcyhsl;

    /** PHHZ */
    private String xstdmxPhhz;

    /** JGYS */
    private String xstdmxJgys;

    /** JGZC */
    private String xstdmxJgzc;

    /** GBSL */
    private Integer xstdmxGbsl;

    /** CZYC */
    private Integer xstdmxCzyc;

    /** SFZJ */
    private String xstdmxSfzj;

    /** JSSL */
    private Integer xstdmxJssl;

    /** FJSSL1 */
    private Integer xstdmxFjssl1;

    /** FJSSL2 */
    private Integer xstdmxFjssl2;

    /** ZJZT */
    private String xstdmxZjzt;

    /** BGDH */
    private String xstdmxBgdh;

    /** FPSL */
    private Integer xstdmxFpsl;

    /** BGSL */
    private Integer xstdmxBgsl;

    /** WLBHBAK */
    private String xstdmxWlbhbak;

    /** HZT */
    private String xstdmxHzt;

    /** HZBZ */
    @Excel(name = "HZBZ")
    private String xstdmxHzbz;

    /** HZR */
    private String xstdmxHzr;

    /** HZRQ */
    private String xstdmxHzrq;

    /** SHHHZ */
    private String xstdmxShhhz;

    /** SHHRQ */
    private String xstdmxShhrq;

    /** SHHBH */
    private String xstdmxShhbh;

    /** MODE */
    private String xstdmxMode;

    /** TCKSL */
    private Integer xstdmxTcksl;

    /** TCKSL1 */
    private Integer xstdmxTckfsl1;

    /** TCKSL2 */
    private Integer xstdmxTckfsl2;

    public void setXstdmxTdls(String xstdmxTdls) 
    {
        this.xstdmxTdls = xstdmxTdls;
    }

    public String getXstdmxTdls() 
    {
        return xstdmxTdls;
    }
    public void setXstdmxTdfl(String xstdmxTdfl) 
    {
        this.xstdmxTdfl = xstdmxTdfl;
    }

    public String getXstdmxTdfl() 
    {
        return xstdmxTdfl;
    }
    public void setXstdmxXsxh(Long xstdmxXsxh) 
    {
        this.xstdmxXsxh = xstdmxXsxh;
    }

    public Long getXstdmxXsxh() 
    {
        return xstdmxXsxh;
    }
    public void setXstdmxFllx(String xstdmxFllx) 
    {
        this.xstdmxFllx = xstdmxFllx;
    }

    public String getXstdmxFllx() 
    {
        return xstdmxFllx;
    }
    public void setXstdmxFlly(String xstdmxFlly) 
    {
        this.xstdmxFlly = xstdmxFlly;
    }

    public String getXstdmxFlly() 
    {
        return xstdmxFlly;
    }
    public void setXstdmxKcfs(String xstdmxKcfs) 
    {
        this.xstdmxKcfs = xstdmxKcfs;
    }

    public String getXstdmxKcfs() 
    {
        return xstdmxKcfs;
    }
    public void setXstdmxDdls(String xstdmxDdls) 
    {
        this.xstdmxDdls = xstdmxDdls;
    }

    public String getXstdmxDdls() 
    {
        return xstdmxDdls;
    }
    public void setXstdmxDdfl(String xstdmxDdfl) 
    {
        this.xstdmxDdfl = xstdmxDdfl;
    }

    public String getXstdmxDdfl() 
    {
        return xstdmxDdfl;
    }
    public void setXstdmxDdbh(String xstdmxDdbh) 
    {
        this.xstdmxDdbh = xstdmxDdbh;
    }

    public String getXstdmxDdbh() 
    {
        return xstdmxDdbh;
    }
    public void setXstdmxYtdls(String xstdmxYtdls) 
    {
        this.xstdmxYtdls = xstdmxYtdls;
    }

    public String getXstdmxYtdls() 
    {
        return xstdmxYtdls;
    }
    public void setXstdmxYtdfl(String xstdmxYtdfl) 
    {
        this.xstdmxYtdfl = xstdmxYtdfl;
    }

    public String getXstdmxYtdfl() 
    {
        return xstdmxYtdfl;
    }
    public void setXstdmxYtdbh(String xstdmxYtdbh) 
    {
        this.xstdmxYtdbh = xstdmxYtdbh;
    }

    public String getXstdmxYtdbh() 
    {
        return xstdmxYtdbh;
    }
    public void setXstdmxHtls(String xstdmxHtls) 
    {
        this.xstdmxHtls = xstdmxHtls;
    }

    public String getXstdmxHtls() 
    {
        return xstdmxHtls;
    }
    public void setXstdmxHtfl(String xstdmxHtfl) 
    {
        this.xstdmxHtfl = xstdmxHtfl;
    }

    public String getXstdmxHtfl() 
    {
        return xstdmxHtfl;
    }
    public void setXstdmxJhrq(String xstdmxJhrq) 
    {
        this.xstdmxJhrq = xstdmxJhrq;
    }

    public String getXstdmxJhrq() 
    {
        return xstdmxJhrq;
    }
    public void setXstdmxCkbh(String xstdmxCkbh) 
    {
        this.xstdmxCkbh = xstdmxCkbh;
    }

    public String getXstdmxCkbh() 
    {
        return xstdmxCkbh;
    }
    public void setXstdmxWlbh(String xstdmxWlbh) 
    {
        this.xstdmxWlbh = xstdmxWlbh;
    }

    public String getXstdmxWlbh() 
    {
        return xstdmxWlbh;
    }
    public void setXstdmxPch(String xstdmxPch) 
    {
        this.xstdmxPch = xstdmxPch;
    }

    public String getXstdmxPch() 
    {
        return xstdmxPch;
    }
    public void setXstdmxHwbh(String xstdmxHwbh) 
    {
        this.xstdmxHwbh = xstdmxHwbh;
    }

    public String getXstdmxHwbh() 
    {
        return xstdmxHwbh;
    }
    public void setXstdmxZyx1(String xstdmxZyx1) 
    {
        this.xstdmxZyx1 = xstdmxZyx1;
    }

    public String getXstdmxZyx1() 
    {
        return xstdmxZyx1;
    }
    public void setXstdmxZyx2(String xstdmxZyx2) 
    {
        this.xstdmxZyx2 = xstdmxZyx2;
    }

    public String getXstdmxZyx2() 
    {
        return xstdmxZyx2;
    }
    public void setXstdmxZyx3(String xstdmxZyx3) 
    {
        this.xstdmxZyx3 = xstdmxZyx3;
    }

    public String getXstdmxZyx3() 
    {
        return xstdmxZyx3;
    }
    public void setXstdmxZyx4(String xstdmxZyx4) 
    {
        this.xstdmxZyx4 = xstdmxZyx4;
    }

    public String getXstdmxZyx4() 
    {
        return xstdmxZyx4;
    }
    public void setXstdmxZyx5(String xstdmxZyx5) 
    {
        this.xstdmxZyx5 = xstdmxZyx5;
    }

    public String getXstdmxZyx5() 
    {
        return xstdmxZyx5;
    }
    public void setXstdmxWlzt(String xstdmxWlzt) 
    {
        this.xstdmxWlzt = xstdmxWlzt;
    }

    public String getXstdmxWlzt() 
    {
        return xstdmxWlzt;
    }
    public void setXstdmxWlbz(String xstdmxWlbz) 
    {
        this.xstdmxWlbz = xstdmxWlbz;
    }

    public String getXstdmxWlbz() 
    {
        return xstdmxWlbz;
    }
    public void setXstdmxZsl(Integer xstdmxZsl) 
    {
        this.xstdmxZsl = xstdmxZsl;
    }

    public Integer getXstdmxZsl() 
    {
        return xstdmxZsl;
    }
    public void setXstdmxFsl1(Integer xstdmxFsl1) 
    {
        this.xstdmxFsl1 = xstdmxFsl1;
    }

    public Integer getXstdmxFsl1() 
    {
        return xstdmxFsl1;
    }
    public void setXstdmxFsl2(Integer xstdmxFsl2) 
    {
        this.xstdmxFsl2 = xstdmxFsl2;
    }

    public Integer getXstdmxFsl2() 
    {
        return xstdmxFsl2;
    }
    public void setXstdmxYzhsj(Integer xstdmxYzhsj) 
    {
        this.xstdmxYzhsj = xstdmxYzhsj;
    }

    public Integer getXstdmxYzhsj() 
    {
        return xstdmxYzhsj;
    }
    public void setXstdmxBzhsj(Integer xstdmxBzhsj) 
    {
        this.xstdmxBzhsj = xstdmxBzhsj;
    }

    public Integer getXstdmxBzhsj() 
    {
        return xstdmxBzhsj;
    }
    public void setXstdmxYzxsj(Integer xstdmxYzxsj) 
    {
        this.xstdmxYzxsj = xstdmxYzxsj;
    }

    public Integer getXstdmxYzxsj() 
    {
        return xstdmxYzxsj;
    }
    public void setXstdmxBzxsj(Integer xstdmxBzxsj) 
    {
        this.xstdmxBzxsj = xstdmxBzxsj;
    }

    public Integer getXstdmxBzxsj() 
    {
        return xstdmxBzxsj;
    }
    public void setXstdmxSl(Integer xstdmxSl) 
    {
        this.xstdmxSl = xstdmxSl;
    }

    public Integer getXstdmxSl() 
    {
        return xstdmxSl;
    }
    public void setXstdmxYxse(Integer xstdmxYxse) 
    {
        this.xstdmxYxse = xstdmxYxse;
    }

    public Integer getXstdmxYxse() 
    {
        return xstdmxYxse;
    }
    public void setXstdmxBxse(Integer xstdmxBxse) 
    {
        this.xstdmxBxse = xstdmxBxse;
    }

    public Integer getXstdmxBxse() 
    {
        return xstdmxBxse;
    }
    public void setXstdmxYse(Integer xstdmxYse) 
    {
        this.xstdmxYse = xstdmxYse;
    }

    public Integer getXstdmxYse() 
    {
        return xstdmxYse;
    }
    public void setXstdmxBse(Integer xstdmxBse) 
    {
        this.xstdmxBse = xstdmxBse;
    }

    public Integer getXstdmxBse() 
    {
        return xstdmxBse;
    }
    public void setXstdmxYhse(Integer xstdmxYhse) 
    {
        this.xstdmxYhse = xstdmxYhse;
    }

    public Integer getXstdmxYhse() 
    {
        return xstdmxYhse;
    }
    public void setXstdmxBhse(Integer xstdmxBhse) 
    {
        this.xstdmxBhse = xstdmxBhse;
    }

    public Integer getXstdmxBhse() 
    {
        return xstdmxBhse;
    }
    public void setXstdmxDbzkbl(Integer xstdmxDbzkbl) 
    {
        this.xstdmxDbzkbl = xstdmxDbzkbl;
    }

    public Integer getXstdmxDbzkbl() 
    {
        return xstdmxDbzkbl;
    }
    public void setXstdmxZezkbl(Integer xstdmxZezkbl) 
    {
        this.xstdmxZezkbl = xstdmxZezkbl;
    }

    public Integer getXstdmxZezkbl() 
    {
        return xstdmxZezkbl;
    }
    public void setXstdmxYzkje(Integer xstdmxYzkje) 
    {
        this.xstdmxYzkje = xstdmxYzkje;
    }

    public Integer getXstdmxYzkje() 
    {
        return xstdmxYzkje;
    }
    public void setXstdmxBzkje(Integer xstdmxBzkje) 
    {
        this.xstdmxBzkje = xstdmxBzkje;
    }

    public Integer getXstdmxBzkje() 
    {
        return xstdmxBzkje;
    }
    public void setXstdmxYzsl(Integer xstdmxYzsl) 
    {
        this.xstdmxYzsl = xstdmxYzsl;
    }

    public Integer getXstdmxYzsl() 
    {
        return xstdmxYzsl;
    }
    public void setXstdmxYfsl(Integer xstdmxYfsl) 
    {
        this.xstdmxYfsl = xstdmxYfsl;
    }

    public Integer getXstdmxYfsl() 
    {
        return xstdmxYfsl;
    }
    public void setXstdmxYfsl1(Integer xstdmxYfsl1) 
    {
        this.xstdmxYfsl1 = xstdmxYfsl1;
    }

    public Integer getXstdmxYfsl1() 
    {
        return xstdmxYfsl1;
    }
    public void setXstdmxYfsl2(Integer xstdmxYfsl2) 
    {
        this.xstdmxYfsl2 = xstdmxYfsl2;
    }

    public Integer getXstdmxYfsl2() 
    {
        return xstdmxYfsl2;
    }
    public void setXstdmxSffy(String xstdmxSffy) 
    {
        this.xstdmxSffy = xstdmxSffy;
    }

    public String getXstdmxSffy() 
    {
        return xstdmxSffy;
    }
    public void setXstdmxSfkp(String xstdmxSfkp) 
    {
        this.xstdmxSfkp = xstdmxSfkp;
    }

    public String getXstdmxSfkp() 
    {
        return xstdmxSfkp;
    }
    public void setXstdmxKpbz(String xstdmxKpbz) 
    {
        this.xstdmxKpbz = xstdmxKpbz;
    }

    public String getXstdmxKpbz() 
    {
        return xstdmxKpbz;
    }
    public void setXstdmxKpsl(Integer xstdmxKpsl) 
    {
        this.xstdmxKpsl = xstdmxKpsl;
    }

    public Integer getXstdmxKpsl() 
    {
        return xstdmxKpsl;
    }
    public void setXstdmxKpfsl1(Integer xstdmxKpfsl1) 
    {
        this.xstdmxKpfsl1 = xstdmxKpfsl1;
    }

    public Integer getXstdmxKpfsl1() 
    {
        return xstdmxKpfsl1;
    }
    public void setXstdmxKpfsl2(Integer xstdmxKpfsl2) 
    {
        this.xstdmxKpfsl2 = xstdmxKpfsl2;
    }

    public Integer getXstdmxKpfsl2() 
    {
        return xstdmxKpfsl2;
    }
    public void setXstdmxYkpe(Integer xstdmxYkpe) 
    {
        this.xstdmxYkpe = xstdmxYkpe;
    }

    public Integer getXstdmxYkpe() 
    {
        return xstdmxYkpe;
    }
    public void setXstdmxBkpe(Integer xstdmxBkpe) 
    {
        this.xstdmxBkpe = xstdmxBkpe;
    }

    public Integer getXstdmxBkpe() 
    {
        return xstdmxBkpe;
    }
    public void setXstdmxSfck(String xstdmxSfck) 
    {
        this.xstdmxSfck = xstdmxSfck;
    }

    public String getXstdmxSfck() 
    {
        return xstdmxSfck;
    }
    public void setXstdmxCkbz(String xstdmxCkbz) 
    {
        this.xstdmxCkbz = xstdmxCkbz;
    }

    public String getXstdmxCkbz() 
    {
        return xstdmxCkbz;
    }
    public void setXstdmxCksl(Integer xstdmxCksl) 
    {
        this.xstdmxCksl = xstdmxCksl;
    }

    public Integer getXstdmxCksl() 
    {
        return xstdmxCksl;
    }
    public void setXstdmxCkfsl1(Integer xstdmxCkfsl1) 
    {
        this.xstdmxCkfsl1 = xstdmxCkfsl1;
    }

    public Integer getXstdmxCkfsl1() 
    {
        return xstdmxCkfsl1;
    }
    public void setXstdmxCkfsl2(Integer xstdmxCkfsl2) 
    {
        this.xstdmxCkfsl2 = xstdmxCkfsl2;
    }

    public Integer getXstdmxCkfsl2() 
    {
        return xstdmxCkfsl2;
    }
    public void setXstdmxThsl(Integer xstdmxThsl) 
    {
        this.xstdmxThsl = xstdmxThsl;
    }

    public Integer getXstdmxThsl() 
    {
        return xstdmxThsl;
    }
    public void setXstdmxThfsl1(Integer xstdmxThfsl1) 
    {
        this.xstdmxThfsl1 = xstdmxThfsl1;
    }

    public Integer getXstdmxThfsl1() 
    {
        return xstdmxThfsl1;
    }
    public void setXstdmxThfsl2(Integer xstdmxThfsl2) 
    {
        this.xstdmxThfsl2 = xstdmxThfsl2;
    }

    public Integer getXstdmxThfsl2() 
    {
        return xstdmxThfsl2;
    }
    public void setXstdmxBhsl(Integer xstdmxBhsl) 
    {
        this.xstdmxBhsl = xstdmxBhsl;
    }

    public Integer getXstdmxBhsl() 
    {
        return xstdmxBhsl;
    }
    public void setXstdmxBhfsl1(Integer xstdmxBhfsl1) 
    {
        this.xstdmxBhfsl1 = xstdmxBhfsl1;
    }

    public Integer getXstdmxBhfsl1() 
    {
        return xstdmxBhfsl1;
    }
    public void setXstdmxBhfsl2(Integer xstdmxBhfsl2) 
    {
        this.xstdmxBhfsl2 = xstdmxBhfsl2;
    }

    public Integer getXstdmxBhfsl2() 
    {
        return xstdmxBhfsl2;
    }
    public void setXstdmxSfth(String xstdmxSfth) 
    {
        this.xstdmxSfth = xstdmxSfth;
    }

    public String getXstdmxSfth() 
    {
        return xstdmxSfth;
    }
    public void setXstdmxThbz(String xstdmxThbz) 
    {
        this.xstdmxThbz = xstdmxThbz;
    }

    public String getXstdmxThbz() 
    {
        return xstdmxThbz;
    }
    public void setXstdmxKcyl(String xstdmxKcyl) 
    {
        this.xstdmxKcyl = xstdmxKcyl;
    }

    public String getXstdmxKcyl() 
    {
        return xstdmxKcyl;
    }
    public void setXstdmxDdkcyl(String xstdmxDdkcyl) 
    {
        this.xstdmxDdkcyl = xstdmxDdkcyl;
    }

    public String getXstdmxDdkcyl() 
    {
        return xstdmxDdkcyl;
    }
    public void setXstdmxC1(String xstdmxC1) 
    {
        this.xstdmxC1 = xstdmxC1;
    }

    public String getXstdmxC1() 
    {
        return xstdmxC1;
    }
    public void setXstdmxC2(String xstdmxC2) 
    {
        this.xstdmxC2 = xstdmxC2;
    }

    public String getXstdmxC2() 
    {
        return xstdmxC2;
    }
    public void setXstdmxC3(String xstdmxC3) 
    {
        this.xstdmxC3 = xstdmxC3;
    }

    public String getXstdmxC3() 
    {
        return xstdmxC3;
    }
    public void setXstdmxC4(String xstdmxC4) 
    {
        this.xstdmxC4 = xstdmxC4;
    }

    public String getXstdmxC4() 
    {
        return xstdmxC4;
    }
    public void setXstdmxC5(String xstdmxC5) 
    {
        this.xstdmxC5 = xstdmxC5;
    }

    public String getXstdmxC5() 
    {
        return xstdmxC5;
    }
    public void setXstdmxC6(String xstdmxC6) 
    {
        this.xstdmxC6 = xstdmxC6;
    }

    public String getXstdmxC6() 
    {
        return xstdmxC6;
    }
    public void setXstdmxC7(String xstdmxC7) 
    {
        this.xstdmxC7 = xstdmxC7;
    }

    public String getXstdmxC7() 
    {
        return xstdmxC7;
    }
    public void setXstdmxC8(String xstdmxC8) 
    {
        this.xstdmxC8 = xstdmxC8;
    }

    public String getXstdmxC8() 
    {
        return xstdmxC8;
    }
    public void setXstdmxC9(String xstdmxC9) 
    {
        this.xstdmxC9 = xstdmxC9;
    }

    public String getXstdmxC9() 
    {
        return xstdmxC9;
    }
    public void setXstdmxC10(String xstdmxC10) 
    {
        this.xstdmxC10 = xstdmxC10;
    }

    public String getXstdmxC10() 
    {
        return xstdmxC10;
    }
    public void setXstdmxU1(Integer xstdmxU1) 
    {
        this.xstdmxU1 = xstdmxU1;
    }

    public Integer getXstdmxU1() 
    {
        return xstdmxU1;
    }
    public void setXstdmxU2(Integer xstdmxU2) 
    {
        this.xstdmxU2 = xstdmxU2;
    }

    public Integer getXstdmxU2() 
    {
        return xstdmxU2;
    }
    public void setXstdmxU3(Integer xstdmxU3) 
    {
        this.xstdmxU3 = xstdmxU3;
    }

    public Integer getXstdmxU3() 
    {
        return xstdmxU3;
    }
    public void setXstdmxU4(Integer xstdmxU4) 
    {
        this.xstdmxU4 = xstdmxU4;
    }

    public Integer getXstdmxU4() 
    {
        return xstdmxU4;
    }
    public void setXstdmxU5(Integer xstdmxU5) 
    {
        this.xstdmxU5 = xstdmxU5;
    }

    public Integer getXstdmxU5() 
    {
        return xstdmxU5;
    }
    public void setXstdmxU6(Integer xstdmxU6) 
    {
        this.xstdmxU6 = xstdmxU6;
    }

    public Integer getXstdmxU6() 
    {
        return xstdmxU6;
    }
    public void setXstdmxDqzk(String xstdmxDqzk) 
    {
        this.xstdmxDqzk = xstdmxDqzk;
    }

    public String getXstdmxDqzk() 
    {
        return xstdmxDqzk;
    }
    public void setXstdmxYjbz(String xstdmxYjbz) 
    {
        this.xstdmxYjbz = xstdmxYjbz;
    }

    public String getXstdmxYjbz() 
    {
        return xstdmxYjbz;
    }
    public void setXstdmxYlzsl(Integer xstdmxYlzsl) 
    {
        this.xstdmxYlzsl = xstdmxYlzsl;
    }

    public Integer getXstdmxYlzsl() 
    {
        return xstdmxYlzsl;
    }
    public void setXstdmxYlfsl1(Integer xstdmxYlfsl1) 
    {
        this.xstdmxYlfsl1 = xstdmxYlfsl1;
    }

    public Integer getXstdmxYlfsl1() 
    {
        return xstdmxYlfsl1;
    }
    public void setXstdmxYlfsl2(Integer xstdmxYlfsl2) 
    {
        this.xstdmxYlfsl2 = xstdmxYlfsl2;
    }

    public Integer getXstdmxYlfsl2() 
    {
        return xstdmxYlfsl2;
    }
    public void setXstdmxYhzsl(Integer xstdmxYhzsl) 
    {
        this.xstdmxYhzsl = xstdmxYhzsl;
    }

    public Integer getXstdmxYhzsl() 
    {
        return xstdmxYhzsl;
    }
    public void setXstdmxYhfsl1(Integer xstdmxYhfsl1) 
    {
        this.xstdmxYhfsl1 = xstdmxYhfsl1;
    }

    public Integer getXstdmxYhfsl1() 
    {
        return xstdmxYhfsl1;
    }
    public void setXstdmxYhfsl2(Integer xstdmxYhfsl2) 
    {
        this.xstdmxYhfsl2 = xstdmxYhfsl2;
    }

    public Integer getXstdmxYhfsl2() 
    {
        return xstdmxYhfsl2;
    }
    public void setXstdmxYstdls(String xstdmxYstdls) 
    {
        this.xstdmxYstdls = xstdmxYstdls;
    }

    public String getXstdmxYstdls() 
    {
        return xstdmxYstdls;
    }
    public void setXstdmxYstdfl(String xstdmxYstdfl) 
    {
        this.xstdmxYstdfl = xstdmxYstdfl;
    }

    public String getXstdmxYstdfl() 
    {
        return xstdmxYstdfl;
    }
    public void setXstdmxLzrq(String xstdmxLzrq) 
    {
        this.xstdmxLzrq = xstdmxLzrq;
    }

    public String getXstdmxLzrq() 
    {
        return xstdmxLzrq;
    }
    public void setXstdmxYhkrq(String xstdmxYhkrq) 
    {
        this.xstdmxYhkrq = xstdmxYhkrq;
    }

    public String getXstdmxYhkrq() 
    {
        return xstdmxYhkrq;
    }
    public void setXstdmxZxpdyj(String xstdmxZxpdyj) 
    {
        this.xstdmxZxpdyj = xstdmxZxpdyj;
    }

    public String getXstdmxZxpdyj() 
    {
        return xstdmxZxpdyj;
    }
    public void setXstdmxZxtszc(String xstdmxZxtszc) 
    {
        this.xstdmxZxtszc = xstdmxZxtszc;
    }

    public String getXstdmxZxtszc() 
    {
        return xstdmxZxtszc;
    }
    public void setXstdmxYywrq(String xstdmxYywrq) 
    {
        this.xstdmxYywrq = xstdmxYywrq;
    }

    public String getXstdmxYywrq() 
    {
        return xstdmxYywrq;
    }
    public void setXstdmxDczsl(Integer xstdmxDczsl) 
    {
        this.xstdmxDczsl = xstdmxDczsl;
    }

    public Integer getXstdmxDczsl() 
    {
        return xstdmxDczsl;
    }
    public void setXstdmxDcfsl1(Integer xstdmxDcfsl1) 
    {
        this.xstdmxDcfsl1 = xstdmxDcfsl1;
    }

    public Integer getXstdmxDcfsl1() 
    {
        return xstdmxDcfsl1;
    }
    public void setXstdmxDcfsl2(Integer xstdmxDcfsl2) 
    {
        this.xstdmxDcfsl2 = xstdmxDcfsl2;
    }

    public Integer getXstdmxDcfsl2() 
    {
        return xstdmxDcfsl2;
    }
    public void setXstdmxYdce(Integer xstdmxYdce) 
    {
        this.xstdmxYdce = xstdmxYdce;
    }

    public Integer getXstdmxYdce() 
    {
        return xstdmxYdce;
    }
    public void setXstdmxBdce(Integer xstdmxBdce) 
    {
        this.xstdmxBdce = xstdmxBdce;
    }

    public Integer getXstdmxBdce() 
    {
        return xstdmxBdce;
    }
    public void setXstdmxSfhk(String xstdmxSfhk) 
    {
        this.xstdmxSfhk = xstdmxSfhk;
    }

    public String getXstdmxSfhk() 
    {
        return xstdmxSfhk;
    }
    public void setXstdmxHkbz(String xstdmxHkbz) 
    {
        this.xstdmxHkbz = xstdmxHkbz;
    }

    public String getXstdmxHkbz() 
    {
        return xstdmxHkbz;
    }
    public void setXstdmxHksl(Integer xstdmxHksl) 
    {
        this.xstdmxHksl = xstdmxHksl;
    }

    public Integer getXstdmxHksl() 
    {
        return xstdmxHksl;
    }
    public void setXstdmxYhke(Integer xstdmxYhke) 
    {
        this.xstdmxYhke = xstdmxYhke;
    }

    public Integer getXstdmxYhke() 
    {
        return xstdmxYhke;
    }
    public void setXstdmxBhke(Integer xstdmxBhke) 
    {
        this.xstdmxBhke = xstdmxBhke;
    }

    public Integer getXstdmxBhke() 
    {
        return xstdmxBhke;
    }
    public void setXstdmxHkfsl1(Integer xstdmxHkfsl1) 
    {
        this.xstdmxHkfsl1 = xstdmxHkfsl1;
    }

    public Integer getXstdmxHkfsl1() 
    {
        return xstdmxHkfsl1;
    }
    public void setXstdmxHkfsl2(Integer xstdmxHkfsl2) 
    {
        this.xstdmxHkfsl2 = xstdmxHkfsl2;
    }

    public Integer getXstdmxHkfsl2() 
    {
        return xstdmxHkfsl2;
    }
    public void setXstdmxYkpce(Integer xstdmxYkpce) 
    {
        this.xstdmxYkpce = xstdmxYkpce;
    }

    public Integer getXstdmxYkpce() 
    {
        return xstdmxYkpce;
    }
    public void setXstdmxBkpce(Integer xstdmxBkpce) 
    {
        this.xstdmxBkpce = xstdmxBkpce;
    }

    public Integer getXstdmxBkpce() 
    {
        return xstdmxBkpce;
    }
    public void setXstdmxYcehxe(Integer xstdmxYcehxe) 
    {
        this.xstdmxYcehxe = xstdmxYcehxe;
    }

    public Integer getXstdmxYcehxe() 
    {
        return xstdmxYcehxe;
    }
    public void setXstdmxBcehxe(Integer xstdmxBcehxe) 
    {
        this.xstdmxBcehxe = xstdmxBcehxe;
    }

    public Integer getXstdmxBcehxe() 
    {
        return xstdmxBcehxe;
    }
    public void setXstdmxBcyhsl(Integer xstdmxBcyhsl) 
    {
        this.xstdmxBcyhsl = xstdmxBcyhsl;
    }

    public Integer getXstdmxBcyhsl() 
    {
        return xstdmxBcyhsl;
    }
    public void setXstdmxPhhz(String xstdmxPhhz) 
    {
        this.xstdmxPhhz = xstdmxPhhz;
    }

    public String getXstdmxPhhz() 
    {
        return xstdmxPhhz;
    }
    public void setXstdmxJgys(String xstdmxJgys) 
    {
        this.xstdmxJgys = xstdmxJgys;
    }

    public String getXstdmxJgys() 
    {
        return xstdmxJgys;
    }
    public void setXstdmxJgzc(String xstdmxJgzc) 
    {
        this.xstdmxJgzc = xstdmxJgzc;
    }

    public String getXstdmxJgzc() 
    {
        return xstdmxJgzc;
    }
    public void setXstdmxGbsl(Integer xstdmxGbsl) 
    {
        this.xstdmxGbsl = xstdmxGbsl;
    }

    public Integer getXstdmxGbsl() 
    {
        return xstdmxGbsl;
    }
    public void setXstdmxCzyc(Integer xstdmxCzyc) 
    {
        this.xstdmxCzyc = xstdmxCzyc;
    }

    public Integer getXstdmxCzyc() 
    {
        return xstdmxCzyc;
    }
    public void setXstdmxSfzj(String xstdmxSfzj) 
    {
        this.xstdmxSfzj = xstdmxSfzj;
    }

    public String getXstdmxSfzj() 
    {
        return xstdmxSfzj;
    }
    public void setXstdmxJssl(Integer xstdmxJssl) 
    {
        this.xstdmxJssl = xstdmxJssl;
    }

    public Integer getXstdmxJssl() 
    {
        return xstdmxJssl;
    }
    public void setXstdmxFjssl1(Integer xstdmxFjssl1) 
    {
        this.xstdmxFjssl1 = xstdmxFjssl1;
    }

    public Integer getXstdmxFjssl1() 
    {
        return xstdmxFjssl1;
    }
    public void setXstdmxFjssl2(Integer xstdmxFjssl2) 
    {
        this.xstdmxFjssl2 = xstdmxFjssl2;
    }

    public Integer getXstdmxFjssl2() 
    {
        return xstdmxFjssl2;
    }
    public void setXstdmxZjzt(String xstdmxZjzt) 
    {
        this.xstdmxZjzt = xstdmxZjzt;
    }

    public String getXstdmxZjzt() 
    {
        return xstdmxZjzt;
    }
    public void setXstdmxBgdh(String xstdmxBgdh) 
    {
        this.xstdmxBgdh = xstdmxBgdh;
    }

    public String getXstdmxBgdh() 
    {
        return xstdmxBgdh;
    }
    public void setXstdmxFpsl(Integer xstdmxFpsl) 
    {
        this.xstdmxFpsl = xstdmxFpsl;
    }

    public Integer getXstdmxFpsl() 
    {
        return xstdmxFpsl;
    }
    public void setXstdmxBgsl(Integer xstdmxBgsl) 
    {
        this.xstdmxBgsl = xstdmxBgsl;
    }

    public Integer getXstdmxBgsl() 
    {
        return xstdmxBgsl;
    }
    public void setXstdmxWlbhbak(String xstdmxWlbhbak) 
    {
        this.xstdmxWlbhbak = xstdmxWlbhbak;
    }

    public String getXstdmxWlbhbak() 
    {
        return xstdmxWlbhbak;
    }
    public void setXstdmxHzt(String xstdmxHzt) 
    {
        this.xstdmxHzt = xstdmxHzt;
    }

    public String getXstdmxHzt() 
    {
        return xstdmxHzt;
    }
    public void setXstdmxHzbz(String xstdmxHzbz) 
    {
        this.xstdmxHzbz = xstdmxHzbz;
    }

    public String getXstdmxHzbz() 
    {
        return xstdmxHzbz;
    }
    public void setXstdmxHzr(String xstdmxHzr) 
    {
        this.xstdmxHzr = xstdmxHzr;
    }

    public String getXstdmxHzr() 
    {
        return xstdmxHzr;
    }
    public void setXstdmxHzrq(String xstdmxHzrq) 
    {
        this.xstdmxHzrq = xstdmxHzrq;
    }

    public String getXstdmxHzrq() 
    {
        return xstdmxHzrq;
    }
    public void setXstdmxShhhz(String xstdmxShhhz) 
    {
        this.xstdmxShhhz = xstdmxShhhz;
    }

    public String getXstdmxShhhz() 
    {
        return xstdmxShhhz;
    }
    public void setXstdmxShhrq(String xstdmxShhrq) 
    {
        this.xstdmxShhrq = xstdmxShhrq;
    }

    public String getXstdmxShhrq() 
    {
        return xstdmxShhrq;
    }
    public void setXstdmxShhbh(String xstdmxShhbh) 
    {
        this.xstdmxShhbh = xstdmxShhbh;
    }

    public String getXstdmxShhbh() 
    {
        return xstdmxShhbh;
    }
    public void setXstdmxMode(String xstdmxMode) 
    {
        this.xstdmxMode = xstdmxMode;
    }

    public String getXstdmxMode() 
    {
        return xstdmxMode;
    }
    public void setXstdmxTcksl(Integer xstdmxTcksl) 
    {
        this.xstdmxTcksl = xstdmxTcksl;
    }

    public Integer getXstdmxTcksl() 
    {
        return xstdmxTcksl;
    }
    public void setXstdmxTckfsl1(Integer xstdmxTckfsl1) 
    {
        this.xstdmxTckfsl1 = xstdmxTckfsl1;
    }

    public Integer getXstdmxTckfsl1() 
    {
        return xstdmxTckfsl1;
    }
    public void setXstdmxTckfsl2(Integer xstdmxTckfsl2) 
    {
        this.xstdmxTckfsl2 = xstdmxTckfsl2;
    }

    public Integer getXstdmxTckfsl2() 
    {
        return xstdmxTckfsl2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("xstdmxTdls", getXstdmxTdls())
            .append("xstdmxTdfl", getXstdmxTdfl())
            .append("xstdmxXsxh", getXstdmxXsxh())
            .append("xstdmxFllx", getXstdmxFllx())
            .append("xstdmxFlly", getXstdmxFlly())
            .append("xstdmxKcfs", getXstdmxKcfs())
            .append("xstdmxDdls", getXstdmxDdls())
            .append("xstdmxDdfl", getXstdmxDdfl())
            .append("xstdmxDdbh", getXstdmxDdbh())
            .append("xstdmxYtdls", getXstdmxYtdls())
            .append("xstdmxYtdfl", getXstdmxYtdfl())
            .append("xstdmxYtdbh", getXstdmxYtdbh())
            .append("xstdmxHtls", getXstdmxHtls())
            .append("xstdmxHtfl", getXstdmxHtfl())
            .append("xstdmxJhrq", getXstdmxJhrq())
            .append("xstdmxCkbh", getXstdmxCkbh())
            .append("xstdmxWlbh", getXstdmxWlbh())
            .append("xstdmxPch", getXstdmxPch())
            .append("xstdmxHwbh", getXstdmxHwbh())
            .append("xstdmxZyx1", getXstdmxZyx1())
            .append("xstdmxZyx2", getXstdmxZyx2())
            .append("xstdmxZyx3", getXstdmxZyx3())
            .append("xstdmxZyx4", getXstdmxZyx4())
            .append("xstdmxZyx5", getXstdmxZyx5())
            .append("xstdmxWlzt", getXstdmxWlzt())
            .append("xstdmxWlbz", getXstdmxWlbz())
            .append("xstdmxZsl", getXstdmxZsl())
            .append("xstdmxFsl1", getXstdmxFsl1())
            .append("xstdmxFsl2", getXstdmxFsl2())
            .append("xstdmxYzhsj", getXstdmxYzhsj())
            .append("xstdmxBzhsj", getXstdmxBzhsj())
            .append("xstdmxYzxsj", getXstdmxYzxsj())
            .append("xstdmxBzxsj", getXstdmxBzxsj())
            .append("xstdmxSl", getXstdmxSl())
            .append("xstdmxYxse", getXstdmxYxse())
            .append("xstdmxBxse", getXstdmxBxse())
            .append("xstdmxYse", getXstdmxYse())
            .append("xstdmxBse", getXstdmxBse())
            .append("xstdmxYhse", getXstdmxYhse())
            .append("xstdmxBhse", getXstdmxBhse())
            .append("xstdmxDbzkbl", getXstdmxDbzkbl())
            .append("xstdmxZezkbl", getXstdmxZezkbl())
            .append("xstdmxYzkje", getXstdmxYzkje())
            .append("xstdmxBzkje", getXstdmxBzkje())
            .append("xstdmxYzsl", getXstdmxYzsl())
            .append("xstdmxYfsl", getXstdmxYfsl())
            .append("xstdmxYfsl1", getXstdmxYfsl1())
            .append("xstdmxYfsl2", getXstdmxYfsl2())
            .append("xstdmxSffy", getXstdmxSffy())
            .append("xstdmxSfkp", getXstdmxSfkp())
            .append("xstdmxKpbz", getXstdmxKpbz())
            .append("xstdmxKpsl", getXstdmxKpsl())
            .append("xstdmxKpfsl1", getXstdmxKpfsl1())
            .append("xstdmxKpfsl2", getXstdmxKpfsl2())
            .append("xstdmxYkpe", getXstdmxYkpe())
            .append("xstdmxBkpe", getXstdmxBkpe())
            .append("xstdmxSfck", getXstdmxSfck())
            .append("xstdmxCkbz", getXstdmxCkbz())
            .append("xstdmxCksl", getXstdmxCksl())
            .append("xstdmxCkfsl1", getXstdmxCkfsl1())
            .append("xstdmxCkfsl2", getXstdmxCkfsl2())
            .append("xstdmxThsl", getXstdmxThsl())
            .append("xstdmxThfsl1", getXstdmxThfsl1())
            .append("xstdmxThfsl2", getXstdmxThfsl2())
            .append("xstdmxBhsl", getXstdmxBhsl())
            .append("xstdmxBhfsl1", getXstdmxBhfsl1())
            .append("xstdmxBhfsl2", getXstdmxBhfsl2())
            .append("xstdmxSfth", getXstdmxSfth())
            .append("xstdmxThbz", getXstdmxThbz())
            .append("xstdmxKcyl", getXstdmxKcyl())
            .append("xstdmxDdkcyl", getXstdmxDdkcyl())
            .append("xstdmxC1", getXstdmxC1())
            .append("xstdmxC2", getXstdmxC2())
            .append("xstdmxC3", getXstdmxC3())
            .append("xstdmxC4", getXstdmxC4())
            .append("xstdmxC5", getXstdmxC5())
            .append("xstdmxC6", getXstdmxC6())
            .append("xstdmxC7", getXstdmxC7())
            .append("xstdmxC8", getXstdmxC8())
            .append("xstdmxC9", getXstdmxC9())
            .append("xstdmxC10", getXstdmxC10())
            .append("xstdmxU1", getXstdmxU1())
            .append("xstdmxU2", getXstdmxU2())
            .append("xstdmxU3", getXstdmxU3())
            .append("xstdmxU4", getXstdmxU4())
            .append("xstdmxU5", getXstdmxU5())
            .append("xstdmxU6", getXstdmxU6())
            .append("xstdmxDqzk", getXstdmxDqzk())
            .append("xstdmxYjbz", getXstdmxYjbz())
            .append("xstdmxYlzsl", getXstdmxYlzsl())
            .append("xstdmxYlfsl1", getXstdmxYlfsl1())
            .append("xstdmxYlfsl2", getXstdmxYlfsl2())
            .append("xstdmxYhzsl", getXstdmxYhzsl())
            .append("xstdmxYhfsl1", getXstdmxYhfsl1())
            .append("xstdmxYhfsl2", getXstdmxYhfsl2())
            .append("xstdmxYstdls", getXstdmxYstdls())
            .append("xstdmxYstdfl", getXstdmxYstdfl())
            .append("xstdmxLzrq", getXstdmxLzrq())
            .append("xstdmxYhkrq", getXstdmxYhkrq())
            .append("xstdmxZxpdyj", getXstdmxZxpdyj())
            .append("xstdmxZxtszc", getXstdmxZxtszc())
            .append("xstdmxYywrq", getXstdmxYywrq())
            .append("xstdmxDczsl", getXstdmxDczsl())
            .append("xstdmxDcfsl1", getXstdmxDcfsl1())
            .append("xstdmxDcfsl2", getXstdmxDcfsl2())
            .append("xstdmxYdce", getXstdmxYdce())
            .append("xstdmxBdce", getXstdmxBdce())
            .append("xstdmxSfhk", getXstdmxSfhk())
            .append("xstdmxHkbz", getXstdmxHkbz())
            .append("xstdmxHksl", getXstdmxHksl())
            .append("xstdmxYhke", getXstdmxYhke())
            .append("xstdmxBhke", getXstdmxBhke())
            .append("xstdmxHkfsl1", getXstdmxHkfsl1())
            .append("xstdmxHkfsl2", getXstdmxHkfsl2())
            .append("xstdmxYkpce", getXstdmxYkpce())
            .append("xstdmxBkpce", getXstdmxBkpce())
            .append("xstdmxYcehxe", getXstdmxYcehxe())
            .append("xstdmxBcehxe", getXstdmxBcehxe())
            .append("xstdmxBcyhsl", getXstdmxBcyhsl())
            .append("xstdmxPhhz", getXstdmxPhhz())
            .append("xstdmxJgys", getXstdmxJgys())
            .append("xstdmxJgzc", getXstdmxJgzc())
            .append("xstdmxGbsl", getXstdmxGbsl())
            .append("xstdmxCzyc", getXstdmxCzyc())
            .append("xstdmxSfzj", getXstdmxSfzj())
            .append("xstdmxJssl", getXstdmxJssl())
            .append("xstdmxFjssl1", getXstdmxFjssl1())
            .append("xstdmxFjssl2", getXstdmxFjssl2())
            .append("xstdmxZjzt", getXstdmxZjzt())
            .append("xstdmxBgdh", getXstdmxBgdh())
            .append("xstdmxFpsl", getXstdmxFpsl())
            .append("xstdmxBgsl", getXstdmxBgsl())
            .append("xstdmxWlbhbak", getXstdmxWlbhbak())
            .append("xstdmxHzt", getXstdmxHzt())
            .append("xstdmxHzbz", getXstdmxHzbz())
            .append("xstdmxHzr", getXstdmxHzr())
            .append("xstdmxHzrq", getXstdmxHzrq())
            .append("xstdmxShhhz", getXstdmxShhhz())
            .append("xstdmxShhrq", getXstdmxShhrq())
            .append("xstdmxShhbh", getXstdmxShhbh())
            .append("xstdmxMode", getXstdmxMode())
            .append("xstdmxTcksl", getXstdmxTcksl())
            .append("xstdmxTckfsl1", getXstdmxTckfsl1())
            .append("xstdmxTckfsl2", getXstdmxTckfsl2())
            .toString();
    }
}
