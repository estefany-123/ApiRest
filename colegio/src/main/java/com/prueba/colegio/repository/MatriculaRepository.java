package com.prueba.colegio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.colegio.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula,Long> {
	List<Matricula> findByEstudianteId(int estudianteId);
}
