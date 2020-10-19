package com.sb.escalab.tarea.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sb.escalab.tarea.model.Vendedor;
import com.sb.escalab.tarea.repo.IVendedorRepo;
import com.sb.escalab.tarea.service.IVendedorService;

public class VendedorServiceImpl implements IVendedorService{

	@Autowired 
	private IVendedorRepo repo;
	@Override
	public Vendedor registrar(Vendedor ven) {
		
		return repo.save(ven);
	}

	@Override
	public Vendedor modificar(Vendedor ven) {
		
		return repo.save(ven);
	}

	@Override
	public List<Vendedor> listar() {
		
		return repo.findAll();
	}

	@Override
	public Vendedor leerPorId(Integer idVendedor) {
		
		Optional<Vendedor> op = repo.findById(idVendedor);
		return op.isPresent() ? op.get() : new Vendedor();
	}

	@Override
	public boolean eliminar(Integer idVendedor) {
		
		repo.deleteById(idVendedor);
		return true;
	}

}
