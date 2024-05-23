package com.inflearn.commute_management.dto.employee.request;

import lombok.Getter;

import java.util.Date;

@Getter
public class EmployeeSaveRequest {
    private String name;
    private String role;
    private Date workStartDate;
    private Date birthday;

    private enum Role {
        MANAGER, MEMBER
    }

    public EmployeeSaveRequest(String name, String role, Date workStartDate, Date birthday) {
        this.name = name;
        this.role = role;
        this.workStartDate = workStartDate;
        this.birthday = birthday;
    }
}
