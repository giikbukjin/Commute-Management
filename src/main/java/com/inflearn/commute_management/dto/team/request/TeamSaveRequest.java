package com.inflearn.commute_management.dto.team.request;

import lombok.Getter;

@Getter
public class TeamSaveRequest {
    private String name;

    public TeamSaveRequest(String name) {
        this.name = name;
    }
}
