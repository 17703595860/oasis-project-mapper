package com.study.mapper;

import com.study.entity.TzJoin;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzJoinMapper extends Mapper<TzJoin>, SelectByIdsMapper<TzJoin> {
}