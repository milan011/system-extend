package com.extend.erp.convert;

import com.extend.erp.domain.ErpXsfp;
import com.extend.erp.domain.ErpXsfpImport;
import com.extend.erp.domain.ErpXsfpmx;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ErpXsfpMxConvert {
  ErpXsfpMxConvert INSTANCE = Mappers.getMapper(ErpXsfpMxConvert.class);
  ErpXsfpmx convert(ErpXsfpImport bean);

}
