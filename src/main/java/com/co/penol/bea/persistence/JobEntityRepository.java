package com.co.penol.bea.persistence;

import com.co.penol.bea.domain.Job;
import com.co.penol.bea.domain.repository.JobRepository;
import com.co.penol.bea.persistence.entity.JobEntity;
import com.co.penol.bea.persistence.mapper.JobMapper;
import com.co.penol.bea.persistence.queries.JobCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JobEntityRepository implements JobRepository {

    @Autowired
    private JobCrudRepository jobCrudRepository;

    @Autowired
    private JobMapper jobMapper;

    @Override
    public void saveJob(Job job) {
        jobCrudRepository.save(jobMapper.toJobEntity(job));
    }

    @Override
    public Optional<Job> getJobById(int id) {
        return jobCrudRepository.findById(id).map(jobEntity -> jobMapper.toJob(jobEntity));
    }

    @Override
    public List<Job> getAllJob() {
        return jobMapper.toJobList((List<JobEntity>) jobCrudRepository.findAll());
    }

    @Override
    public void deleteJob(int id) {
        jobCrudRepository.deleteById(id);
    }
}
