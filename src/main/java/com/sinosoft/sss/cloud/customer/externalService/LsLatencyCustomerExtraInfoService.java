package com.sinosoft.sss.cloud.customer.externalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import com.sinosoft.sss.cloud.customer.api.fallback.DefaultLsLatencyCustomerExtraInfoApiFallback;
import com.sinosoft.sss.cloud.customer.api.springmvc.LsLatencyCustomerExtraInfoApi;


@FeignClient(name="lsLatencyCustomerExtraInfo", fallback=LsLatencyCustomerExtraInfoServiceFallback.class)
public interface LsLatencyCustomerExtraInfoService extends LsLatencyCustomerExtraInfoApi {

}


/**
* LsLatencyCustomerExtraInfoService服务降级
* @date 2019/10/23
*/
@Component
class LsLatencyCustomerExtraInfoServiceFallback extends DefaultLsLatencyCustomerExtraInfoApiFallback implements LsLatencyCustomerExtraInfoService {

}