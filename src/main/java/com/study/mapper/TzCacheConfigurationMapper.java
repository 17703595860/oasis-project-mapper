package com.study.mapper;

import com.study.entity.TzCacheConfiguration;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzCacheConfigurationMapper extends Mapper<TzCacheConfiguration>, SelectByIdsMapper<TzCacheConfiguration> {
}