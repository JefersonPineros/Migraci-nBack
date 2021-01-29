package com.skillexBack.app.dao;

import java.util.List;
import java.util.Optional;

import com.skillexBack.app.models.Pedidos;

public interface IPedidosDao {
	public List<Pedidos> findAll();
	public Optional<Pedidos> findById(Integer id);
}
