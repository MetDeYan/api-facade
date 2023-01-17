package com.intexsoft.apifacadeservice.controllers.clientcontrollers.employee;

import com.intexsoft.apifacadeservice.consumers.apiclient.employee.EmployeeLanguageConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.LanguageAddDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeLanguagesController {

    @Getter
    private final EmployeeLanguageConsumerFeign employeeLanguageConsumerFeign;

    private static final String URL_EMPLOYEE_LANGUAGES = "/{employeeId}/languages";
    private static final String URL_EMPLOYEE_LANGUAGES_ID = "{employeeId}/languages/{languageId}";

    @GetMapping(URL_EMPLOYEE_LANGUAGES)
    public ResponseEntity<Object> getEmployeeLanguages(@PathVariable final String employeeId) {
        return employeeLanguageConsumerFeign.getEmployeeLanguages(employeeId);
    }

    @PostMapping(URL_EMPLOYEE_LANGUAGES)
    public ResponseEntity<EntityId> addEmployeeLanguage(@PathVariable final String employeeId,
                                                        @RequestBody final LanguageAddDto languageAddDto) {
        return employeeLanguageConsumerFeign.addEmployeeLanguage(employeeId, languageAddDto);
    }

    @PutMapping(URL_EMPLOYEE_LANGUAGES_ID)
    public ResponseEntity<EntityId> updateEmployeeLanguage(@PathVariable final String employeeId,
                                                           @PathVariable final String languageId,
                                                           @RequestBody final LanguageAddDto languageAddDto) {
        return employeeLanguageConsumerFeign.updateEmployeeLanguage(employeeId, languageId, languageAddDto);
    }

    @DeleteMapping(URL_EMPLOYEE_LANGUAGES_ID)
    public ResponseEntity<EntityId> deleteEmployeeLanguage(@PathVariable final String employeeId,
                                                           @PathVariable final String languageId) {
        return employeeLanguageConsumerFeign.deleteEmployeeLanguage(employeeId, languageId);
    }

}
