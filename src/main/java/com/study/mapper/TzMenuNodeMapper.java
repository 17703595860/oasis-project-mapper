package com.study.mapper;

import com.study.entity.TzMenuNode;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzMenuNodeMapper extends Mapper<TzMenuNode>, SelectByIdsMapper<TzMenuNode> {
}