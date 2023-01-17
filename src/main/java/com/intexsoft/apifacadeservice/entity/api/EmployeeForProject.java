package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

/**
 * The employee entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeForProject {

    private String id;
    private String dateStart;
    private String dateEnd;
    private String positionId;
    private String employeeId;

}
