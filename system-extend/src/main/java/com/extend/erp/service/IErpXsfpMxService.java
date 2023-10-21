package com.extend.erp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.extend.erp.domain.ErpXsfpmx;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IErpXsfpMxService extends IService<ErpXsfpmx> {
  public List<ErpXsfpmx> selectErpXsfpList(String xsfpLs);
}
