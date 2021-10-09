package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.User;
import com.co.penol.bea.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public Optional<User> getUserById(String id) {
        return userRepository.getUserById(id);
    }

    public boolean existUserByIdentificationCard(String identificationCard) {
        return userRepository.existUserByIdentificationCard(identificationCard);
    }

    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }

    public boolean deleteUserById(String id) {
        return getUserById(id).map(user -> {
            userRepository.deleteUserById(id);
            return true;
        }).orElse(false);
    }
}
