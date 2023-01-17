package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

/**
 * The Education entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Education {

    private String id;
    private String education;
    private String educationRu;
    private String majorDisciplines;
    private String majorDisciplinesRu;
    private String results;
    private String resultsRu;
    private String employeeId;
    private String dateStart;
    private String dateEnd;

}
