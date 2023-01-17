package com.intexsoft.apifacadeservice.entity.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The technology entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TechnologyForStatistic {
    private String id;
    private String title;
    private boolean statistics_for_top;
}
