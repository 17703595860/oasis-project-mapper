package com.study.mapper;

import com.study.entity.TzHistoryMapping;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzHistoryMappingMapper extends Mapper<TzHistoryMapping>, SelectByIdsMapper<TzHistoryMapping> {
}