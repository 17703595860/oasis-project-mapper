package com.study.mapper;

import com.study.entity.TzField;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzFieldMapper extends Mapper<TzField>, SelectByIdsMapper<TzField> {
}