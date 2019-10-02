package com.alex.spring.service;

import com.alex.spring.model.Book;
import com.alex.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService implements com.alex.spring.service.Service<Book> {

    @Autowired
    private BookRepository repository;

    @Override
    public Collection<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book getOne(String id) {
        return repository.getOne(id);
    }

    public Book addOne(Book book) {
        return repository.save(book);
    }
}
