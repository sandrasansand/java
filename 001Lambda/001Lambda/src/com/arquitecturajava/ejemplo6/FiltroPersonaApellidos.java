package com.arquitecturajava.ejemplo6;

import java.util.function.Predicate;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaApellidos implements Predicate<Persona> {

	private String apellidos;

	public FiltroPersonaApellidos(String apellidos) {
		super();
		this.apellidos = apellidos;
	}

	@Override
	public boolean test(Persona persona) {

		if (persona.getApellidos().equals(apellidos)) {

			return true;
		} else {
			return false;
		}
	}

}
