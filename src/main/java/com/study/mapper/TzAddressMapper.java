package com.study.mapper;

import com.study.entity.TzAddress;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzAddressMapper extends Mapper<TzAddress>, SelectByIdsMapper<TzAddress> {
}