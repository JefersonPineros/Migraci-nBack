package com.skillexBack.app.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "pedidos_has_productos")
public class PedidosHasProductos implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(insertable = false, updatable = false, name = "productos_id_productos")
	private Integer IdProducto;
	
	@JsonBackReference
	@JoinColumn(name = "pedidos_idPedidos", referencedColumnName = "idPedidos")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Pedidos pedidosIdProductos;
	
	@JsonBackReference
	@JoinColumn(name = "productos_id_productos", referencedColumnName = "id_productos")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Productos productosIdProductos;

	@Column(name = "cantidad_producto_pedido")
	private Integer cantidadProductoPedido;


	public PedidosHasProductos() {
		super();
	}


	public PedidosHasProductos(Integer id, Integer idProducto, Pedidos pedidosIdProductos,
			Productos productosIdProductos, Integer cantidadProductoPedido) {
		super();
		this.id = id;
		IdProducto = idProducto;
		this.pedidosIdProductos = pedidosIdProductos;
		this.productosIdProductos = productosIdProductos;
		this.cantidadProductoPedido = cantidadProductoPedido;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Pedidos getPedidosIdProductos() {
		return pedidosIdProductos;
	}


	public void setPedidosIdProductos(Pedidos pedidosIdProductos) {
		this.pedidosIdProductos = pedidosIdProductos;
	}


	public Productos getProductosIdProductos() {
		return productosIdProductos;
	}


	public void setProductosIdProductos(Productos productosIdProductos) {
		this.productosIdProductos = productosIdProductos;
	}


	public Integer getCantidadProductoPedido() {
		return cantidadProductoPedido;
	}


	public void setCantidadProductoPedido(Integer cantidadProductoPedido) {
		this.cantidadProductoPedido = cantidadProductoPedido;
	}

	public Integer getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(Integer idProducto) {
		IdProducto = idProducto;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
