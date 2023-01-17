package com.intexsoft.apifacadeservice.consumers.apiclient;

import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "customer-api-consumer",
        url = "${api.service.url}/customers")
public interface CustomerConsumerFeign extends CrudConsumerFeign {
    String URL_PROJECTS_AND_DOMAINS = "/projectsAndDomains";
    String URL_PROJECTS_AND_DOMAINS_SEARCH = "/projectsAndDomains/search";

    @GetMapping(URL_PROJECTS_AND_DOMAINS)
    ResponseEntity<Object> getCustomersWithProjectsAndDomains();

    @PostMapping(URL_PROJECTS_AND_DOMAINS_SEARCH)
    ResponseEntity<Object> searchCustomersWithProjectsAndDomains(@RequestParam final String limit,
                                                                 @RequestParam final String offset,
                                                                 @RequestBody final Object customer);
}

