package com.java.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        //get employees from DB
        //Since EmployeeMySQL is an Employee, we can easily store it in Employee reference
        Employee employeeMySQL = new EmployeeMySQL("1234", "Prasanna", "Adiga", "prasanna@gmail.com");
        employees.add(employeeMySQL);

        //get employees from LDAP
        EmployeeLdap employeeFromLdap = new EmployeeLdap("5678", "Adiga", "Prasanna", "prasanna@gmail.com");
        //Since EmployeeLdap is not an 'Employee', we need to use an adapter here
        //Since EmployeeAdapterLdap is an Employee, we can easily store it in Employee reference
        Employee employeeLdap = new EmployeeAdapterLdap(employeeFromLdap);
        employees.add(employeeLdap);

        return employees;
    }
}
