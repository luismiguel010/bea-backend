package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.Job;

import java.util.List;
import java.util.Optional;

public interface JobRepository {
    void saveJob(Job job);
    Optional<Job> getJobById(int id);
    List<Job> getAllJob();
    void deleteJob(int id);
}
