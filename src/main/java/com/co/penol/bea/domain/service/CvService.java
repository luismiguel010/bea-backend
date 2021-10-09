package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.CV;
import com.co.penol.bea.domain.repository.CvRepository;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CvService {

    @Autowired
    private CvRepository cvRepository;

    @Autowired
    AzureBlobService azureBlobService;

    public List<CV> getAll() {
        return cvRepository.getAll();
    }

    public CV saveCv(CV cv, MultipartFile multipartFile) {
        String fileName = cv.getDirectoryFile() + "-" +
                cv.getIdCv();
        cv.setDirectoryFile(fileName);
        CV cvResponse = cvRepository.saveCv(cv);
        azureBlobService.upload(multipartFile, fileName);
        return cvResponse;
    }

    public Optional<CV> getByIdCv(String id) {
        return cvRepository.getByIdCv(id);
    }

    public Optional<CV> getByIdUser(String id) {
        return cvRepository.getByIdUser(id);
    }

    public boolean deleteCv(String id) {
        return getByIdCv(id).map(cv -> {
            cvRepository.deleteCv(id);
            return true;
        }).orElse(false);
    }
}
