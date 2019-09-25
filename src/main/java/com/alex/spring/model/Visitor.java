package com.alex.spring.model;

import java.time.LocalDate;

public class Visitor extends Person {
    public Visitor(String id, String title, String firstName, String lastName, String middleName,
            LocalDate dateOfBirth) {
        super(id, title, firstName, lastName, middleName, dateOfBirth);
    }
}
