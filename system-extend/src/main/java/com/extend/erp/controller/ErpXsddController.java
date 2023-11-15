package com.extend.erp.controller;

import java.util.List;
import java.util.Map;
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
import com.extend.erp.domain.ErpXsdd;
import com.extend.erp.service.IErpXsddService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售订单Controller
 *
 * @author wcg
 * @date 2023-11-14
 */
@RestController
@RequestMapping("/erp/xsdd")
public class ErpXsddController extends BaseController
{
  @Autowired
  private IErpXsddService erpXsddService;

  /**
   * 查询销售订单列表
   */
  @PreAuthorize("@ss.hasPermi('erp:xsdd:list')")
  @GetMapping("/list")
  public TableDataInfo list(ErpXsdd erpXsdd)
  {
    startPage();
    List<ErpXsdd> list = erpXsddService.selectErpXsddList(erpXsdd);
    return getDataTable(list);
  }

  /**
   * 导出销售订单列表
   */
  @PreAuthorize("@ss.hasPermi('erp:xsdd:export')")
  @Log(title = "销售订单", businessType = BusinessType.EXPORT)
  @PostMapping("/export")
  public void export(HttpServletResponse response, ErpXsdd erpXsdd)
  {
    List<ErpXsdd> list = erpXsddService.selectErpXsddList(erpXsdd);
    ExcelUtil<ErpXsdd> util = new ExcelUtil<ErpXsdd>(ErpXsdd.class);
    util.exportExcel(response, list, "销售订单数据");
  }

  /**
   * 获取销售订单详细信息
   */
  @PreAuthorize("@ss.hasPermi('erp:xsdd:query')")
  @GetMapping(value = "/{xsddDdls}")
  public AjaxResult getInfo(@PathVariable("xsddDdls") String xsddDdls)
  {
    return success(erpXsddService.selectErpXsddByXsddDdls(xsddDdls));
  }

  /**
   * 新增销售订单
   */
  @PreAuthorize("@ss.hasPermi('erp:xsdd:add')")
  @Log(title = "销售订单", businessType = BusinessType.INSERT)
  @PostMapping
  public AjaxResult add(@RequestBody ErpXsdd erpXsdd)
  {
    return toAjax(erpXsddService.insertErpXsdd(erpXsdd));
  }

  /**
   * 新增销售订单接口(销售系统调用)
   */
  @PreAuthorize("@ss.hasPermi('erp:xsdd:add')")
  @Log(title = "销售订单新增接口", businessType = BusinessType.INSERT)
  @PostMapping("/addByOms")
  public AjaxResult addByOms(@RequestBody Map<String, Object> map)
  {
    return toAjax(erpXsddService.createXsddByOms(map));
  }
  /**
   * 修改销售订单
   */
  @PreAuthorize("@ss.hasPermi('erp:xsdd:edit')")
  @Log(title = "销售订单", businessType = BusinessType.UPDATE)
  @PutMapping
  public AjaxResult edit(@RequestBody ErpXsdd erpXsdd)
  {
    return toAjax(erpXsddService.updateErpXsdd(erpXsdd));
  }

  /**
   * 删除销售订单
   */
  @PreAuthorize("@ss.hasPermi('erp:xsdd:remove')")
  @Log(title = "销售订单", businessType = BusinessType.DELETE)
  @DeleteMapping("/{xsddDdlss}")
  public AjaxResult remove(@PathVariable String[] xsddDdlss)
  {
    return toAjax(erpXsddService.deleteErpXsddByXsddDdlss(xsddDdlss));
  }
}
