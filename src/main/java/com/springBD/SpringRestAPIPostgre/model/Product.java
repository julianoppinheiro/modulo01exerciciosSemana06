package com.springBD.SpringRestAPIPostgre.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    /////Exercicio 01

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name, description;
    private Double value;
    private Integer amount;

}
