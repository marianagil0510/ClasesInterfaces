package org.example.service.impl;

import org.example.model.Employee;
import org.example.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImplTest implements EmployeeService {
    @Override
    public long getSalary() {
        return 100000L;
    }

    @Override
    public ArrayList<Employee> changeStatus() {
        return new ArrayList<>();

    }

    @Override
    public ArrayList<Employee> getActives() {
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Employee> getActives(ArrayList<Employee> employees) {
        return new ArrayList<>();
    }

}
