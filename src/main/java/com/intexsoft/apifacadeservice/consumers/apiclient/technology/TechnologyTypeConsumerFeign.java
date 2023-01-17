package com.intexsoft.apifacadeservice.consumers.apiclient.technology;

import com.intexsoft.apifacadeservice.entity.api.TechnologyTypes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Consumer to work with technology type api-service requests
 */
@FeignClient(value = "technologyType-api-consumer",
        url = "${api.service.url}/technologies_types")
public interface TechnologyTypeConsumerFeign {

    @GetMapping()
    ResponseEntity<List<TechnologyTypes>> getTechnologyTypes();

}
