package com.zetta.apirest.models;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="TB_USUARIO")
public class Usuario extends Pessoa{


	private static final long serialVersionUID = 1L;	
	
	private long idCargo;
	private String dataCadastro;
	
	public long getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(long idCargo) {
		this.idCargo = idCargo;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}