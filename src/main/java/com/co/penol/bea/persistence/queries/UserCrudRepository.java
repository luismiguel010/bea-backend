package com.co.penol.bea.persistence.queries;

import com.co.penol.bea.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<UserEntity, Integer> {
}
