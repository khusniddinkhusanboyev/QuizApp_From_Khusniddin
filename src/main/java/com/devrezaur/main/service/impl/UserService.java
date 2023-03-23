package com.devrezaur.main.service.impl;

import com.devrezaur.main.model.User;
import com.devrezaur.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElse(new User());
    }
}
