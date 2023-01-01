package com.arquitecturajava.ejemplo3;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaNombre implements FiltroPersona {

	private String nombre;
	
	
	public FiltroPersonaNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	//funcion de test que recibe una persona y devuelve verdadero o falso

	@Override
	public boolean test(Persona persona) {
		// TODO Auto-generated method stub
		if(persona.getNombre().equals(nombre)) {
			
			return true;
		}else {
			return false;
		}
	}

}
