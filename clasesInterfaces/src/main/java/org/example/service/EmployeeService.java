package org.example.service;

import org.example.model.Employee;

import java.util.ArrayList;

public interface EmployeeService {
    public long getSalary();
    public void changeStatus();
    public ArrayList<Employee> getActives();
}
