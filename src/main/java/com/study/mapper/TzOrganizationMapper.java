package com.study.mapper;

import com.study.entity.TzOrganization;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzOrganizationMapper extends Mapper<TzOrganization>, SelectByIdsMapper<TzOrganization> {
}