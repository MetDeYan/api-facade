package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The position entity.
 */
@Data
public class Position {

    private String id;
    private String fullTitle;
    private String fullTitleRu;
    private String shortTitle;
    private String shortTitleRu;
    private int order;

}
