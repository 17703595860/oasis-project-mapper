package com.study.mapper;

import com.study.entity.TzAppClass;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzAppClassMapper extends Mapper<TzAppClass>, SelectByIdsMapper<TzAppClass> {
}