package com.skillexBack.app.dao;

import java.util.List;
import com.skillexBack.app.models.Productos;

public interface IProductosDao {
	public List<Productos> findAll();
	public Productos findById(Integer id);
}
