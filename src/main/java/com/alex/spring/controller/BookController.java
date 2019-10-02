package com.alex.spring.controller;

import com.alex.spring.model.Book;
import com.alex.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController()
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Collection<Book> getBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable("bookId") String bookId) {
        return bookService.getOne(bookId);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookService.addOne(book);
    }
}
