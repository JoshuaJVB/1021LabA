package com.wozu.LabA;

import com.wozu.LabA.repo.EmployeeRepo;
import com.wozu.LabA.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    EmployeeService employeeService;

    @Override
    public void run(String...args) throws Exception{
        employeeService.saveEmployee("Joe", "Bro", "Engineer");
    }
}
