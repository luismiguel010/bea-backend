package com.co.penol.bea.persistence.mapper;

import com.co.penol.bea.domain.Job;
import com.co.penol.bea.persistence.entity.JobEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JobMapper {

    @Mappings({
            @Mapping(source = "idJob", target = "idJob"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "state", target = "state"),
    })
    Job toJob(JobEntity jobEntity);
    List<Job> toJobList(List<JobEntity> jobEntityList);

    @InheritInverseConfiguration
    @Mapping(target = "description", ignore = true)
    JobEntity toJobEntity(Job job);
}