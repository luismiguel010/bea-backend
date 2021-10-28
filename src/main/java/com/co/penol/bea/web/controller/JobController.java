package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.Job;
import com.co.penol.bea.domain.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/save")
    public ResponseEntity<Job> save(@RequestBody Job job) {
        return new ResponseEntity<>(jobService.saveJob(job), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Job> update(@RequestBody Job job) {
        return new ResponseEntity<>(jobService.saveJob(job),HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Job> getById(@PathVariable("id") String id) {
        return jobService.getJobById(id)
                .map(job -> new ResponseEntity<>(job, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @CrossOrigin("https://beapenol.web.app")
    @GetMapping("/getAll")
    public ResponseEntity<List<Job>> getAll() {
        return new ResponseEntity<>(jobService.getAllJob(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") String id) {
        if(jobService.deleteJob(id)){
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }
}
