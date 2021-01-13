package com.skillexBack.app.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillexBack.app.dao.IUsuarioDao;
import com.skillexBack.app.models.Usuario;
import com.skillexBack.app.repository.IUsuarioRepository;

@Service
public class UsuarioImpl implements IUsuarioDao {
	@Autowired
	private IUsuarioRepository usuarioRep;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) this.usuarioRep.findAll();
	}

	@Override
	@Transactional
	public Usuario crearUsuario(Usuario usuario) {
		try {
			return this.usuarioRep.save(usuario);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Integer id) {
		return this.usuarioRep.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		try {
			this.usuarioRep.deleteById(id);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	@Transactional
	public void updateUsuario(Usuario usuario) {
		this.usuarioRep.save(usuario);
	}

}
