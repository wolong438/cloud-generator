package com.sinosoft.sss.cloud.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sinosoft.sss.cloud.customer.api.springmvc.LsLatencyCustomerApi;
import com.sinosoft.sss.cloud.customer.service.LsLatencyCustomerService;

/**
* LsLatencyCustomerController控制器
* @date 2019/10/23
*/
@RestController
public class LsLatencyCustomerController implements LsLatencyCustomerApi{
private static final Logger logger = LoggerFactory.getLogger(LsLatencyCustomerController.class);

@Autowired
private LsLatencyCustomerService lsLatencyCustomerService;


}