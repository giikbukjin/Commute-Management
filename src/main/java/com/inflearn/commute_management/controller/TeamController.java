package com.inflearn.commute_management.controller;

import com.inflearn.commute_management.dto.team.request.TeamSaveRequest;
import com.inflearn.commute_management.dto.team.response.TeamFindResponse;
import com.inflearn.commute_management.service.TeamService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/team")
    public void saveTeam(@RequestBody TeamSaveRequest request) {
        teamService.saveTeam(request);
    }

    @GetMapping("/team")
    public TeamFindResponse findTeam(@RequestParam TeamFindResponse response) {
        return response;
    }
}
