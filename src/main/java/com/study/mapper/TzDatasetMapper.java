package com.study.mapper;

import com.study.entity.TzDataset;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzDatasetMapper extends Mapper<TzDataset>, SelectByIdsMapper<TzDataset> {
}