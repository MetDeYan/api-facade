package com.intexsoft.apifacadeservice.consumers.apiclient.project;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.ProjectInformationAddDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with project api-service requests
 */
@FeignClient(value = "project-api-consumer",
        url = "${api.service.url}/projects")
public interface ProjectConsumerFeign {

    String URL_PROJECT_ID = "/{projectId}";
    String URL_SEARCH_PROJECT = "/search";

    @GetMapping
    ResponseEntity<Object> getProjects();

    @PostMapping
    ResponseEntity<Object> addProject(@RequestBody final ProjectInformationAddDto projectInformationAddDto);

    @GetMapping(URL_PROJECT_ID)
    ResponseEntity<Object> getProjectById(@PathVariable final String projectId);

    @PutMapping(URL_PROJECT_ID)
    ResponseEntity<EntityId> updateProject(@PathVariable final String projectId,
                                           @RequestBody final ProjectInformationAddDto projectInformationAddDto);

    @DeleteMapping(URL_PROJECT_ID)
    ResponseEntity<EntityId> deleteProject(@PathVariable final String projectId);

    @PostMapping(URL_SEARCH_PROJECT)
    ResponseEntity<Object> searchProject(@RequestParam("fields") final String fields,
                                         @RequestParam("sort") final String sort,
                                         @RequestParam("limit") final String limit,
                                         @RequestParam("offset") final String offset);

}
