package com.prueba.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.colegio.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
	
	
}
