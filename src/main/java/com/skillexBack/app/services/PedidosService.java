package com.skillexBack.app.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skillexBack.app.dao.IPedidosDao;
import com.skillexBack.app.models.Pedidos;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping("/api/pedidos")
public class PedidosService {

	//private static final Logger log = LoggerFactory.getLogger(PedidosService.class);
	@Autowired
	private IPedidosDao pedidosDao;

	@GetMapping
	public ResponseEntity<List<Pedidos>> getPedidos() {
		List<Pedidos> listPedidos = pedidosDao.findAll();
		if (listPedidos.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			// return ResponseEntity.ok(listPedidos);
			return new ResponseEntity<>(listPedidos , HttpStatus.OK);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getPedido(@PathVariable Integer id) {
		Optional<Pedidos> pedido = this.pedidosDao.findById(id);
		if(pedido != null) {
			return new ResponseEntity<>(pedido , HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} 
	}
}
