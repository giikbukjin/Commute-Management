package com.inflearn.commute_management.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String managerName;

    private long memberCount;

    public Team() {}

    public Team(String name) {
        this.name = name;
    }

    public void setManager(String name) {
        this.managerName = name;
    }

    public void setEmployeeCount() {
        this.memberCount++;
    }
}
