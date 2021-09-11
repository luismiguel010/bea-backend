package com.co.penol.bea.persistence.queries;

import com.co.penol.bea.persistence.entity.CV;
import org.springframework.data.repository.CrudRepository;

public interface CvCrudRepository extends CrudRepository<CV, Integer> {
    CV findByIdUser(int idUser);
}
