package com.movil.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/angular/tareas")
@CrossOrigin ("*")
public class TareaController {

	@Autowired
	private TareaService tareaService;
	
	//metodos de listar
	@GetMapping("/listarTarea")
	public List<Tarea> listarTareas() {
		return tareaService.findAll();
	}
	
	@PostMapping("/registrarTarea")
	public Tarea registrarTarea(@RequestBody Tarea tarea) {
		tarea.setIdTarea(0);
		tarea.setFechaRegistro(new Date());
		tarea.setFechaModifica(new Date());
		return tareaService.save(tarea);
	}	
	
	@DeleteMapping("/eliminarTarea/{id}")
	public void eliminarTarea(@PathVariable("id") int idTarea) {
		tareaService.delete(idTarea);
	}
	
}
