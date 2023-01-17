package com.intexsoft.apifacadeservice.consumers.apiclient.employee;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.LanguageAddDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with employee language api-service requests
 */
@FeignClient(value = "employee-language-api-consumer",
        url = "${api.service.url}/employees")
public interface EmployeeLanguageConsumerFeign {

    String URL_EMPLOYEE_LANGUAGES = "/{employeeId}/languages";
    String URL_EMPLOYEE_LANGUAGES_ID = "{employeeId}/languages/{languageId}";

    @GetMapping(URL_EMPLOYEE_LANGUAGES)
    ResponseEntity<Object> getEmployeeLanguages(@PathVariable final String employeeId);

    @PostMapping(URL_EMPLOYEE_LANGUAGES)
    ResponseEntity<EntityId> addEmployeeLanguage(@PathVariable final String employeeId,
                                                 @RequestBody final LanguageAddDto languageAddDto);

    @PutMapping(URL_EMPLOYEE_LANGUAGES_ID)
    ResponseEntity<EntityId> updateEmployeeLanguage(@PathVariable final String employeeId,
                                                    @PathVariable final String languageId,
                                                    @RequestBody final LanguageAddDto languageAddDto);

    @DeleteMapping(URL_EMPLOYEE_LANGUAGES_ID)
    ResponseEntity<EntityId> deleteEmployeeLanguage(@PathVariable final String employeeId,
                                                    @PathVariable final String languageId);

}
