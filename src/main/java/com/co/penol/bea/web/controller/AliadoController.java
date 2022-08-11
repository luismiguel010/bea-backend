package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.Aliado;
import com.co.penol.bea.domain.service.AliadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/aliado")
public class AliadoController {
    @Autowired
    private AliadoService aliadoService;

    @GetMapping("/get")
    public ResponseEntity<Aliado> getAliadoById(String id) {
        return aliadoService.getAliadoById(id)
                .map(aliado -> new ResponseEntity<>(aliado, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Aliado>> getAll() {
        return new ResponseEntity<>(aliadoService.getAllAliado(), HttpStatus.OK);
    }

    @PostMapping(value = "/save",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Aliado> save(@RequestPart("aliado") Aliado aliado, @RequestPart("file") MultipartFile file) {
        return new ResponseEntity<>(aliadoService.saveAliado(aliado, file), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteAliado(@PathVariable("id") String id) {
        if(aliadoService.deleteAliado(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
