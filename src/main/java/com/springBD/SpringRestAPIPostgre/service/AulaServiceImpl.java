package com.springBD.SpringRestAPIPostgre.service;

import com.springBD.SpringRestAPIPostgre.model.Aula;
import com.springBD.SpringRestAPIPostgre.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaServiceImpl implements AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    @Override
    public Aula save(Aula aula){
        return aulaRepository.save(aula);
    }

    @Override
    public List<Aula> findAll() {
        return aulaRepository.findAll();
    }

    @Override
    public Optional<Aula> findById(Long id) {
        return aulaRepository.findById(id);
    }

    @Override
    public Aula update(Aula aula) {
        return aulaRepository.save(aula);
    }

    @Override
    public void deleteById(Long id) {
        aulaRepository.deleteById(id);
    }
}
