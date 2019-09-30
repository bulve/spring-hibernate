package com.alex.spring.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Visitor extends Person {


    public Visitor() {
    }

    public Visitor(String title, String firstName, String lastName, String middleName,
                   LocalDate dateOfBirth) {
        super(title, firstName, lastName, middleName, dateOfBirth);
    }
}
