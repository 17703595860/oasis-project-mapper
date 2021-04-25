package com.study.mapper;

import com.study.entity.TzPage;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzPageMapper extends Mapper<TzPage>, SelectByIdsMapper<TzPage> {
}