package com.springBD.SpringRestAPIPostgre.controller;

import com.springBD.SpringRestAPIPostgre.model.Aluno;
import com.springBD.SpringRestAPIPostgre.service.AlunoService;
import com.springBD.SpringRestAPIPostgre.service.Calculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/m1s06")

public class PrincipalController {

    @Autowired
    AlunoService alunoService;

    @PostMapping("/ex02/calcularIMC") //ok
    public String calcularIMC(@RequestParam("peso") Double peso, @RequestParam("altura") Double altura){
        //realizar o calculo

            /*Implementado para que n�o possa colocar um CPF somente com zeros*/
            if (peso > 0.0 && altura > 0.0) {
                Double imc = Calculos.calcularIMC(peso, altura);
                return String.valueOf(imc);
            }
            else {
                return ResponseEntity.badRequest().body("Não foi aceito os dados informados, vefique!!").getBody();
            }
    }


    //buscar por nome, exercicio 03
    @PostMapping("/ex03/buscanome")
    public List<Aluno> buscaNome(@RequestParam("nome") String nome){
        return ResponseEntity.ok().body(alunoService.findByNomeLike(nome.toLowerCase())).getBody();

    }

    @PostMapping("/ex04/buscanomeidade")
    public List<Aluno> buscaNomeIdade(@RequestParam("nome") String nome, @RequestParam("idade") Integer idade) {

        if (idade > 0.0) {
            return ResponseEntity.ok().body(alunoService.findbyNomeIdade(nome.toLowerCase(), idade)).getBody();
        }
        return null;
    }

    @GetMapping("/aluno")
    public List<Aluno> listar() {
        return ResponseEntity.ok().body(alunoService.findAll()).getBody();
    }

    @PostMapping("/aluno")
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(aluno));
    }

    @GetMapping("/aluno/{id}")
    public Aluno findById(@PathVariable Long id){
        return ResponseEntity.ok(alunoService.findById(id)).getBody();
    }

    @PutMapping("/aluno")
    public ResponseEntity<Aluno> update(@RequestBody Aluno aula){
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.update(aula));
    }

    @DeleteMapping("/aluno/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        alunoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
