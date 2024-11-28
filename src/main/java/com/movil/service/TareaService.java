package com.movil.service;

import java.util.List;

import com.movil.entity.Tarea;

public interface TareaService {

	//metodos para el crud
	public abstract List<Tarea> findAll();
	public abstract Tarea findById(int idTarea);
	public abstract Tarea save(Tarea tarea);
	public abstract void delete(int idTarea);
	
	
}