package com.wozu.LabA.controller;

import com.wozu.LabA.model.Employee;
import com.wozu.LabA.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/postName")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

}
