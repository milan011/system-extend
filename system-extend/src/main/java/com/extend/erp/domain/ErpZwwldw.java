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
 * 往来单位对象 erp_zwwldw
 *
 * @author wcg
 * @date 2023-10-19
 */
@DataSource(value = DataSourceType.SLAVE)
@TableName("ZWWLDW")
public class ErpZwwldw
{
  private static final long serialVersionUID = 1L;

  /** 单位编号 */
  @Excel(name = "单位编号")
  private String zwwldwDwbh;

  /** 单位名称 */
  @Excel(name = "单位名称")
  private String zwwldwDwmc;

  /** 单位简称 */
  private String zwwldwDwjc;

  /** 地区编号 */
  private String zwwldwDqbh;

  /** LB编号 */
  private String zwwldwLbbh;

  /** 单位地址 */
  @Excel(name = "单位地址")
  private String zwwldwAddr;

  /** 单位电话 */
  @Excel(name = "单位电话")
  private String zwwldwTele;

  /** 客户号 */
  private String zwwldwKhh;

  /** 银行账号 */
  @Excel(name = "银行账号")
  private String zwwldwYhzh;

  /** 税号 */
  @Excel(name = "税号")
  private String zwwldwSh;

  /** 最新限额 */
  private BigDecimal zwwldwZxxe;

  /** LXR */
  @Excel(name = "LXR")
  private String zwwldwLxr;

  /** 邮箱 */
  @Excel(name = "邮箱")
  private String zwwldwEml;

  /** 拼音加密 */
  @Excel(name = "拼音加密")
  private String zwwldwPyjm;

  /** DYTMH */
  @Excel(name = "DYTMH")
  private String zwwldwDytmh;

  /** SFFC */
  @Excel(name = "SFFC")
  private String zwwldwSffc;

  /** SYZT */
  @Excel(name = "SYZT")
  private String zwwldwSyzt;

  /** KHJB */
  @Excel(name = "KHJB")
  private String zwwldwKhjb;

  public void setZwwldwDwbh(String zwwldwDwbh)
  {
    this.zwwldwDwbh = zwwldwDwbh;
  }

  public String getZwwldwDwbh()
  {
    return zwwldwDwbh;
  }
  public void setZwwldwDwmc(String zwwldwDwmc)
  {
    this.zwwldwDwmc = zwwldwDwmc;
  }

  public String getZwwldwDwmc()
  {
    return zwwldwDwmc;
  }
  public void setZwwldwDwjc(String zwwldwDwjc)
  {
    this.zwwldwDwjc = zwwldwDwjc;
  }

  public String getZwwldwDwjc()
  {
    return zwwldwDwjc;
  }
  public void setZwwldwDqbh(String zwwldwDqbh)
  {
    this.zwwldwDqbh = zwwldwDqbh;
  }

  public String getZwwldwDqbh()
  {
    return zwwldwDqbh;
  }
  public void setZwwldwLbbh(String zwwldwLbbh)
  {
    this.zwwldwLbbh = zwwldwLbbh;
  }

  public String getZwwldwLbbh()
  {
    return zwwldwLbbh;
  }
  public void setZwwldwAddr(String zwwldwAddr)
  {
    this.zwwldwAddr = zwwldwAddr;
  }

  public String getZwwldwAddr()
  {
    return zwwldwAddr;
  }
  public void setZwwldwTele(String zwwldwTele)
  {
    this.zwwldwTele = zwwldwTele;
  }

  public String getZwwldwTele()
  {
    return zwwldwTele;
  }
  public void setZwwldwKhh(String zwwldwKhh)
  {
    this.zwwldwKhh = zwwldwKhh;
  }

  public String getZwwldwKhh()
  {
    return zwwldwKhh;
  }
  public void setZwwldwYhzh(String zwwldwYhzh)
  {
    this.zwwldwYhzh = zwwldwYhzh;
  }

  public String getZwwldwYhzh()
  {
    return zwwldwYhzh;
  }
  public void setZwwldwSh(String zwwldwSh)
  {
    this.zwwldwSh = zwwldwSh;
  }

  public String getZwwldwSh()
  {
    return zwwldwSh;
  }
  public void setZwwldwZxxe(BigDecimal zwwldwZxxe)
  {
    this.zwwldwZxxe = zwwldwZxxe;
  }

  public BigDecimal getZwwldwZxxe()
  {
    return zwwldwZxxe;
  }
  public void setZwwldwLxr(String zwwldwLxr)
  {
    this.zwwldwLxr = zwwldwLxr;
  }

  public String getZwwldwLxr()
  {
    return zwwldwLxr;
  }
  public void setZwwldwEml(String zwwldwEml)
  {
    this.zwwldwEml = zwwldwEml;
  }

  public String getZwwldwEml()
  {
    return zwwldwEml;
  }
  public void setZwwldwPyjm(String zwwldwPyjm)
  {
    this.zwwldwPyjm = zwwldwPyjm;
  }

  public String getZwwldwPyjm()
  {
    return zwwldwPyjm;
  }
  public void setZwwldwDytmh(String zwwldwDytmh)
  {
    this.zwwldwDytmh = zwwldwDytmh;
  }

  public String getZwwldwDytmh()
  {
    return zwwldwDytmh;
  }
  public void setZwwldwSffc(String zwwldwSffc)
  {
    this.zwwldwSffc = zwwldwSffc;
  }

  public String getZwwldwSffc()
  {
    return zwwldwSffc;
  }
  public void setZwwldwSyzt(String zwwldwSyzt)
  {
    this.zwwldwSyzt = zwwldwSyzt;
  }

  public String getZwwldwSyzt()
  {
    return zwwldwSyzt;
  }
  public void setZwwldwKhjb(String zwwldwKhjb)
  {
    this.zwwldwKhjb = zwwldwKhjb;
  }

  public String getZwwldwKhjb()
  {
    return zwwldwKhjb;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
        .append("zwwldwDwbh", getZwwldwDwbh())
        .append("zwwldwDwmc", getZwwldwDwmc())
        .append("zwwldwDwjc", getZwwldwDwjc())
        .append("zwwldwDqbh", getZwwldwDqbh())
        .append("zwwldwLbbh", getZwwldwLbbh())
        .append("zwwldwAddr", getZwwldwAddr())
        .append("zwwldwTele", getZwwldwTele())
        .append("zwwldwKhh", getZwwldwKhh())
        .append("zwwldwYhzh", getZwwldwYhzh())
        .append("zwwldwSh", getZwwldwSh())
        .append("zwwldwZxxe", getZwwldwZxxe())
        .append("zwwldwLxr", getZwwldwLxr())
        .append("zwwldwEml", getZwwldwEml())
        .append("zwwldwPyjm", getZwwldwPyjm())
        .append("zwwldwDytmh", getZwwldwDytmh())
        .append("zwwldwSffc", getZwwldwSffc())
        .append("zwwldwSyzt", getZwwldwSyzt())
        .append("zwwldwKhjb", getZwwldwKhjb())
        .toString();
  }
}
