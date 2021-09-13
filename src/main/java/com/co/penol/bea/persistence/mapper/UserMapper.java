package com.co.penol.bea.persistence.mapper;

import com.co.penol.bea.domain.User;
import com.co.penol.bea.persistence.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CVMapper.class})
public interface UserMapper {

    @Mappings({
            @Mapping(source = "idUser", target = "idUser"),
            @Mapping(source = "names", target = "names"),
            @Mapping(source = "lastnames", target = "lastnames"),
            @Mapping(source = "phone", target = "phone"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "academicProfile", target = "academicProfile"),
            @Mapping(source = "cvEntity", target = "cv"),
    })
    User toUser(UserEntity userEntity);
    List<User> toUsers(List<UserEntity> userEntityList);

    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);
}
