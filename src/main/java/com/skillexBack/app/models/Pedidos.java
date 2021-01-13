package com.skillexBack.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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
	
	
	//detalle pedido
	//usuario
	// estado pedido
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
