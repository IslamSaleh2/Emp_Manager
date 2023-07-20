package com.techno.emplayeemanager.repo;

import com.techno.emplayeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    //void deleteEmployeeByID(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
