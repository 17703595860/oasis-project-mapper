package com.study.mapper;

import com.study.entity.TzFileManage;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzFileManageMapper extends Mapper<TzFileManage>, SelectByIdsMapper<TzFileManage> {
}