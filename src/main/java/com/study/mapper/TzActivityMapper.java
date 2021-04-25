package com.study.mapper;

import com.study.entity.TzActivity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzActivityMapper extends Mapper<TzActivity>, SelectByIdsMapper<TzActivity> {
}