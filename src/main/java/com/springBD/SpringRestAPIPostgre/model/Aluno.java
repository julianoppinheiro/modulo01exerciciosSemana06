package com.springBD.SpringRestAPIPostgre.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.Instant;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long matricula;

    private String nome, telefone, email;

    private Integer idade;

    private Instant dataCadastro;

}
