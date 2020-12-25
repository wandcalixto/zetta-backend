package com.zetta.apirest.models;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="TB_PERFIL_USUARIO")
public class PerfilUsuario extends Pessoa{


	private static final long serialVersionUID = 1L;	
	
	private String dataCadastro;
	
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
