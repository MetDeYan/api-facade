package com.intexsoft.apifacadeservice.controllers.clientcontrollers.project;

import com.intexsoft.apifacadeservice.consumers.apiclient.project.ProjectFilesConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectFilesController {

    @Getter
    private final ProjectFilesConsumerFeign projectFilesConsumerFeign;

    private static final String URL_PROJECT_FILES = "/{projectId}/files";
    private static final String URL_PROJECT_FILES_ID = "/{projectId}/files/{fileId}";

    @GetMapping(URL_PROJECT_FILES)
    public ResponseEntity<Object> getProjectFiles(@PathVariable final String projectId) {
        return projectFilesConsumerFeign.getProjectFiles(projectId);
    }

    @GetMapping(URL_PROJECT_FILES_ID)
    public ResponseEntity<ByteArrayResource> getProjectFileById(@PathVariable final String projectId,
                                                                @PathVariable final String fileId) {
        return projectFilesConsumerFeign.getProjectFileById(projectId, fileId);
    }

    @PostMapping(URL_PROJECT_FILES) //Doesn't work - not tested
    public ResponseEntity<EntityId> addProjectFile(@PathVariable final String projectId,
                                                   @RequestPart final MultipartFile file) {
        return projectFilesConsumerFeign.addProjectFile(projectId, file);
    }

    @DeleteMapping(URL_PROJECT_FILES_ID)
    public ResponseEntity<EntityId> deleteProjectFile(@PathVariable final String projectId,
                                                      @PathVariable final String fileId) {
        return projectFilesConsumerFeign.deleteProjectFile(projectId, fileId);
    }

}
