package com.springBD.SpringRestAPIPostgre.controller;

import com.springBD.SpringRestAPIPostgre.model.Aula;
import com.springBD.SpringRestAPIPostgre.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/m1s06/ex05")
public class AulaController {
    @Autowired
    private AulaService aulaService;

    @GetMapping
    public ResponseEntity<List<Aula>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(aulaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Aula>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(aulaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Aula> create(@RequestBody Aula aula){
        return ResponseEntity.status(HttpStatus.CREATED).body(aulaService.save(aula));
    }

    @PutMapping
    public ResponseEntity<Aula> update(@RequestBody Aula aula){
        return ResponseEntity.status(HttpStatus.OK).body(aulaService.update(aula));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        aulaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}