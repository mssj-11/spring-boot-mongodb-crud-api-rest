package com.mss.springboot.web.app.implement;

import org.springframework.data.repository.CrudRepository;

import com.mss.springboot.web.app.commons.GenericServiceImp;
import com.mss.springboot.web.app.model.Persona;
import com.mss.springboot.web.app.service.PersonaServicio;


public class PersonaImp extends GenericServiceImp<Persona, Long> implements PersonaServicio{

	@Override
	public CrudRepository<Persona, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}