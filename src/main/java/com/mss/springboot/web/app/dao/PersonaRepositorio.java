package com.mss.springboot.web.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mss.springboot.web.app.model.Persona;


public interface PersonaRepositorio extends MongoRepository<Persona, Long>{
	
}