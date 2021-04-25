package com.study.mapper;

import com.study.entity.TzPermission;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzPermissionMapper extends Mapper<TzPermission>, SelectByIdsMapper<TzPermission> {
}