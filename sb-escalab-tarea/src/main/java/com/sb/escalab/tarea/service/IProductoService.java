package com.sb.escalab.tarea.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sb.escalab.tarea.model.Producto;

public interface IProductoService extends ICRUD<Producto> {
	
	Page<Producto> listarPageable(Pageable pageable);

}
