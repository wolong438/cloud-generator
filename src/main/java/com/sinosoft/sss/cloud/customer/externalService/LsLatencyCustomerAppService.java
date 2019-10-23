package com.sinosoft.sss.cloud.customer.externalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import com.sinosoft.sss.cloud.customer.api.fallback.DefaultLsLatencyCustomerAppApiFallback;
import com.sinosoft.sss.cloud.customer.api.springmvc.LsLatencyCustomerAppApi;


@FeignClient(name="lsLatencyCustomerApp", fallback=LsLatencyCustomerAppServiceFallback.class)
public interface LsLatencyCustomerAppService extends LsLatencyCustomerAppApi {

}


/**
* LsLatencyCustomerAppService服务降级
* @date 2019/10/23
*/
@Component
class LsLatencyCustomerAppServiceFallback extends DefaultLsLatencyCustomerAppApiFallback implements LsLatencyCustomerAppService {

}