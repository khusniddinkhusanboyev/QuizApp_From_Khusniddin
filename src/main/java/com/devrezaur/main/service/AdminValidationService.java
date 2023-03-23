package com.devrezaur.main.service;

import com.devrezaur.main.model.Admin;

import java.util.List;

public interface AdminValidationService {
    Admin save(Admin  admin);
    Admin findById(Long id);
    List<Admin> findAll();
    void delete(Admin admin);
    void deleteById(Long id);
}
