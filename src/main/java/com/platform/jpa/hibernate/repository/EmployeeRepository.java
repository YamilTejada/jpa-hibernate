package com.platform.jpa.hibernate.repository;

import com.platform.jpa.hibernate.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This interface is used to perform CRUD operations on Employee entities in the database.
 *
 * JpaRepository is a Spring Data interface that provides methods for common database operations such as saving, finding, updating, and deleting entities.
 * By extending JpaRepository, EmployeeRepository inherits these methods and can be used to interact with the Employee table in the database.
 */


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
