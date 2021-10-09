package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.Administrator;

import java.util.Optional;
import java.util.UUID;

public interface AdministratorRepository {
    Optional<Administrator> getAdministratorById(String id);
    Administrator saveAdministrator(Administrator administrator);
    void deleteAdministrator(String id);
}
