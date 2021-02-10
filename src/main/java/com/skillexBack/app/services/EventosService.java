package com.skillexBack.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skillexBack.app.dao.IEventosDao;
import com.skillexBack.app.models.Eventos;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping("/api/eventos")
public class EventosService {

	@Autowired
	private IEventosDao eventosDao;

	@GetMapping
	public ResponseEntity<?> listarEventos(){
		List<Eventos> listaEventos = this.eventosDao.findAll();
		if(!listaEventos.isEmpty()) {
			return new ResponseEntity<>(listaEventos, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> traerEvento(@PathVariable Integer id) {
		Optional<Eventos> evento = this.eventosDao.findById(id);
		if (evento != null) {
			return new ResponseEntity<>(evento, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
