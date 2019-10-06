package com.alex.spring.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Author extends Person{

    @OneToMany
    private List<Book> books;

    public Author() {
    }

    public Author(String title, String firstName, String lastName, String middleName,
            LocalDate dateOfBirth) {
        super(title, firstName, lastName, middleName, dateOfBirth);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
