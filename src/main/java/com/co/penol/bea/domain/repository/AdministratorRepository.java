package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.Administrator;

import java.util.Optional;

public interface AdministratorRepository {
    Optional<Administrator> getAdministratorById(String id);
    void saveAdministrator(Administrator administrator);
    void deleteAdministrator(String id);
}
