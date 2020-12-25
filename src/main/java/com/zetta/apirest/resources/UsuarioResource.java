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

import com.zetta.apirest.models.Usuario;
import com.zetta.apirest.repository.UsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Usuarios")
@CrossOrigin(origins="*")
public class UsuarioResource {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	@ApiOperation(value="Retorna todos os usuarios cadastradas")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@ApiOperation(value="Busca um usuario pelo id")
	@GetMapping("/usuario/{id}")
	public Usuario listaUsuarioId(@PathVariable(value="id") long id){
		return usuarioRepository.findById(id);
	}
	
	@PostMapping("/usuario")
	@ApiOperation(value="Salva o registro de usuario")
	public Usuario salvaUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);		
	}
	

	@DeleteMapping("/usuario")
	@ApiOperation(value="Apaga um registro de usuario")
	public void deletaUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);	
	}
	
	@PutMapping("/usuario")
	@ApiOperation(value="Altera um registro de usuario")
	public Usuario alteraUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);	
	}
	
}
