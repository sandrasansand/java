package com.arquitecturajava.ejemplo7;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaNombre implements FiltroPersona {

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
