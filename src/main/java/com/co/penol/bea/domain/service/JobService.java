package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.Job;
import com.co.penol.bea.domain.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public void saveJob(Job job) {
        jobRepository.saveJob(job);
    }

    public Optional<Job> getJobById(int id) {
        return jobRepository.getJobById(id);
    }

    public List<Job> getAllJob() {
        return jobRepository.getAllJob();
    }

    public boolean deleteJob(int id) {
        return getJobById(id).map(job -> {
            jobRepository.deleteJob(id);
            return true;
        }).orElse(false);
    }
}
