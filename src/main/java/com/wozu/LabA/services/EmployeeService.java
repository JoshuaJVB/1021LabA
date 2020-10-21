package com.wozu.LabA.services;

import com.wozu.LabA.model.Employee;
import com.wozu.LabA.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public void saveEmployee(String firstName, String lastName, String title){
        employeeRepo.save(new Employee(firstName, lastName, title));
    }

    public List<Employee> getEmployees(){
        return employeeRepo.findAll();
    }
}
