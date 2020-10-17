package com.sb.escalab.tarea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.escalab.tarea.model.Vendedor;

public interface IVendedorRepo extends JpaRepository<Vendedor, Integer> {

}
