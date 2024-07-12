package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Define custom queries if needed
}
