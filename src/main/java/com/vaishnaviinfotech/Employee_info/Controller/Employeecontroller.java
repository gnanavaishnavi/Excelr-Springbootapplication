package com.vaishnaviinfotech.Employee_info.Controller;

import com.vaishnaviinfotech.Employee_info.Model.Employee;
import com.vaishnaviinfotech.Employee_info.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }
}
