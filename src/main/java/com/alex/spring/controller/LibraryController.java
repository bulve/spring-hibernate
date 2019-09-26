package com.alex.spring.controller;

import com.alex.spring.model.Book;
import com.alex.spring.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController()
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/{libraryId}")
    public Collection<Book> getLibraryBooks(@PathVariable("libraryId") String libraryId) {
        return libraryService.getLibraryBooks(libraryId);
    }
}
