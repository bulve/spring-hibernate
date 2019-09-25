package com.alex.spring.model;

import java.time.LocalDate;

public class Person {

    private String id;

    private String title;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate dateOfBirth;

    public Person(String id, String title, String firstName, String lastName, String middleName,
            LocalDate dateOfBirth) {
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
