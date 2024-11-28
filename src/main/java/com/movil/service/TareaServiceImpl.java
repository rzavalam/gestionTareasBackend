package com.movil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movil.entity.Tarea;
import com.movil.repository.TareaRepository;

@Service
public class TareaServiceImpl implements TareaService{
	
	@Autowired
	private TareaRepository tareaRepository;

	@Override
	public List<Tarea> findAll() {
		return tareaRepository.findAll();
	}
	
	@Override
	public Tarea findById(int idTarea) {
		return tareaRepository.findById(idTarea).orElse(null);
	}
	
	@Override
	public Tarea save(Tarea tarea) {
		return tareaRepository.save(tarea);
	}
	
	@Override
	public void delete(int idTarea) {
		tareaRepository.deleteById(idTarea);
	}
	

}
