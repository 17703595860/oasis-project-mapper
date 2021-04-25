package com.study.mapper;

import com.study.entity.TzEmployee;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzEmployeeMapper extends Mapper<TzEmployee>, SelectByIdsMapper<TzEmployee> {
}