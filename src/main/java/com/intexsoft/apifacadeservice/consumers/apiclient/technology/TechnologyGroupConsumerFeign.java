package com.intexsoft.apifacadeservice.consumers.apiclient.technology;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with technology group api-service requests
 */
@FeignClient(value = "technologyGroup-api-consumer",
        url = "${api.service.url}/technologies_groups")
public interface TechnologyGroupConsumerFeign {

    String URL_TECHNOLOGIES_GROUPS_LIST = "/list";
    String URL_TECHNOLOGIES_GROUPS_ID = "/{groupId}";
    String URL_TECHNOLOGIES_GROUPS_ID_TECHNOLOGIES = "/{groupId}/technologies";
    String URL_TECHNOLOGIES_GROUPS_SEARCH = "/search";

    @PostMapping()
    ResponseEntity<Object> getTechnologyGroups();

    @PutMapping()
    ResponseEntity<Object> addTechnologyGroup(@RequestBody final Object request);

    @GetMapping(URL_TECHNOLOGIES_GROUPS_LIST)
    ResponseEntity<Object> getGroupTechnologiesList();

    @DeleteMapping(URL_TECHNOLOGIES_GROUPS_ID)
    ResponseEntity<EntityId> deleteTechnologyGroup(@PathVariable final String groupId);

    @PutMapping(URL_TECHNOLOGIES_GROUPS_ID)
    ResponseEntity<EntityId> editTechnologyGroup(@PathVariable final String groupId,
                                                 @RequestBody final Object request);

    @PostMapping(URL_TECHNOLOGIES_GROUPS_ID_TECHNOLOGIES)
    ResponseEntity<Object> getGroupTechnologies(@PathVariable final String groupId,
                                                @RequestBody final Object request);

    @PutMapping(URL_TECHNOLOGIES_GROUPS_ID_TECHNOLOGIES)
    ResponseEntity<Object> updateTechnologiesOrdering(@PathVariable final String groupId,
                                                      @RequestBody final Object request);

    @PostMapping(URL_TECHNOLOGIES_GROUPS_SEARCH)
    ResponseEntity<Object> searchTechnologies(@RequestBody final Object request);

}
