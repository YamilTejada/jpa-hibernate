package com.platform.jpa.hibernate.mapper;

import com.platform.jpa.hibernate.dto.EmployeeDto;
import com.platform.jpa.hibernate.entity.Employee;

public class EmployeeMapper {

    /**
     * Maps an Employee entity to an EmployeeDto.
     *
     * @param employee the Employee entity to be mapped
     * @return the corresponding EmployeeDto
     */

    public static EmployeeDto mapToEmployeeDto(Employee employee) {

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );

    }

    /**
     * Maps an EmployeeDto to an Employee entity.
     *
     * @param employeeDto the EmployeeDto to be mapped
     * @return the corresponding Employee entity
     */

    public static Employee maptoEmployee(EmployeeDto employeeDto) {

        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }


}
