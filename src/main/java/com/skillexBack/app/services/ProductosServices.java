package com.skillexBack.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skillexBack.app.dao.IProductosDao;
import com.skillexBack.app.models.Productos;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping("/api/productos")
public class ProductosServices {
	@Autowired
	private IProductosDao proDao;
	@GetMapping
	public ResponseEntity<?> listarProductos() {
		List<Productos> listaProductos = this.proDao.findAll();
		if(listaProductos.size() > 0) {
			return ResponseEntity.ok(listaProductos);
		} else {
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.NOT_FOUND);
		}
	}
}
