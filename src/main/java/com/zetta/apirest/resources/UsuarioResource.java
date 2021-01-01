package com.zetta.apirest.resources;


import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.zetta.apirest.repository.CargoRepository;
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
	
	@Autowired
	CargoRepository cargoRepository;
	
	@GetMapping("/usuarios/{ordem}")
	@ApiOperation(value="Retorna todos os usuarios cadastradas")
	public List<Usuario> listaUsuarios(@PathVariable(value="ordem") String ordem){
		if(ordem.equals("id")) {
			return usuarioRepository.findAllOrderById();
		}else {
			return usuarioRepository.findAllOrderByNome();
		}	
	}
	
	@ApiOperation(value="Busca um usuario pelo id")
	@GetMapping("/usuario/{id}")
	public Usuario listaUsuarioId(@PathVariable(value="id") long id){
		return usuarioRepository.findById(id);
	}
	
	@ApiOperation(value="Busca um usuario pelo cpf")
	@GetMapping("/usuario/cpf/{cpf}")
	public Usuario buscaUsuarioCpf(@PathVariable(value="cpf") String cpf){
		return usuarioRepository.findByCpf(cpf);		
	}
	
	
	@PostMapping("/usuario")
	@ApiOperation(value="Salva o registro de usuario")

	public Usuario salvaUsuario(@RequestBody Usuario usuario) {					

		
		Date dataAtual = new Date(); 
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
		String data = formatador.format(dataAtual);
		usuario.setDataCadastro(data);//setamos a data do cadastro para a atual
		
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