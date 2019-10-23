package com.sinosoft.sss.cloud.customer.externalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import com.sinosoft.sss.cloud.customer.api.fallback.DefaultLsLatencyCustomerAddressApiFallback;
import com.sinosoft.sss.cloud.customer.api.springmvc.LsLatencyCustomerAddressApi;


@FeignClient(name="lsLatencyCustomerAddress", fallback=LsLatencyCustomerAddressServiceFallback.class)
public interface LsLatencyCustomerAddressService extends LsLatencyCustomerAddressApi {

}


/**
* LsLatencyCustomerAddressService服务降级
* @date 2019/10/23
*/
@Component
class LsLatencyCustomerAddressServiceFallback extends DefaultLsLatencyCustomerAddressApiFallback implements LsLatencyCustomerAddressService {

}