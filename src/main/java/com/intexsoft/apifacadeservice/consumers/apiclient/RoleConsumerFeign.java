package com.intexsoft.apifacadeservice.consumers.apiclient;

import com.intexsoft.apifacadeservice.config.BasicConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "role-api-consumer",
        url = "${api.service.url}/roles")
public interface RoleConsumerFeign {
    @GetMapping(BasicConstants.INITIAL_URL)
    ResponseEntity<Object> getAllRoles();
}
