package com.co.penol.bea.persistence.queries;

import com.co.penol.bea.persistence.entity.CVEntity;
import org.springframework.data.repository.CrudRepository;

public interface CvCrudRepository extends CrudRepository<CVEntity, Integer> {
    CVEntity findByIdUser(int idUser);
}
