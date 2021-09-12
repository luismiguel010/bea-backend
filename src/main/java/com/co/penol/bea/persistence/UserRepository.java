package com.co.penol.bea.persistence;

import com.co.penol.bea.persistence.entity.User;
import com.co.penol.bea.persistence.queries.UserCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private UserCrudRepository userCrudRepository;

    public void createUser(User user) {
        userCrudRepository.save(user);
    }

    public Optional<User> getUserById(String id) {
        return userCrudRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return (List<User>) userCrudRepository.findAll();
    }

    public void deleteUserById(String id) {
        userCrudRepository.deleteById(id);
    }
}
