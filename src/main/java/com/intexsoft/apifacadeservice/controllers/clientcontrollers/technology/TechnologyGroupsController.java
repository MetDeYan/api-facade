package com.intexsoft.apifacadeservice.controllers.clientcontrollers.technology;

import com.intexsoft.apifacadeservice.consumers.apiclient.technology.TechnologyGroupConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/technologies_groups")
public class TechnologyGroupsController {

    private static final String URL_TECHNOLOGIES_GROUPS_LIST = "/list";
    private static final String URL_TECHNOLOGIES_GROUPS_ID = "/{groupId}";
    private static final String URL_TECHNOLOGIES_GROUPS_ID_TECHNOLOGIES = "/{groupId}/technologies";
    private static final String URL_TECHNOLOGIES_GROUPS_SEARCH = "/search";

    @Getter
    private final TechnologyGroupConsumerFeign technologyGroupConsumerFeign;

    @PostMapping()
    public ResponseEntity<Object> getTechnologyGroups() {
        return technologyGroupConsumerFeign.getTechnologyGroups();
    }

    @PutMapping()
    public ResponseEntity<Object> addTechnologyGroup(@RequestBody final Object request) {
        return technologyGroupConsumerFeign.addTechnologyGroup(request);
    }

    @GetMapping(URL_TECHNOLOGIES_GROUPS_LIST)
    public ResponseEntity<Object> getGroupTechnologiesList() {
        return technologyGroupConsumerFeign.getGroupTechnologiesList();
    }

    @DeleteMapping(URL_TECHNOLOGIES_GROUPS_ID)
    public ResponseEntity<EntityId> deleteTechnologyGroup(@PathVariable final String groupId) {
        return technologyGroupConsumerFeign.deleteTechnologyGroup(groupId);
    }

    @PutMapping(URL_TECHNOLOGIES_GROUPS_ID)
    public ResponseEntity<EntityId> editTechnologyGroup(@PathVariable final String groupId,
                                                        @RequestBody final Object request) {
        return technologyGroupConsumerFeign.editTechnologyGroup(groupId, request);
    }

    @PostMapping(URL_TECHNOLOGIES_GROUPS_ID_TECHNOLOGIES)
    public ResponseEntity<Object> getGroupTechnologies(@PathVariable final String groupId,
                                                       @RequestBody final Object request) {
        return technologyGroupConsumerFeign.getGroupTechnologies(groupId, request);
    }

    @PutMapping(URL_TECHNOLOGIES_GROUPS_ID_TECHNOLOGIES)
    public ResponseEntity<Object> updateTechnologiesOrdering(@PathVariable final String groupId,
                                                             @RequestBody final Object request) {
        return technologyGroupConsumerFeign.updateTechnologiesOrdering(groupId, request);
    }

    @PostMapping(URL_TECHNOLOGIES_GROUPS_SEARCH)
    public ResponseEntity<Object> searchTechnologies(@RequestBody final Object request) {
        return technologyGroupConsumerFeign.searchTechnologies(request);
    }

}
