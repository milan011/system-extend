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
import com.extend.erp.domain.ErpZwwldw;
import com.extend.erp.service.IErpZwwldwService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 往来单位Controller
 *
 * @author wcg
 * @date 2023-10-19
 */
@RestController
@RequestMapping("/erp/zwwldw")
public class ErpZwwldwController extends BaseController
{
  @Autowired
  private IErpZwwldwService erpZwwldwService;

  /**
   * 查询往来单位列表
   */
  @PreAuthorize("@ss.hasPermi('erp:zwwldw:list')")
  @GetMapping("/list")
  public TableDataInfo list(ErpZwwldw erpZwwldw)
  {
    startPage();
    List<ErpZwwldw> list = erpZwwldwService.selectErpZwwldwList(erpZwwldw);
    return getDataTable(list);
  }

  /**
   * 导出往来单位列表
   */
  @PreAuthorize("@ss.hasPermi('erp:zwwldw:export')")
  @Log(title = "往来单位", businessType = BusinessType.EXPORT)
  @PostMapping("/export")
  public void export(HttpServletResponse response, ErpZwwldw erpZwwldw)
  {
    List<ErpZwwldw> list = erpZwwldwService.selectErpZwwldwList(erpZwwldw);
    ExcelUtil<ErpZwwldw> util = new ExcelUtil<ErpZwwldw>(ErpZwwldw.class);
    util.exportExcel(response, list, "往来单位数据");
  }

  /**
   * 获取往来单位详细信息
   */
  @PreAuthorize("@ss.hasPermi('erp:zwwldw:query')")
  @GetMapping(value = "/{zwwldwDwbh}")
  public AjaxResult getInfo(@PathVariable("zwwldwDwbh") String zwwldwDwbh)
  {
    return success(erpZwwldwService.selectErpZwwldwByZwwldwDwbh(zwwldwDwbh));
  }

  /**
   * 新增往来单位
   */
  @PreAuthorize("@ss.hasPermi('erp:zwwldw:add')")
  @Log(title = "往来单位", businessType = BusinessType.INSERT)
  @PostMapping
  public AjaxResult add(@RequestBody ErpZwwldw erpZwwldw)
  {
    return toAjax(erpZwwldwService.insertErpZwwldw(erpZwwldw));
  }

  /**
   * 修改往来单位
   */
  @PreAuthorize("@ss.hasPermi('erp:zwwldw:edit')")
  @Log(title = "往来单位", businessType = BusinessType.UPDATE)
  @PutMapping
  public AjaxResult edit(@RequestBody ErpZwwldw erpZwwldw)
  {
    return toAjax(erpZwwldwService.updateErpZwwldw(erpZwwldw));
  }

  /**
   * 删除往来单位
   */
  @PreAuthorize("@ss.hasPermi('erp:zwwldw:remove')")
  @Log(title = "往来单位", businessType = BusinessType.DELETE)
  @DeleteMapping("/{zwwldwDwbhs}")
  public AjaxResult remove(@PathVariable String[] zwwldwDwbhs)
  {
    return toAjax(erpZwwldwService.deleteErpZwwldwByZwwldwDwbhs(zwwldwDwbhs));
  }
}
