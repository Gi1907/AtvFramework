package com.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetojpa.entities.Drogarias;

@Repository
public interface DrogariasRepository extends JpaRepository<Drogarias, Long> {
    // Métodos personalizados podem ser adicionados aqui
}