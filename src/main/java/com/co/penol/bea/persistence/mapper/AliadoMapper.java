package com.co.penol.bea.persistence.mapper;

import com.co.penol.bea.domain.Aliado;
import com.co.penol.bea.persistence.entity.AliadoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AliadoMapper {
    @Mappings({
            @Mapping(source = "idAliado", target = "idAliado"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "logo", target = "logo"),
    })
    Aliado toAliado(AliadoEntity aliadoEntity);
    List<Aliado> toAliados(List<AliadoEntity> aliadoEntityList);

    @InheritInverseConfiguration
    AliadoEntity toAliadoEntity(Aliado aliado);
}
