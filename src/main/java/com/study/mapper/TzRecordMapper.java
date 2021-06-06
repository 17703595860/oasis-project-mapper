package com.study.mapper;

import com.study.entity.TzRecord;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzRecordMapper extends Mapper<TzRecord>, SelectByIdsMapper<TzRecord> {
}