package com.skillexBack.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "detalle_productos")
public class DetalleProducto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle_productos")
	private Integer idDetalleProductos;
	@Column(name = "valor_inicial")
	private Integer valorInicial;
	@Column(name = "valor_mas_iva")
	private Integer valorMasIva;
	@Column(name = "descripcion_producto")
	private String descripcionProducto;
	@Column(name = "descripcion_producto_in")
	private String descripcionProductoIn;
	@Column(name = "nombre_imagen")
	private String nombreImagen;
	@Column(name = "url_imagen")
	private String urlImagen;

	@JsonBackReference
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productos_id_productos", referencedColumnName = "id_productos")
	private Productos producto;
	
	
	public DetalleProducto() {
		super();
	}


	public DetalleProducto(Integer idDetalleProductos, Integer valorInicial, Integer valorMasIva,
			String descripcionProducto, String descripcionProductoIn, String nombreImagen, String urlImagen,
			Productos producto) {
		super();
		this.idDetalleProductos = idDetalleProductos;
		this.valorInicial = valorInicial;
		this.valorMasIva = valorMasIva;
		this.descripcionProducto = descripcionProducto;
		this.descripcionProductoIn = descripcionProductoIn;
		this.nombreImagen = nombreImagen;
		this.urlImagen = urlImagen;
		this.producto = producto;
	}


	public Integer getIdDetalleProductos() {
		return idDetalleProductos;
	}


	public void setIdDetalleProductos(Integer idDetalleProductos) {
		this.idDetalleProductos = idDetalleProductos;
	}


	public Integer getValorInicial() {
		return valorInicial;
	}


	public void setValorInicial(Integer valorInicial) {
		this.valorInicial = valorInicial;
	}


	public Integer getValorMasIva() {
		return valorMasIva;
	}


	public void setValorMasIva(Integer valorMasIva) {
		this.valorMasIva = valorMasIva;
	}


	public String getDescripcionProducto() {
		return descripcionProducto;
	}


	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}


	public String getDescripcionProductoIn() {
		return descripcionProductoIn;
	}


	public void setDescripcionProductoIn(String descripcionProductoIn) {
		this.descripcionProductoIn = descripcionProductoIn;
	}


	public String getNombreImagen() {
		return nombreImagen;
	}


	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}


	public String getUrlImagen() {
		return urlImagen;
	}


	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}


	public Productos getProducto() {
		return producto;
	}


	public void setProducto(Productos producto) {
		this.producto = producto;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
