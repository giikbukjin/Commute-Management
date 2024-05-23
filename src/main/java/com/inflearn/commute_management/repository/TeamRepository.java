package com.inflearn.commute_management.repository;

import com.inflearn.commute_management.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
