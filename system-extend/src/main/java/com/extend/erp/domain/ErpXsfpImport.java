package com.extend.erp.domain;

import com.ruoyi.common.annotation.Excel;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;


@Data
public class ErpXsfpImport {
  @Excel(name = "发票编号")
  private String xsfpFpbh;

  /** 发票种类 */
  @Excel(name = "发票种类")
  private String xsfpZlbh;


  /** 售达客户名称 */
  @Excel(name = "售达客户名称")
  private String xsfpShdkhmc;

  /** 部门编号 */
  @Excel(name = "部门编号")
  private String xsfpBmbh;

  /** 人员姓名 */
  @Excel(name = "人员姓名")
  private String xsfpRyxm;

  /** 物料编号 */
  @Excel(name = "物料编号")
  private String xsfpmxWlbh;

  /** 主数量 */
  @Excel(name = "主数量")
  private BigDecimal xsfpmxZsl;

  /** 开票价 */
  @Excel(name = "开票价")
  private BigDecimal xsfpmxYzhsj;

  /** 含税金额 */
  @Excel(name = "含税金额")
  private BigDecimal xsfpmxYhse;

  public String getXsfpZlbh() {
    return xsfpZlbh;
  }

  public void setXsfpZlbh(String xsfpZlbh) {
    this.xsfpZlbh = xsfpZlbh;
  }

  public String getXsfpShdkhmc() {
    return xsfpShdkhmc;
  }

  public void setXsfpShdkhmc(String xsfpShdkhmc) {
    this.xsfpShdkhmc = xsfpShdkhmc;
  }

  public String getXsfpBmbh() {
    return xsfpBmbh;
  }

  public void setXsfpBmbh(String xsfpBmbh) {
    this.xsfpBmbh = xsfpBmbh;
  }

  public String getXsfpRyxm() {
    return xsfpRyxm;
  }

  public void setXsfpRyxm(String xsfpRyxm) {
    this.xsfpRyxm = xsfpRyxm;
  }

  public String getWwsddf() {
    return xsfpBmbh;
  }

  public void setWwsddf(String xsfpBmbh) {
    this.xsfpBmbh = xsfpBmbh;
  }

  public String getXsfpFpbh() {
    return xsfpFpbh;
  }

  public void setXsfpFpbh(String xsfpFpbh) {
    this.xsfpFpbh = xsfpFpbh;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("xsfpFpbh", getXsfpFpbh())
        .append("xsfpZlbh", getXsfpZlbh())
        .append("xsfpShdkhmc", getXsfpShdkhmc())
        .append("xsfpBmbh", getXsfpBmbh())
        .append("xsfpRyxm", getXsfpRyxm())
        .toString();
  }
}
