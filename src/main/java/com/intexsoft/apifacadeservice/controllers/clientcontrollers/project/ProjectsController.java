package com.intexsoft.apifacadeservice.controllers.clientcontrollers.project;

import com.intexsoft.apifacadeservice.consumers.apiclient.project.ProjectConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.ProjectInformationAddDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectsController {

    @Getter
    private final ProjectConsumerFeign projectConsumerFeign;

    private static final String URL_PROJECT_ID = "/{projectId}";
    private static final String URL_SEARCH_PROJECT = "/search";

    @GetMapping
    public ResponseEntity<Object> getProjects() {
        return projectConsumerFeign.getProjects();
    }

    @PostMapping
    public ResponseEntity<Object> addProject(@RequestBody final ProjectInformationAddDto projectInformationAddDto) {
        return projectConsumerFeign.addProject(projectInformationAddDto);
    }

    @GetMapping(URL_PROJECT_ID)
    public ResponseEntity<Object> getProjectById(@PathVariable final String projectId) {
        return projectConsumerFeign.getProjectById(projectId);
    }

    @PutMapping(URL_PROJECT_ID)
    public ResponseEntity<EntityId> updateProject(@PathVariable final String projectId,
                                                  @RequestBody final ProjectInformationAddDto projectInformationAddDto) {
        return projectConsumerFeign.updateProject(projectId, projectInformationAddDto);
    }

    @DeleteMapping(URL_PROJECT_ID)
    public ResponseEntity<EntityId> deleteProject(@PathVariable final String projectId) {
        return projectConsumerFeign.deleteProject(projectId);
    }

    @PostMapping(URL_SEARCH_PROJECT)
    public ResponseEntity<Object> searchProject(@RequestParam("fields") final String fields,
                                                @RequestParam("sort") final String sort,
                                                @RequestParam("limit") final String limit,
                                                @RequestParam("offset") final String offset) {
        return projectConsumerFeign.searchProject(fields, sort, limit, offset);
    }

}
