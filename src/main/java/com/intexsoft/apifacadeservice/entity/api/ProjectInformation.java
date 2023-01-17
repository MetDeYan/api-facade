package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * The project information entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ProjectInformation {

    private String id;
    private String title;
    private String internalTitle;
    private String background;
    private String backgroundRu;
    private boolean typeWeb;
    private boolean typeMobile;
    private boolean insideIntexsoft;
    private boolean nda;
    private String dateStart;
    private String dateEnd;
    private String links;
    private String solution;
    private String transparency;
    private int isBefore;
    private Department department;
    private Customer customer;
    private List<File> files;
    private List<Technology> technologies;
    private List<Domain> domains;
    private List<EmployeeForProject> employees;
    private Status status;

}
