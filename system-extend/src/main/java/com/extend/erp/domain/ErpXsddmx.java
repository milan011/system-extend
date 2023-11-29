package com.extend.erp.domain;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售订单明细对象 erp_xsddmx
 *
 * @author ruoyi
 * @date 2023-11-14
 */
@DataSource(value = DataSourceType.SLAVE)
@TableName("XSDDMX")
@Data
public class ErpXsddmx
{
  private static final long serialVersionUID = 1L;

  /** 订单流水 */
  @Excel(name = "订单流水")
  private String xsddmxDdls;

  /** 订单分流 */
  private String xsddmxDdfl;

  /** 销售序号 */
  private Long xsddmxXsxh;

  /** 分流类型 */
  private String xsddmxFllx;

  /** 分流状态 */
  private String xsddmxFlzt;

  /** Y订单流水 */
  private String xsddmxYddls;

  /** Y订单分流 */
  private String xsddmxYddfl;

  /** Y订单编号 */
  @Excel(name = "Y订单编号")
  private String xsddmxYddbh;

  /** BJ流水 */
  private String xsddmxBjls;

  /** BJ分流 */
  private String xsddmxBjfl;

  /** BJ编号 */
  private String xsddmxBjbh;

  /** 合同流水 */
  private String xsddmxHtls;

  /** 合同分类 */
  private String xsddmxHtfl;

  /** 合同编号 */
  @Excel(name = "合同编号")
  private String xsddmxHtbh;

  /** 计划日期 */
  @Excel(name = "计划日期")
  private String xsddmxJhrq;

  /** 物料编号 */
  @Excel(name = "物料编号")
  private String xsddmxWlbh;

  /** 仓库编号 */
  private String xsddmxCkbh;

  /** 货物编号 */
  private String xsddmxHwbh;

  /** 批次 */
  @Excel(name = "批次")
  private String xsddmxPch;

  /** XSDDMX_ZYX1 */
  private String xsddmxZyx1;

  /** XSDDMX_ZYX2 */
  private String xsddmxZyx2;

  /** XSDDMX_ZYX3 */
  private String xsddmxZyx3;

  /** XSDDMX_ZYX4 */
  private String xsddmxZyx4;

  /** XSDDMX_ZYX5 */
  private String xsddmxZyx5;

  /** 物料状态 */
  private String xsddmxWlzt;

  /** 物料标志 */
  private String xsddmxWlbz;

  /** $column.columnComment */
  private String xsddmxScpz;

  /** XSDDMX_YBJ */
  private Integer xsddmxYbj;

  /** XSDDMX_BBJ */
  private Integer xsddmxBbj;

  /** 主数量 */
  @Excel(name = "主数量")
  private BigDecimal xsddmxZsl;

  /** 辅助数量1 */
  @Excel(name = "辅助数量1")
  private BigDecimal xsddmxFsl1;

  /** 辅助数量2 */
  private BigDecimal xsddmxFsl2;

  /** 原主含税价 */
  @Excel(name = "原主含税价")
  private BigDecimal xsddmxYzhsj;

  /** 原主销售价 */
  @Excel(name = "原主销售价")
  private BigDecimal xsddmxYzxsj;

  /** 本主含税价 */
  @Excel(name = "本主含税价")
  private BigDecimal xsddmxBzhsj;

  /** 本主销售价 */
  @Excel(name = "本主销售价")
  private BigDecimal xsddmxBzxsj;

  /** 原主税额 */
  @Excel(name = "原主税额")
  private BigDecimal xsddmxYse;

  /** 本主税额 */
  @Excel(name = "本主税额")
  private BigDecimal xsddmxBse;

  /** 税率 */
  @Excel(name = "税率")
  private BigDecimal xsddmxSl;

  /** 原含税额 */
  private BigDecimal xsddmxYhse;

  /** 本含税 */
  private BigDecimal xsddmxBhse;

  /** 原销售额 */
  private BigDecimal xsddmxYxse;

  /** 本销售额 */
  private BigDecimal xsddmxBxse;

  /** XSDDMX_DBZKBL */
  private BigDecimal xsddmxDbzkbl;

  /** XSDDMX_ZEZKBL */
  private BigDecimal xsddmxZezkbl;

  /** XSDDMX_YZKJE */
  private BigDecimal xsddmxYzkje;

  /** XSDDMX_BZKJE */
  private BigDecimal xsddmxBzkje;

  /** XSDDMX_TZSL */
  private BigDecimal xsddmxTzsl;

  /** XSDDMX_TZFSL1 */
  private BigDecimal xsddmxTzfsl1;

  /** XSDDMX_TZFSL2 */
  private BigDecimal xsddmxTzfsl2;

  /** 原含税调整 */
  private BigDecimal xsddmxTzyhse;

  /** 本含税调整 */
  private BigDecimal xsddmxTzbhse;

  /** 原销售额调整 */
  private BigDecimal xsddmxTzyxse;

  /** 本销售额调整 */
  private BigDecimal xsddmxTzbxse;

  /** XSDDMX_YFSL */
  private BigDecimal xsddmxYfsl;

  /** XSDDMX_YFSL1 */
  private BigDecimal xsddmxYffsl1;

  /** XSDDMX_YFSL2 */
  private BigDecimal xsddmxYffsl2;

  /** XSDDMX_YYFE */
  private BigDecimal xsddmxYyfe;

  /** XSDDMX_BYFE */
  private BigDecimal xsddmxByfe;

  /** XSDDMX_KPSL */
  private BigDecimal xsddmxKpsl;

  /** XSDDMX_KPSL1 */
  private BigDecimal xsddmxKpfsl1;

