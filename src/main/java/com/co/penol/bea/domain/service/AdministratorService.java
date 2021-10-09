package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.Administrator;
import com.co.penol.bea.domain.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    public Optional<Administrator> getAdministratorById(String id) {
        return administratorRepository.getAdministratorById(id);
    }

    public Administrator saveAdministrator(Administrator administrator) {
        return administratorRepository.saveAdministrator(administrator);
    }

    public boolean deleteAdministrator(String id) {
        return getAdministratorById(id).map(administrator -> {
            administratorRepository.deleteAdministrator(id);
            return true;
        }).orElse(false);
    }
}
