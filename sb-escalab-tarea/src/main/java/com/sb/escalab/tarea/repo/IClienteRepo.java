package com.sb.escalab.tarea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.escalab.tarea.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

}
