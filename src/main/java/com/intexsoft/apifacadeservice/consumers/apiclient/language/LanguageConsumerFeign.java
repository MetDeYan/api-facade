package com.intexsoft.apifacadeservice.consumers.apiclient.language;

import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "language-api-consumer",
        url = "${api.service.url}/settings/language")
public interface LanguageConsumerFeign extends CrudConsumerFeign {
}
