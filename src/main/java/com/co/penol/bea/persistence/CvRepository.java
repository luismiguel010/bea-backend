package com.co.penol.bea.persistence;

import com.co.penol.bea.persistence.entity.CV;
import com.co.penol.bea.persistence.queries.CvCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CvRepository {

    private CvCrudRepository cvCrudRepository;

    public List<CV> getAll() {
        return (List<CV>) cvCrudRepository.findAll();
    }
    
    public void saveCv(CV cv) {
        cvCrudRepository.save(cv);
    }
    
    public Optional<CV> getByIdCv(int idCv) {
        return cvCrudRepository.findById(idCv);
    }

    public CV getByIdUser(int idUser) {
        return cvCrudRepository.findByIdUser(idUser);
    }
    
}
