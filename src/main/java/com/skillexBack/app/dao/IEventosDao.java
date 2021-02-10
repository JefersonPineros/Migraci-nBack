package com.skillexBack.app.dao;

import java.util.List;
import java.util.Optional;

import com.skillexBack.app.models.Eventos;

public interface IEventosDao {
	public List<Eventos> findAll();
	public Optional<Eventos> findById(Integer id);
}
