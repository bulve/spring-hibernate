package com.alex.spring.service;

import com.alex.spring.model.Library;
import com.alex.spring.repository.LibraryRepository;
import com.alex.spring.service.database.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LibraryService implements com.alex.spring.service.Service<Library> {

    @Autowired
    private LibraryRepository libraryRepository;

    @Override
    public Collection<Library> findAll() {
        return libraryRepository.findAll();
    }

    @Override
    public Library getOne(String id) {
        return libraryRepository.getOne(id);
    }
}
