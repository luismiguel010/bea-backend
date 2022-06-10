package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.Aliado;

import java.util.List;
import java.util.Optional;

public interface AliadoRepository {
    Optional<Aliado> getAliadoById(String id);
    Aliado saveAliado(Aliado aliado);
    void deleteAliado(String id);
    List<Aliado> getAllAliado();
}
