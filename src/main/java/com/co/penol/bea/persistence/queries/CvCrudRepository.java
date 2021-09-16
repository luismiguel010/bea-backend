package com.co.penol.bea.persistence.queries;

import com.co.penol.bea.persistence.entity.CVEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CvCrudRepository extends CrudRepository<CVEntity, Integer> {
    Optional<CVEntity> findByIdUser(int idUser);
}
