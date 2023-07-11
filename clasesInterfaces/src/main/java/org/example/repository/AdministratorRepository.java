package org.example.repository;

import org.example.model.Address;
import org.example.model.Administrator;

import java.util.Date;

public class AdministratorRepository {
    public Administrator getAdministrator(){
        Administrator administrator = new Administrator();
        administrator.setRole("Administrador");
        administrator.setActive(true);
        administrator.setAge(30);
        administrator.setEmail("pepito12345@gmail.com");
        administrator.setName("Pepido");
        administrator.setIdPerson((byte)1);
        administrator.setLastName("Perez");
        administrator.setPhone(123456);
        administrator.setSalary(100000);
        administrator.setStartDate(new Date());

        Address address = new Address();
        address.setAddress("Calle 80 # 66 - 70, Medellín");
        address.setCity("Medellín");
        address.setDescription("Cerca a la glorieta");
        address.setCountry("Colombia");

        //Inyección de dependencia por setter
        administrator.setAddress(address);

        return administrator;
    }
}
