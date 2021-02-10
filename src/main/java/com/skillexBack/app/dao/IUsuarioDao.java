package com.skillexBack.app.dao;

import java.util.List;

import com.skillexBack.app.models.Usuario;

public interface IUsuarioDao {
	public List<Usuario> findAll();
	public Usuario  crearUsuario(Usuario usuario);
	public Usuario findById(Integer id);
	public void deleteById(Integer id);
	public Usuario updateUsuario(Usuario usuario);
}
