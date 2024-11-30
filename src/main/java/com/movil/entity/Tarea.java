package com.movil.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tarea")
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTarea;

	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;

	@Column(name = "responsable", nullable = false, length = 100)
	private String responsable;

	@Column(name = "descTarea", nullable = false, length = 70)
	private String descTarea;

	@Column(name = "prioridad", nullable = false, length = 30)
	private String prioridad;

	@Column(name = "estado", nullable = false, length = 30)
	private String estado;

	@Column(name = "fechaInicio", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	@Column(name = "fechaFinal", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaFinal;
	
	@Column(name = "fechaRegistro", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@Column(name = "fechaModifica", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaModifica;

}
