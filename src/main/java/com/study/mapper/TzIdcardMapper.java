package com.study.mapper;

import com.study.entity.TzIdcard;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzIdcardMapper extends Mapper<TzIdcard>, SelectByIdsMapper<TzIdcard> {
}