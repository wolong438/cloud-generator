package com.sinosoft.sss.cloud.customer.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.sss.cloud.customer.respository.LsLatencyCustomerAppDao;
import com.sinosoft.sss.cloud.customer.service.LsLatencyCustomerAppService;

/**
* LsLatencyCustomerAppService 接口实现
* @date 2019/10/23
*/
@Service
public class LsLatencyCustomerAppServiceImpl implements LsLatencyCustomerAppService{
private static final Logger logger = LoggerFactory.getLogger(LsLatencyCustomerAppServiceImpl.class);

@Autowired
private LsLatencyCustomerAppDao lsLatencyCustomerAppDao;

}