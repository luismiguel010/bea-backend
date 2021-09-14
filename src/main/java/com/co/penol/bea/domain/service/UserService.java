package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.User;
import com.co.penol.bea.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    public Optional<User> getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }

    public boolean deleteUserById(int id) {
        return getUserById(id).map(user -> {
            userRepository.deleteUserById(id);
            return true;
        }).orElse(false);
    }
}
