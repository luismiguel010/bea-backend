package com.co.penol.bea.persistence.queries;

import com.co.penol.bea.persistence.entity.JobEntity;
import org.springframework.data.repository.CrudRepository;

public interface JobCrudRepository extends CrudRepository<JobEntity, Integer> {
}
