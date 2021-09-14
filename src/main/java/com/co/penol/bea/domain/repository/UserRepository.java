package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void saveUser(User user);
    Optional<User> getUserById(int id);
    List<User> getAllUser();
    void deleteUserById(int id);
}
