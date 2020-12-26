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

import com.zetta.apirest.models.Cargo;
import com.zetta.apirest.repository.CargoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Cargos")
@CrossOrigin(origins="*")
public class CargoResource {
	
	@Autowired
	CargoRepository cargoRepository;
	
	@GetMapping("/cargos")
	@ApiOperation(value="Retorna todos os cargos cadastradas")
	public List<Cargo> listaCargos(){
		return cargoRepository.findAll();
	}
	
	@ApiOperation(value="Busca um cargo pelo id")
	@GetMapping("/cargo/{id}")
	public Cargo listaCargoId(@PathVariable(value="id") long id){
		return cargoRepository.findById(id);
	}
	
	@ApiOperation(value="Busca um cargo pela descricao")
	@GetMapping("/cargo/descricao/{cargo}")
	public Cargo buscaCargoDescricao(@PathVariable(value="cargo") String cargo){
		return cargoRepository.findByCargo(cargo);		
	}
	
	@PostMapping("/cargo")
	@ApiOperation(value="Salva o registro de cargo")
	public Cargo salvaCargo(@RequestBody Cargo cargo) {
		
		Cargo cargoDuplicado;// para verificar se esse cargo ja está cadastrado
				
		cargoDuplicado = this.buscaCargoDescricao(cargo.getCargo());	

		
		if (cargoDuplicado == null) {		
			return cargoRepository.save(cargo);	
		}else {
			return cargoDuplicado;
		}
		
	}
	

	@DeleteMapping("/cargo")
	@ApiOperation(value="Apaga um registro de cargo")
	public void deletaCargo(@RequestBody Cargo cargo) {
		cargoRepository.delete(cargo);	
	}
	
	@PutMapping("/cargo")
	@ApiOperation(value="Altera um registro de cargo")
	public Cargo alteraCargo(@RequestBody Cargo cargo) {
		return cargoRepository.save(cargo);	
	}
	
}