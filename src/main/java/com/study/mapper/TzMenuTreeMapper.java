package com.study.mapper;

import com.study.entity.TzMenuTree;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzMenuTreeMapper extends Mapper<TzMenuTree>, SelectByIdsMapper<TzMenuTree> {
}