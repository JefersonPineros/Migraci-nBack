package com.skillexBack.app.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "detalle_evento")
public class DetalleEvento implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle_evento")
	private Integer idDetalleEvento;
	@Column(name = "tipo_evento")
	private String tipoEvento;
	@Column(name = "servicio_ofrecido")
	private String servicioOfrecido;
	@Column(name = "nombre_imagen")
	private String nombreImagen;
	@Column(name = "imagen_evento")
	private String imagenEvento;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "detalleEvento")
	private Eventos evento;
	

	public DetalleEvento() {
		super();
	}


	public DetalleEvento(Integer idDetalleEvento, String tipoEvento, String servicioOfrecido, String nombreImagen,
			String imagenEvento, Eventos evento) {
		super();
		this.idDetalleEvento = idDetalleEvento;
		this.tipoEvento = tipoEvento;
		this.servicioOfrecido = servicioOfrecido;
		this.nombreImagen = nombreImagen;
		this.imagenEvento = imagenEvento;
		this.evento = evento;
	}


	public Integer getIdDetalleEvento() {
		return idDetalleEvento;
	}


	public void setIdDetalleEvento(Integer idDetalleEvento) {
		this.idDetalleEvento = idDetalleEvento;
	}


	public String getTipoEvento() {
		return tipoEvento;
	}


	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}


	public String getServicioOfrecido() {
		return servicioOfrecido;
	}


	public void setServicioOfrecido(String servicioOfrecido) {
		this.servicioOfrecido = servicioOfrecido;
	}


	public String getNombreImagen() {
		return nombreImagen;
	}


	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}


	public String getImagenEvento() {
		return imagenEvento;
	}


	public void setImagenEvento(String imagenEvento) {
		this.imagenEvento = imagenEvento;
	}

	@JsonBackReference
	public Eventos getEvento() {
		return evento;
	}


	public void setEvento(Eventos evento) {
		this.evento = evento;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
