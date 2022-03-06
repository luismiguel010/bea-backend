package com.co.penol.bea.persistence.mapper;

import com.co.penol.bea.domain.Capacitacion;
import com.co.penol.bea.persistence.entity.CapacitacionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CapacitacionMapper {
    @Mappings({
            @Mapping(source = "idCapacitacion", target = "idCapacitacion"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "objetivo", target = "objetivo"),
            @Mapping(source = "dirigido", target = "dirigido"),
            @Mapping(source = "contenido", target = "contenido"),
            @Mapping(source = "requisitos", target = "requisitos"),
            @Mapping(source = "facilitador", target = "facilitador"),
            @Mapping(source = "state", target = "state"),
            @Mapping(source = "dateInit", target = "dateInit"),
            @Mapping(source = "dateFinish", target = "dateFinish"),
            @Mapping(source = "categoria", target = "categoria"),
            @Mapping(source = "modalidad", target = "modalidad"),
            @Mapping(source = "contactos", target = "contactos"),
            @Mapping(source = "lugar", target = "lugar"),
            @Mapping(source = "cupos", target = "cupos"),
    })
    Capacitacion toCapacitacion(CapacitacionEntity capacitacionEntity);
    List<Capacitacion> toCapacitacionList(List<CapacitacionEntity> capacitacionEntityList);

    @InheritInverseConfiguration
    CapacitacionEntity toCapacitacionEntity(Capacitacion capacitacion);
}
