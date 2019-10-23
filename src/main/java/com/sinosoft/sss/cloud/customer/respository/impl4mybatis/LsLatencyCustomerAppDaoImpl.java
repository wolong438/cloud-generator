package com.sinosoft.sss.cloud.customer.respository.impl4mybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sinosoft.sss.cloud.customer.respository.LsLatencyCustomerAppDao;
import com.sinosoft.sss.cloud.customer.respository.impl4mybatis.mapper.LsLatencyCustomerAppMapper;

/**
* LsLatencyCustomerAppDao接口实现
* @date 2019/10/23
*/
@Component
public class LsLatencyCustomerAppDaoImpl implements LsLatencyCustomerAppDao{
private static final Logger logger = LoggerFactory.getLogger(LsLatencyCustomerAppDaoImpl.class);
  @Autowired
  private LsLatencyCustomerAppMapper lsLatencyCustomerAppMapper;

}