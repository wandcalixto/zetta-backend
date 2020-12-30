package com.zetta.apirest.models;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="TB_CARGO")
public class Cargo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	private String cargo;
	
//	@OneToMany
//	@JoinColumn(name= "cargo_id")
//	private List<Usuario> usuarios;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
//	public List<Usuario> getUsuarios() {
//		return usuarios;
//	}
//	public void setUsuarios(List<Usuario> usuarios) {
//		this.usuarios = usuarios;
//	}
	
	
	
	

}
