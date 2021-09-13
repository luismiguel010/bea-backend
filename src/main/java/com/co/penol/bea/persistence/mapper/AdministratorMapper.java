package com.co.penol.bea.persistence.mapper;

import com.co.penol.bea.domain.Administrator;
import com.co.penol.bea.persistence.entity.AdministratorEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AdministratorMapper {
    @Mappings({
            @Mapping(source = "idAdmin", target = "idAdmin"),
            @Mapping(source = "names", target = "names"),
            @Mapping(source = "lastnames", target = "lastnames"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "password", target = "password"),
    })
    Administrator toAdministrator(AdministratorEntity administratorEntity);

    @InheritInverseConfiguration
    AdministratorEntity toAdministratorEntity(Administrator administrator);
}
