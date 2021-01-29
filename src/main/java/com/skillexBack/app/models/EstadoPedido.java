package com.skillexBack.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado_pedido")
public class EstadoPedido implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Estado_pedido")
	private Integer idEstadoPedido;
	@Column(name = "State_id")
	private Integer stateId;
	@Column(name = "descripcion")
	private String descripcion;

	public EstadoPedido() {
		super();
	}

	public EstadoPedido(Integer idEstadoPedido, Integer stateId, String descripcion) {
		super();
		this.idEstadoPedido = idEstadoPedido;
		this.stateId = stateId;
		this.descripcion = descripcion;
	}

	public Integer getIdEstadoPedido() {
		return idEstadoPedido;
	}

	public void setIdEstadoPedido(Integer idEstadoPedido) {
		this.idEstadoPedido = idEstadoPedido;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
