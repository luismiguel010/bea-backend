package com.co.penol.bea.persistence;

import com.co.penol.bea.domain.Capacitacion;
import com.co.penol.bea.domain.repository.CapacitacionRepository;
import com.co.penol.bea.persistence.entity.CapacitacionEntity;
import com.co.penol.bea.persistence.mapper.CapacitacionMapper;
import com.co.penol.bea.persistence.queries.CapacitacionCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CapacitacionEntityRepository implements CapacitacionRepository {

    @Autowired
    private CapacitacionCrudRepository capacitacionCrudRepository;

    @Autowired
    private CapacitacionMapper capacitacionMapper;

    @Override
    public Capacitacion saveCapacitacion(Capacitacion capacitacion) {
        return capacitacionMapper.toCapacitacion(capacitacionCrudRepository.save(capacitacionMapper.toCapacitacionEntity(capacitacion)));
    }

    @Override
    public Optional<Capacitacion> getCapacitacionById(String id) {
        return capacitacionCrudRepository.findById(id).map(capacitacionEntity -> capacitacionMapper.toCapacitacion(capacitacionEntity));
    }

    @Override
    public List<Capacitacion> getAllCapacitacion() {
        return capacitacionMapper.toCapacitacionList((List<CapacitacionEntity>) capacitacionCrudRepository.findAll());
    }

    @Override
    public void deleteCapacitacion(String id) {
        capacitacionCrudRepository.deleteById(id);
    }
}