  /** XSDDMX_KPSL2 */
  private BigDecimal xsddmxKpfsl2;

  /** XSDDMX_YKPE */
  private BigDecimal xsddmxYkpe;

  /** XSDDMX_BKPE */
  private BigDecimal xsddmxBkpe;

  /** XSDDMX_CGSL */
  private BigDecimal xsddmxCgsl;

  /** XSDDMX_CGSL1 */
  private BigDecimal xsddmxCgfsl1;

  /** XSDDMX_CGSL2 */
  private BigDecimal xsddmxCgfsl2;

  /** 文本1 */
  private String xsddmxC1;

  /** $column.columnComment */
  private String xsddmxC2;

  /** $column.columnComment */
  private String xsddmxC3;

  /** $column.columnComment */
  private String xsddmxC4;

  /** $column.columnComment */
  private String xsddmxC5;

  /** $column.columnComment */
  private String xsddmxC6;

  /** $column.columnComment */
  private String xsddmxC7;

  /** $column.columnComment */
  private String xsddmxC8;

  /** $column.columnComment */
  private String xsddmxC9;

  /** $column.columnComment */
  private String xsddmxC10;

  /** XSDDMX_U1 */
  private BigDecimal xsddmxU1;

  /** $column.columnComment */
  private BigDecimal xsddmxU2;

  /** $column.columnComment */
  private BigDecimal xsddmxU3;

  /** $column.columnComment */
  private BigDecimal xsddmxU4;

  /** $column.columnComment */
  private BigDecimal xsddmxU5;

  /** $column.columnComment */
  private BigDecimal xsddmxU6;

  /** XSDDMX_THSL */
  private BigDecimal xsddmxThsl;

  /** XSDDMX_THSL1 */
  private BigDecimal xsddmxThfsl1;

  /** XSDDMX_THSL2 */
  private BigDecimal xsddmxThfsl2;

  /** XSDDMX_BHSL */
  private BigDecimal xsddmxBhsl;

  /** XSDDMX_BHSL1 */
  private BigDecimal xsddmxBhfsl1;

  /** XSDDMX_BHSL2 */
  private BigDecimal xsddmxBhfsl2;

  /** XSDDMX_CKSL */
  private BigDecimal xsddmxCksl;

  /** XSDDMX_CKSL1 */
  private BigDecimal xsddmxCkfsl1;

  /** XSDDMX_CKSL2 */
  private BigDecimal xsddmxCkfsl2;

  /** XSDDMX_WGL */
  private BigDecimal xsddmxWgl;

  /** XSDDMX_SFKP */
  private String xsddmxSfkp;

  /** XSDDMX_SFTD */
  private String xsddmxSftd;

  /** XSDDMX_KCFS */
  private String xsddmxKcfs;

  /** XSDDMX_KCYL */
  private String xsddmxKcyl;

  /** XSDDMX_YLZSL */
  private BigDecimal xsddmxYlzsl;

  /** XSDDMX_YLZSL1 */
  private BigDecimal xsddmxYlfsl1;

  /** XSDDMX_YLZSL2 */
  private BigDecimal xsddmxYlfsl2;

  /** XSDDMX_YHZSL */
  private BigDecimal xsddmxYhzsl;

  /** XSDDMX_YHZSL1 */
  private BigDecimal xsddmxYhfsl1;

  /** XSDDMX_YHZSL2 */
  private BigDecimal xsddmxYhfsl2;

  /** XSDDMX_YHKRQ */
  private String xsddmxYhkrq;

  /** XSDDMX_SCZT */
  private String xsddmxSczt;

  /** XSDDMX_BOMLSBH */
  private String xsddmxBomlsbh;

  /** XSDDMX_SCWGSL */
  private BigDecimal xsddmxScwgsl;

  /** $column.columnComment */
  private BigDecimal xsddmxGbsl;

  /** $column.columnComment */
  private String xsddmxJsbz;

  /** $column.columnComment */
  private String xsddmxJgys;

  /** $column.columnComment */
  private String xsddmxJgzc;

  /** $column.columnComment */
  private String xsddmxGhbm;

  /** $column.columnComment */
  private String xsddmxSfsc;

  /** $column.columnComment */
  private String xsddmxCgddls;

  /** $column.columnComment */
  private String xsddmxCgddfl;

  /** $column.columnComment */
  private String xsddmxScjhls;

  public void setXsddmxDdls(String xsddmxDdls)
  {
    this.xsddmxDdls = xsddmxDdls;
  }

  public String getXsddmxDdls()
  {
    return xsddmxDdls;
  }
  public void setXsddmxDdfl(String xsddmxDdfl)
  {
    this.xsddmxDdfl = xsddmxDdfl;
  }

  public String getXsddmxDdfl()
  {
    return xsddmxDdfl;
  }
  public void setXsddmxXsxh(Long xsddmxXsxh)
  {
    this.xsddmxXsxh = xsddmxXsxh;
  }

  public Long getXsddmxXsxh()
  {
    return xsddmxXsxh;
  }
  public void setXsddmxFllx(String xsddmxFllx)
  {
    this.xsddmxFllx = xsddmxFllx;
  }

  public String getXsddmxFllx()
  {
    return xsddmxFllx;
  }
  public void setXsddmxFlzt(String xsddmxFlzt)
  {
    this.xsddmxFlzt = xsddmxFlzt;
  }

  public String getXsddmxFlzt()
  {
    return xsddmxFlzt;
  }
  public void setXsddmxYddls(String xsddmxYddls)
  {
    this.xsddmxYddls = xsddmxYddls;
  }

