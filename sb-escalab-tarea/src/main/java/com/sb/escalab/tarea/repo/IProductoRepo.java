package com.sb.escalab.tarea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.escalab.tarea.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {

}
