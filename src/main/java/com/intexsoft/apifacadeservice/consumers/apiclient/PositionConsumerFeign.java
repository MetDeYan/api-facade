package com.intexsoft.apifacadeservice.consumers.apiclient;

import com.intexsoft.apifacadeservice.config.BasicConstants;
import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "position-api-consumer",
        url = "${api.service.url}/positions")
public interface PositionConsumerFeign extends CrudConsumerFeign {
    String POSITIONS_BY_ID = "/{id}";

    @GetMapping(POSITIONS_BY_ID)
    ResponseEntity<Object> getPositionsById(@PathVariable final String id);
}
