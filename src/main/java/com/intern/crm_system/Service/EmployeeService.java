package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployeeById(Long id);

    Employee saveEmployee(Employee employee);
}
