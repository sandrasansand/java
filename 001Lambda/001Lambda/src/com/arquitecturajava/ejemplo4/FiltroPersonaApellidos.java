package com.arquitecturajava.ejemplo4;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaApellidos implements FiltroPersona {

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
