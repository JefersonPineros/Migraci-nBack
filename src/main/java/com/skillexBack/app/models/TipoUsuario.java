package com.skillexBack.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipousuario")
public class TipoUsuario implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTipoUsuario;
	private Integer nivelAcceso;
	private String descripcion;
	
	@OneToMany(mappedBy = "tipoUsuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Usuario> usuarios;

	public TipoUsuario() {
		super();
	}

	public TipoUsuario(Integer idTipoUsuario, Integer nivelAcceso, String descripcion, List<Usuario> usuarios) {
		super();
		this.idTipoUsuario = idTipoUsuario;
		this.nivelAcceso = nivelAcceso;
		this.descripcion = descripcion;
		this.usuarios = usuarios;
	}



	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}



	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}



	public Integer getNivelAcceso() {
		return nivelAcceso;
	}



	public void setNivelAcceso(Integer nivelAcceso) {
		this.nivelAcceso = nivelAcceso;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public List<Usuario> getUsuarios() {
		return usuarios;
	}



	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
