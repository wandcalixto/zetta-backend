package com.zetta.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zetta.apirest.models.PerfilUsuario;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuario, Long> {

	PerfilUsuario findById(long id);
}