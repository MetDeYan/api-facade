package com.intexsoft.apifacadeservice.entity.api.dto;

import lombok.Data;

import java.util.Date;

/**
 * The type Project add dto.
 */
@Data
public class ProjectAddDto {

    private String dateStart;
    private String dateEnd;
    private String tools;
    private String employeeId;
    private String positionId;
    private String projectId;

}