  public String getXsddmxYddls()
  {
    return xsddmxYddls;
  }
  public void setXsddmxYddfl(String xsddmxYddfl)
  {
    this.xsddmxYddfl = xsddmxYddfl;
  }

  public String getXsddmxYddfl()
  {
    return xsddmxYddfl;
  }
  public void setXsddmxYddbh(String xsddmxYddbh)
  {
    this.xsddmxYddbh = xsddmxYddbh;
  }

  public String getXsddmxYddbh()
  {
    return xsddmxYddbh;
  }
  public void setXsddmxBjls(String xsddmxBjls)
  {
    this.xsddmxBjls = xsddmxBjls;
  }

  public String getXsddmxBjls()
  {
    return xsddmxBjls;
  }
  public void setXsddmxBjfl(String xsddmxBjfl)
  {
    this.xsddmxBjfl = xsddmxBjfl;
  }

  public String getXsddmxBjfl()
  {
    return xsddmxBjfl;
  }
  public void setXsddmxBjbh(String xsddmxBjbh)
  {
    this.xsddmxBjbh = xsddmxBjbh;
  }

  public String getXsddmxBjbh()
  {
    return xsddmxBjbh;
  }
  public void setXsddmxHtls(String xsddmxHtls)
  {
    this.xsddmxHtls = xsddmxHtls;
  }

  public String getXsddmxHtls()
  {
    return xsddmxHtls;
  }
  public void setXsddmxHtfl(String xsddmxHtfl)
  {
    this.xsddmxHtfl = xsddmxHtfl;
  }

  public String getXsddmxHtfl()
  {
    return xsddmxHtfl;
  }
  public void setXsddmxHtbh(String xsddmxHtbh)
  {
    this.xsddmxHtbh = xsddmxHtbh;
  }

  public String getXsddmxHtbh()
  {
    return xsddmxHtbh;
  }
  public void setXsddmxJhrq(String xsddmxJhrq)
  {
    this.xsddmxJhrq = xsddmxJhrq;
  }

  public String getXsddmxJhrq()
  {
    return xsddmxJhrq;
  }
  public void setXsddmxWlbh(String xsddmxWlbh)
  {
    this.xsddmxWlbh = xsddmxWlbh;
  }

  public String getXsddmxWlbh()
  {
    return xsddmxWlbh;
  }
  public void setXsddmxCkbh(String xsddmxCkbh)
  {
    this.xsddmxCkbh = xsddmxCkbh;
  }

  public String getXsddmxCkbh()
  {
    return xsddmxCkbh;
  }
  public void setXsddmxHwbh(String xsddmxHwbh)
  {
    this.xsddmxHwbh = xsddmxHwbh;
  }

  public String getXsddmxHwbh()
  {
    return xsddmxHwbh;
  }
  public void setXsddmxPch(String xsddmxPch)
  {
    this.xsddmxPch = xsddmxPch;
  }

  public String getXsddmxPch()
  {
    return xsddmxPch;
  }
  public void setXsddmxZyx1(String xsddmxZyx1)
  {
    this.xsddmxZyx1 = xsddmxZyx1;
  }

  public String getXsddmxZyx1()
  {
    return xsddmxZyx1;
  }
  public void setXsddmxZyx2(String xsddmxZyx2)
  {
    this.xsddmxZyx2 = xsddmxZyx2;
  }

  public String getXsddmxZyx2()
  {
    return xsddmxZyx2;
  }
  public void setXsddmxZyx3(String xsddmxZyx3)
  {
    this.xsddmxZyx3 = xsddmxZyx3;
  }

  public String getXsddmxZyx3()
  {
    return xsddmxZyx3;
  }
  public void setXsddmxZyx4(String xsddmxZyx4)
  {
    this.xsddmxZyx4 = xsddmxZyx4;
  }

  public String getXsddmxZyx4()
  {
    return xsddmxZyx4;
  }
  public void setXsddmxZyx5(String xsddmxZyx5)
  {
    this.xsddmxZyx5 = xsddmxZyx5;
  }

  public String getXsddmxZyx5()
  {
    return xsddmxZyx5;
  }
  public void setXsddmxWlzt(String xsddmxWlzt)
  {
    this.xsddmxWlzt = xsddmxWlzt;
  }

  public String getXsddmxWlzt()
  {
    return xsddmxWlzt;
  }
  public void setXsddmxWlbz(String xsddmxWlbz)
  {
    this.xsddmxWlbz = xsddmxWlbz;
  }

  public String getXsddmxWlbz()
  {
    return xsddmxWlbz;
  }
  public void setXsddmxScpz(String xsddmxScpz)
  {
    this.xsddmxScpz = xsddmxScpz;
  }

  public String getXsddmxScpz()
  {
    return xsddmxScpz;
  }
  public void setXsddmxYbj(Integer xsddmxYbj)
  {
    this.xsddmxYbj = xsddmxYbj;
  }

  public Integer getXsddmxYbj()
  {
    return xsddmxYbj;
  }
  public void setXsddmxBbj(Integer xsddmxBbj)
  {
    this.xsddmxBbj = xsddmxBbj;
  }

  public Integer getXsddmxBbj()
  {
    return xsddmxBbj;
  }
  public void setXsddmxZsl(BigDecimal xsddmxZsl)
  {
    this.xsddmxZsl = xsddmxZsl;
  }

  public BigDecimal getXsddmxZsl()
  {
    return xsddmxZsl;
  }
  public void setXsddmxFsl1(BigDecimal xsddmxFsl1)
  {
    this.xsddmxFsl1 = xsddmxFsl1;
  }

  public BigDecimal getXsddmxFsl1()
  {
    return xsddmxFsl1;
  }
  public void setXsddmxFsl2(BigDecimal xsddmxFsl2)
  {
    this.xsddmxFsl2 = xsddmxFsl2;
  }

