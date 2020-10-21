package com.sb.escalab.tarea.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.escalab.tarea.exception.ModeloNotFoundException;
import com.sb.escalab.tarea.model.Supervisor;
import com.sb.escalab.tarea.service.ISupervisorService;

@RestController
@RequestMapping("/supervisores")
public class SupervisorController {
	
	@Autowired
	private ISupervisorService service;
	
	@GetMapping
	public ResponseEntity<List<Supervisor>> listar(){
		List<Supervisor> lista = service.listar();
		return new ResponseEntity<List<Supervisor>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Supervisor> listarPorId(@PathVariable("id") Integer id){
		Supervisor obj = service.leerPorId(id);
		if(obj.getIdSupervisor() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		return new ResponseEntity<Supervisor> (obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Supervisor supervisor){ //REVISAR
		Supervisor obj = service.registrar(supervisor);
		return new ResponseEntity<Object>(obj, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Supervisor> modificar(@Valid @RequestBody Supervisor supervisor){
		Supervisor obj = service.modificar(supervisor);
		return new ResponseEntity<Supervisor>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		Supervisor obj = service.leerPorId(id);
		if(obj.getIdSupervisor() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	

}
