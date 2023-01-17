package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * The employee project entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeProject {

    private String id;
    private Date dateStart;
    private Date dateEnd;
    private Position position;
    private Project project;
    private List<Responsibility> responsibilities;
    private List<Technology> technologies;

}