  public BigDecimal getXsddmxFsl2()
  {
    return xsddmxFsl2;
  }
  public void setXsddmxYzhsj(BigDecimal xsddmxYzhsj)
  {
    this.xsddmxYzhsj = xsddmxYzhsj;
  }

  public BigDecimal getXsddmxYzhsj()
  {
    return xsddmxYzhsj;
  }
  public void setXsddmxYzxsj(BigDecimal xsddmxYzxsj)
  {
    this.xsddmxYzxsj = xsddmxYzxsj;
  }

  public BigDecimal getXsddmxYzxsj()
  {
    return xsddmxYzxsj;
  }
  public void setXsddmxBzhsj(BigDecimal xsddmxBzhsj)
  {
    this.xsddmxBzhsj = xsddmxBzhsj;
  }

  public BigDecimal getXsddmxBzhsj()
  {
    return xsddmxBzhsj;
  }
  public void setXsddmxBzxsj(BigDecimal xsddmxBzxsj)
  {
    this.xsddmxBzxsj = xsddmxBzxsj;
  }

  public BigDecimal getXsddmxBzxsj()
  {
    return xsddmxBzxsj;
  }
  public void setXsddmxYse(BigDecimal xsddmxYse)
  {
    this.xsddmxYse = xsddmxYse;
  }

  public BigDecimal getXsddmxYse()
  {
    return xsddmxYse;
  }
  public void setXsddmxBse(BigDecimal xsddmxBse)
  {
    this.xsddmxBse = xsddmxBse;
  }

  public BigDecimal getXsddmxBse()
  {
    return xsddmxBse;
  }
  public void setXsddmxSl(BigDecimal xsddmxSl)
  {
    this.xsddmxSl = xsddmxSl;
  }

  public BigDecimal getXsddmxSl()
  {
    return xsddmxSl;
  }
  public void setXsddmxYhse(BigDecimal xsddmxYhse)
  {
    this.xsddmxYhse = xsddmxYhse;
  }

  public BigDecimal getXsddmxYhse()
  {
    return xsddmxYhse;
  }
  public void setXsddmxBhse(BigDecimal xsddmxBhse)
  {
    this.xsddmxBhse = xsddmxBhse;
  }

  public BigDecimal getXsddmxBhse()
  {
    return xsddmxBhse;
  }
  public void setXsddmxYxse(BigDecimal xsddmxYxse)
  {
    this.xsddmxYxse = xsddmxYxse;
  }

  public BigDecimal getXsddmxYxse()
  {
    return xsddmxYxse;
  }
  public void setXsddmxBxse(BigDecimal xsddmxBxse)
  {
    this.xsddmxBxse = xsddmxBxse;
  }

  public BigDecimal getXsddmxBxse()
  {
    return xsddmxBxse;
  }
  public void setXsddmxDbzkbl(BigDecimal xsddmxDbzkbl)
  {
    this.xsddmxDbzkbl = xsddmxDbzkbl;
  }

  public BigDecimal getXsddmxDbzkbl()
  {
    return xsddmxDbzkbl;
  }
  public void setXsddmxZezkbl(BigDecimal xsddmxZezkbl)
  {
    this.xsddmxZezkbl = xsddmxZezkbl;
  }

  public BigDecimal getXsddmxZezkbl()
  {
    return xsddmxZezkbl;
  }
  public void setXsddmxYzkje(BigDecimal xsddmxYzkje)
  {
    this.xsddmxYzkje = xsddmxYzkje;
  }

  public BigDecimal getXsddmxYzkje()
  {
    return xsddmxYzkje;
  }
  public void setXsddmxBzkje(BigDecimal xsddmxBzkje)
  {
    this.xsddmxBzkje = xsddmxBzkje;
  }

  public BigDecimal getXsddmxBzkje()
  {
    return xsddmxBzkje;
  }
  public void setXsddmxTzsl(BigDecimal xsddmxTzsl)
  {
    this.xsddmxTzsl = xsddmxTzsl;
  }

  public BigDecimal getXsddmxTzsl()
  {
    return xsddmxTzsl;
  }
  public void setXsddmxTzfsl1(BigDecimal xsddmxTzfsl1)
  {
    this.xsddmxTzfsl1 = xsddmxTzfsl1;
  }

  public BigDecimal getXsddmxTzfsl1()
  {
    return xsddmxTzfsl1;
  }
  public void setXsddmxTzfsl2(BigDecimal xsddmxTzfsl2)
  {
    this.xsddmxTzfsl2 = xsddmxTzfsl2;
  }

  public BigDecimal getXsddmxTzfsl2()
  {
    return xsddmxTzfsl2;
  }
  public void setXsddmxTzyhse(BigDecimal xsddmxTzyhse)
  {
    this.xsddmxTzyhse = xsddmxTzyhse;
  }

  public BigDecimal getXsddmxTzyhse()
  {
    return xsddmxTzyhse;
  }
  public void setXsddmxTzbhse(BigDecimal xsddmxTzbhse)
  {
    this.xsddmxTzbhse = xsddmxTzbhse;
  }

  public BigDecimal getXsddmxTzbhse()
  {
    return xsddmxTzbhse;
  }
  public void setXsddmxTzyxse(BigDecimal xsddmxTzyxse)
  {
    this.xsddmxTzyxse = xsddmxTzyxse;
  }

  public BigDecimal getXsddmxTzyxse()
  {
    return xsddmxTzyxse;
  }
  public void setXsddmxTzbxse(BigDecimal xsddmxTzbxse)
  {
    this.xsddmxTzbxse = xsddmxTzbxse;
  }

