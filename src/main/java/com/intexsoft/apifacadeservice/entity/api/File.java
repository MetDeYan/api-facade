package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The file entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class File {

    private String id;
    private String name;
    private String employeeId;

}
