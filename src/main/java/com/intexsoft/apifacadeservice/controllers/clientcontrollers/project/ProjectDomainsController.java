package com.intexsoft.apifacadeservice.controllers.clientcontrollers.project;

import com.intexsoft.apifacadeservice.consumers.apiclient.project.ProjectDomainsConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectDomainsController {

    @Getter
    private final ProjectDomainsConsumerFeign projectDomainsConsumerFeign;

    private static final String URL_PROJECT_DOMAINS = "/{projectId}/domains";

    @GetMapping(URL_PROJECT_DOMAINS)
    public ResponseEntity<Object> getProjectDomains(@PathVariable final String projectId) {
        return projectDomainsConsumerFeign.getProjectDomains(projectId);
    }

    @PostMapping(URL_PROJECT_DOMAINS)
    public ResponseEntity<EntityId> editProjectDomains(@PathVariable final String projectId,
                                                       @RequestBody final Object object) {
        return projectDomainsConsumerFeign.editProjectDomains(projectId, object);
    }

}
