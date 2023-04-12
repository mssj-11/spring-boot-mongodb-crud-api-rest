package com.mss.springboot.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mss.springboot.web.app.model.Persona;
import com.mss.springboot.web.app.service.PersonaServicio;


@RestController
@RequestMapping("/persona/api/v1")
@CrossOrigin("*")
public class PersonaControlador {
	
	
	@Autowired
	private PersonaServicio personaServicio;
	
	
	//	Obtener todos los registros
	@GetMapping("/all")
	public List<Persona> getAll(){
		return personaServicio.getAll();
	}
	
	
	//	Buscar por ID
	@GetMapping("/find/{id}")
	public Persona find(@PathVariable Long id) {
		return personaServicio.get(id);
	}
	
	
	//	Guardar / Actualizar
	@PostMapping("/save")
	public ResponseEntity<Persona> save(@RequestBody Persona persona){
		Persona obj = personaServicio.save(persona);
		return new ResponseEntity<Persona>(obj, HttpStatus.OK);
	}
	
	
	//	Eliminar
	@GetMapping("/delete/{id}")
	public ResponseEntity<Persona> delete(@PathVariable Long id){
		Persona persona = personaServicio.get(id);
		if(persona != null)	personaServicio.delete(id);
		else	return new ResponseEntity<Persona>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
	
	
	
	
}