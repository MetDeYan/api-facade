package com.intexsoft.apifacadeservice.consumers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Consumer to work with filling service request
 */
@FeignClient(value = "filling-consumer",
        url = "${filling.service.url}")
public interface FillingConsumerFeign {
    /**
     * Force checking of access.
     */
    @GetMapping("/check/force")
    void forceCheck();
}
