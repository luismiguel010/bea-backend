package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.CV;
import com.co.penol.bea.domain.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cv")
public class CvController {

    @Autowired
    private CvService cvService;

    @GetMapping("/all")
    public ResponseEntity<List<CV>> getAll() {
        return new ResponseEntity<>(cvService.getAll(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/save")
    public ResponseEntity<CV> save(@RequestPart("cv") CV cv, @RequestPart("file") MultipartFile file) {
        return new ResponseEntity<>(cvService.saveCv(cv, file), HttpStatus.CREATED);
    }

    // Servicio a implementar en un futuro
    /*@PutMapping("/update")
    public ResponseEntity<CV> update(@RequestBody CV cv) {
        return new ResponseEntity<>(cvService.saveCv(cv), HttpStatus.OK);
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<CV> getById(@PathVariable("id") String id) {
        return cvService.getByIdCv(id)
                .map(cv -> new ResponseEntity<>(cv, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getIdUser/{id}")
    public ResponseEntity<CV> getByIdUser(@PathVariable("id") String id) {
        return cvService.getByIdUser(id)
                .map(cv -> new ResponseEntity<>(cv, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") String id) {
        if (cvService.deleteCv(id)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }



}
