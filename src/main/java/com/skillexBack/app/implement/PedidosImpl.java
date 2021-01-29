package com.skillexBack.app.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillexBack.app.dao.IPedidosDao;
import com.skillexBack.app.models.Pedidos;
import com.skillexBack.app.repository.IPedidosRepository;

@Service
public class PedidosImpl implements IPedidosDao {

	@Autowired
	private IPedidosRepository pedidosRepo;

	@Override
	public List<Pedidos> findAll() {
		List<Pedidos> listPedidos = (List<Pedidos>) this.pedidosRepo.findAll();
		
		return listPedidos;
	}

	@Override
	public Optional<Pedidos> findById(Integer id) {
		Optional<Pedidos> pedido = this.pedidosRepo.findById(id);
		return pedido;
	}

}
