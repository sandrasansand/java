package com.arquitecturajava.servicios;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.dominio.Persona;

public class ServicioPersona {

	public List<Persona> buscarTodos() {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));
		listaPersonas.add(new Persona("david", "alvarez", 70));
		return listaPersonas;
	}

}
