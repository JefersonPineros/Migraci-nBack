package com.skillexBack.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "usuarioevento")
public class UsuarioEvento implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario_Evento")
	private Integer idUsuarioEvento;
	
	@Column(name = "nombre_usuario_participacion")
	private String nombreUsuarioParticipacion;
	@ManyToMany(mappedBy = "usuarioEvento")
	private List<Eventos> eventos;
	@JoinTable(
			name = "usuario_has_usuarioevento",
			joinColumns = @JoinColumn(name = "usuarioEvento_idusuarioEvento", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "Usuario_idUsuarios")
			)
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Usuario> usuarios;
	
	public UsuarioEvento() {
		super();
	}

	public UsuarioEvento(Integer idUsuarioEvento, String nombreUsuarioParticipacion, List<Eventos> eventos) {
		super();
		this.idUsuarioEvento = idUsuarioEvento;
		this.nombreUsuarioParticipacion = nombreUsuarioParticipacion;
		this.eventos = eventos;
	}

	public Integer getIdUsuarioEvento() {
		return idUsuarioEvento;
	}



	public void setIdUsuarioEvento(Integer idUsuarioEvento) {
		this.idUsuarioEvento = idUsuarioEvento;
	}



	public String getNombreUsuarioParticipacion() {
		return nombreUsuarioParticipacion;
	}



	public void setNombreUsuarioParticipacion(String nombreUsuarioParticipacion) {
		this.nombreUsuarioParticipacion = nombreUsuarioParticipacion;
	}

	@JsonBackReference
	public List<Eventos> getEventos() {
		return eventos;
	}

	public void setEventos(List<Eventos> eventos) {
		this.eventos = eventos;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}