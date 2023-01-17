package com.intexsoft.apifacadeservice.consumers.apiclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with api service requests
 */
@FeignClient(
        value = "user-api-consumer",
        url = "${api.service.url}/users")
public interface UserConsumerFeign {
    @GetMapping("/")
    ResponseEntity<Object> getAllUsers();

    @GetMapping("/{username}")
    ResponseEntity<Object> getUserByUsername(@PathVariable String username);

    @PutMapping("/{username}")
    ResponseEntity<Object> putUserByUsername(@PathVariable String username,
                                             @RequestBody Object body);

    @PostMapping("/search")
    ResponseEntity<Object> searchUsers(@RequestParam String sort,
                                       @RequestParam String limit,
                                       @RequestParam String offset);
}
