package com.intexsoft.apifacadeservice.entity.api.dto;

import lombok.Data;

/**
 * The type Generate add document dto.
 */
@Data
public class GeneratedAddDocumentDto {

    private String comment;
    private Long timestamp;
    private String url;
    private String customerId;

}
