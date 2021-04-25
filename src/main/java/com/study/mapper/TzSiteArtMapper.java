package com.study.mapper;

import com.study.entity.TzSiteArt;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzSiteArtMapper extends Mapper<TzSiteArt>, SelectByIdsMapper<TzSiteArt> {
}