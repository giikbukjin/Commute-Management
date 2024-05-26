package com.inflearn.commute_management.dto.employee.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.Date;

@Getter
public class EmployeeSaveRequest {
    private String name;

    private String teamName;

    @JsonProperty("isManager")
    private boolean isManager;

    private Date workStartDate;

    private Date birthday;
}
