package com.co.penol.bea.persistence;

import com.co.penol.bea.domain.CV;
import com.co.penol.bea.domain.repository.CvRepository;
import com.co.penol.bea.persistence.entity.CVEntity;
import com.co.penol.bea.persistence.mapper.CVMapper;
import com.co.penol.bea.persistence.queries.CvCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CvEntityRepository implements CvRepository {

    @Autowired
    private CvCrudRepository cvCrudRepository;
    
    @Autowired
    private CVMapper cvMapper;
    
    @Override
    public List<CV> getAll() {
        return cvMapper.toCVList((List<CVEntity>) cvCrudRepository.findAll());
    }

    @Override
    public void saveCv(CV cv) {
        cvCrudRepository.save(cvMapper.toCVEntity(cv));
    }

    @Override
    public Optional<CV> getByIdCv(int id) {
        return cvCrudRepository.findById(id).map(cvEntity -> cvMapper.toCV(cvEntity));
    }

    @Override
    public CV getByIdUser(int id) {
        return cvMapper.toCV(cvCrudRepository.findByIdUser(id));
    }

    @Override
    public void deleteCv(int id) {
        cvCrudRepository.deleteById(id);
    }
}
