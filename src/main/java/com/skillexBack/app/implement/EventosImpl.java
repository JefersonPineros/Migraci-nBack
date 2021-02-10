package com.skillexBack.app.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillexBack.app.dao.IEventosDao;
import com.skillexBack.app.models.Eventos;
import com.skillexBack.app.repository.IEventosRepository;

@Service
public class EventosImpl implements IEventosDao {
	@Autowired
	private IEventosRepository eventosRepo;

	@Override
	public List<Eventos> findAll() {
		List<Eventos> listaEventos = (List<Eventos>) this.eventosRepo.findAll();
		return listaEventos;
	}

	@Override
	public Optional<Eventos> findById(Integer id) {
		return this.eventosRepo.findById(id);
	}
	
}
