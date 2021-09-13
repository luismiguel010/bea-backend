package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.CV;

import java.util.List;
import java.util.Optional;

public interface CvRepository {
    List<CV> getAll();
    void saveCv(CV cv);
    Optional<CV> getByIdCv(int id);
    CV getByIdUser(int id);
    void deleteCv(int id);

}
