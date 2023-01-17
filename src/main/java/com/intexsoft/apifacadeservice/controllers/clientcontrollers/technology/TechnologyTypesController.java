package com.intexsoft.apifacadeservice.controllers.clientcontrollers.technology;

import com.intexsoft.apifacadeservice.consumers.apiclient.technology.TechnologyTypeConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.TechnologyTypes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/technologies_types")
public class TechnologyTypesController {

    private final TechnologyTypeConsumerFeign technologyTypeConsumerFeign;

    @GetMapping()
    public ResponseEntity<List<TechnologyTypes>> getTechnologyTypes() {
        return technologyTypeConsumerFeign.getTechnologyTypes();
    }

}
