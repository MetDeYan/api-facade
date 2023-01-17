package com.intexsoft.apifacadeservice.consumers.apiclient.project;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Consumer to work with project api-service requests
 */
@FeignClient(value = "project-files-api-consumer",
        url = "${api.service.url}/projects")
public interface ProjectFilesConsumerFeign {

    String URL_PROJECT_FILES = "/{projectId}/files";
    String URL_PROJECT_FILES_ID = "/{projectId}/files/{fileId}";

    @GetMapping(URL_PROJECT_FILES)
    ResponseEntity<Object> getProjectFiles(@PathVariable final String projectId);

    @GetMapping(URL_PROJECT_FILES_ID)
    ResponseEntity<ByteArrayResource> getProjectFileById(@PathVariable final String projectId,
                                                         @PathVariable final String fileId);

    @PostMapping(value = URL_PROJECT_FILES, consumes = "multipart/form-data")
    ResponseEntity<EntityId> addProjectFile(@PathVariable final String projectId,
                                            @RequestPart final MultipartFile file);

    @DeleteMapping(URL_PROJECT_FILES_ID)
    ResponseEntity<EntityId> deleteProjectFile(@PathVariable final String projectId,
                                               @PathVariable final String fileId);

}
