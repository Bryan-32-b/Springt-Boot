package com.dbo.repository;

import org.springframework.stereotype.Repository;

import com.dbo.model.Registro;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public interface RegistroRepository  extends JpaRepository<Registro, Integer> {

}
