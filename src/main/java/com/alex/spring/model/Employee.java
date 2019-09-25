package com.alex.spring.model;

import java.time.LocalDate;

public class Employee extends Person {

    public Employee(String id, String title, String firstName, String lastName, String middleName,
            LocalDate dateOfBirth) {
        super(id, title, firstName, lastName, middleName, dateOfBirth);
    }
}
