package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.ProjectInformation;
import lombok.Data;

import java.util.List;

/**
 * The type Project add dto.
 */
@Data
public class ProjectDto {

    private int count;
    private List<ProjectInformation> rows;

}