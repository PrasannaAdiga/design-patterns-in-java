package com.java;

import com.java.adapter.Employee;
import com.java.adapter.EmployeeClient;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();
        List<Employee> employees = employeeClient.getEmployees();
        System.out.println(employees.get(0));
        System.out.println(employees.get(1));
    }
}
