package com.zetta.apirest.models;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinTable(name="tb_usuario_com_perfil_usuario", joinColumns = @JoinColumn(name="usuario_id"), inverseJoinColumns = @JoinColumn(name="perfilUsuario_id"))
	private List<PerfilUsuario> perfilUsuarios;

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
	public List<PerfilUsuario> getPerfilUsuarios() {
		return perfilUsuarios;
	}
	public void setPerfilUsuarios(List<PerfilUsuario> perfilUsuarios) {
		this.perfilUsuarios = perfilUsuarios;
	}

	
	
	

}