package com.study.mapper;

import com.study.entity.TzPersonAddress;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzPersonAddressMapper extends Mapper<TzPersonAddress>, SelectByIdsMapper<TzPersonAddress> {
}