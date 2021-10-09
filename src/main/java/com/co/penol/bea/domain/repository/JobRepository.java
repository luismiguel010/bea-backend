package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.Job;

import java.util.List;
import java.util.Optional;

public interface JobRepository {
    Job saveJob(Job job);
    Optional<Job> getJobById(String id);
    List<Job> getAllJob();
    void deleteJob(String id);
}
