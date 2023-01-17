package com.intexsoft.apifacadeservice.entity.api.dto;

import lombok.Data;

/**
 * The type Career add dto.
 */
@Data
public class CareerAddDto {

    private String organization;
    private String positionId;
    private String dateStart;
    private String dateEnd;

}
