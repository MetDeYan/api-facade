package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The generated document entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class GeneratedDocument {

    private String id;
    private String comment;
    private Long timestamp;
    private String url;
    private Customer customer;

}
