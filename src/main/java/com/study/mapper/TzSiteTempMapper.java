package com.study.mapper;

import com.study.entity.TzSiteTemp;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzSiteTempMapper extends Mapper<TzSiteTemp>, SelectByIdsMapper<TzSiteTemp> {
}