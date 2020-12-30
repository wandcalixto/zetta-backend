package com.zetta.apirest.models;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TB_USUARIO")
public class Usuario extends Pessoa{


	private static final long serialVersionUID = 1L;	
	

	private String dataCadastro;
	

	
	@ManyToOne
//	@JoinTable(name="cargo_usuario", joinColumns = @JoinColumn(name="id"), inverseJoinColumns = @JoinColumn(name="id"))
	private Cargo cargo;
	

	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	

}