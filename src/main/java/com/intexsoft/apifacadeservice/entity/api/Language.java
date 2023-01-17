package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The language entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Language {

    private String id;
    private String title;
    private String titleRu;
    private int levels_order;

}
