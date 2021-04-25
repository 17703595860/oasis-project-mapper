package com.study.mapper;

import com.study.entity.TzMessageInfo;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzMessageInfoMapper extends Mapper<TzMessageInfo>, SelectByIdsMapper<TzMessageInfo> {
}