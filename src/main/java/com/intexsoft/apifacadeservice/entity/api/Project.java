package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


/**
 * The project entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Project {

    private String id;
    private String title;
    private String internalTitle;
    private String customerId;
    private String background;
    private String backgroundRu;
    private boolean typeWeb;
    private boolean typeMobile;
    private int statusId;
    private boolean insideIntexsoft;
    private boolean nda;
    private String dateStart;
    private String dateEnd;
    private String links;
    private String departmentId;
    private String solution;
    private String transparency;
    private int isBefore;

}
