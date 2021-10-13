package com.co.penol.bea.domain.validates;

import com.co.penol.bea.domain.User;
import com.co.penol.bea.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserValidate {

    @Autowired
    private UserRepository userRepository;

    public boolean validateFields(User user) {
        if(userRepository.existUserByIdentificationCard(user.getIdentificationCard())) {
            return false;
        } else if (userRepository.isExistUser(user.getIdUser())) {
            return false;
        } else {
            return true;
        }
    }

}
