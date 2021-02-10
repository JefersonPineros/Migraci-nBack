package com.skillexBack.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.skillexBack.app.models.Eventos;

public interface IEventosRepository extends CrudRepository<Eventos, Integer> {

}
