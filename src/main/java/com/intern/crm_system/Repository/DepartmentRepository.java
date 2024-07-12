package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Define custom queries if needed
}
