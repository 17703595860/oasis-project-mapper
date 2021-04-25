package com.study.mapper;

import com.study.entity.TzBmentity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzBmentityMapper extends Mapper<TzBmentity>, SelectByIdsMapper<TzBmentity> {
}