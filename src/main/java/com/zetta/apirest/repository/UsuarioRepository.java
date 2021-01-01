package com.zetta.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zetta.apirest.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findById(long id);

	Usuario findByCpf(String cpf);
	
	@Query("SELECT obj FROM Usuario obj ORDER BY obj.id")
	List<Usuario> findAllOrderById();	
	
	@Query("SELECT obj FROM Usuario obj ORDER BY obj.nome")
	List<Usuario> findAllOrderByNome();
}



