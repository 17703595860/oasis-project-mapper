package com.study.mapper;

import com.study.entity.TzCustomer;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface TzCustomerMapper extends Mapper<TzCustomer>, SelectByIdsMapper<TzCustomer> {
}