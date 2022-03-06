package com.co.penol.bea.domain.service;

import com.co.penol.bea.domain.Capacitacion;
import com.co.penol.bea.domain.repository.CapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapacitacionService {

    @Autowired
    private CapacitacionRepository capacitacionRepository;

    public Capacitacion saveCapacitacion(Capacitacion capacitacion) {
        return capacitacionRepository.saveCapacitacion(capacitacion);
    }

    public Optional<Capacitacion> getCapacitacionById(String id) {
        return capacitacionRepository.getCapacitacionById(id);
    }

    public List<Capacitacion> getAllCapacitacion(){
        return capacitacionRepository.getAllCapacitacion();
    }

    public boolean deleteCapacitacion(String id) {
        return getCapacitacionById(id).map(capacitacion -> {
            capacitacionRepository.deleteCapacitacion(id);
            return true;
        }).orElse(false);
    }
}
