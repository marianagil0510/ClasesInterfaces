package org.example.service;

import org.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {
    public long getSalary();
    public ArrayList<Employee> changeStatus();
    public ArrayList<Employee> getActives();
    public ArrayList<Employee> getActives(ArrayList<Employee> employees);
}
