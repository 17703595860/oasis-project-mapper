package com.study.mapper;

import com.study.entity.TzLicense;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzLicenseMapper extends Mapper<TzLicense>, SelectByIdsMapper<TzLicense> {
}