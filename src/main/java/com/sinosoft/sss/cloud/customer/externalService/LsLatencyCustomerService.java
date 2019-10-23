package com.sinosoft.sss.cloud.customer.externalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import com.sinosoft.sss.cloud.customer.api.fallback.DefaultLsLatencyCustomerApiFallback;
import com.sinosoft.sss.cloud.customer.api.springmvc.LsLatencyCustomerApi;


@FeignClient(name="lsLatencyCustomer", fallback=LsLatencyCustomerServiceFallback.class)
public interface LsLatencyCustomerService extends LsLatencyCustomerApi {

}


/**
* LsLatencyCustomerService服务降级
* @date 2019/10/23
*/
@Component
class LsLatencyCustomerServiceFallback extends DefaultLsLatencyCustomerApiFallback implements LsLatencyCustomerService {

}