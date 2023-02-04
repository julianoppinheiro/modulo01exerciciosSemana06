package com.springBD.SpringRestAPIPostgre.repository;

import com.springBD.SpringRestAPIPostgre.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}