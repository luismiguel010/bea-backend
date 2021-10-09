package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.CV;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CvRepository {
    List<CV> getAll();
    CV saveCv(CV cv);
    Optional<CV> getByIdCv(String id);
    Optional<CV> getByIdUser(String id);
    void deleteCv(String id);

}
