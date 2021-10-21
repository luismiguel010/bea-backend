package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.CV;
import com.co.penol.bea.domain.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @PostMapping(
            value = "/save",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE}
    )
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

    @GetMapping("/getByIdUser/{id}")
    public ResponseEntity<CV> getByIdUser(@PathVariable("id") String id) {
        return cvService.getByIdUser(id)
                .map(cv -> new ResponseEntity<>(cv, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") String id) {
        if (cvService.deleteCv(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
