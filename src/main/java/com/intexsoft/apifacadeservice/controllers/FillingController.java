package com.intexsoft.apifacadeservice.controllers;

import com.intexsoft.apifacadeservice.consumers.FillingConsumerFeign;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Filling service controller.
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class FillingController {

    private final FillingConsumerFeign fillingConsumerFeign;

    /**
     * Force checking of access.
     */
    @GetMapping("/check/force")
    public void forceCheck() {
        fillingConsumerFeign.forceCheck();
    }

}
