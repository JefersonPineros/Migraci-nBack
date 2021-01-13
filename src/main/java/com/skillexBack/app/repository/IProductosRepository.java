package com.skillexBack.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.skillexBack.app.models.Productos;

public interface IProductosRepository extends CrudRepository<Productos, Integer> {

}
