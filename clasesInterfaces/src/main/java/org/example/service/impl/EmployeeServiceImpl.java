package org.example.service.impl;

import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public long getSalary() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> employees = employeeRepository.getEmployees();
        employees.get(5).getSalary();
        int totalEmployees = employees.size();
        //Realizar con for each
        //for each (employees)

        return 0;
    }

    @Override
    public void changeStatus() {

    }

    @Override
    public ArrayList<Employee> getActives() {
        return null;
    }
}
