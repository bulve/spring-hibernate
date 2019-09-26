package com.alex.spring.service.database;

import com.alex.spring.model.Author;
import com.alex.spring.model.Book;
import com.alex.spring.model.Library;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DatabaseService {

    private Collection<Book> harryPotterBooks = Arrays.asList(
            new Book("01", "Harry Potter And sth", "About young kid", Arrays.asList(new Author("01", "Mr", "Antanas", "Baranauskas", null, LocalDate.parse("1921-02-05")))),
            new Book("02", "Harry Potter And sth", "About young kid", Arrays.asList(new Author("01", "Mr", "Antanas", "Baranauskas", null, LocalDate.parse("1921-02-05")))),
            new Book("03", "Harry Potter And sth", "About young kid", Arrays.asList(new Author("01", "Mr", "Antanas", "Baranauskas", null, LocalDate.parse("1921-02-05"))))
    );

    private Collection<Book> lordOfTheRingBooks = Arrays.asList(
            new Book("01", "Lord of The Rings", "About young kid", Arrays.asList(new Author("01", "Mr", "Antanas", "Baranauskas", null, LocalDate.parse("1921-02-05")))),
            new Book("02", "Lord of The Rings", "About young kid", Arrays.asList(new Author("01", "Mr", "Antanas", "Baranauskas", null, LocalDate.parse("1921-02-05")))),
            new Book("03", "Lord of The Rings", "About young kid", Arrays.asList(new Author("01", "Mr", "Antanas", "Baranauskas", null, LocalDate.parse("1921-02-05"))))
    );

    private Collection<Library> libraries = Arrays.asList(
            new Library("01", "Kapsu 11", "Naujamaiestio filialas", harryPotterBooks),
            new Library("02", "Kapsu 11", "Naujamaiestio filialas", lordOfTheRingBooks),
            new Library("03", "Kapsu 11", "Naujamaiestio filialas", Collections.emptyList())
    );


    public Collection<Book> getBooks() {
        return Stream.of(lordOfTheRingBooks, harryPotterBooks)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public Collection<Book> getLibraryBooks(String libraryId) {
        return libraries.stream()
                .filter(library -> library.getId().equals(libraryId))
                .findFirst()
                .map(Library::getBooks)
                .orElse(Collections.emptyList());
    }
}
