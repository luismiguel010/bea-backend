package com.co.penol.bea.persistence;

import com.co.penol.bea.persistence.entity.AdministratorEntity;
import com.co.penol.bea.persistence.queries.AdministratorCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministratorEntityRepository {

    private AdministratorCrudRepository administratorCrudRepository;

    public Optional<AdministratorEntity> getAdministratorById(String id) {
        return administratorCrudRepository.findById(id);
    }

    public List<AdministratorEntity> getAllAdministrator() {
        return (List<AdministratorEntity>) administratorCrudRepository.findAll();
    }

    public void saveAdministrator(AdministratorEntity administratorEntity) {
        administratorCrudRepository.save(administratorEntity);
    }

    public void deleteAdministrator(String id) {
        administratorCrudRepository.deleteById(id);
    }
}
