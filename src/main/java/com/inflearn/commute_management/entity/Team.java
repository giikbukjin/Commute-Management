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

    public Team() {}

    public Team(String name) {
        this.name = name;
    }
}
