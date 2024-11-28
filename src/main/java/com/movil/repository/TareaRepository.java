package com.movil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movil.entity.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Integer>{

	
}