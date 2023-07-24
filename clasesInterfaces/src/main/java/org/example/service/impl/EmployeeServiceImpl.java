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
        int totalEmployees = employees.size(); //Variable totalEmployees en la cual almacena la cantidad de empleados que tiene el arreglo o la lista de employees
        long salary = 0L;
        for (Employee employee: employees ) {
            if (employee.getSalary()!=0L){
                 salary = salary + employee.getSalary();

            }
        }

        return salary/totalEmployees;
    }

    @Override
    public void changeStatus() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> employees = employeeRepository.getEmployees();
        int i =0;
        for (Employee employee: employees){
            if(i<3){
                employee.setActive(false);
                i++;
                continue;
            }
        }
    }

    @Override
    public ArrayList<Employee> getActives() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> employees = employeeRepository.getEmployees();
        List<Employee> employeesActive = new ArrayList<>();
        for (Employee employee: employees){
            if (employee.isActive()){
                employeesActive.add(employee);
            }
        }
        return (ArrayList<Employee>) employeesActive;
    }
}
