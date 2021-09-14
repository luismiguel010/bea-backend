package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.CV;
import com.co.penol.bea.domain.repository.CvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CvService {

    @Autowired
    private CvRepository cvRepository;

    public List<CV> getAll() {
        return cvRepository.getAll();
    }

    public void saveCv(CV cv) {
        cvRepository.saveCv(cv);
    }

    public Optional<CV> getByIdCv(int id) {
        return cvRepository.getByIdCv(id);
    }

    public CV getByIdUser(int id) {
        return cvRepository.getByIdUser(id);
    }

    public boolean deleteCv(int id) {
        return getByIdCv(id).map(cv -> {
            cvRepository.deleteCv(id);
            return true;
        }).orElse(false);
    }
}
