package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.GeneratedDocument;
import lombok.Data;

import java.util.List;

/**
 * The type Generate document dto.
 */
@Data
public class GeneratedDocumentDto {

    private int count;
    private List<GeneratedDocument> rows;

}
