package com.alex.spring.model;

import java.util.Collection;

public class Library {

    private String id;

    private String address;

    private String name;

    private Collection<Book> books;

    public Library() {
    }

    public Library(String id, String address, String name, Collection<Book> books) {
        this.id = id;
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
