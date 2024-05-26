package com.inflearn.commute_management.service;

import com.inflearn.commute_management.dto.team.request.TeamSaveRequest;
import com.inflearn.commute_management.dto.team.response.TeamFindResponse;
import com.inflearn.commute_management.entity.Team;
import com.inflearn.commute_management.repository.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void saveTeam(TeamSaveRequest request) {
        teamRepository.save(new Team(request.getName()));
    }

    @Transactional
    public List<TeamFindResponse> getTeams() {
        List<Team> teams = teamRepository.findAll();

        return teams.stream()
                .map(TeamFindResponse::new)
                .collect(Collectors.toList());
        // 모든 team의 정보 읽은 뒤 stream() 이용해 리스트 생성하여 반환
    }
}
