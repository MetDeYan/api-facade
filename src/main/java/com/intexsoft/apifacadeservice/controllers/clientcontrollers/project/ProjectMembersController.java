package com.intexsoft.apifacadeservice.controllers.clientcontrollers.project;

import com.intexsoft.apifacadeservice.consumers.apiclient.project.ProjectMembersConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectMembersController {

    @Getter
    private final ProjectMembersConsumerFeign projectMembersConsumerFeign;

    private static final String URL_PROJECTS_MEMBERS = "/members";
    private static final String URL_PROJECTS_PROJECTId_MEMBERS = "/{projectId}/members";
    private static final String URL_PROJECTS_PROJECTId_MEMBERS_MEMBERS_ID = "/{projectId}/members/{memberId}";

    @PostMapping(URL_PROJECTS_MEMBERS)
    public ResponseEntity<Object> addProjectMember(@RequestBody final Object request) {
        return projectMembersConsumerFeign.addProjectMember(request);
    }

    @GetMapping(URL_PROJECTS_PROJECTId_MEMBERS)
    public ResponseEntity<Object> getProjectMembers(@PathVariable final String projectId) {
        return projectMembersConsumerFeign.getProjectMembers(projectId);
    }

    @PostMapping(URL_PROJECTS_PROJECTId_MEMBERS) //Doesn't work
    public ResponseEntity<EntityId> addProjectMemberWithCreateProject(@PathVariable final String projectId,
                                                                      @RequestBody final Object request) {
        return projectMembersConsumerFeign.addProjectMemberWithCreateProject(projectId, request);
    }

    @PutMapping(URL_PROJECTS_PROJECTId_MEMBERS_MEMBERS_ID)
    public ResponseEntity<EntityId> editProjectMember(@PathVariable final String projectId,
                                                      @PathVariable final String memberId,
                                                      @RequestBody final Object request) {
        return projectMembersConsumerFeign.editProjectMember(projectId, memberId, request);
    }

    @DeleteMapping(URL_PROJECTS_PROJECTId_MEMBERS_MEMBERS_ID)
    public ResponseEntity<EntityId> deleteProjectMember(@PathVariable final String projectId,
                                                        @PathVariable final String memberId) {
        return projectMembersConsumerFeign.deleteProjectMember(projectId, memberId);
    }

}
