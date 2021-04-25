package com.study.mapper;

import com.study.entity.TzFileStorageType;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzFileStorageTypeMapper extends Mapper<TzFileStorageType>, SelectByIdsMapper<TzFileStorageType> {
}