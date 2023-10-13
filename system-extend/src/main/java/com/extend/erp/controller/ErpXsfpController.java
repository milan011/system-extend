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
import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.service.IErpXsfpService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售发票Controller
 * 
 * @author wcg
 * @date 2023-10-13
 */
@RestController
@RequestMapping("/erp/xsfp")
public class ErpXsfpController extends BaseController
{
    @Autowired
    private IErpXsfpService erpXsfpService;

    /**
     * 查询销售发票列表
     */
    @PreAuthorize("@ss.hasPermi('erp:xsfp:list')")
    @GetMapping("/list")
    public TableDataInfo list(ErpXsfp erpXsfp)
    {
        startPage();
        List<ErpXsfp> list = erpXsfpService.selectErpXsfpList(erpXsfp);
        return getDataTable(list);
    }

    /**
     * 导出销售发票列表
     */
    @PreAuthorize("@ss.hasPermi('erp:xsfp:export')")
    @Log(title = "销售发票", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ErpXsfp erpXsfp)
    {
        List<ErpXsfp> list = erpXsfpService.selectErpXsfpList(erpXsfp);
        ExcelUtil<ErpXsfp> util = new ExcelUtil<ErpXsfp>(ErpXsfp.class);
        util.exportExcel(response, list, "销售发票数据");
    }

    /**
     * 获取销售发票详细信息
     */
    @PreAuthorize("@ss.hasPermi('erp:xsfp:query')")
    @GetMapping(value = "/{xsfpFpls}")
    public AjaxResult getInfo(@PathVariable("xsfpFpls") String xsfpFpls)
    {
        return success(erpXsfpService.selectErpXsfpByXsfpFpls(xsfpFpls));
    }

    /**
     * 新增销售发票
     */
    @PreAuthorize("@ss.hasPermi('erp:xsfp:add')")
    @Log(title = "销售发票", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ErpXsfp erpXsfp)
    {
        return toAjax(erpXsfpService.insertErpXsfp(erpXsfp));
    }

    /**
     * 修改销售发票
     */
    @PreAuthorize("@ss.hasPermi('erp:xsfp:edit')")
    @Log(title = "销售发票", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ErpXsfp erpXsfp)
    {
        return toAjax(erpXsfpService.updateErpXsfp(erpXsfp));
    }

    /**
     * 删除销售发票
     */
    @PreAuthorize("@ss.hasPermi('erp:xsfp:remove')")
    @Log(title = "销售发票", businessType = BusinessType.DELETE)
	@DeleteMapping("/{xsfpFplss}")
    public AjaxResult remove(@PathVariable String[] xsfpFplss)
    {
        return toAjax(erpXsfpService.deleteErpXsfpByXsfpFplss(xsfpFplss));
    }
}
