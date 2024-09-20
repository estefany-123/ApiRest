package com.prueba.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.colegio.entity.Estudiante;
import com.prueba.colegio.repository.EstudianteRepository;

@Service
public class EstudianteService {
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	public List<Estudiante> getAllEstudiantes(){
		return estudianteRepository.findAll();
	}
	
	public Optional<Estudiante> getEstudiante(Long id){
		return estudianteRepository.findById(id);
	}
	
	public Estudiante saveEstudiante(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}
	
	public void deleteEstudiante(Long id) {
		estudianteRepository.deleteById(id);
	}
}
