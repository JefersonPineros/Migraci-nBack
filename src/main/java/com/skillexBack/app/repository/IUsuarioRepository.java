package com.skillexBack.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.skillexBack.app.models.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {

}
