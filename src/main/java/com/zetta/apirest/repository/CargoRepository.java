package com.zetta.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zetta.apirest.models.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

	Cargo findById(long id);

	Cargo findByCargo(String cargo);
}

