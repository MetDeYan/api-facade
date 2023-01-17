package com.intexsoft.apifacadeservice.entity.statistic;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

/**
 * The type TechnologyForStatistic id dto.
 */
@Data
@Builder
@Jacksonized
public class TechnologyForStatisticIdDto {
    private String id;
}
