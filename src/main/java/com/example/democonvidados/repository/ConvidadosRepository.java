package com.example.democonvidados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.democonvidados.model.Convidado;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long>{

}
