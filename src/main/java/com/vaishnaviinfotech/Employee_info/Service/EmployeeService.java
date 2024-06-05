package com.vaishnaviinfotech.Employee_info.Service;

import com.vaishnaviinfotech.Employee_info.Model.Employee;
import com.vaishnaviinfotech.Employee_info.Repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private Employeerepository repo;
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }
}
