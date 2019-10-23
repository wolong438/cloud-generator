package com.sinosoft.sss.cloud.customer.respository.impl4mybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sinosoft.sss.cloud.customer.respository.LsLatencyCustomerAddressDao;
import com.sinosoft.sss.cloud.customer.respository.impl4mybatis.mapper.LsLatencyCustomerAddressMapper;

/**
* LsLatencyCustomerAddressDao接口实现
* @date 2019/10/23
*/
@Component
public class LsLatencyCustomerAddressDaoImpl implements LsLatencyCustomerAddressDao{
private static final Logger logger = LoggerFactory.getLogger(LsLatencyCustomerAddressDaoImpl.class);
  @Autowired
  private LsLatencyCustomerAddressMapper lsLatencyCustomerAddressMapper;

}