package com.intexsoft.apifacadeservice.consumers;

import com.intexsoft.apifacadeservice.entity.statistic.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "statistic-consumer",
        url = "${statistic.service.url}")
public interface StatisticConsumerFeign {

    /**
     * Start process finding top technologies and send messages to admins
     */
    @GetMapping("/top")
    void hardSendTopStatistics();

    /**
     * Start process finding anti-top technologies and send messages to admins
     */
    @GetMapping("/antitop")
    void hardSendAntiTopStatistics();

    /**
     * Gets employee technologies statistic by employee id.
     *
     * @param id        the employee id
     * @param dateRange
     * @return the employee technologies statistic by employee id
     */
    @GetMapping(value = "/{id}")
    ResponseEntity<List<EmployeeTechnologyStatisticWithTechnologyDto>> getEmployeeTechnology(@PathVariable("id") String id, @RequestParam(required = false) DateRangeDto dateRange);

    /**
     * Search for technologies by name, among technologies that are not selected as ignored.
     *
     * @param technologyForStatisticTitleDto
     * @return found technologies
     */
    @PostMapping(value = "/search")
    ResponseEntity<List<TechnologyForStatistic>> getTechnologiesByName(@RequestBody TechnologyForStatisticTitleDto technologyForStatisticTitleDto);

    /**
     * Search technologies by name, among technologies that are marked as ignored.
     *
     * @param technologyForStatisticTitleDto
     * @param sort
     * @return found technologies
     */
    @PostMapping(value = "/ignored")
    ResponseEntity<List<TechnologyForStatistic>> getIgnoredTechnologies(@RequestBody TechnologyForStatisticTitleDto technologyForStatisticTitleDto, @RequestParam("sort") String sort);

    /**
     * Updating the technologyForStatistic for accounting (not accounting) in the TOP-50 and ANTITOP-50 ratings.
     *
     * @param technologyForStatistic
     * @return id of the changed technologyForStatistic for accounting (not accounting) in the TOP-50 and ANTITOP-50 ratings
     */
    @PutMapping(value = "/ignored")
    ResponseEntity<TechnologyForStatisticIdDto> upgradeIgnoredTechnology(@RequestBody TechnologyForStatistic technologyForStatistic);
}
