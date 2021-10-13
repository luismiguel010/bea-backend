package com.co.penol.bea.web.controller;

import com.co.penol.bea.domain.service.AzureBlobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/blob")
public class BlobController {

    @Autowired
    AzureBlobService azureBlobService;

    @GetMapping(path = "/download/formato")
    public ResponseEntity<Resource> downloadFormato() throws IOException {
        String file = "formulario-bea.xlsx";
        byte[] data = azureBlobService.getFile(file);
        ByteArrayResource resource = new ByteArrayResource(data);

        return ResponseEntity
                .ok()
                .header("Content-type", "application/octet-stream")
                .header("Content-disposition", "attachment; filename=\"" + file + "\"")
                .body(resource);
    }
}
