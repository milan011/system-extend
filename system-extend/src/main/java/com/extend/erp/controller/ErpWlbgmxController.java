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
import com.extend.erp.domain.ErpWlbgmx;
import com.extend.erp.service.IErpWlbgmxService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料Controller
 * 
 * @author wcg
 * @date 2023-07-11
 */
@RestController
@RequestMapping("/erp/wlbgmx")
public class ErpWlbgmxController extends BaseController
{
    @Autowired
    private IErpWlbgmxService erpWlbgmxService;

    /**
     * 查询物料列表
     */
    @PreAuthorize("@ss.hasPermi('erp:wlbgmx:list')")
    @GetMapping("/list")
    public TableDataInfo list(ErpWlbgmx erpWlbgmx)
    {
        startPage();
        List<ErpWlbgmx> list = erpWlbgmxService.selectErpWlbgmxList(erpWlbgmx);
        return getDataTable(list);
    }

    /**
     * 导出物料列表
     */
    @PreAuthorize("@ss.hasPermi('erp:wlbgmx:export')")
    @Log(title = "物料", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ErpWlbgmx erpWlbgmx)
    {
        List<ErpWlbgmx> list = erpWlbgmxService.selectErpWlbgmxList(erpWlbgmx);
        ExcelUtil<ErpWlbgmx> util = new ExcelUtil<ErpWlbgmx>(ErpWlbgmx.class);
        util.exportExcel(response, list, "物料数据");
    }

    /**
     * 获取物料详细信息
     */
    @PreAuthorize("@ss.hasPermi('erp:wlbgmx:query')")
    @GetMapping(value = "/{WLBH}")
    public AjaxResult getInfo(@PathVariable("WLBH") String WLBH)
    {
        return success(erpWlbgmxService.selectErpWlbgmxByWLBH(WLBH));
    }

    /**
     * 新增物料
     */
    @PreAuthorize("@ss.hasPermi('erp:wlbgmx:add')")
    @Log(title = "物料", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ErpWlbgmx erpWlbgmx)
    {
        return toAjax(erpWlbgmxService.insertErpWlbgmx(erpWlbgmx));
    }

    /**
     * 修改物料
     */
    @PreAuthorize("@ss.hasPermi('erp:wlbgmx:edit')")
    @Log(title = "物料", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ErpWlbgmx erpWlbgmx)
    {
        return toAjax(erpWlbgmxService.updateErpWlbgmx(erpWlbgmx));
    }

    /**
     * 删除物料
     */
    @PreAuthorize("@ss.hasPermi('erp:wlbgmx:remove')")
    @Log(title = "物料", businessType = BusinessType.DELETE)
	@DeleteMapping("/{WLBHs}")
    public AjaxResult remove(@PathVariable String[] WLBHs)
    {
        return toAjax(erpWlbgmxService.deleteErpWlbgmxByWLBHs(WLBHs));
    }
}
