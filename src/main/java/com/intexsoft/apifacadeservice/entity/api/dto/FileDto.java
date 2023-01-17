package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.File;
import lombok.Data;

import java.util.List;

/**
 * The type File dto.
 */
@Data
public class FileDto {

    private int count;
    private List<File> rows;

}
