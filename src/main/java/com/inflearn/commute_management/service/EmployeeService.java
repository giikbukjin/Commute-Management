package com.inflearn.commute_management.service;

import com.inflearn.commute_management.dto.employee.request.EmployeeSaveRequest;
import com.inflearn.commute_management.dto.employee.response.EmployeeResponse;
import com.inflearn.commute_management.entity.Employee;
import com.inflearn.commute_management.entity.Role;
import com.inflearn.commute_management.entity.Team;
import com.inflearn.commute_management.repository.EmployeeRepository;
import com.inflearn.commute_management.repository.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final TeamRepository teamRepository;

    public EmployeeService(EmployeeRepository employeeRepository, TeamRepository teamRepository) {
        this.employeeRepository = employeeRepository;
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void saveEmployee(EmployeeSaveRequest request){

        Team team = teamRepository.findByName(request.getTeamName())
                .orElseThrow(IllegalArgumentException::new);

        Role role = request.isManager() ? Role.Manager : Role.Member;

        employeeRepository.save(new Employee(request.getName(),team.getId(),
                role, request.getWorkStartDate(), request.getBirthday()));

        if(role.equals(Role.Manager)){
            team.setManager(request.getName());
            teamRepository.save(team);
        }
        team.setEmployeeCount();
        teamRepository.save(team);
    }

    @Transactional
    public List<EmployeeResponse> getEmployees(){
        List<Employee> members = employeeRepository.findAll();
        List<EmployeeResponse> memberResponses = new ArrayList<>();
        for(Employee m : members){
            String teamName = teamRepository.findById(m.getTeamId()).orElseThrow().getName();
            memberResponses.add(new EmployeeResponse(
                    m.getName(), teamName,m.getRole(), m.getWorkStartDate(), m.getBirthday()
            ));
        }
        return memberResponses;
    }
}