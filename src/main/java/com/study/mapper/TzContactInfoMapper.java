package com.study.mapper;

import com.study.entity.TzContactInfo;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzContactInfoMapper extends Mapper<TzContactInfo>, SelectByIdsMapper<TzContactInfo> {
}