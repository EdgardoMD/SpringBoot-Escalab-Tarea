package com.sb.escalab.tarea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.escalab.tarea.model.CompraProducto;
import com.sb.escalab.tarea.repo.ICompraProductoRepo;
import com.sb.escalab.tarea.service.ICompraProductoService;

@Service
public class CompraProductoServiceImpl implements ICompraProductoService {
	
	@Autowired
	private ICompraProductoRepo repo;

	@Override
	public List<CompraProducto> listarProductosPorVenta(Integer idVenta) {
		
		return repo.listarProductosPorVenta(idVenta);
	}

}
