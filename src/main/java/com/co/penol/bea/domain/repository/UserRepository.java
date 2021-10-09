package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User saveUser(User user);
    Optional<User> getUserById(String id);
    boolean existUserByIdentificationCard(String identificationCard);
    List<User> getAllUser();
    void deleteUserById(String id);
}
