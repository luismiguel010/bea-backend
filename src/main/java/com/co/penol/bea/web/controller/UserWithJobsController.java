package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.UserWithJobs;
import com.co.penol.bea.domain.service.UserWithJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userwithjobs")
public class UserWithJobsController {

    @Autowired
    private UserWithJobsService userWithJobsService;

    @GetMapping("/getAll")
    public ResponseEntity<List<UserWithJobs>> getAll() {
        return new ResponseEntity<>(userWithJobsService.getAllUserWithJobs(), HttpStatus.OK);
    }
}
