package com.co.penol.bea.persistence.queries;

import com.co.penol.bea.persistence.entity.AdministratorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AdministratorCrudRepository extends CrudRepository<AdministratorEntity, String> {

}
