package com.study.mapper;

import com.study.entity.TzImportHistory;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzImportHistoryMapper extends Mapper<TzImportHistory>, SelectByIdsMapper<TzImportHistory> {
}