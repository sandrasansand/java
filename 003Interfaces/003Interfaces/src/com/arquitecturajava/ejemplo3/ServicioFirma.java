package com.arquitecturajava.ejemplo3;

import com.arquitecturajava.dominio.Persona;

public class ServicioFirma {

	private Persona persona;

	public ServicioFirma(Persona persona) {

		this.persona = persona;

	}

	public String obtenerFirmaPersona() {

		return "firma de la persona:" + persona.getNombre();
	}
}
