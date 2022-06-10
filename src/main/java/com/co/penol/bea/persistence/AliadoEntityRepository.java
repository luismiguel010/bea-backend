package com.co.penol.bea.persistence;

import com.co.penol.bea.domain.Aliado;
import com.co.penol.bea.domain.repository.AliadoRepository;
import com.co.penol.bea.persistence.entity.AliadoEntity;
import com.co.penol.bea.persistence.mapper.AliadoMapper;
import com.co.penol.bea.persistence.queries.AliadoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AliadoEntityRepository implements AliadoRepository {
    @Autowired
    private AliadoCrudRepository aliadoCrudRepository;
    @Autowired
    private AliadoMapper aliadoMapper;

    @Override
    public Optional<Aliado> getAliadoById(String id) {
        return aliadoCrudRepository.findById(id).map(aliado -> aliadoMapper.toAliado(aliado));
    }

    @Override
    public Aliado saveAliado(Aliado aliado) {
        return aliadoMapper.toAliado(aliadoCrudRepository.save(aliadoMapper.toAliadoEntity(aliado)));
    }

    @Override
    public void deleteAliado(String id) {
        aliadoCrudRepository.deleteById(id);
    }

    @Override
    public List<Aliado> getAllAliado() {
        return aliadoMapper.toAliados((List<AliadoEntity>) aliadoCrudRepository.findAll());
    }
}
