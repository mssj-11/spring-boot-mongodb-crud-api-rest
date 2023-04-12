package com.mss.springboot.web.app.commons;

import java.io.Serializable;
import java.util.List;

//	 Plantilla para definir servicios, Utilizando 2 parámetros de tipo genérico, T y ID, que permiten la definición de diferentes tipos de entidad y diferentes tipos de identificadores.
public interface GenericServiceAPI<T, ID extends Serializable> {
	
	T save(T entity);	//	 recibe una entidad de tipo T y la guarda en la base de datos. Devuelve la entidad guardada.
	void delete(ID id);	//	recibe un ID y elimina la entidad correspondiente de la base de datos.
	
	T get(ID id);		//	recibe un ID y devuelve la entidad correspondiente de la base de datos.
	List<T> getAll();	//	devuelve una lista de todas las entidades de tipo T almacenadas en la base de datos.
	
}