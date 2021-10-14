package com.co.penol.bea.persistence;

import com.co.penol.bea.domain.Administrator;
import com.co.penol.bea.domain.repository.AdministratorRepository;
import com.co.penol.bea.persistence.mapper.AdministratorMapper;
import com.co.penol.bea.persistence.queries.AdministratorCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AdministratorEntityRepository implements AdministratorRepository {

    @Autowired
    private AdministratorCrudRepository administratorCrudRepository;

    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Optional<Administrator> getAdministratorById(String id) {
        return administratorCrudRepository.findById(id).map(administrator -> administratorMapper.toAdministrator(administrator));
    }

    @Override
    public Administrator saveAdministrator(Administrator administrator) {
        return administratorMapper.toAdministrator(administratorCrudRepository
                .save(administratorMapper.toAdministratorEntity(administrator)));
    }

    @Override
    public void deleteAdministrator(String id) {
        administratorCrudRepository.deleteById(id);
    }
}
