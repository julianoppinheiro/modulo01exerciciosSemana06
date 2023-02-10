package com.springBD.SpringRestAPIPostgre.repository;

import com.springBD.SpringRestAPIPostgre.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    @Query("select a from Aluno a where lower(a.nome) like %:nome%")
    List<Aluno> buscanome(String nome);

    @Query("select a from Aluno a where lower(a.nome) like %:nome% and a.idade = :idade")
    List<Aluno> buscanomeeidade(String nome, Integer idade);

}