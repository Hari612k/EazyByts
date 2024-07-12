package com.intern.crm_system.Controller;

import com.intern.crm_system.Entity.Department;
import com.intern.crm_system.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long departmentId) {
        Department department = departmentService.getDepartmentById(departmentId);
        return ResponseEntity.ok(department);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }

    @PostMapping("/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        Department newDepartment = departmentService.addDepartment(department);
        return new ResponseEntity<>(newDepartment, HttpStatus.CREATED);
    }

    @PutMapping("/update/{departmentId}")
    public ResponseEntity<Department> updateDepartmentById(@PathVariable Long departmentId, @RequestBody Department department) {
        Department updatedDepartment = departmentService.updateDepartmentById(departmentId, department);
        return ResponseEntity.ok(updatedDepartment);
    }

    @DeleteMapping("/delete/{departmentId}")
    public ResponseEntity<?> deleteDepartmentById(@PathVariable Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return ResponseEntity.ok().build();




























    }
}
