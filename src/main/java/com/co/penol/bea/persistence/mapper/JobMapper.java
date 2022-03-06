package com.co.penol.bea.persistence.mapper;

import com.co.penol.bea.domain.Job;
import com.co.penol.bea.persistence.entity.JobEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {JobCvMapper.class})
public interface JobMapper {

    @Mappings({
            @Mapping(source = "idJob", target = "idJob"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "requisito", target = "requisito"),
            @Mapping(source = "state", target = "state"),
            @Mapping(source = "dateInit", target = "dateInit"),
            @Mapping(source = "dateFinish", target = "dateFinish"),
            @Mapping(source = "salary", target = "salary"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "company", target = "company"),
            @Mapping(source = "category", target = "category"),
    })
    Job toJob(JobEntity jobEntity);
    List<Job> toJobList(List<JobEntity> jobEntityList);

    @InheritInverseConfiguration
    JobEntity toJobEntity(Job job);
}
