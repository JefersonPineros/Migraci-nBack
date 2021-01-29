package com.skillexBack.app.models;

import java.io.Serializable;
import java.util.Date;

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
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "detallepedido")
public class DetallePedido implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddetallePedido")
	private Integer IdDetallePedido;
	
	@Column(name = "valorApagar")
	private Integer valorAPagar;
	
	@Column(name = "producto")
	private String productos;
	
	@Column(name = "cantidadProducto")
	private Integer cantidadProductos;
	
	@Column(name = "fecha_pedido")
	private Date fechaPedido;
	
	@OneToOne(mappedBy = "detallePedido", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Pedidos pedido;
	
	public DetallePedido() {
		super();
	}

	public DetallePedido(Integer idDetallePedido, Integer valorAPagar, String productos, Integer cantidadProductos,
			Date fechaPedido, Pedidos pedido) {
		super();
		IdDetallePedido = idDetallePedido;
		this.valorAPagar = valorAPagar;
		this.productos = productos;
		this.cantidadProductos = cantidadProductos;
		this.fechaPedido = fechaPedido;
		this.pedido = pedido;
	}

	public Integer getIdDetallePedido() {
		return IdDetallePedido;
	}


	public void setIdDetallePedido(Integer idDetallePedido) {
		IdDetallePedido = idDetallePedido;
	}


	public Integer getValorAPagar() {
		return valorAPagar;
	}


	public void setValorAPagar(Integer valorAPagar) {
		this.valorAPagar = valorAPagar;
	}


	public String getProducto() {
		return productos;
	}


	public void setProducto(String productos) {
		this.productos = productos;
	}


	public Integer getCantidadProducto() {
		return cantidadProductos;
	}


	public void setCantidadProducto(Integer cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}


	public Date getFechaPedido() {
		return fechaPedido;
	}


	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	@JsonBackReference
	public Pedidos getPedido() {
		return pedido;
	}


	public void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