  public BigDecimal getXsddmxTzbxse()
  {
    return xsddmxTzbxse;
  }
  public void setXsddmxYfsl(BigDecimal xsddmxYfsl)
  {
    this.xsddmxYfsl = xsddmxYfsl;
  }

  public BigDecimal getXsddmxYfsl()
  {
    return xsddmxYfsl;
  }
  public void setXsddmxYffsl1(BigDecimal xsddmxYffsl1)
  {
    this.xsddmxYffsl1 = xsddmxYffsl1;
  }

  public BigDecimal getXsddmxYffsl1()
  {
    return xsddmxYffsl1;
  }
  public void setXsddmxYffsl2(BigDecimal xsddmxYffsl2)
  {
    this.xsddmxYffsl2 = xsddmxYffsl2;
  }

  public BigDecimal getXsddmxYffsl2()
  {
    return xsddmxYffsl2;
  }
  public void setXsddmxYyfe(BigDecimal xsddmxYyfe)
  {
    this.xsddmxYyfe = xsddmxYyfe;
  }

  public BigDecimal getXsddmxYyfe()
  {
    return xsddmxYyfe;
  }
  public void setXsddmxByfe(BigDecimal xsddmxByfe)
  {
    this.xsddmxByfe = xsddmxByfe;
  }

  public BigDecimal getXsddmxByfe()
  {
    return xsddmxByfe;
  }
  public void setXsddmxKpsl(BigDecimal xsddmxKpsl)
  {
    this.xsddmxKpsl = xsddmxKpsl;
  }

  public BigDecimal getXsddmxKpsl()
  {
    return xsddmxKpsl;
  }
  public void setXsddmxKpfsl1(BigDecimal xsddmxKpfsl1)
  {
    this.xsddmxKpfsl1 = xsddmxKpfsl1;
  }

  public BigDecimal getXsddmxKpfsl1()
  {
    return xsddmxKpfsl1;
  }
  public void setXsddmxKpfsl2(BigDecimal xsddmxKpfsl2)
  {
    this.xsddmxKpfsl2 = xsddmxKpfsl2;
  }

  public BigDecimal getXsddmxKpfsl2()
  {
    return xsddmxKpfsl2;
  }
  public void setXsddmxYkpe(BigDecimal xsddmxYkpe)
  {
    this.xsddmxYkpe = xsddmxYkpe;
  }

  public BigDecimal getXsddmxYkpe()
  {
    return xsddmxYkpe;
  }
  public void setXsddmxBkpe(BigDecimal xsddmxBkpe)
  {
    this.xsddmxBkpe = xsddmxBkpe;
  }

  public BigDecimal getXsddmxBkpe()
  {
    return xsddmxBkpe;
  }
  public void setXsddmxCgsl(BigDecimal xsddmxCgsl)
  {
    this.xsddmxCgsl = xsddmxCgsl;
  }

  public BigDecimal getXsddmxCgsl()
  {
    return xsddmxCgsl;
  }
  public void setXsddmxCgfsl1(BigDecimal xsddmxCgfsl1)
  {
    this.xsddmxCgfsl1 = xsddmxCgfsl1;
  }

  public BigDecimal getXsddmxCgfsl1()
  {
    return xsddmxCgfsl1;
  }
  public void setXsddmxCgfsl2(BigDecimal xsddmxCgfsl2)
  {
    this.xsddmxCgfsl2 = xsddmxCgfsl2;
  }

  public BigDecimal getXsddmxCgfsl2()
  {
    return xsddmxCgfsl2;
  }
  public void setXsddmxC1(String xsddmxC1)
  {
    this.xsddmxC1 = xsddmxC1;
  }

  public String getXsddmxC1()
  {
    return xsddmxC1;
  }
  public void setXsddmxC2(String xsddmxC2)
  {
    this.xsddmxC2 = xsddmxC2;
  }

  public String getXsddmxC2()
  {
    return xsddmxC2;
  }
  public void setXsddmxC3(String xsddmxC3)
  {
    this.xsddmxC3 = xsddmxC3;
  }

  public String getXsddmxC3()
  {
    return xsddmxC3;
  }
  public void setXsddmxC4(String xsddmxC4)
  {
    this.xsddmxC4 = xsddmxC4;
  }

  public String getXsddmxC4()
  {
    return xsddmxC4;
  }
  public void setXsddmxC5(String xsddmxC5)
  {
    this.xsddmxC5 = xsddmxC5;
  }

  public String getXsddmxC5()
  {
    return xsddmxC5;
  }
  public void setXsddmxC6(String xsddmxC6)
  {
    this.xsddmxC6 = xsddmxC6;
  }

  public String getXsddmxC6()
  {
    return xsddmxC6;
  }
  public void setXsddmxC7(String xsddmxC7)
  {
    this.xsddmxC7 = xsddmxC7;
  }

  public String getXsddmxC7()
  {
    return xsddmxC7;
  }
  public void setXsddmxC8(String xsddmxC8)
  {
    this.xsddmxC8 = xsddmxC8;
  }

  public String getXsddmxC8()
  {
    return xsddmxC8;
  }
  public void setXsddmxC9(String xsddmxC9)
  {
    this.xsddmxC9 = xsddmxC9;
  }

  public String getXsddmxC9()
  {
    return xsddmxC9;
  }
  public void setXsddmxC10(String xsddmxC10)
  {
    this.xsddmxC10 = xsddmxC10;
  }

  public String getXsddmxC10()
  {
    return xsddmxC10;
  }
  public void setXsddmxU1(BigDecimal xsddmxU1)
  {
    this.xsddmxU1 = xsddmxU1;
  }

