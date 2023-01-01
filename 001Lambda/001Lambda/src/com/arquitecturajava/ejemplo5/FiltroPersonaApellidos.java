package com.arquitecturajava.ejemplo5;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaApellidos implements Filtro<Persona> {

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
