package com.zetta.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PERFIL_USUARIO")
public class PerfilUsuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	private String nomeUsuario;
	private long idPessoa;
	private long idCargo;
	private String dataCadastroUsuario;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public long getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(long idCargo) {
		this.idCargo = idCargo;
	}
	public String getDataCadastroUsuario() {
		return dataCadastroUsuario;
	}
	public void setDataCadastroUsuario(String dataCadastroUsuario) {
		this.dataCadastroUsuario = dataCadastroUsuario;
	}
	
	
	
	
	

}
