package com.intexsoft.apifacadeservice.controllers.clientcontrollers.project;

import com.intexsoft.apifacadeservice.consumers.apiclient.project.ProjectStatusConsumerFeign;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProjectStatusesController {

    @Getter
    private final ProjectStatusConsumerFeign projectStatusConsumerFeign;

    private static final String URL_PROJECT_STATUSES = "/project_statuses";

    @GetMapping(URL_PROJECT_STATUSES)
    public ResponseEntity<Object> getProjectStatuses() {
        return projectStatusConsumerFeign.getProjectStatuses();
    }

}
