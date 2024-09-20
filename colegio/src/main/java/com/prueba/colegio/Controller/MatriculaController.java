package com.prueba.colegio.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.colegio.entity.Matricula;
import com.prueba.colegio.service.MatriculaService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
	@Autowired
	private MatriculaService matriculaService;
	
	@GetMapping
	public List<Matricula> getAllMatriculas(){
		return matriculaService.getAllMatriculas();
	}
	
	@GetMapping("/{id_matricula}")
	public Optional<Matricula> getMatricula(@PathVariable Long id_matricula){
		return matriculaService.getMatricula(id_matricula);
	}
	
	@PostMapping
	public Matricula saveMatricula(@RequestBody Matricula matricula) {
		return matriculaService.saveMatricula(matricula);
	}
	
	@GetMapping("/estudiante/{estudianteId}")
	public List<Matricula> findByEstudianteId(@PathVariable int estudianteId){
		return matriculaService.findByEstudianteId(estudianteId);
	}
	
	
	@DeleteMapping("/{id_matricula}")
	
	public void deleteMatricula(@PathVariable Long id_matricula) {
		matriculaService.deleteMatricula(id_matricula);
	}
}
