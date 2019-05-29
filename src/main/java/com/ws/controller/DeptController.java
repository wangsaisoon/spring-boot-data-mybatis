package com.ws.controller;

import com.ws.bean.Department;
import com.ws.bean.Employee;
import com.ws.mapper.DepartmentMapper;
import com.ws.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("dept/{id}")
    public Department getDeptById(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @PostMapping("dept")
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }
}
