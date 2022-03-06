package com.co.penol.bea.domain.repository;

import com.co.penol.bea.domain.Capacitacion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CapacitacionRepository {
    Capacitacion saveCapacitacion(Capacitacion capacitacion);
    Optional<Capacitacion> getCapacitacionById(String id);
    List<Capacitacion> getAllCapacitacion();
    void deleteCapacitacion(String id);
}
