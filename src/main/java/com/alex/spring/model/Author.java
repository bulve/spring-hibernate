package com.alex.spring.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Author extends Person{

    public Author() {
    }

    public Author(String title, String firstName, String lastName, String middleName,
            LocalDate dateOfBirth) {
        super(title, firstName, lastName, middleName, dateOfBirth);
    }
}
