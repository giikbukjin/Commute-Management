package com.inflearn.commute_management.service;

import com.inflearn.commute_management.dto.team.request.TeamSaveRequest;
import com.inflearn.commute_management.entity.Team;
import com.inflearn.commute_management.repository.TeamRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public void saveTeam(TeamSaveRequest request) {
        teamRepository.save(new Team(request.getName()));
    }
}
