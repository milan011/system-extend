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
import com.extend.erp.domain.ErpLsnbbm;
import com.extend.erp.service.IErpLsnbbmService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 流水内部编码Controller
 * 
 * @author wcg
 * @date 2023-10-18
 */
@RestController
@RequestMapping("/erp/lsnbbm")
public class ErpLsnbbmController extends BaseController
{
    @Autowired
    private IErpLsnbbmService erpLsnbbmService;

    /**
     * 查询流水内部编码列表
     */
    @PreAuthorize("@ss.hasPermi('erp:lsnbbm:list')")
    @GetMapping("/list")
    public TableDataInfo list(ErpLsnbbm erpLsnbbm)
    {
        startPage();
        List<ErpLsnbbm> list = erpLsnbbmService.selectErpLsnbbmList(erpLsnbbm);
        return getDataTable(list);
    }

    /**
     * 导出流水内部编码列表
     */
    @PreAuthorize("@ss.hasPermi('erp:lsnbbm:export')")
    @Log(title = "流水内部编码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ErpLsnbbm erpLsnbbm)
    {
        List<ErpLsnbbm> list = erpLsnbbmService.selectErpLsnbbmList(erpLsnbbm);
        ExcelUtil<ErpLsnbbm> util = new ExcelUtil<ErpLsnbbm>(ErpLsnbbm.class);
        util.exportExcel(response, list, "流水内部编码数据");
    }

    /**
     * 获取流水内部编码详细信息
     */
    @PreAuthorize("@ss.hasPermi('erp:lsnbbm:query')")
    @GetMapping(value = "/{lsnbbmXtbh}")
    public AjaxResult getInfo(@PathVariable("lsnbbmXtbh") String lsnbbmXtbh)
    {
        return success(erpLsnbbmService.selectErpLsnbbmByLsnbbmNmbh(lsnbbmXtbh));
    }

    /**
     * 新增流水内部编码
     */
    @PreAuthorize("@ss.hasPermi('erp:lsnbbm:add')")
    @Log(title = "流水内部编码", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ErpLsnbbm erpLsnbbm)
    {
        return toAjax(erpLsnbbmService.insertErpLsnbbm(erpLsnbbm));
    }

    /**
     * 修改流水内部编码
     */
    @PreAuthorize("@ss.hasPermi('erp:lsnbbm:edit')")
    @Log(title = "流水内部编码", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ErpLsnbbm erpLsnbbm)
    {
        return toAjax(erpLsnbbmService.updateErpLsnbbm(erpLsnbbm));
    }

    /**
     * 删除流水内部编码
     */
    @PreAuthorize("@ss.hasPermi('erp:lsnbbm:remove')")
    @Log(title = "流水内部编码", businessType = BusinessType.DELETE)
	@DeleteMapping("/{lsnbbmXtbhs}")
    public AjaxResult remove(@PathVariable String[] lsnbbmXtbhs)
    {
        return toAjax(erpLsnbbmService.deleteErpLsnbbmByLsnbbmXtbhs(lsnbbmXtbhs));
    }
}
