package com.extend.erp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.extend.erp.domain.ErpXsfpmx;
import com.extend.erp.mapper.ErpXsfpMapper;
import com.extend.erp.mapper.ErpXsfpMxMapper;
import com.extend.erp.service.IErpXsfpMxService;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DataSource(value = DataSourceType.SLAVE)
public class EprXsfpMxServiceImpl extends ServiceImpl<ErpXsfpMxMapper, ErpXsfpmx> implements IErpXsfpMxService {

  @Autowired
  private ErpXsfpMxMapper erpXsfpMxMapper;
  @Override
  public List<ErpXsfpmx> selectErpXsfpList(String xsfpLs) {
    return erpXsfpMxMapper.selectListByXsfpLs(xsfpLs);
  }
}
