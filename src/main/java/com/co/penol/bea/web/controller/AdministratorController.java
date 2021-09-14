package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.Administrator;
import com.co.penol.bea.domain.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    public Optional<Administrator> getAdministratorById(String id) {
        return administratorService.getAdministratorById(id);
    }

    public void saveAdministrator(Administrator administrator) {
        administratorService.saveAdministrator(administrator);
    }

    public boolean deleteAdministrator(String id) {
        return administratorService.deleteAdministrator(id);
    }

}
