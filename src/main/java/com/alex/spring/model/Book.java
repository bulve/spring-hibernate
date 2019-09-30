package com.alex.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private String id;

    @NotNull
    private String title;

    private String about;

    private List<Author> authors;

    public Book(String id, String title, String about, List<Author> authors) {
        this.id = id;
        this.title = title;
        this.about = about;
        this.authors = authors;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAbout() {
        return about;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
