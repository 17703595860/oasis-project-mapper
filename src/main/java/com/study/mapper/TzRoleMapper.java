package com.study.mapper;

import com.study.entity.TzRole;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzRoleMapper extends Mapper<TzRole>, SelectByIdsMapper<TzRole> {
}