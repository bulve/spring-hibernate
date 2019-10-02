package com.alex.spring.service;

import java.util.Collection;

public interface Service<T> {

    Collection<T> findAll();

    T getOne(String id);
}
