package com.inflearn.commute_management.controller;

import com.inflearn.commute_management.dto.employee.request.EmployeeSaveRequest;
import com.inflearn.commute_management.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public void saveEmployee(@RequestBody EmployeeSaveRequest request) {
        employeeService.saveEmployee(request);
    }
}
