package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The employee technology entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeTechnology {

    private String id;
    private String last;
    private String year;
    private boolean main;
    private String level;
    private String technologyId;

}
