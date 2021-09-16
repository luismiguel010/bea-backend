package com.co.penol.bea.persistence.mapper;

import com.co.penol.bea.domain.JobCv;
import com.co.penol.bea.persistence.entity.JobCvEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {CVMapper.class})
public interface JobCvMapper {
    @Mappings({
            @Mapping(source = "id.idCv", target = "idCv"),
            @Mapping(source = "id.idJob", target = "idJob")
    })
    JobCv toJobCv(JobCvEntity jobCvEntity);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "jobEntity", ignore = true),
            @Mapping(target = "cvEntity", ignore = true)
    })
    JobCvEntity toJobCvEntity(JobCv jobCv);
}
