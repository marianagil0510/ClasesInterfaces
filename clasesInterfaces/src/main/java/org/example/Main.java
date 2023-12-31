package org.example;

import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.example.service.impl.EmployeeServiceImpl;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /**
         * 1. Crear clase persona con las variables idPersona, nombres, apellidos, edad, correo, telefono y direccion
         * 2. Crear clase direccion donde va tener variables: pais, ciudad, dirección, descripción
         * 3. Crear clase empleado heredada de la clase persona con las variables: salario, fecha de inicio, activo
         * 4. Crear clase administrador heredada de la clase empleado con la variable role
         * 5. Crear interfaces para la clase administrador y empleado con la invocación de los métodos, obtener salario, cambiar estado de activo y listar activos
         * 6. Crear clases que extiendan de su respectivas interfaces e implementar los métodos con su lógica
         * 6.1 Crear en repositorio una clase que nos retorne una lista de empleados y otra que retorne un administrador
         * 7. Crear una lista con 7 empleados e instanciar un administrador
         * 8. Obtener el promedio de los salarios
         * 8.1 Imprimir por consola el salario de los empleados
         * 9. Cambiar el estado de 3 empoleados a inactivos mediante el método de cambiar estado de activo
         * 10. Listar los empleados que queden activos
         */

        EmployeeService employeeService = new EmployeeServiceImpl();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("El promedio de los empleados es: " + employeeService.getSalary());
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Estado de empleados: ");
        ArrayList<Employee> employees = employeeService.changeStatus();
        System.out.println("Tamaño de la lista: " + employees.size());
        employees.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Empleados activos: ");
        ArrayList<Employee> employeesActiveWithParams = employeeService.getActives(employees);
        employeesActiveWithParams.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Empleados activos: ");
        ArrayList<Employee> employeesActiveWithOutParams = employeeService.getActives();
        employeesActiveWithOutParams.forEach(System.out::println);
        //System.out.println("Los empleados activos: " + employeeService.getActives());
    }
}