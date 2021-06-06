package com.study.mapper;

import com.study.entity.TzClassroom;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzClassroomMapper extends Mapper<TzClassroom>, SelectByIdsMapper<TzClassroom> {
}