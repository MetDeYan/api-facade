package com.intexsoft.apifacadeservice.controllers;

import com.intexsoft.apifacadeservice.consumers.StatisticConsumerFeign;
import com.intexsoft.apifacadeservice.entity.statistic.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The Statistic service controller.
 */
@RestController
@RequestMapping("/api/statistic")
@RequiredArgsConstructor
public class StatisticController {

    private final StatisticConsumerFeign statisticConsumerFeign;

    /**
     * Hard send top statistics
     */
    @GetMapping("/top")
    public void hardSendTopStatistics() {
        statisticConsumerFeign.hardSendTopStatistics();
    }

    /**
     * Hard send anti-top statistics
     */
    @GetMapping("/antitop")
    public void hardSendAntiTopStatistics() {
        statisticConsumerFeign.hardSendAntiTopStatistics();
    }

    /**
     * Gets employee technologies statistic by employee id.
     *
     * @param id the employee id
     * @return the employee technologies statistic by employee id
     */
    @GetMapping(value = "/{id}")
    @PreAuthorize("hasRole(@roleConfig.ekAdmin) and @permissionService.hasPermissions(@permissionConfig.employeeView)")
    public ResponseEntity<List<EmployeeTechnologyStatisticWithTechnologyDto>> getEmployeeTechnology(@PathVariable("id") String id, @RequestParam(required = false) DateRangeDto dateRange) {
        return statisticConsumerFeign.getEmployeeTechnology(id, dateRange);
    }

    /**
     * Search for technologies by name, among technologies that are not selected as ignored.
     *
     * @param technologyForStatisticTitleDto
     * @return found technologies
     */
    @PostMapping(value = "/search")
    @PreAuthorize("hasRole(@roleConfig.ekAdmin) and @permissionService.hasPermissions(@permissionConfig.ratingExceptions)")
    public ResponseEntity<List<TechnologyForStatistic>> getTechnologiesByName(@RequestBody TechnologyForStatisticTitleDto technologyForStatisticTitleDto) {
        return statisticConsumerFeign.getTechnologiesByName(technologyForStatisticTitleDto);
    }

    /**
     * Search technologies by name, among technologies that are marked as ignored.
     *
     * @param technologyForStatisticTitleDto
     * @param sort
     * @return found technologies
     */
    @PostMapping("/ignored")
    @PreAuthorize("hasRole(@roleConfig.ekAdmin) and @permissionService.hasPermissions(@permissionConfig.ratingExceptions)")
    public ResponseEntity<List<TechnologyForStatistic>> getIgnoredTechnologies(@RequestBody TechnologyForStatisticTitleDto technologyForStatisticTitleDto, @RequestParam("sort") String sort) {
        return statisticConsumerFeign.getIgnoredTechnologies(technologyForStatisticTitleDto, sort);
    }

    /**
     * Updating the technologyForStatistic for accounting (not accounting) in the TOP-50 and ANTITOP-50 ratings.
     *
     * @param technologyForStatistic
     * @return id of the changed technologyForStatistic for accounting (not accounting) in the TOP-50 and ANTITOP-50 ratings
     */
    @PutMapping("/ignored")
    @PreAuthorize("hasRole(@roleConfig.ekAdmin) and @permissionService.hasPermissions(@permissionConfig.ratingExceptions)")
    public ResponseEntity<TechnologyForStatisticIdDto> upgradeIgnoredTechnology(@RequestBody TechnologyForStatistic technologyForStatistic) {
        return statisticConsumerFeign.upgradeIgnoredTechnology(technologyForStatistic);
    }
}
