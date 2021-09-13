package com.co.penol.bea.persistence;

import com.co.penol.bea.persistence.entity.UserEntity;
import com.co.penol.bea.persistence.queries.UserCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private UserCrudRepository userCrudRepository;

    public void createUser(UserEntity userEntity) {
        userCrudRepository.save(userEntity);
    }

    public Optional<UserEntity> getUserById(int id) {
        return userCrudRepository.findById(id);
    }

    public List<UserEntity> getAllUsers() {
        return (List<UserEntity>) userCrudRepository.findAll();
    }

    public void deleteUserById(int id) {
        userCrudRepository.deleteById(id);
    }
}
