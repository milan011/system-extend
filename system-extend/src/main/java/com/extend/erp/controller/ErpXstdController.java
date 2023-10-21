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
import com.extend.erp.domain.ErpXstd;
import com.extend.erp.service.IErpXstdService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售提单Controller
 * 
 * @author wcg
 * @date 2023-10-21
 */
@RestController
@RequestMapping("/erp/xstd")
public class ErpXstdController extends BaseController
{
    @Autowired
    private IErpXstdService erpXstdService;

    /**
     * 查询销售提单列表
     */
    @PreAuthorize("@ss.hasPermi('erp:xstd:list')")
    @GetMapping("/list")
    public TableDataInfo list(ErpXstd erpXstd)
    {
        startPage();
        List<ErpXstd> list = erpXstdService.selectErpXstdList(erpXstd);
        return getDataTable(list);
    }

    /**
     * 导出销售提单列表
     */
    @PreAuthorize("@ss.hasPermi('erp:xstd:export')")
    @Log(title = "销售提单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ErpXstd erpXstd)
    {
        List<ErpXstd> list = erpXstdService.selectErpXstdList(erpXstd);
        ExcelUtil<ErpXstd> util = new ExcelUtil<ErpXstd>(ErpXstd.class);
        util.exportExcel(response, list, "销售提单数据");
    }

    /**
     * 获取销售提单详细信息
     */
    @PreAuthorize("@ss.hasPermi('erp:xstd:query')")
    @GetMapping(value = "/{xstdTdls}")
    public AjaxResult getInfo(@PathVariable("xstdTdls") String xstdTdls)
    {
        return success(erpXstdService.selectErpXstdByXstdTdls(xstdTdls));
    }

    /**
     * 新增销售提单
     */
    @PreAuthorize("@ss.hasPermi('erp:xstd:add')")
    @Log(title = "销售提单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ErpXstd erpXstd)
    {
        return toAjax(erpXstdService.insertErpXstd(erpXstd));
    }

    /**
     * 修改销售提单
     */
    @PreAuthorize("@ss.hasPermi('erp:xstd:edit')")
    @Log(title = "销售提单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ErpXstd erpXstd)
    {
        return toAjax(erpXstdService.updateErpXstd(erpXstd));
    }

    /**
     * 删除销售提单
     */
    @PreAuthorize("@ss.hasPermi('erp:xstd:remove')")
    @Log(title = "销售提单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{xstdTdlss}")
    public AjaxResult remove(@PathVariable String[] xstdTdlss)
    {
        return toAjax(erpXstdService.deleteErpXstdByXstdTdlss(xstdTdlss));
    }
}
