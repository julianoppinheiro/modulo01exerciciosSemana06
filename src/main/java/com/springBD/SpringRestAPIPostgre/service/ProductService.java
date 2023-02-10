package com.springBD.SpringRestAPIPostgre.service;

import com.springBD.SpringRestAPIPostgre.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    //salvar produto
    Product save(Product product);

    //buscar produtos
    List<Product> findAll();

    //buscar um produto
    Optional<Product> findById(Long id);

    //fazer update em um produto
    Product update(Product product);

    void deleteById(Long id);
}
