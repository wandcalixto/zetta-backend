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

import com.zetta.apirest.models.ItensUsuarioPerfilUsuario;
import com.zetta.apirest.repository.ItensUsuarioPerfilUsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST ItensUsuarioPerfilUsuario")
@CrossOrigin(origins="*")
public class ItensUsuarioPerfilUsuarioResource {
	
	@Autowired
	ItensUsuarioPerfilUsuarioRepository itensUsuarioPerfilUsuarioRepository;
	
	@GetMapping("/itensUsuarioPerfilUsuarios")
	@ApiOperation(value="Retorna todos os itens usuarios perifil usuarios cadastrados")
	public List<ItensUsuarioPerfilUsuario> listaItensUsuarioPerfilUsuario(){
		return itensUsuarioPerfilUsuarioRepository.findAll();
	}
	
	@ApiOperation(value="Busca um item usuario perfil usuario pelo id")
	@GetMapping("/itensUsuarioPerfilUsuario/{id}")
	public ItensUsuarioPerfilUsuario listaItensUsuarioPerfilUsuarioId(@PathVariable(value="id") long id){
		return itensUsuarioPerfilUsuarioRepository.findById(id);
	}
	
	
	@PostMapping("/itensUsuarioPerfilUsuario")
	@ApiOperation(value="Salva o registro de item usuario perfil usuario")
	public ItensUsuarioPerfilUsuario salvaItensUsuarioPerfilUsuario(@RequestBody ItensUsuarioPerfilUsuario itensUsuarioPerfilUsuario) {
		return itensUsuarioPerfilUsuarioRepository.save(itensUsuarioPerfilUsuario);		
	}
	

	@DeleteMapping("/itensUsuarioPerfilUsuario")
	@ApiOperation(value="Apaga um registro de item usuario perfil usuario")
	public void deletaItensUsuarioPerfilUsuario(@RequestBody ItensUsuarioPerfilUsuario itensUsuarioPerfilUsuario) {
		itensUsuarioPerfilUsuarioRepository.delete(itensUsuarioPerfilUsuario);	
	}
	
	@PutMapping("/itensUsuarioPerfilUsuario")
	@ApiOperation(value="Altera um registro de item usuario perfil usuario")
	public ItensUsuarioPerfilUsuario alteraItensUsuarioPerfilUsuario(@RequestBody ItensUsuarioPerfilUsuario itensUsuarioPerfilUsuario) {
		return itensUsuarioPerfilUsuarioRepository.save(itensUsuarioPerfilUsuario);	
	}
	
}
