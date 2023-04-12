package com.mss.springboot.web.app.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.mss.springboot.web.app.commons.GenericServiceImp;
import com.mss.springboot.web.app.dao.PersonaRepositorio;
import com.mss.springboot.web.app.model.Persona;
import com.mss.springboot.web.app.service.PersonaServicio;


@Service
public class PersonaImp extends GenericServiceImp<Persona, Long> implements PersonaServicio{

	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	@Override
	public CrudRepository<Persona, Long> getDao() {
		// TODO Auto-generated method stub
		return personaRepositorio;
	}
	
}