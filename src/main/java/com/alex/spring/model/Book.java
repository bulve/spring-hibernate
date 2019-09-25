package com.alex.spring.model;

import java.util.List;

public class Book {

    private String id;

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
