package com.sb.escalab.tarea.service;

import java.util.List;

import com.sb.escalab.tarea.model.CompraProducto;

public interface ICompraProductoService {
	
	List<CompraProducto> listarProductosPorVenta(Integer idVenta);

}
