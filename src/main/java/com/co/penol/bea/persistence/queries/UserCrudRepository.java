package com.co.penol.bea.persistence.queries;

import com.co.penol.bea.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<UserEntity, Integer> {
    Optional<UserEntity> findByIdentificationCard(String identificationCard);
}
