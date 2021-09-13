package com.co.penol.bea.persistence;

import com.co.penol.bea.persistence.entity.JobEntity;
import com.co.penol.bea.persistence.queries.JobCrudRepository;

import java.util.List;
import java.util.Optional;

public class JobEntityRepository {

    private JobCrudRepository jobCrudRepository;

    public void saveJob(JobEntity jobEntity) {
        jobCrudRepository.save(jobEntity);
    }

    public Optional<JobEntity> getJobById(int id) {
        return jobCrudRepository.findById(id);
    }

    public List<JobEntity> getAllJobs() {
        return (List<JobEntity>) jobCrudRepository.findAll();
    }

    public void deleteJob(int id) {
        jobCrudRepository.deleteById(id);
    }
}
