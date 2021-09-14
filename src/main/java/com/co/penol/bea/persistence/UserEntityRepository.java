package com.co.penol.bea.persistence;

import com.co.penol.bea.domain.User;
import com.co.penol.bea.domain.repository.UserRepository;
import com.co.penol.bea.persistence.entity.UserEntity;
import com.co.penol.bea.persistence.mapper.UserMapper;
import com.co.penol.bea.persistence.queries.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserEntityRepository implements UserRepository {

    @Autowired
    private UserCrudRepository userCrudRepository;

    @Autowired
    private UserMapper userMapper;


    @Override
    public void saveUser(User user) {
        userCrudRepository.save(userMapper.toUserEntity(user));
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userCrudRepository.findById(id).map(userEntity -> userMapper.toUser(userEntity));
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.toUsers((List<UserEntity>) userCrudRepository.findAll());
    }

    @Override
    public void deleteUserById(int id) {
        userCrudRepository.deleteById(id);
    }
}
