package com.sb.escalab.tarea.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.escalab.tarea.model.Producto;
import com.sb.escalab.tarea.repo.IProductoRepo;
import com.sb.escalab.tarea.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo repo;
	
	@Override
	public Producto registrar(Producto pro) {
		
		return repo.save(pro);
	}

	@Override
	public Producto modificar(Producto pro) {
		
		return repo.save(pro);
	}

	@Override
	public List<Producto> listar() {
		
		return repo.findAll();
	}

	@Override
	public Producto leerPorId(Integer idProducto) {
		
		Optional<Producto> op = repo.findById(idProducto);
		return op.isPresent() ? op.get() : new Producto();
		
	}

	@Override
	public boolean eliminar(Integer idProducto) {
		
		repo.deleteById(idProducto);
		return true;
	}
}


