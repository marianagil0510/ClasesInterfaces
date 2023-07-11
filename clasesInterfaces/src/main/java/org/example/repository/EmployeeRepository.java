package org.example.repository;

import org.example.model.Address;
import org.example.model.Administrator;
import org.example.model.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeRepository {
    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i <= 10; i++)
        {
            employees.add(getEmployee((byte) i));
        }
        return employees;
    }

    private  Employee getEmployee(byte id){
        Employee employee = new Employee();
        employee.setActive(true);
        employee.setAge(30);
        employee.setEmail("pepito12345@gmail.com");
        employee.setName("Pepido"+ id);
        employee.setIdPerson(id);
        employee.setLastName("Perez");
        employee.setPhone(123456);
        employee.setSalary(100000 + id);
        employee.setStartDate(new Date());

        Address address = new Address();
        address.setAddress("Calle 80 # 66 - 70, Medellín");
        address.setCity("Medellín");
        address.setDescription("Cerca a la glorieta");
        address.setCountry("Colombia");

        //Inyección de dependencia por setter
        employee.setAddress(address);

        return employee;

    }
}


