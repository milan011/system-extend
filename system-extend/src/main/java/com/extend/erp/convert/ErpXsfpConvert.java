package com.extend.erp.convert;

import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.domain.ErpXsfpImport;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ErpXsfpConvert {
  ErpXsfpConvert INSTANCE = Mappers.getMapper(ErpXsfpConvert.class);

  ErpXsfp convert(ErpXsfpImport bean);
}
