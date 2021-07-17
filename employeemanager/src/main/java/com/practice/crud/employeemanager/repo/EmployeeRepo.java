package com.practice.crud.employeemanager.repo;

import com.practice.crud.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * we need to tell jpa repository what class this repository is for.
 * and type of primary key. in our case it is Long.
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
