package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.CV;
import com.co.penol.bea.domain.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cv")
public class CvController {

    @Autowired
    private CvService cvService;

    @GetMapping("/all")
    public ResponseEntity<List<CV>> getAll() {
        return new ResponseEntity<>(cvService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<CV> save(@RequestBody CV cv) {
        return new ResponseEntity<>(cvService.saveCv(cv), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<CV> update(@RequestBody CV cv) {
        return new ResponseEntity<>(cvService.saveCv(cv), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CV> getById(@PathVariable("id") int id) {
        return cvService.getByIdCv(id)
                .map(cv -> new ResponseEntity<>(cv, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getIdUser/{id}")
    public ResponseEntity<CV> getByIdUser(@PathVariable("id") int id) {
        return cvService.getByIdUser(id)
                .map(cv -> new ResponseEntity<>(cv, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int id) {
        if (cvService.deleteCv(id)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }



}