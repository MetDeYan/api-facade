package com.intexsoft.apifacadeservice.entity.api.dto;

import lombok.Data;

import java.util.Date;

/**
 * The type Project information add dto.
 */
@Data
public class ProjectInformationAddDto {

    private String title;
    private String internalTitle;
    private String customerId;
    private String departmentId;
    private String background;
    private String backgroundRu;
    private String solution;
    private String transparency;
    private String links;
    private boolean nda;
    private boolean insideIntexsoft;
    private int statusId;
    private boolean typeMobile;
    private boolean typeWeb;
    private String dateStart;
    private String dateEnd;
    private String adminFullName;

}
