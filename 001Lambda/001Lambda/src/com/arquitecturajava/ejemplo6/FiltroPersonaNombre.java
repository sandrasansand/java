package com.arquitecturajava.ejemplo6;

import java.util.function.Predicate;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaNombre implements Predicate<Persona> {

	private String nombre;
	
	
	public FiltroPersonaNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	

	public boolean test(Persona persona) {
		// TODO Auto-generated method stub
		if(persona.getNombre().equals(nombre)) {
			
			return true;
		}else {
			return false;
		}
	}

}
