package com.study.mapper;

import com.study.entity.TzUser;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzUserMapper extends Mapper<TzUser>, SelectByIdsMapper<TzUser> {
}