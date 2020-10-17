package com.sb.escalab.tarea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Column(name = "nombre", nullable = false, length = 70)
	@Size(min = 3, max = 70, message = "Nombre debe tener mínimo 3 caracteres")
	private String nombre;
	
	/*
	 * @Column(name = "apellido", nullable = false, length = 50)
	 * 
	 * @Size(min = 3, max = 50, message =
	 * "Apellido debe tener a lo menos 3 caracteres") private String apellido;
	 */
	
	@Column(name = "dir_cliente", nullable = true, length = 150)
	@Size(min = 3, max = 150, message = "Dirección debe tener a lo menos 3 caracteres")
	private String dirCliente;
	
	@Column(name = "tel_cliente", nullable = true, length = 9)
	@Size(min = 9, max = 9, message = "Teléfono debe tener 9 caracteres")
	private String telCliente;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * public String getApellido() { return apellido; }
	 * 
	 * public void setApellido(String apellido) { this.apellido = apellido; }
	 */

	public String getDirCliente() {
		return dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}

}
