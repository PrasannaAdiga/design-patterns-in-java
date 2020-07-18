package com.java.adapter;

//Adapter class which basically adapts an legacy EmployeeLdap into as new 'Employee'
public class EmployeeAdapterLdap implements Employee {
    private EmployeeLdap employeeLdap;

    //allows to hooks an adapter into adaptee
    public EmployeeAdapterLdap(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    //returns id of 'EmployeeLdap'
    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    //returns given name of 'EmployeeLdap'
    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    //returns surname of 'EmployeeLdap'
    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    //returns email of 'EmployeeLdap'
    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }

    /**
     * NOTE: In adapter pattern basically we should not add any new functionality.
     * If we add new functionality it will become a Decorator pattern.
     * But since we are just overriding toString method of an object to provide better text,
     * this addition of new functionality can be allowed in adapter pattern
     */
    @Override
    public String toString() {
        return "EmployeeAdapterLdap{" +
                "id='" + employeeLdap.getCn() + '\'' +
                ", firstName='" + employeeLdap.getGivenName() + '\'' +
                ", lastName='" + employeeLdap.getSurname() + '\'' +
                ", email='" + employeeLdap.getMail() + '\'' +
                '}';
    }
}
