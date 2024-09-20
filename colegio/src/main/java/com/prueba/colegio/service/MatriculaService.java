package com.prueba.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.colegio.entity.Matricula;
import com.prueba.colegio.repository.MatriculaRepository;

@Service
public class MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	public List<Matricula> getAllMatriculas(){
		return matriculaRepository.findAll();
	}
	
	public Optional<Matricula> getMatricula(Long id_matricula){
		return matriculaRepository.findById(id_matricula);
	}
	
	public Matricula saveMatricula(Matricula matricula) {
		return matriculaRepository.save(matricula);
	}
	
	public List<Matricula> findByEstudianteId(int estudianteId){
		return matriculaRepository.findByEstudianteId(estudianteId);
	}
	
	public void deleteMatricula(Long id_matricula) {
		matriculaRepository.deleteById(id_matricula);
	}
}
