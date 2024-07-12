package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    Department addDepartment(Department department);
    Department updateDepartmentById(Long id, Department department);
    void deleteDepartmentById(Long id);

}
