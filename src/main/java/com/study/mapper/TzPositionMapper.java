package com.study.mapper;

import com.study.entity.TzPosition;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzPositionMapper extends Mapper<TzPosition>, SelectByIdsMapper<TzPosition> {
}