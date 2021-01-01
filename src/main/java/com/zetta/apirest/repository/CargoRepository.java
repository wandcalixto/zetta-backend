package com.zetta.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zetta.apirest.models.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

	Cargo findById(long id);

	Cargo findByCargo(String cargo);
	
	@Query("SELECT obj FROM Cargo obj ORDER BY obj.id")
	List<Cargo> findAllOrderById();	
	
	@Query("SELECT obj FROM Cargo obj ORDER BY obj.cargo")
	List<Cargo> findAllOrderByCargo();
}

