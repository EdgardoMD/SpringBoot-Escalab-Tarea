package com.sb.escalab.tarea.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.escalab.tarea.model.Marca;
import com.sb.escalab.tarea.repo.IMarcaRepo;
import com.sb.escalab.tarea.service.IMarcaService;

@Service
public class MarcaServiceImpl implements IMarcaService{
	
	@Autowired
	private IMarcaRepo repo;

	@Override
	public Marca registrar(Marca mar) {
		
		return repo.save(mar);
	}

	@Override
	public Marca modificar(Marca mar) {
		
		return repo.save(mar);
	}

	@Override
	public List<Marca> listar() {
		
		return repo.findAll();
	}

	@Override
	public Marca leerPorId(Integer idMarca) {
		
		Optional<Marca> op = repo.findById(idMarca);
		return op.isPresent() ? op.get() : new Marca();
		
	}

	@Override
	public boolean eliminar(Integer idMarca) {
		
		repo.deleteById(idMarca);
		return true;
	}

}
