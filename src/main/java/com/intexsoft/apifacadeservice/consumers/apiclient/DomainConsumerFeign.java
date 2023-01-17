package com.intexsoft.apifacadeservice.consumers.apiclient;

import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "domain-api-consumer",
        url = "${api.service.url}/domains")
public interface DomainConsumerFeign extends CrudConsumerFeign {
    String URL_SEARCH = "/search";

    @PostMapping(URL_SEARCH)
    ResponseEntity<Object> searchEntities(@RequestParam final String limit,
                                          @RequestParam final String offset,
                                          @RequestBody final Object domain);
}

