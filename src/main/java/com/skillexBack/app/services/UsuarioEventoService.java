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

import com.skillexBack.app.dao.IUsuarioEventoDao;
import com.skillexBack.app.models.UsuarioEvento;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping("/api/usuarioEvento")
public class UsuarioEventoService {

	@Autowired
	private IUsuarioEventoDao usuEDao;

	@GetMapping
	public ResponseEntity<?> listUsuarioEventos() {
		List<UsuarioEvento> usuarioEve = this.usuEDao.findAll();
		if (!usuarioEve.isEmpty()) {
			return new ResponseEntity<>(usuarioEve, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

}
