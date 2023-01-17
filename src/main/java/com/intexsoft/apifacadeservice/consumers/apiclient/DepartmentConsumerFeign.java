package com.intexsoft.apifacadeservice.consumers.apiclient;

import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "department-api-consumer",
        url = "${api.service.url}/departments")
public interface DepartmentConsumerFeign extends CrudConsumerFeign {
    String URL_FULL_DEPARTMENT = "/full";

    @GetMapping(URL_FULL_DEPARTMENT)
    ResponseEntity<Object> getAllFull();
}

