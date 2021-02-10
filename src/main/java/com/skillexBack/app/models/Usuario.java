package com.skillexBack.app.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idUsuarios")
	private Integer idUsuarios;
	@Basic(optional = false)
	@Column(name = "nombreUsuario")
	private String nombreUsuario;
	@Basic(optional = false)
	@Column(name = "apellidoUsuario")
	private String apellidoUsuario;
	@Basic(optional = false)
	@Column(name = "emailUsuario")
	private String emailUsuario;
	@Basic(optional = false)
	@Column(name = "passwordUsuario")
	private String passwordUsuario;
	@Basic(optional = false)
	@Column(name ="tienda")
	private String tienda;
	@Basic(optional = false)
	@Temporal(TemporalType.DATE)
	@Column(name = "creacion_usuario")
	private Date creacion_usuario;
	private String fecha_login;
	private String turnos_laborales;
	private String cedula_ciudadania;
	
	@Column(insertable = false, updatable = false)
	private Integer tipoUsuario_idTipoUsuario;
	
	@Column(insertable = false, updatable = false)
	private Integer inventario_idInventario;

	@JoinColumn(name = "tipoUsuario_idTipoUsuario", referencedColumnName = "idTipoUsuario")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private TipoUsuario tipoUsuario;

	@JoinColumn(name = "inventario_idInventario", referencedColumnName = "id_inventario")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Inventario inventario;
	
	@ManyToMany(mappedBy = "usuarios")
	private List<UsuarioEvento> usuarioEvento;

	public Integer getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

	public Date getCreacion_usuario() {
		return creacion_usuario;
	}

	public void setCreacion_usuario(Date creacion_usuario) {
		this.creacion_usuario = creacion_usuario;
	}

	public String getFecha_login() {
		return fecha_login;
	}

	public void setFecha_login(String fecha_login) {
		this.fecha_login = fecha_login;
	}

	public String getTurnos_laborales() {
		return turnos_laborales;
	}

	public void setTurnos_laborales(String turnos_laborales) {
		this.turnos_laborales = turnos_laborales;
	}

	public String getCedula_ciudadania() {
		return cedula_ciudadania;
	}

	public void setCedula_ciudadania(String cedula_ciudadania) {
		this.cedula_ciudadania = cedula_ciudadania;
	}

	
	public Integer getTipoUsuario_idTipoUsuario() {
		return tipoUsuario_idTipoUsuario;
	}

	public void setTipoUsuario_idTipoUsuario(Integer tipoUsuario_idTipoUsuario) {
		this.tipoUsuario_idTipoUsuario = tipoUsuario_idTipoUsuario;
	}

	public Integer getInventario_idInventario() {
		return inventario_idInventario;
	}

	public void setInventario_idInventario(Integer inventario_idInventario) {
		this.inventario_idInventario = inventario_idInventario;
	}
	

	public List<UsuarioEvento> getUsuarioEvento() {
		return usuarioEvento;
	}

	public void setUsuarioEvento(List<UsuarioEvento> usuarioEvento) {
		this.usuarioEvento = usuarioEvento;
	}


	public Usuario() {
		super();
	}

	public Usuario(Integer idUsuarios, String nombreUsuario, String apellidoUsuario, String emailUsuario,
			String passwordUsuario, String tienda, Date creacion_usuario, String fecha_login, String turnos_laborales,
			String cedula_ciudadania, Integer tipoUsuario_idTipoUsuario, Integer inventario_idInventario,
			TipoUsuario tipoUsuario, Inventario inventario, List<UsuarioEvento> usuarioEvento) {
		super();
		this.idUsuarios = idUsuarios;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.emailUsuario = emailUsuario;
		this.passwordUsuario = passwordUsuario;
		this.tienda = tienda;
		this.creacion_usuario = creacion_usuario;
		this.fecha_login = fecha_login;
		this.turnos_laborales = turnos_laborales;
		this.cedula_ciudadania = cedula_ciudadania;
		this.tipoUsuario_idTipoUsuario = tipoUsuario_idTipoUsuario;
		this.inventario_idInventario = inventario_idInventario;
		this.tipoUsuario = tipoUsuario;
		this.inventario = inventario;
		this.usuarioEvento = usuarioEvento;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
