package com.study.mapper;

import com.study.entity.TzPermissionGroup;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzPermissionGroupMapper extends Mapper<TzPermissionGroup>, SelectByIdsMapper<TzPermissionGroup> {
}