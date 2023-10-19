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
import com.extend.erp.domain.ErpZwzgzd;
import com.extend.erp.service.IErpZwzgzdService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 人员Controller
 *
 * @author wcg
 * @date 2023-10-19
 */
@RestController
@RequestMapping("/erp/zwzgzd")
public class ErpZwzgzdController extends BaseController
{
  @Autowired
  private IErpZwzgzdService erpZwzgzdService;

  /**
   * 查询人员列表
   */
  @PreAuthorize("@ss.hasPermi('erp:zwzgzd:list')")
  @GetMapping("/list")
  public TableDataInfo list(ErpZwzgzd erpZwzgzd)
  {
    startPage();
    List<ErpZwzgzd> list = erpZwzgzdService.selectErpZwzgzdList(erpZwzgzd);
    return getDataTable(list);
  }

  /**
   * 导出人员列表
   */
  @PreAuthorize("@ss.hasPermi('erp:zwzgzd:export')")
  @Log(title = "人员", businessType = BusinessType.EXPORT)
  @PostMapping("/export")
  public void export(HttpServletResponse response, ErpZwzgzd erpZwzgzd)
  {
    List<ErpZwzgzd> list = erpZwzgzdService.selectErpZwzgzdList(erpZwzgzd);
    ExcelUtil<ErpZwzgzd> util = new ExcelUtil<ErpZwzgzd>(ErpZwzgzd.class);
    util.exportExcel(response, list, "人员数据");
  }

  /**
   * 获取人员详细信息
   */
  @PreAuthorize("@ss.hasPermi('erp:zwzgzd:query')")
  @GetMapping(value = "/{zwzgzdZgbh}")
  public AjaxResult getInfo(@PathVariable("zwzgzdZgbh") String zwzgzdZgbh)
  {
    return success(erpZwzgzdService.selectErpZwzgzdByZwzgzdZgbh(zwzgzdZgbh));
  }

  /**
   * 新增人员
   */
  @PreAuthorize("@ss.hasPermi('erp:zwzgzd:add')")
  @Log(title = "人员", businessType = BusinessType.INSERT)
  @PostMapping
  public AjaxResult add(@RequestBody ErpZwzgzd erpZwzgzd)
  {
    return toAjax(erpZwzgzdService.insertErpZwzgzd(erpZwzgzd));
  }

  /**
   * 修改人员
   */
  @PreAuthorize("@ss.hasPermi('erp:zwzgzd:edit')")
  @Log(title = "人员", businessType = BusinessType.UPDATE)
  @PutMapping
  public AjaxResult edit(@RequestBody ErpZwzgzd erpZwzgzd)
  {
    return toAjax(erpZwzgzdService.updateErpZwzgzd(erpZwzgzd));
  }

  /**
   * 删除人员
   */
  @PreAuthorize("@ss.hasPermi('erp:zwzgzd:remove')")
  @Log(title = "人员", businessType = BusinessType.DELETE)
  @DeleteMapping("/{zwzgzdZgbhs}")
  public AjaxResult remove(@PathVariable String[] zwzgzdZgbhs)
  {
    return toAjax(erpZwzgzdService.deleteErpZwzgzdByZwzgzdZgbhs(zwzgzdZgbhs));
  }
}
