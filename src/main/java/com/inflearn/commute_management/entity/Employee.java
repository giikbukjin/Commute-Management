package com.inflearn.commute_management.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity
@Getter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "work_start_date", nullable = false)
    private Date workStartDate;

    @Column(nullable = false)
    private Date birthday;

    public enum Role {
        MANAGER, MEMBER
    }

    public Employee() {}

    public Employee(String name, Role role, Date workStartDate, Date birthday) {
        this.name = name;
        this.role = role;
        this.workStartDate = workStartDate;
        this.birthday = birthday;
    }
}