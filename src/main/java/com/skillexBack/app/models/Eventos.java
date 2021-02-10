package com.skillexBack.app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "eventos")
public class Eventos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEventos")
	private Integer idEventos;
	@Column(name = "nombre_evento")
	private String nombreEvento;
	@Column(name = "autor_evento")
	private String autorEvento;
	@Column(name = "fecha_evento")
	private Date fechaEvento;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Usuario_idUsuarios", referencedColumnName = "idUsuarios", nullable = false, updatable = false)
	private Usuario usuario;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "detalle_evento_id_detalle_evento", referencedColumnName = "id_detalle_evento")
	private DetalleEvento detalleEvento;
	@JoinTable(name = "eventos_has_usuarioevento", joinColumns = @JoinColumn(name = "Eventos_idEventos", nullable = false), inverseJoinColumns = @JoinColumn(name = "usuarioEvento_id_usuario_Evento", nullable = false))
	@ManyToMany(cascade = CascadeType.ALL)
	private List<UsuarioEvento> usuarioEvento;

	public Integer getIdEventos() {
		return idEventos;
	}

	public void setIdEventos(Integer idEventos) {
		this.idEventos = idEventos;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getAutorEvento() {
		return autorEvento;
	}

	public void setAutorEvento(String autorEvento) {
		this.autorEvento = autorEvento;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@JsonManagedReference
	public DetalleEvento getDetalleEvento() {
		return detalleEvento;
	}

	public void setDetalleEvento(DetalleEvento detalleEvento) {
		this.detalleEvento = detalleEvento;
	}

	@JsonManagedReference
	public List<UsuarioEvento> getUsuarioEvento() {
		return usuarioEvento;
	}

	public void setUsuarioEvento(List<UsuarioEvento> usuarioEvento) {
		this.usuarioEvento = usuarioEvento;
	}

	public Eventos(Integer idEventos, String nombreEvento, String autorEvento, Date fechaEvento, Usuario usuario,
			DetalleEvento detalleEvento, List<UsuarioEvento> usuarioEvento) {
		super();
		this.idEventos = idEventos;
		this.nombreEvento = nombreEvento;
		this.autorEvento = autorEvento;
		this.fechaEvento = fechaEvento;
		this.usuario = usuario;
		this.detalleEvento = detalleEvento;
		this.usuarioEvento = usuarioEvento;
	}

	public Eventos() {
		super();
	}

	public void addUsuarioEvento(UsuarioEvento usuarioEventos) {
		if (this.usuarioEvento == null) {
			this.usuarioEvento = new ArrayList<>();
		}
		this.usuarioEvento.add(usuarioEventos);
	}
}
