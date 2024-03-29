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
    public User saveUser(User user) {
        return userMapper.toUser(userCrudRepository.save(userMapper.toUserEntity(user)));
    }

    @Override
    public Optional<User> getUserById(String id) {
        return userCrudRepository.findById(id).map(userEntity -> userMapper.toUser(userEntity));
    }

    @Override
    public boolean existUserByIdentificationCard(String identificationCard) {
        return userCrudRepository.findByIdentificationCard(identificationCard).isPresent();
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.toUsers((List<UserEntity>) userCrudRepository.findAll());
    }

    @Override
    public void deleteUserById(String id) {
        userCrudRepository.deleteById(id);
    }

    @Override
    public boolean isExistUser(String id) {
        return userCrudRepository.existsById(id);
    }
}
