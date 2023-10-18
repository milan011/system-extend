package com.extend.erp.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.extend.erp.domain.ErpLsnbbm;
import com.extend.erp.domain.ErpWlbgmx;

/**
 * 流水内部编码Mapper接口
 *
 * @author wcg
 * @date 2023-10-18
 */
public interface ErpLsnbbmMapper extends BaseMapper<ErpLsnbbm>
{
    /**
     * 查询流水内部编码
     * 
     * @param lsnbbmXtbh 流水内部编码主键
     * @return 流水内部编码
     */
    public ErpLsnbbm selectErpLsnbbmByLsnbbmNmbh(String lsnbbmXtbh);

    /**
     * 查询流水内部编码列表
     * 
     * @param erpLsnbbm 流水内部编码
     * @return 流水内部编码集合
     */
    public List<ErpLsnbbm> selectErpLsnbbmList(ErpLsnbbm erpLsnbbm);

    /**
     * 新增流水内部编码
     * 
     * @param erpLsnbbm 流水内部编码
     * @return 结果
     */
    public int insertErpLsnbbm(ErpLsnbbm erpLsnbbm);

    /**
     * 修改流水内部编码
     * 
     * @param erpLsnbbm 流水内部编码
     * @return 结果
     */
    public int updateErpLsnbbm(ErpLsnbbm erpLsnbbm);

    /**
     * 删除流水内部编码
     * 
     * @param lsnbbmXtbh 流水内部编码主键
     * @return 结果
     */
    public int deleteErpLsnbbmByLsnbbmXtbh(String lsnbbmXtbh);

    /**
     * 批量删除流水内部编码
     * 
     * @param lsnbbmXtbhs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteErpLsnbbmByLsnbbmXtbhs(String[] lsnbbmXtbhs);
}
