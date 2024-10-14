package com.uisrael.motocicletas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.motocicletas.model.Motocicleta;

@Repository
public interface IMotocicletaRepository extends JpaRepository<Motocicleta, Integer>{

}
