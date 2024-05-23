package com.inflearn.commute_management.service;

import com.inflearn.commute_management.dto.employee.request.EmployeeSaveRequest;
import com.inflearn.commute_management.entity.Employee;
import com.inflearn.commute_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void saveEmployee(EmployeeSaveRequest request) {
        Employee.Role role = Employee.Role.valueOf(request.getRole().toUpperCase());
        employeeRepository.save(new Employee(request.getName(), role, request.getWorkStartDate(), request.getBirthday()));
    }
}