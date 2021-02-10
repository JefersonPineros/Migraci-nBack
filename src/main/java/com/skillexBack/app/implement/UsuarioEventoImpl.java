package com.skillexBack.app.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillexBack.app.dao.IUsuarioEventoDao;
import com.skillexBack.app.models.UsuarioEvento;
import com.skillexBack.app.repository.IEventosRepository;
import com.skillexBack.app.repository.IUsuarioEventoRepository;

@Service
public class UsuarioEventoImpl implements IUsuarioEventoDao {
	
	@Autowired
	private IUsuarioEventoRepository usuERepository;
	
	@Override
	public List<UsuarioEvento> findAll() {
		List<UsuarioEvento> usuariolist = (List<UsuarioEvento>) this.usuERepository.findAll();
		return usuariolist;
	}

}
