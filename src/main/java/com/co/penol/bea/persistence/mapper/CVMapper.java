package com.co.penol.bea.persistence.mapper;

import com.co.penol.bea.domain.CV;
import com.co.penol.bea.persistence.entity.CVEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface CVMapper {

    @Mappings({
            @Mapping(source = "idCv", target = "idCv"),
            @Mapping(source = "idUser", target = "idUser"),
            @Mapping(source = "directoryFile", target = "directoryFile"),
            @Mapping(source = "dateReceived", target = "dateReceived"),
            @Mapping(source = "userEntity", target = "user"),
    })
    CV toCV(CVEntity cvEntity);
    List<CV> toCVList(List<CVEntity> cvEntityList);

    @InheritInverseConfiguration
    CVEntity toCVEntity(CV cv);
}