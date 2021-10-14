package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.Administrator;
import com.co.penol.bea.domain.dto.AuthenticationRequest;
import com.co.penol.bea.domain.dto.AuthenticationResponse;
import com.co.penol.bea.domain.service.AdministratorService;
import com.co.penol.bea.domain.service.BeaUserDetailService;
import com.co.penol.bea.web.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private BeaUserDetailService beaUserDetailService;

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request) {
        try {
            Optional<Administrator> administrator = administratorService.getAdministratorByEmail(request.getUsername());
            String passwordDB = administrator.map(Administrator::getPassword).orElse("");
            if (request.getPassword().equals(passwordDB)) {
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
                UserDetails userDetails = beaUserDetailService.loadUserByUsername(request.getUsername());
                String jwt = jwtUtil.generateToken(userDetails);
                return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
            }
        }catch (BadCredentialsException badCredentialsException){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }

}
