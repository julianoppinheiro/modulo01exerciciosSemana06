package com.springBD.SpringRestAPIPostgre.service;

import com.springBD.SpringRestAPIPostgre.model.Aula;

import java.util.List;
import java.util.Optional;

public interface AulaService {
    //salvar produto
    Aula save(Aula aula);

    //buscar produtos
    List<Aula> findAll();

    //buscar um produto
    Optional<Aula> findById(Long id);

    //fazer update em um produto
    Aula update(Aula aula);

    void deleteById(Long id);
}
