package com.skillexBack.app.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillexBack.app.dao.IProductosDao;
import com.skillexBack.app.models.Productos;
import com.skillexBack.app.repository.IProductosRepository;

@Service
public class ProductosImpl implements IProductosDao {

	@Autowired
	private IProductosRepository productoDao;

	@Override
	public List<Productos> findAll() {
		return (List<Productos>) this.productoDao.findAll();
	}

	@Override
	public Productos findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
