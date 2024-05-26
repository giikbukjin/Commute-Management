package com.inflearn.commute_management.dto.team.response;

import com.inflearn.commute_management.entity.Team;
import lombok.Getter;

@Getter
public class TeamFindResponse {
    private String name;
    private String manager;
    private long employeeCount;

    public TeamFindResponse(Team team) {
        this.name = team.getName();
        this.manager = team.getManagerName();
        this.employeeCount = team.getEmplpoyeeCount();
    }
}
