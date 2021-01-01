package com.zetta.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.zetta.apirest.models.PerfilUsuario;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuario, Long> {

	PerfilUsuario findById(long id);

	PerfilUsuario findByNomePerfilUsuario(String nomePerfilUsuario);
	
	@Query("SELECT obj FROM PerfilUsuario obj ORDER BY obj.id")
	List<PerfilUsuario> findAllOrderById();
	
	@Query("SELECT obj FROM PerfilUsuario obj ORDER BY obj.nomePerfilUsuario")
	List<PerfilUsuario> findAllOrderByNomePerfilUsuario();
}