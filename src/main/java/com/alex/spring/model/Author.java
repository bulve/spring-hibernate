package com.alex.spring.model;

import java.time.LocalDate;

public class Author extends Person{

    public Author(String id, String title, String firstName, String lastName, String middleName,
            LocalDate dateOfBirth) {
        super(id, title, firstName, lastName, middleName, dateOfBirth);
    }
}
