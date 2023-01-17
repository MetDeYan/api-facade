package com.intexsoft.apifacadeservice.consumers.apiclient.project;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with project api-service requests
 */
@FeignClient(value = "project-status-api-consumer",
        url = "${api.service.url}")
public interface ProjectStatusConsumerFeign {

    String URL_PROJECT_STATUSES = "/project_statuses";

    @GetMapping(URL_PROJECT_STATUSES)
    ResponseEntity<Object> getProjectStatuses();

}
