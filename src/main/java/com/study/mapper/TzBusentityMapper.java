package com.study.mapper;

import com.study.entity.TzBusentity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzBusentityMapper extends Mapper<TzBusentity>, SelectByIdsMapper<TzBusentity> {
}