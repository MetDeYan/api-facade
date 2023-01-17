package com.intexsoft.apifacadeservice.consumers.apiclient;

import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "logs-api-consumer",
        url = "${api.service.url}/logs")
public interface LogsConsumerFeign extends CrudConsumerFeign {
    @GetMapping()
    ResponseEntity<Object> getLogs();

    @PostMapping()
    ResponseEntity<Object> postLog(@RequestBody final Object log);
}
