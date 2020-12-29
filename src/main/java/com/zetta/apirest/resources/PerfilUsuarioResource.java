package com.zetta.apirest.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zetta.apirest.models.PerfilUsuario;
import com.zetta.apirest.repository.PerfilUsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST PerfilUsuarios")
@CrossOrigin(origins="*")
public class PerfilUsuarioResource {
	
	@Autowired
	PerfilUsuarioRepository perfilUsuarioRepository;
	
	@GetMapping("/perfilUsuarios")
	@ApiOperation(value="Retorna todos os perfis de usuarios cadastradas")
	public List<PerfilUsuario> listaPerfilUsuarios(){
		return perfilUsuarioRepository.findAll();
	}
	
	@ApiOperation(value="Busca uma perfil de usuario pelo id")
	@GetMapping("/perfilUsuario/{id}")
	public PerfilUsuario listaPerfilUsuarioId(@PathVariable(value="id") long id){
		return perfilUsuarioRepository.findById(id);
	}
	
	@PostMapping("/perfilUsuario")
	@ApiOperation(value="Salva o registro de perfil de usuario")
	public PerfilUsuario salvaPerfilUsuario(@RequestBody PerfilUsuario perfilUsuario) {
		return perfilUsuarioRepository.save(perfilUsuario);		
	}
	

	@DeleteMapping("/perfilUsuario")
	@ApiOperation(value="Apaga um registro de perfil de usuario")
	public void deletaPerfilUsuario(@RequestBody PerfilUsuario perfilUsuario) {
		perfilUsuarioRepository.delete(perfilUsuario);	
	}
	
	@PutMapping("/perfilUsuario")
	@ApiOperation(value="Altera um registro de perfil de usuario")
	public PerfilUsuario alteraPerfilUsuario(@RequestBody PerfilUsuario perfilUsuario) {
		return perfilUsuarioRepository.save(perfilUsuario);	
	}
	
}
