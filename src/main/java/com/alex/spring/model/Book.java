package com.alex.spring.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    @NotNull
    private String title;

    private String about;

    @OneToMany
    private List<Author> authors;

    public Book() {
    }

    public Book(String id, String title, String about, List<Author> authors) {
        this.id = id;
        this.title = title;
        this.about = about;
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

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
