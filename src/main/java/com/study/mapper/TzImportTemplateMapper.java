package com.study.mapper;

import com.study.entity.TzImportTemplate;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzImportTemplateMapper extends Mapper<TzImportTemplate>, SelectByIdsMapper<TzImportTemplate> {
}