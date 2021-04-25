package com.study.mapper;

import com.study.entity.TzOpportunity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzOpportunityMapper extends Mapper<TzOpportunity>, SelectByIdsMapper<TzOpportunity> {
}