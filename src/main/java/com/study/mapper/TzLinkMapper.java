package com.study.mapper;

import com.study.entity.TzLink;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzLinkMapper extends Mapper<TzLink>, SelectByIdsMapper<TzLink> {
}