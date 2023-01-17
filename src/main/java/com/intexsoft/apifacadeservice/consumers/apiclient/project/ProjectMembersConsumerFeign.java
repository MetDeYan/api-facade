package com.intexsoft.apifacadeservice.consumers.apiclient.project;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with project api-service requests
 */
@FeignClient(value = "project-member-api-consumer",
        url = "${api.service.url}/projects")
public interface ProjectMembersConsumerFeign {

    String URL_PROJECTS_MEMBERS = "/members";
    String URL_PROJECTS_PROJECTId_MEMBERS = "/{projectId}/members";
    String URL_PROJECTS_PROJECTId_MEMBERS_MEMBERS_ID = "/{projectId}/members/{memberId}";

    @PostMapping(URL_PROJECTS_MEMBERS)
    ResponseEntity<Object> addProjectMember(@RequestBody final Object request);

    @GetMapping(URL_PROJECTS_PROJECTId_MEMBERS)
    ResponseEntity<Object> getProjectMembers(@PathVariable final String projectId);

    @PostMapping(URL_PROJECTS_PROJECTId_MEMBERS)
    ResponseEntity<EntityId> addProjectMemberWithCreateProject(@PathVariable final String projectId,
                                                               @RequestBody final Object request);

    @PutMapping(URL_PROJECTS_PROJECTId_MEMBERS_MEMBERS_ID)
    ResponseEntity<EntityId> editProjectMember(@PathVariable final String projectId,
                                               @PathVariable final String memberId,
                                               @RequestBody final Object request);

    @DeleteMapping(URL_PROJECTS_PROJECTId_MEMBERS_MEMBERS_ID)
    ResponseEntity<EntityId> deleteProjectMember(@PathVariable final String projectId,
                                                 @PathVariable final String memberId);

}
