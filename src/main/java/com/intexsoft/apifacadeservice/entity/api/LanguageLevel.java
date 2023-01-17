package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The language level entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LanguageLevel {

    private String id;
    private String title;
    private int levels_order;

}
