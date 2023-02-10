package com.springBD.SpringRestAPIPostgre.repository;

import com.springBD.SpringRestAPIPostgre.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AulaRepository extends JpaRepository<Aula, Long> {
}