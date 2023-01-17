package com.intexsoft.apifacadeservice.consumers.apiclient.technology;

import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Consumer to work with technology api-service requests
 */
@FeignClient(value = "technology-api-consumer",
        url = "${api.service.url}/technologies")
public interface TechnologyConsumerFeign extends CrudConsumerFeign {

    String URL_TECHNOLOGIES_SEARCH = "/search";

    @GetMapping(URL_TECHNOLOGIES_SEARCH)
    ResponseEntity<Object> getTechnologies();

    @PostMapping(URL_TECHNOLOGIES_SEARCH)
    ResponseEntity<Object> searchTechnologyWithFilter();

}
