package com.skillexBack.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "productos")
public class Productos implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_productos")
	private Integer idProductos;
	@Basic(optional = false)
	@Column(name = "nombre_producto")
	private String nombreProducto;
	@Column(name = "nombre_producto_in")
	private String nombreProductoIn;
	@Column(name = "codigo_producto")
	private String codigoProducto;
	@Column(name = "estado_producto")
	private String estadoProducto;
	@Column(name = "cantidad_producto")
	private Integer cantidadProducto;
	@Column(name = "fecha_ingreso")
	private Date fechaIngreso;
	
	@JsonManagedReference
	@OneToOne(mappedBy = "producto", fetch = FetchType.LAZY)
    private DetalleProducto destalleProducto;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id_categoria_producto", name = "categoria_producto_id_categoria_producto")
	private CategoriaProducto categoria;
	
	@JsonBackReference
	@JoinColumn(referencedColumnName = "id_inventario", name = "inventario_id_inventario")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Inventario inventario;
	
	public Productos() {
		super();
	}

	public Productos(Integer idProductos, String nombreProducto, String nombreProductoIn, String codigoProducto,
			String estadoProducto, Integer cantidadProducto, Date fechaIngreso, Inventario inventario,
			CategoriaProducto categoria, DetalleProducto detalleProducto) {
		super();
		this.idProductos = idProductos;
		this.nombreProducto = nombreProducto;
		this.nombreProductoIn = nombreProductoIn;
		this.codigoProducto = codigoProducto;
		this.estadoProducto = estadoProducto;
		this.cantidadProducto = cantidadProducto;
		this.fechaIngreso = fechaIngreso;
		this.inventario = inventario;
		this.categoria = categoria;
		this.destalleProducto = detalleProducto;
	}

	public Integer getIdProductos() {
		return idProductos;
	}

	public void setIdProductos(Integer idProductos) {
		this.idProductos = idProductos;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getNombreProductoIn() {
		return nombreProductoIn;
	}

	public void setNombreProductoIn(String nombreProductoIn) {
		this.nombreProductoIn = nombreProductoIn;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getEstadoProducto() {
		return estadoProducto;
	}

	public void setEstadoProducto(String estadoProducto) {
		this.estadoProducto = estadoProducto;
	}

	public Integer getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public CategoriaProducto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProducto categoria) {
		this.categoria = categoria;
	}

	public DetalleProducto getDestalleProducto() {
		return destalleProducto;
	}

	public void setDestalleProducto(DetalleProducto destalleProducto) {
		this.destalleProducto = destalleProducto;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
