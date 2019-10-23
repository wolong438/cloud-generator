package com.sinosoft.sss.cloud.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sinosoft.sss.cloud.customer.api.springmvc.LsLatencyCustomerExtraInfoApi;
import com.sinosoft.sss.cloud.customer.service.LsLatencyCustomerExtraInfoService;

/**
* LsLatencyCustomerExtraInfoController控制器
* @date 2019/10/23
*/
@RestController
public class LsLatencyCustomerExtraInfoController implements LsLatencyCustomerExtraInfoApi{
private static final Logger logger = LoggerFactory.getLogger(LsLatencyCustomerExtraInfoController.class);

@Autowired
private LsLatencyCustomerExtraInfoService lsLatencyCustomerExtraInfoService;


}