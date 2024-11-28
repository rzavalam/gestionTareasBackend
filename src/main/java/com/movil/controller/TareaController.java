package com.movil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movil.entity.Tarea;
import com.movil.service.TareaService;

@RestController
@RequestMapping("/url/tareas")
public class TareaController {

	@Autowired
	private TareaService tareaService;
	
	
	//metodos de listar
	@GetMapping("/listar")
	public List<Tarea> listar() {
		return tareaService.findAll();
	}
	
	@PostMapping("/registrar")
	public Tarea registrar(@RequestBody Tarea tarea) {
		return tareaService.save(tarea);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") int idTarea) {
		tareaService.delete(idTarea);
	}
	
}
