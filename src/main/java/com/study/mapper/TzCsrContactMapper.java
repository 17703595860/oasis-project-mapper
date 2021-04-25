package com.study.mapper;

import com.study.entity.TzCsrContact;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzCsrContactMapper extends Mapper<TzCsrContact>, SelectByIdsMapper<TzCsrContact> {
}