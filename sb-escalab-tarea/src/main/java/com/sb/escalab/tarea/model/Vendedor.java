package com.sb.escalab.tarea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "VENDEDOR")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendedor;
	
	@ManyToOne
	@JoinColumn(name = "id_supervisor", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_supervisor"))
	private Supervisor supervisor;
	
	@Column(name = "nombre", nullable = false, length = 70)
	@Size(min = 3, max = 70, message = "Nombre debe tener mínimo 3 caracteres")
	private String nombre;
	
	/*
	 * @Column(name = "apellido", nullable = false, length = 50)
	 * 
	 * @Size(min = 3, max = 50, message = "Apellido debe tener mínimo 3 caracteres")
	 * private String apellido;
	 */
	
	@Column(name = "dir_vendedor", nullable = true, length = 150)
	@Size(min = 3, max = 150, message = "Dirección debe tener mínimo 3 caracteres")
	private String dirVendedor;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
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

	public String getDirVendedor() {
		return dirVendedor;
	}

	public void setDirVendedor(String dirVendedor) {
		this.dirVendedor = dirVendedor;
	}

}
