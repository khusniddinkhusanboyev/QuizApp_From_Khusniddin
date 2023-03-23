package com.devrezaur.main.service.impl;

import com.devrezaur.main.model.User;
import com.devrezaur.main.repository.SignUpRepository;
import com.devrezaur.main.service.SignUpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignUpServiceImpl implements SignUpService {

    private final SignUpRepository signUpRepository;
    public SignUpServiceImpl(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

    @Override
    public User save(User user) {
        return signUpRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return signUpRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return signUpRepository.findAll();
    }

    @Override
    public void delete(User user) {
        signUpRepository.delete(user);
    }

    @Override
    public void deleteById(Long id) {
        signUpRepository.deleteById(id);
    }
}
