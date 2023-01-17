package com.intexsoft.apifacadeservice.consumers.apiclient.language;

import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "language-level-api-consumer",
        url = "${api.service.url}/settings/language_levels")
public interface LanguageLevelConsumerFeign extends CrudConsumerFeign {
}
