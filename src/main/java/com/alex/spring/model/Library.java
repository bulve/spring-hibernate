package com.alex.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Library {

    @Id
    @GeneratedValue
    private String id;

    private String address;

    private String name;

    @ManyToMany
    private Collection<Book> books;

    public Library() {
    }

    public Library(String address, String name, Collection<Book> books) {
        this.address = address;
        this.name = name;
        this.books = books;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

}
