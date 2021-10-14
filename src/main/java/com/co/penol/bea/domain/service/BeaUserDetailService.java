package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BeaUserDetailService implements UserDetailsService {

    @Autowired
    private AdministratorService administratorService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String password = administratorService.getAdministratorByEmail(username).map(Administrator::getPassword).orElse(null);
        return new User(username, "{noop}"+password, new ArrayList<>());
    }
}
