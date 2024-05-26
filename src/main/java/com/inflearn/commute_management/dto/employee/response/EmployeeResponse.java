package com.inflearn.commute_management.dto.employee.response;

import com.inflearn.commute_management.entity.Role;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
public class EmployeeResponse {
    private String name;
    private String teamName;
    private Role role;
    private Date birthday;
    private Date workStartDate;

    public EmployeeResponse(String name, String teamName,
                          Role role, Date birthday, Date workStartDate) {
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthday = birthday;
        this.workStartDate = workStartDate;
    }
}
