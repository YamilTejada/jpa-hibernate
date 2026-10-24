package com.platform.jpa.hibernate.service.impl;

import com.platform.jpa.hibernate.dto.EmployeeDto;
import com.platform.jpa.hibernate.entity.Employee;
import com.platform.jpa.hibernate.mapper.EmployeeMapper;
import com.platform.jpa.hibernate.repository.EmployeeRepository;
import com.platform.jpa.hibernate.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.hibernate.ResourceClosedException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // very important
@AllArgsConstructor // very important
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    // employeeDto always will be the parameter of the method

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);

    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).
                                                orElseThrow(() -> new ResourceClosedException("Employee not found with id: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        // Map each Employee entity to an EmployeeDto
        return employees.stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public EmployeeDto putEmployee(Long id, EmployeeDto employeeDto) {

        Employee employee = employeeRepository.findById(id).
                                                orElseThrow(() -> new ResourceClosedException("Employee is not exists with given id: " + id));
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        Employee updatedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployee);
    }

    @Override
    public void DeleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).
                                                orElseThrow(() -> new ResourceClosedException("Employee is not exists with given id: " + id));
        employeeRepository.deleteById(id);
    }


}
