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

import com.prueba.colegio.entity.Estudiante;
import com.prueba.colegio.service.EstudianteService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
	@Autowired
	private EstudianteService estudianteService;
	
	@GetMapping
	public List<Estudiante> getAllEstudiantes(){
		return estudianteService.getAllEstudiantes();
	}
	
	@GetMapping("/{id}")
	public Optional<Estudiante> getEstudiante(@PathVariable Long id){
		return estudianteService.getEstudiante(id);
	}
	
	@PostMapping
	public Estudiante saveEstudiante(@RequestBody Estudiante estudiante) {
		return estudianteService.saveEstudiante(estudiante);
	}
	
	@DeleteMapping("/{id}")
	
	public void deleteEstudiante(@PathVariable Long id) {
		estudianteService.deleteEstudiante(id);
	}
	
	
}
