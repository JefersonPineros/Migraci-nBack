package com.skillexBack.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skillexBack.app.dao.IUsuarioDao;
import com.skillexBack.app.models.Usuario;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping("/api/usuario")
public class UsuarioService {
	@Autowired
	private IUsuarioDao usuarioDao;

	@GetMapping("/listar")
	public ResponseEntity<?> listarUsuarios() {
		List<Usuario> listadoUsuarios = usuarioDao.findAll();
		if (listadoUsuarios.size() > 0) {
			return ResponseEntity.ok(listadoUsuarios);
		}else {
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarUsuario(@PathVariable Integer id) {
		Usuario usuario = this.usuarioDao.findById(id);
		if(usuario != null) {
			System.out.println(usuario.getTipoUsuario_idTipoUsuario());
			return ResponseEntity.ok(usuario);
		} else {
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.NOT_FOUND);
		}
	}
}
