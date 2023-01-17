package com.intexsoft.apifacadeservice.controllers.clientcontrollers.project;

import com.intexsoft.apifacadeservice.consumers.apiclient.project.ProjectTechnologiesConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectTechnologyController {

    private final ProjectTechnologiesConsumerFeign projectTechnologiesConsumerFeign;

    private static final String URL_PROJECT_TECHNOLOGIES = "/{projectId}/technologies";
    private static final String URL_PROJECT_TECHNOLOGIES_ID = "/{projectId}/technologies/{technologyId}";

    @GetMapping(URL_PROJECT_TECHNOLOGIES)
    public ResponseEntity<Object> getProjectTechnologies(@PathVariable final String projectId) {
        return projectTechnologiesConsumerFeign.getProjectTechnologies(projectId);
    }

    @PostMapping(URL_PROJECT_TECHNOLOGIES)
    public ResponseEntity<EntityId> addProjectTechnologies(@PathVariable final String projectId,
                                                           @RequestBody final Object object) {
        return projectTechnologiesConsumerFeign.addProjectTechnologies(projectId, object);
    }

    @DeleteMapping(URL_PROJECT_TECHNOLOGIES_ID)
    public ResponseEntity<EntityId> deleteProjectTechnology(@PathVariable final String projectId,
                                                            @PathVariable final String technologyId) {
        return projectTechnologiesConsumerFeign.deleteProjectTechnology(projectId, technologyId);
    }

}
