package com.intexsoft.apifacadeservice.consumers.apiclient;

import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "responsibilities-api-consumer",
        url = "${api.service.url}/responsibilities")
public interface ResponsibilitiesConsumerFeign extends CrudConsumerFeign {
    String RESPONSIBILITIES_BY_ID = "/{id}";
    String URL_SEARCH = "/search";

    @GetMapping(RESPONSIBILITIES_BY_ID)
    ResponseEntity<Object> getAllResponsibilitiesById(@PathVariable String id);

    @PostMapping(URL_SEARCH)
        // done
    ResponseEntity<Object> search(@RequestParam(required = false) final String sort,
                                  @RequestParam final String limit,
                                  @RequestParam final String offset,
                                  @RequestBody final Object body);
}
