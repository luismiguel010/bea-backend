package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.Aliado;
import com.co.penol.bea.domain.repository.AliadoRepository;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class AliadoService {
    @Autowired
    private AliadoRepository aliadoRepository;
    @Autowired
    private AzureBlobService azureBlobService;

    public Optional<Aliado> getAliadoById(String id) {
        return aliadoRepository.getAliadoById(id);
    }

    public Aliado saveAliado(Aliado aliado, MultipartFile multipartFile) {
        String fileName = aliado.getIdAliado() + "." + FilenameUtils.getExtension(multipartFile.getOriginalFilename());
        aliado.setLogo(fileName);
        Aliado aliadoResponse = aliadoRepository.saveAliado(aliado);
        azureBlobService.upload(multipartFile, fileName);
        return aliadoResponse;
    }

    public List<Aliado> getAllAliado() {
        return aliadoRepository.getAllAliado();
    }

    public boolean deleteAliado(String id) {
        return getAliadoById(id).map(aliado -> {
            aliadoRepository.deleteAliado(id);
            azureBlobService.deleteFile(aliado.getLogo());
            return true;
        }).orElse(false);
    }
}
