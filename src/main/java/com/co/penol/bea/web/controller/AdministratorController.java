package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.Administrator;
import com.co.penol.bea.domain.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping("/get")
    public Optional<Administrator> getAdministratorById(int id) {
        return administratorService.getAdministratorById(id);
    }

    @PostMapping("/insert")
    public void saveAdministrator(@RequestBody Administrator administrator) {
        administratorService.saveAdministrator(administrator);
    }

    @PutMapping("/update")
    public void updateAdministrator(@RequestBody Administrator administrator) {
        administratorService.saveAdministrator(administrator);
    }

    @DeleteMapping("/delete")
    public boolean deleteAdministrator(int id) {
        return administratorService.deleteAdministrator(id);
    }

}
