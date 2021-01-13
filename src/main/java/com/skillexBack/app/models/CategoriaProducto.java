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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "categoria_producto")
public class CategoriaProducto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria_producto")
	private Integer idCategoriaProducto;
	@Column(name = "tipo_categoria")
	private String tipoCategoria;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria", fetch = FetchType.LAZY)
	private List<Productos> productos;

	public Integer getIdCategoriaProducto() {
		return idCategoriaProducto;
	}

	public void setIdCategoriaProducto(Integer idCategoriaProducto) {
		this.idCategoriaProducto = idCategoriaProducto;
	}

	public String getTipoCategoria() {
		return tipoCategoria;
	}

	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}
	
	
	public CategoriaProducto(Integer idCategoriaProducto, String tipoCategoria, List<Productos> productos) {
		super();
		this.idCategoriaProducto = idCategoriaProducto;
		this.tipoCategoria = tipoCategoria;
		this.productos = productos;
	}

	public CategoriaProducto() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