  public BigDecimal getXsddmxU1()
  {
    return xsddmxU1;
  }
  public void setXsddmxU2(BigDecimal xsddmxU2)
  {
    this.xsddmxU2 = xsddmxU2;
  }

  public BigDecimal getXsddmxU2()
  {
    return xsddmxU2;
  }
  public void setXsddmxU3(BigDecimal xsddmxU3)
  {
    this.xsddmxU3 = xsddmxU3;
  }

  public BigDecimal getXsddmxU3()
  {
    return xsddmxU3;
  }
  public void setXsddmxU4(BigDecimal xsddmxU4)
  {
    this.xsddmxU4 = xsddmxU4;
  }

  public BigDecimal getXsddmxU4()
  {
    return xsddmxU4;
  }
  public void setXsddmxU5(BigDecimal xsddmxU5)
  {
    this.xsddmxU5 = xsddmxU5;
  }

  public BigDecimal getXsddmxU5()
  {
    return xsddmxU5;
  }
  public void setXsddmxU6(BigDecimal xsddmxU6)
  {
    this.xsddmxU6 = xsddmxU6;
  }

  public BigDecimal getXsddmxU6()
  {
    return xsddmxU6;
  }
  public void setXsddmxThsl(BigDecimal xsddmxThsl)
  {
    this.xsddmxThsl = xsddmxThsl;
  }

  public BigDecimal getXsddmxThsl()
  {
    return xsddmxThsl;
  }
  public void setXsddmxThfsl1(BigDecimal xsddmxThfsl1)
  {
    this.xsddmxThfsl1 = xsddmxThfsl1;
  }

  public BigDecimal getXsddmxThfsl1()
  {
    return xsddmxThfsl1;
  }
  public void setXsddmxThfsl2(BigDecimal xsddmxThfsl2)
  {
    this.xsddmxThfsl2 = xsddmxThfsl2;
  }

  public BigDecimal getXsddmxThfsl2()
  {
    return xsddmxThfsl2;
  }
  public void setXsddmxBhsl(BigDecimal xsddmxBhsl)
  {
    this.xsddmxBhsl = xsddmxBhsl;
  }

  public BigDecimal getXsddmxBhsl()
  {
    return xsddmxBhsl;
  }
  public void setXsddmxBhfsl1(BigDecimal xsddmxBhfsl1)
  {
    this.xsddmxBhfsl1 = xsddmxBhfsl1;
  }

  public BigDecimal getXsddmxBhfsl1()
  {
    return xsddmxBhfsl1;
  }
  public void setXsddmxBhfsl2(BigDecimal xsddmxBhfsl2)
  {
    this.xsddmxBhfsl2 = xsddmxBhfsl2;
  }

  public BigDecimal getXsddmxBhfsl2()
  {
    return xsddmxBhfsl2;
  }
  public void setXsddmxCksl(BigDecimal xsddmxCksl)
  {
    this.xsddmxCksl = xsddmxCksl;
  }

  public BigDecimal getXsddmxCksl()
  {
    return xsddmxCksl;
  }
  public void setXsddmxCkfsl1(BigDecimal xsddmxCkfsl1)
  {
    this.xsddmxCkfsl1 = xsddmxCkfsl1;
  }

  public BigDecimal getXsddmxCkfsl1()
  {
    return xsddmxCkfsl1;
  }
  public void setXsddmxCkfsl2(BigDecimal xsddmxCkfsl2)
  {
    this.xsddmxCkfsl2 = xsddmxCkfsl2;
  }

  public BigDecimal getXsddmxCkfsl2()
  {
    return xsddmxCkfsl2;
  }
  public void setXsddmxWgl(BigDecimal xsddmxWgl)
  {
    this.xsddmxWgl = xsddmxWgl;
  }

  public BigDecimal getXsddmxWgl()
  {
    return xsddmxWgl;
  }
  public void setXsddmxSfkp(String xsddmxSfkp)
  {
    this.xsddmxSfkp = xsddmxSfkp;
  }

  public String getXsddmxSfkp()
  {
    return xsddmxSfkp;
  }
  public void setXsddmxSftd(String xsddmxSftd)
  {
    this.xsddmxSftd = xsddmxSftd;
  }

  public String getXsddmxSftd()
  {
    return xsddmxSftd;
  }
  public void setXsddmxKcfs(String xsddmxKcfs)
  {
    this.xsddmxKcfs = xsddmxKcfs;
  }

  public String getXsddmxKcfs()
  {
    return xsddmxKcfs;
  }
  public void setXsddmxKcyl(String xsddmxKcyl)
  {
    this.xsddmxKcyl = xsddmxKcyl;
  }

  public String getXsddmxKcyl()
  {
    return xsddmxKcyl;
  }
  public void setXsddmxYlzsl(BigDecimal xsddmxYlzsl)
  {
    this.xsddmxYlzsl = xsddmxYlzsl;
  }

  public BigDecimal getXsddmxYlzsl()
  {
    return xsddmxYlzsl;
  }
  public void setXsddmxYlfsl1(BigDecimal xsddmxYlfsl1)
  {
    this.xsddmxYlfsl1 = xsddmxYlfsl1;
  }

  public BigDecimal getXsddmxYlfsl1()
  {
    return xsddmxYlfsl1;
  }
  public void setXsddmxYlfsl2(BigDecimal xsddmxYlfsl2)
  {
    this.xsddmxYlfsl2 = xsddmxYlfsl2;
  }

  public BigDecimal getXsddmxYlfsl2()
  {
    return xsddmxYlfsl2;
  }
  public void setXsddmxYhzsl(BigDecimal xsddmxYhzsl)
  {
    this.xsddmxYhzsl = xsddmxYhzsl;
  }

