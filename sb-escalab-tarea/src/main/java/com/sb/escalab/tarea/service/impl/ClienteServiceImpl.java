package com.sb.escalab.tarea.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sb.escalab.tarea.model.Cliente;
import com.sb.escalab.tarea.repo.IClienteRepo;
import com.sb.escalab.tarea.service.IClienteService;

public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteRepo repo;

	@Override
	public Cliente registrar(Cliente cli) {
		
		return repo.save(cli);
	}

	@Override
	public Cliente modificar(Cliente cli) {
		
		return repo.save(cli);
	}

	@Override
	public List<Cliente> listar() {
		
		return repo.findAll();
	}

	@Override
	public Cliente leerPorId(Integer idCliente) {
		
		Optional<Cliente> op = repo.findById(idCliente);
		return op.isPresent() ? op.get() : new Cliente();
	}

	@Override
	public boolean eliminar(Integer idCliente) {
		
		repo.deleteById(idCliente);
		return true;
	}

}
