package com.devrezaur.main.service;

import com.devrezaur.main.model.User;

import java.util.List;

public interface SignUpService {
    User save(User user);
    User findById(Long id);
    List<User> findAll();
    void delete(User user);
    void deleteById(Long id);
}
