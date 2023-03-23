package com.devrezaur.main.service.impl;

import com.devrezaur.main.model.Admin;
import com.devrezaur.main.repository.AdminValidationRepository;
import com.devrezaur.main.service.AdminValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminValidationServiceImple implements AdminValidationService {
    @Autowired
    private AdminValidationRepository adminValidationRepository;
    @Override
    public Admin save(Admin admin) {
        return adminValidationRepository.save(admin);
    }

    @Override
    public Admin findById(Long id) {
        return adminValidationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Admin> findAll() {
        return adminValidationRepository.findAll();
    }

    @Override
    public void delete(Admin admin) {
adminValidationRepository.delete(admin);
    }

    @Override
    public void deleteById(Long id) {
adminValidationRepository.deleteById(id);
    }
}
