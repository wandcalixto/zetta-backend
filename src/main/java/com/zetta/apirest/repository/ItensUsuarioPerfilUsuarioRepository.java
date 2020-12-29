package com.zetta.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zetta.apirest.models.ItensUsuarioPerfilUsuario;

public interface ItensUsuarioPerfilUsuarioRepository extends JpaRepository<ItensUsuarioPerfilUsuario, Long> {

	ItensUsuarioPerfilUsuario findById(long id);

}



