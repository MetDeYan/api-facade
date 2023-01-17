package com.intexsoft.apifacadeservice.consumers.apiclient.project;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with project api-service requests
 */
@FeignClient(value = "project-technologies-api-consumer",
        url = "${api.service.url}/projects")
public interface ProjectTechnologiesConsumerFeign {

    String URL_PROJECT_TECHNOLOGIES = "/{projectId}/technologies";
    String URL_PROJECT_TECHNOLOGIES_ID = "/{projectId}/technologies/{technologyId}";

    @GetMapping(URL_PROJECT_TECHNOLOGIES)
    ResponseEntity<Object> getProjectTechnologies(@PathVariable final String projectId);

    @PostMapping(URL_PROJECT_TECHNOLOGIES)
    ResponseEntity<EntityId> addProjectTechnologies(@PathVariable final String projectId,
                                                    @RequestBody final Object object);

    @DeleteMapping(URL_PROJECT_TECHNOLOGIES_ID)
    ResponseEntity<EntityId> deleteProjectTechnology(@PathVariable final String projectId,
                                                     @PathVariable final String technologyId);

}
