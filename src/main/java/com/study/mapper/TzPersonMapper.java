package com.study.mapper;

import com.study.entity.TzPerson;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzPersonMapper extends Mapper<TzPerson>, SelectByIdsMapper<TzPerson> {
}