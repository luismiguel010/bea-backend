package com.co.penol.bea.persistence.queries;

import com.co.penol.bea.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, String> {
}
