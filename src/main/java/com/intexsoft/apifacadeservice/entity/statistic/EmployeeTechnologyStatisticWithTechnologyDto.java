package com.intexsoft.apifacadeservice.entity.statistic;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * The type Employee technology statistic with technology dto.
 */
@Data
@Builder
public class EmployeeTechnologyStatisticWithTechnologyDto {

    private String id;
    private String level;
    private String last;
    private Date sliceDate;
    private TechnologyForStatisticDto technology;

}