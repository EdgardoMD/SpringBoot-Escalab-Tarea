package com.sb.escalab.tarea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "SUPERVISOR")
public class Supervisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSupervisor;
	
	@Column(name = "nombre", nullable = false, length = 70)
	@Size(min = 3, max = 70, message = "Nombre debe tener a lo menos 3 caracteres" )
	private String nombre;
	
	/*
	 * @Column(name = "apellido", nullable = false, length = 50)
	 * 
	 * @Size(min = 3, max = 50, message =
	 * "Apellido debe tener a lo menos 3 caracteres") private String apellido;
	 */
	
	@Column(name = "dir_supervisor", nullable = false, length = 150)
	@Size(min = 3, max = 100, message = "Dirección debe tener a lo menos 3 caracteres")
	private String dirSupervisor;
	
	@Column(name = "tel_supervisor", nullable = false, length = 9)
	@Size(min = 9, max = 9, message = "Teléfono debe tener 9 caracteres")
	private String telSupervisor;

	public Integer getIdSupervisor() {
		return idSupervisor;
	}

	public void setIdSupervisor(Integer idSupervisor) {
		this.idSupervisor = idSupervisor;
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

	public String getDirSupervisor() {
		return dirSupervisor;
	}

	public void setDirSupervisor(String dirSupervisor) {
		this.dirSupervisor = dirSupervisor;
	}

	public String getTelSupervisor() {
		return telSupervisor;
	}

	public void setTelSupervisor(String telSupervisor) {
		this.telSupervisor = telSupervisor;
	}

}
