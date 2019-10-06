package com.alex.spring.controller;

import com.alex.spring.model.Book;
import com.alex.spring.model.Library;
import com.alex.spring.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController()
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/books/{libraryId}")
    public Collection<Book> getLibraryBooks(@PathVariable("libraryId") String libraryId) {
        return libraryService.getOne(libraryId).getBooks();
    }

    @GetMapping()
    public Collection<Library> getLibraries() {
        return libraryService.findAll();
    }

    @PostMapping()
    public Library saveLibrary(@RequestBody Library library) {
        return libraryService.saveOne(library);
    }

    @GetMapping("/{libraryId}")
    public Library getLibrary(@PathVariable("libraryId") String libraryId) {
        return libraryService.getOne(libraryId);
    }
}
