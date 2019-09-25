package com.alex.spring.controller;

import com.alex.spring.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
public class LibraryController {


    @GetMapping
    public Collection<Book> getBooks() {
        return Collections.emptyList();
    }
}
