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
 * 人员对象 erp_zwzgzd
 *
 * @author wcg
 * @date 2023-10-19
 */
@DataSource(value = DataSourceType.SLAVE)
@TableName("ZWZGZD")
public class ErpZwzgzd
{
  private static final long serialVersionUID = 1L;

  /** 人员编号 */
  @Excel(name = "人员编号")
  private String zwzgzdZgbh;

  /** 人员姓名 */
  @Excel(name = "人员姓名")
  private String zwzgzdZgxm;

  /** 部门编号 */
  @Excel(name = "部门编号")
  private String zwzgzdBmbh;

  /** DZ */
  @Excel(name = "DZ")
  private String zwzgzdDz;

  /** DH */
  private String zwzgzdDh;

  /** YB */
  private String zwzgzdYb;

  /** XYXE */
  private BigDecimal zwzgzdXyxe;

  /** LBBH */
  private String zwzgzdLbbh;

  /** 拼音加密 */
  private String zwzgzdPyjm;

  /** DYTMH */
  private String zwzgzdDytmh;

  /** SJHM */
  private String zwzgzdSjhm;

  /** 邮箱 */
  private String zwzgzdEmail;

  /** CZYBH */
  private String zwzgzdCzybh;

  /** XYDJ */
  private String zwzgzdXydj;

  /** $column.columnComment */
  private String zwzgzdYwy;

  /** $column.columnComment */
  private String zwzgzdSffc;

  public void setZwzgzdZgbh(String zwzgzdZgbh)
  {
    this.zwzgzdZgbh = zwzgzdZgbh;
  }

  public String getZwzgzdZgbh()
  {
    return zwzgzdZgbh;
  }
  public void setZwzgzdZgxm(String zwzgzdZgxm)
  {
    this.zwzgzdZgxm = zwzgzdZgxm;
  }

  public String getZwzgzdZgxm()
  {
    return zwzgzdZgxm;
  }
  public void setZwzgzdBmbh(String zwzgzdBmbh)
  {
    this.zwzgzdBmbh = zwzgzdBmbh;
  }

  public String getZwzgzdBmbh()
  {
    return zwzgzdBmbh;
  }
  public void setZwzgzdDz(String zwzgzdDz)
  {
    this.zwzgzdDz = zwzgzdDz;
  }

  public String getZwzgzdDz()
  {
    return zwzgzdDz;
  }
  public void setZwzgzdDh(String zwzgzdDh)
  {
    this.zwzgzdDh = zwzgzdDh;
  }

  public String getZwzgzdDh()
  {
    return zwzgzdDh;
  }
  public void setZwzgzdYb(String zwzgzdYb)
  {
    this.zwzgzdYb = zwzgzdYb;
  }

  public String getZwzgzdYb()
  {
    return zwzgzdYb;
  }
  public void setZwzgzdXyxe(BigDecimal zwzgzdXyxe)
  {
    this.zwzgzdXyxe = zwzgzdXyxe;
  }

  public BigDecimal getZwzgzdXyxe()
  {
    return zwzgzdXyxe;
  }
  public void setZwzgzdLbbh(String zwzgzdLbbh)
  {
    this.zwzgzdLbbh = zwzgzdLbbh;
  }

  public String getZwzgzdLbbh()
  {
    return zwzgzdLbbh;
  }
  public void setZwzgzdPyjm(String zwzgzdPyjm)
  {
    this.zwzgzdPyjm = zwzgzdPyjm;
  }

  public String getZwzgzdPyjm()
  {
    return zwzgzdPyjm;
  }
  public void setZwzgzdDytmh(String zwzgzdDytmh)
  {
    this.zwzgzdDytmh = zwzgzdDytmh;
  }

  public String getZwzgzdDytmh()
  {
    return zwzgzdDytmh;
  }
  public void setZwzgzdSjhm(String zwzgzdSjhm)
  {
    this.zwzgzdSjhm = zwzgzdSjhm;
  }

  public String getZwzgzdSjhm()
  {
    return zwzgzdSjhm;
  }
  public void setZwzgzdEmail(String zwzgzdEmail)
  {
    this.zwzgzdEmail = zwzgzdEmail;
  }

  public String getZwzgzdEmail()
  {
    return zwzgzdEmail;
  }
  public void setZwzgzdCzybh(String zwzgzdCzybh)
  {
    this.zwzgzdCzybh = zwzgzdCzybh;
  }

  public String getZwzgzdCzybh()
  {
    return zwzgzdCzybh;
  }
  public void setZwzgzdXydj(String zwzgzdXydj)
  {
    this.zwzgzdXydj = zwzgzdXydj;
  }

  public String getZwzgzdXydj()
  {
    return zwzgzdXydj;
  }
  public void setZwzgzdYwy(String zwzgzdYwy)
  {
    this.zwzgzdYwy = zwzgzdYwy;
  }

  public String getZwzgzdYwy()
  {
    return zwzgzdYwy;
  }
  public void setZwzgzdSffc(String zwzgzdSffc)
  {
    this.zwzgzdSffc = zwzgzdSffc;
  }

  public String getZwzgzdSffc()
  {
    return zwzgzdSffc;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
        .append("zwzgzdZgbh", getZwzgzdZgbh())
        .append("zwzgzdZgxm", getZwzgzdZgxm())
        .append("zwzgzdBmbh", getZwzgzdBmbh())
        .append("zwzgzdDz", getZwzgzdDz())
        .append("zwzgzdDh", getZwzgzdDh())
        .append("zwzgzdYb", getZwzgzdYb())
        .append("zwzgzdXyxe", getZwzgzdXyxe())
        .append("zwzgzdLbbh", getZwzgzdLbbh())
        .append("zwzgzdPyjm", getZwzgzdPyjm())
        .append("zwzgzdDytmh", getZwzgzdDytmh())
        .append("zwzgzdSjhm", getZwzgzdSjhm())
        .append("zwzgzdEmail", getZwzgzdEmail())
        .append("zwzgzdCzybh", getZwzgzdCzybh())
        .append("zwzgzdXydj", getZwzgzdXydj())
        .append("zwzgzdYwy", getZwzgzdYwy())
        .append("zwzgzdSffc", getZwzgzdSffc())
        .toString();
  }
}
