package com.study.mapper;

import com.study.entity.TzTest;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzTestMapper extends Mapper<TzTest>, SelectByIdsMapper<TzTest> {
}