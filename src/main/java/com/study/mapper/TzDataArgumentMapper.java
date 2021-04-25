package com.study.mapper;

import com.study.entity.TzDataArgument;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzDataArgumentMapper extends Mapper<TzDataArgument>, SelectByIdsMapper<TzDataArgument> {
}