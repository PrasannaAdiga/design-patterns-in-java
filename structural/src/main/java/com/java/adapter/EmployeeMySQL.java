package com.java.adapter;

//Concrete class of Employee, which gets the data from DB
//This class contains same data attributes of Employee
public class EmployeeMySQL implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeMySQL(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    /**
     * NOTE: In adapter pattern basically we should not add any new functionality.
     * If we add new functionality it will become a Decorator pattern.
     * But since we are just overriding toString method of an object to provide better text,
     * this addition of new functionality can be allowed in adapter pattern
     */
    @Override
    public String toString() {
        return "EmployeeMySQL{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
