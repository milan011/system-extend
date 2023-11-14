package com.extend.erp.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.extend.erp.domain.ErpXsddmx;
import com.extend.erp.service.IErpXsddmxService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售订单明细Controller
 *
 * @author ruoyi
 * @date 2023-11-14
 */
@RestController
@RequestMapping("/erp/xsddmx")
public class ErpXsddmxController extends BaseController
{
  @Autowired
  private IErpXsddmxService erpXsddmxService;

  /**
   * 查询销售订单明细列表
   */
  @PreAuthorize("@ss.hasPermi('erp:xsddmx:list')")
  @GetMapping("/list")
  public TableDataInfo list(ErpXsddmx erpXsddmx)
  {
    startPage();
    List<ErpXsddmx> list = erpXsddmxService.selectErpXsddmxList(erpXsddmx);
    return getDataTable(list);
  }

  /**
   * 导出销售订单明细列表
   */
  @PreAuthorize("@ss.hasPermi('erp:xsddmx:export')")
  @Log(title = "销售订单明细", businessType = BusinessType.EXPORT)
  @PostMapping("/export")
  public void export(HttpServletResponse response, ErpXsddmx erpXsddmx)
  {
    List<ErpXsddmx> list = erpXsddmxService.selectErpXsddmxList(erpXsddmx);
    ExcelUtil<ErpXsddmx> util = new ExcelUtil<ErpXsddmx>(ErpXsddmx.class);
    util.exportExcel(response, list, "销售订单明细数据");
  }

  /**
   * 获取销售订单明细详细信息
   */
  @PreAuthorize("@ss.hasPermi('erp:xsddmx:query')")
  @GetMapping(value = "/{xsddmxDdls}")
  public AjaxResult getInfo(@PathVariable("xsddmxDdls") String xsddmxDdls)
  {
    return success(erpXsddmxService.selectErpXsddmxByXsddmxDdls(xsddmxDdls));
  }

  /**
   * 新增销售订单明细
   */
  @PreAuthorize("@ss.hasPermi('erp:xsddmx:add')")
  @Log(title = "销售订单明细", businessType = BusinessType.INSERT)
  @PostMapping
  public AjaxResult add(@RequestBody ErpXsddmx erpXsddmx)
  {
    return toAjax(erpXsddmxService.insertErpXsddmx(erpXsddmx));
  }

  /**
   * 修改销售订单明细
   */
  @PreAuthorize("@ss.hasPermi('erp:xsddmx:edit')")
  @Log(title = "销售订单明细", businessType = BusinessType.UPDATE)
  @PutMapping
  public AjaxResult edit(@RequestBody ErpXsddmx erpXsddmx)
  {
    return toAjax(erpXsddmxService.updateErpXsddmx(erpXsddmx));
  }

  /**
   * 删除销售订单明细
   */
  @PreAuthorize("@ss.hasPermi('erp:xsddmx:remove')")
  @Log(title = "销售订单明细", businessType = BusinessType.DELETE)
  @DeleteMapping("/{xsddmxDdlss}")
  public AjaxResult remove(@PathVariable String[] xsddmxDdlss)
  {
    return toAjax(erpXsddmxService.deleteErpXsddmxByXsddmxDdlss(xsddmxDdlss));
  }
}
