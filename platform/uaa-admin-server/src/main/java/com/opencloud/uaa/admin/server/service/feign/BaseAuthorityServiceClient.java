package com.opencloud.uaa.admin.server.service.feign;

import com.opencloud.base.client.constants.BaseConstants;
import com.opencloud.base.client.service.IBaseAuthorityServiceClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author: liuyadu
 * @date: 2018/10/24 16:49
 * @description:
 */
@Component
@FeignClient(value = BaseConstants.BASE_SERVER)
public interface BaseAuthorityServiceClient extends IBaseAuthorityServiceClient {

}
