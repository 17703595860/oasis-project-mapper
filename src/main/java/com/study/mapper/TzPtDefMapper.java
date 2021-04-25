package com.study.mapper;

import com.study.entity.TzPtDef;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzPtDefMapper extends Mapper<TzPtDef>, SelectByIdsMapper<TzPtDef> {
}