  public BigDecimal getXsddmxYhzsl()
  {
    return xsddmxYhzsl;
  }
  public void setXsddmxYhfsl1(BigDecimal xsddmxYhfsl1)
  {
    this.xsddmxYhfsl1 = xsddmxYhfsl1;
  }

  public BigDecimal getXsddmxYhfsl1()
  {
    return xsddmxYhfsl1;
  }
  public void setXsddmxYhfsl2(BigDecimal xsddmxYhfsl2)
  {
    this.xsddmxYhfsl2 = xsddmxYhfsl2;
  }

  public BigDecimal getXsddmxYhfsl2()
  {
    return xsddmxYhfsl2;
  }
  public void setXsddmxYhkrq(String xsddmxYhkrq)
  {
    this.xsddmxYhkrq = xsddmxYhkrq;
  }

  public String getXsddmxYhkrq()
  {
    return xsddmxYhkrq;
  }
  public void setXsddmxSczt(String xsddmxSczt)
  {
    this.xsddmxSczt = xsddmxSczt;
  }

  public String getXsddmxSczt()
  {
    return xsddmxSczt;
  }
  public void setXsddmxBomlsbh(String xsddmxBomlsbh)
  {
    this.xsddmxBomlsbh = xsddmxBomlsbh;
  }

  public String getXsddmxBomlsbh()
  {
    return xsddmxBomlsbh;
  }
  public void setXsddmxScwgsl(BigDecimal xsddmxScwgsl)
  {
    this.xsddmxScwgsl = xsddmxScwgsl;
  }

  public BigDecimal getXsddmxScwgsl()
  {
    return xsddmxScwgsl;
  }
  public void setXsddmxGbsl(BigDecimal xsddmxGbsl)
  {
    this.xsddmxGbsl = xsddmxGbsl;
  }

  public BigDecimal getXsddmxGbsl()
  {
    return xsddmxGbsl;
  }
  public void setXsddmxJsbz(String xsddmxJsbz)
  {
    this.xsddmxJsbz = xsddmxJsbz;
  }

  public String getXsddmxJsbz()
  {
    return xsddmxJsbz;
  }
  public void setXsddmxJgys(String xsddmxJgys)
  {
    this.xsddmxJgys = xsddmxJgys;
  }

  public String getXsddmxJgys()
  {
    return xsddmxJgys;
  }
  public void setXsddmxJgzc(String xsddmxJgzc)
  {
    this.xsddmxJgzc = xsddmxJgzc;
  }

  public String getXsddmxJgzc()
  {
    return xsddmxJgzc;
  }
  public void setXsddmxGhbm(String xsddmxGhbm)
  {
    this.xsddmxGhbm = xsddmxGhbm;
  }

  public String getXsddmxGhbm()
  {
    return xsddmxGhbm;
  }
  public void setXsddmxSfsc(String xsddmxSfsc)
  {
    this.xsddmxSfsc = xsddmxSfsc;
  }

  public String getXsddmxSfsc()
  {
    return xsddmxSfsc;
  }
  public void setXsddmxCgddls(String xsddmxCgddls)
  {
    this.xsddmxCgddls = xsddmxCgddls;
  }

  public String getXsddmxCgddls()
  {
    return xsddmxCgddls;
  }
  public void setXsddmxCgddfl(String xsddmxCgddfl)
  {
    this.xsddmxCgddfl = xsddmxCgddfl;
  }

  public String getXsddmxCgddfl()
  {
    return xsddmxCgddfl;
  }
  public void setXsddmxScjhls(String xsddmxScjhls)
  {
    this.xsddmxScjhls = xsddmxScjhls;
  }

