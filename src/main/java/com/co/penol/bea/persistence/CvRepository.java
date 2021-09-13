package com.co.penol.bea.persistence;

import com.co.penol.bea.persistence.entity.CVEntity;
import com.co.penol.bea.persistence.queries.CvCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CvRepository {

    private CvCrudRepository cvCrudRepository;

    public List<CVEntity> getAll() {
        return (List<CVEntity>) cvCrudRepository.findAll();
    }
    
    public void saveCv(CVEntity cvEntity) {
        cvCrudRepository.save(cvEntity);
    }
    
    public Optional<CVEntity> getByIdCv(int idCv) {
        return cvCrudRepository.findById(idCv);
    }

    public CVEntity getByIdUser(int idUser) {
        return cvCrudRepository.findByIdUser(idUser);
    }

    public void deleteCv(int idCv) {
        cvCrudRepository.deleteById(idCv);
    }
    
}
