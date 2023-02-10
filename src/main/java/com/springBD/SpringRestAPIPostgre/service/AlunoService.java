package com.springBD.SpringRestAPIPostgre.service;

import com.springBD.SpringRestAPIPostgre.model.Aluno;
import com.springBD.SpringRestAPIPostgre.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findByNomeLike(String nome) {
        return alunoRepository.buscanome(nome);
    }

    public List<Aluno> findbyNomeIdade(String nome, Integer idade) {
        return alunoRepository.buscanomeeidade(nome, idade);

    }

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Aluno findById(Long id) {
        Optional<Aluno> obj = alunoRepository.findById(id);
        return obj.get();
    }
    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
    public Aluno update(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }
}
