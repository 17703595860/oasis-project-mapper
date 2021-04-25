package com.study.mapper;

import com.study.entity.TzComponent;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzComponentMapper extends Mapper<TzComponent>, SelectByIdsMapper<TzComponent> {
}