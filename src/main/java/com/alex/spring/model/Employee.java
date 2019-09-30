package com.alex.spring.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Employee extends Person {

    public Employee() {
    }

    public Employee(String title, String firstName, String lastName, String middleName,
                    LocalDate dateOfBirth) {
        super(title, firstName, lastName, middleName, dateOfBirth);
    }
}
