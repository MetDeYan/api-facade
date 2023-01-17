package com.intexsoft.apifacadeservice.consumers.apiclient.project;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with project api-service requests
 */
@FeignClient(value = "project-domain-api-consumer",
        url = "${api.service.url}/projects")
public interface ProjectDomainsConsumerFeign {

    String URL_PROJECT_DOMAINS = "/{projectId}/domains";

    @GetMapping(URL_PROJECT_DOMAINS)
    ResponseEntity<Object> getProjectDomains(@PathVariable final String projectId);

    @PostMapping(URL_PROJECT_DOMAINS)
    ResponseEntity<EntityId> editProjectDomains(@PathVariable final String projectId,
                                                @RequestBody final Object object);

}