  public String getXsddmxScjhls()
  {
    return xsddmxScjhls;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
        .append("xsddmxDdls", getXsddmxDdls())
        .append("xsddmxDdfl", getXsddmxDdfl())
        .append("xsddmxXsxh", getXsddmxXsxh())
        .append("xsddmxFllx", getXsddmxFllx())
        .append("xsddmxFlzt", getXsddmxFlzt())
        .append("xsddmxYddls", getXsddmxYddls())
        .append("xsddmxYddfl", getXsddmxYddfl())
        .append("xsddmxYddbh", getXsddmxYddbh())
        .append("xsddmxBjls", getXsddmxBjls())
        .append("xsddmxBjfl", getXsddmxBjfl())
        .append("xsddmxBjbh", getXsddmxBjbh())
        .append("xsddmxHtls", getXsddmxHtls())
        .append("xsddmxHtfl", getXsddmxHtfl())
        .append("xsddmxHtbh", getXsddmxHtbh())
        .append("xsddmxJhrq", getXsddmxJhrq())
        .append("xsddmxWlbh", getXsddmxWlbh())
        .append("xsddmxCkbh", getXsddmxCkbh())
        .append("xsddmxHwbh", getXsddmxHwbh())
        .append("xsddmxPch", getXsddmxPch())
        .append("xsddmxZyx1", getXsddmxZyx1())
        .append("xsddmxZyx2", getXsddmxZyx2())
        .append("xsddmxZyx3", getXsddmxZyx3())
        .append("xsddmxZyx4", getXsddmxZyx4())
        .append("xsddmxZyx5", getXsddmxZyx5())
        .append("xsddmxWlzt", getXsddmxWlzt())
        .append("xsddmxWlbz", getXsddmxWlbz())
        .append("xsddmxScpz", getXsddmxScpz())
        .append("xsddmxYbj", getXsddmxYbj())
        .append("xsddmxBbj", getXsddmxBbj())
        .append("xsddmxZsl", getXsddmxZsl())
        .append("xsddmxFsl1", getXsddmxFsl1())
        .append("xsddmxFsl2", getXsddmxFsl2())
        .append("xsddmxYzhsj", getXsddmxYzhsj())
        .append("xsddmxYzxsj", getXsddmxYzxsj())
        .append("xsddmxBzhsj", getXsddmxBzhsj())
        .append("xsddmxBzxsj", getXsddmxBzxsj())
        .append("xsddmxYse", getXsddmxYse())
        .append("xsddmxBse", getXsddmxBse())
        .append("xsddmxSl", getXsddmxSl())
        .append("xsddmxYhse", getXsddmxYhse())
        .append("xsddmxBhse", getXsddmxBhse())
        .append("xsddmxYxse", getXsddmxYxse())
        .append("xsddmxBxse", getXsddmxBxse())
        .append("xsddmxDbzkbl", getXsddmxDbzkbl())
        .append("xsddmxZezkbl", getXsddmxZezkbl())
        .append("xsddmxYzkje", getXsddmxYzkje())
        .append("xsddmxBzkje", getXsddmxBzkje())
        .append("xsddmxTzsl", getXsddmxTzsl())
        .append("xsddmxTzfsl1", getXsddmxTzfsl1())
        .append("xsddmxTzfsl2", getXsddmxTzfsl2())
        .append("xsddmxTzyhse", getXsddmxTzyhse())
        .append("xsddmxTzbhse", getXsddmxTzbhse())
        .append("xsddmxTzyxse", getXsddmxTzyxse())
        .append("xsddmxTzbxse", getXsddmxTzbxse())
        .append("xsddmxYfsl", getXsddmxYfsl())
        .append("xsddmxYffsl1", getXsddmxYffsl1())
        .append("xsddmxYffsl2", getXsddmxYffsl2())
        .append("xsddmxYyfe", getXsddmxYyfe())
        .append("xsddmxByfe", getXsddmxByfe())
        .append("xsddmxKpsl", getXsddmxKpsl())
        .append("xsddmxKpfsl1", getXsddmxKpfsl1())
        .append("xsddmxKpfsl2", getXsddmxKpfsl2())
        .append("xsddmxYkpe", getXsddmxYkpe())
        .append("xsddmxBkpe", getXsddmxBkpe())
        .append("xsddmxCgsl", getXsddmxCgsl())
        .append("xsddmxCgfsl1", getXsddmxCgfsl1())
        .append("xsddmxCgfsl2", getXsddmxCgfsl2())
        .append("xsddmxC1", getXsddmxC1())
        .append("xsddmxC2", getXsddmxC2())
        .append("xsddmxC3", getXsddmxC3())
        .append("xsddmxC4", getXsddmxC4())
        .append("xsddmxC5", getXsddmxC5())
        .append("xsddmxC6", getXsddmxC6())
        .append("xsddmxC7", getXsddmxC7())
        .append("xsddmxC8", getXsddmxC8())
        .append("xsddmxC9", getXsddmxC9())
        .append("xsddmxC10", getXsddmxC10())
        .append("xsddmxU1", getXsddmxU1())
        .append("xsddmxU2", getXsddmxU2())
        .append("xsddmxU3", getXsddmxU3())
        .append("xsddmxU4", getXsddmxU4())
        .append("xsddmxU5", getXsddmxU5())
        .append("xsddmxU6", getXsddmxU6())
        .append("xsddmxThsl", getXsddmxThsl())
        .append("xsddmxThfsl1", getXsddmxThfsl1())
        .append("xsddmxThfsl2", getXsddmxThfsl2())
        .append("xsddmxBhsl", getXsddmxBhsl())
        .append("xsddmxBhfsl1", getXsddmxBhfsl1())
        .append("xsddmxBhfsl2", getXsddmxBhfsl2())
        .append("xsddmxCksl", getXsddmxCksl())
        .append("xsddmxCkfsl1", getXsddmxCkfsl1())
        .append("xsddmxCkfsl2", getXsddmxCkfsl2())
        .append("xsddmxWgl", getXsddmxWgl())
        .append("xsddmxSfkp", getXsddmxSfkp())
        .append("xsddmxSftd", getXsddmxSftd())
        .append("xsddmxKcfs", getXsddmxKcfs())
        .append("xsddmxKcyl", getXsddmxKcyl())
        .append("xsddmxYlzsl", getXsddmxYlzsl())
        .append("xsddmxYlfsl1", getXsddmxYlfsl1())
        .append("xsddmxYlfsl2", getXsddmxYlfsl2())
        .append("xsddmxYhzsl", getXsddmxYhzsl())
        .append("xsddmxYhfsl1", getXsddmxYhfsl1())
        .append("xsddmxYhfsl2", getXsddmxYhfsl2())
        .append("xsddmxYhkrq", getXsddmxYhkrq())
        .append("xsddmxSczt", getXsddmxSczt())
        .append("xsddmxBomlsbh", getXsddmxBomlsbh())
        .append("xsddmxScwgsl", getXsddmxScwgsl())
        .append("xsddmxGbsl", getXsddmxGbsl())
        .append("xsddmxJsbz", getXsddmxJsbz())
        .append("xsddmxJgys", getXsddmxJgys())
        .append("xsddmxJgzc", getXsddmxJgzc())
        .append("xsddmxGhbm", getXsddmxGhbm())
        .append("xsddmxSfsc", getXsddmxSfsc())
        .append("xsddmxCgddls", getXsddmxCgddls())
        .append("xsddmxCgddfl", getXsddmxCgddfl())
        .append("xsddmxScjhls", getXsddmxScjhls())
        .toString();
  }
}
