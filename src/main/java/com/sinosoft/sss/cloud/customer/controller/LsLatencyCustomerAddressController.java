package com.sinosoft.sss.cloud.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sinosoft.sss.cloud.customer.api.springmvc.LsLatencyCustomerAddressApi;
import com.sinosoft.sss.cloud.customer.service.LsLatencyCustomerAddressService;

/**
* LsLatencyCustomerAddressController控制器
* @date 2019/10/23
*/
@RestController
public class LsLatencyCustomerAddressController implements LsLatencyCustomerAddressApi{
private static final Logger logger = LoggerFactory.getLogger(LsLatencyCustomerAddressController.class);

@Autowired
private LsLatencyCustomerAddressService lsLatencyCustomerAddressService;


}