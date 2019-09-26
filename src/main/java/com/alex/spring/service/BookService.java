package com.alex.spring.service;

import com.alex.spring.model.Book;
import com.alex.spring.service.database.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    @Autowired
    private DatabaseService databaseService;

    public Collection<Book> getBooks() {
        return databaseService.getBooks();
    }

}
