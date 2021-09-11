package com.co.penol.bea.persistence;

import com.co.penol.bea.persistence.entity.Job;
import com.co.penol.bea.persistence.queries.JobCrudRepository;

import java.util.List;
import java.util.Optional;

public class JobRepository {

    private JobCrudRepository jobCrudRepository;

    public void saveJob(Job job) {
        jobCrudRepository.save(job);
    }

    public Optional<Job> getJobById(int id) {
        return jobCrudRepository.findById(id);
    }

    public List<Job> getAllJobs() {
        return (List<Job>) jobCrudRepository.findAll();
    }

    public void deleteJob(int id) {
        jobCrudRepository.deleteById(id);
    }
}
