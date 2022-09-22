package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.Capacitacion;
import com.co.penol.bea.domain.service.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/capacitacion")
public class CapacitacionController {

    @Autowired
    private CapacitacionService capacitacionService;

    @PostMapping("/save")
    public ResponseEntity<Capacitacion> save(@RequestBody Capacitacion capacitacion) {
        return new ResponseEntity<>(capacitacionService.saveCapacitacion(capacitacion), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Capacitacion> update(@RequestBody Capacitacion capacitacion) {
        return new ResponseEntity<>(capacitacionService.saveCapacitacion(capacitacion), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Capacitacion> getById(@PathVariable("id") String id) {
        return capacitacionService.getCapacitacionById(id)
                .map(capacitacion -> new ResponseEntity<>(capacitacion, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @CrossOrigin(origins = "https://beapenol.web.app")
    @GetMapping("/getAll")
    public ResponseEntity<List<Capacitacion>> getAll() {
        return new ResponseEntity<>(capacitacionService.getAllCapacitacion(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") String id) {
        if(capacitacionService.deleteCapacitacion(id)){
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }



}
