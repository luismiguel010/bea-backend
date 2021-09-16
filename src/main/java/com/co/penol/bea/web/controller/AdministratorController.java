package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.Administrator;
import com.co.penol.bea.domain.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping("/get")
    public ResponseEntity<Administrator> getAdministratorById(int id) {
        return administratorService.getAdministratorById(id)
                .map(administrator -> new ResponseEntity<>(administrator, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/insert")
    public ResponseEntity<Administrator> saveAdministrator(@RequestBody Administrator administrator) {
        return new ResponseEntity<>(administratorService.saveAdministrator(administrator), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Administrator> updateAdministrator(@RequestBody Administrator administrator) {
        return new ResponseEntity<>(administratorService.saveAdministrator(administrator), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteAdministrator(int id) {
        if (administratorService.deleteAdministrator(id)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
