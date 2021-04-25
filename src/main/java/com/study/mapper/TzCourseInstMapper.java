package com.study.mapper;

import com.study.entity.TzCourseInst;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzCourseInstMapper extends Mapper<TzCourseInst>, SelectByIdsMapper<TzCourseInst> {
}