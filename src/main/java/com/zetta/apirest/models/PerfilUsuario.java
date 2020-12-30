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
	private String nomePerfilUsuario;


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomePerfilUsuario() {
		return nomePerfilUsuario;
	}
	public void setNomePerfilUsuario(String nomePerfilUsuario) {
		this.nomePerfilUsuario = nomePerfilUsuario;
	}


}
