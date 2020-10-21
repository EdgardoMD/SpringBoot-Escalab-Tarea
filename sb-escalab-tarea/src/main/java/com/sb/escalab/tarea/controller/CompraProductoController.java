package com.sb.escalab.tarea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.escalab.tarea.model.CompraProducto;
import com.sb.escalab.tarea.service.ICompraProductoService;

@RestController
@RequestMapping("/consultacompras")
public class CompraProductoController {
	
	@Autowired
	private ICompraProductoService service;
	
	@GetMapping("/{idVenta}")
	public ResponseEntity<List<CompraProducto>> listar(@PathVariable("idVenta") Integer idVenta){
		List<CompraProducto> consultasventa = new ArrayList<>();
		consultasventa = service.listarProductosPorVenta(idVenta);
		return new ResponseEntity <List<CompraProducto>> (consultasventa, HttpStatus.OK);
	}

}
