package com.skillexBack.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "pedidos")
public class Pedidos implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPedidos")
	private Integer idPedidos;
	@Column(name = "estadoPedido")
	private String estadoPedido;
	@Column(name = "mesa")
	private Integer mesa;
	@Column(name = "numeroPedido")
	private Integer numeroPedido;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "detallePedido_iddetallePedido", referencedColumnName = "iddetallePedido", nullable = false, updatable = false)
	private DetallePedido detallePedido;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedidosIdProductos")
	private List<PedidosHasProductos> pedidoProducto;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,optional = false)
	@JoinColumn(name = "Usuario_idUsuarios", referencedColumnName = "idUsuarios",  nullable = false, updatable = false)
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,optional = false)
	@JoinColumn(name = "estado_pedido_ID", referencedColumnName = "id_Estado_pedido",  nullable = false, updatable = false)
	private EstadoPedido estadoPedidoId;
	
	public Pedidos() {
		super();
	}

	
	public Pedidos(Integer idPedidos, String estadoPedido, Integer mesa, Integer numeroPedido,
			DetallePedido detallePedido, List<PedidosHasProductos> pedidoProducto, Usuario usuario,
			EstadoPedido estadoPedidoId) {
		super();
		this.idPedidos = idPedidos;
		this.estadoPedido = estadoPedido;
		this.mesa = mesa;
		this.numeroPedido = numeroPedido;
		this.detallePedido = detallePedido;
		this.pedidoProducto = pedidoProducto;
		this.usuario = usuario;
		this.estadoPedidoId = estadoPedidoId;
	}


	public Integer getIdPedidos() {
		return idPedidos;
	}

	public void setIdPedidos(Integer idPedidos) {
		this.idPedidos = idPedidos;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}

	public Integer getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public List<PedidosHasProductos> getPedidoProducto() {
		return pedidoProducto;
	}

	public void setPedidoProducto(List<PedidosHasProductos> pedidoProducto) {
		this.pedidoProducto = pedidoProducto;
	}

	@JsonManagedReference
	public DetallePedido getDetallePedido() {
		return detallePedido;
	}

	public void setDetallePedido(DetallePedido detallePedido) {
		this.detallePedido = detallePedido;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public EstadoPedido getEstadoPedidoId() {
		return estadoPedidoId;
	}

	public void setEstadoPedidoId(EstadoPedido estadoPedidoId) {
		this.estadoPedidoId = estadoPedidoId;
	}


	// estado pedido
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
