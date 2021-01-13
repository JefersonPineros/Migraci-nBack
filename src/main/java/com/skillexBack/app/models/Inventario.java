package com.skillexBack.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "inventario")
public class Inventario implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id_inventario;
	public String nombre_empresa;
	public String total_productos;
	
	@OneToMany(mappedBy = "inventario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Usuario> usuarios;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Productos> producto;
	
	public Integer getId_inventario() {
		return id_inventario;
	}


	public void setId_inventario(Integer id_inventario) {
		this.id_inventario = id_inventario;
	}


	public String getNombre_empresa() {
		return nombre_empresa;
	}


	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}


	public String getTotal_productos() {
		return total_productos;
	}


	public void setTotal_productos(String total_productos) {
		this.total_productos = total_productos;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

	public List<Productos> getProducto() {
		return producto;
	}


	public void setProducto(List<Productos> producto) {
		this.producto = producto;
	}


	public Inventario() {
		super();
	}

	public Inventario(Integer id_inventario, String nombre_empresa, String total_productos, List<Usuario> usuarios,
			List<Productos> producto) {
		super();
		this.id_inventario = id_inventario;
		this.nombre_empresa = nombre_empresa;
		this.total_productos = total_productos;
		this.usuarios = usuarios;
		this.producto = producto;
	}





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
