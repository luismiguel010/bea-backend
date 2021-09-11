package com.co.penol.bea.persistence;

import com.co.penol.bea.persistence.entity.Administrator;
import com.co.penol.bea.persistence.queries.AdministratorCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministratorRepository {

    private AdministratorCrudRepository administratorCrudRepository;

    public Optional<Administrator> getAdministratorById(String id) {
        return administratorCrudRepository.findById(id);
    }

    public List<Administrator> getAllAdministrator() {
        return (List<Administrator>) administratorCrudRepository.findAll();
    }

    public void saveAdministrator(Administrator administrator) {
        administratorCrudRepository.save(administrator);
    }

    public void deleteAdministrator(String id) {
        administratorCrudRepository.deleteById(id);
    }
}
