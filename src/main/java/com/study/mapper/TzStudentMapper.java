package com.study.mapper;

import com.study.entity.TzStudent;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzStudentMapper extends Mapper<TzStudent>, SelectByIdsMapper<TzStudent> {
}