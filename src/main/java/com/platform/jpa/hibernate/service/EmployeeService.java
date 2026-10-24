package com.platform.jpa.hibernate.service;

import com.platform.jpa.hibernate.dto.EmployeeDto;
import com.platform.jpa.hibernate.entity.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * Creates a new employee.
     *
     * @param employeeDto the employee data transfer object containing employee details
     * @return the created employee data transfer object (DTO)
     */

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto putEmployee(Long id, EmployeeDto employeeDto);

    void DeleteEmployee(Long id);
}
