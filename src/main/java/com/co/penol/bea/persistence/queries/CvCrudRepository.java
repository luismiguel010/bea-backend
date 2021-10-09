package com.co.penol.bea.persistence.queries;

import com.co.penol.bea.persistence.entity.CVEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface CvCrudRepository extends CrudRepository<CVEntity, String> {
    Optional<CVEntity> findByIdUser(String idUser);
}
