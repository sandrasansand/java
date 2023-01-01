package com.arquitecturajava.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

	public List<Persona> buscarTodosJubilados() {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));
		listaPersonas.add(new Persona("david", "alvarez", 70));
	
		//filto mistream
		Stream<Persona> mistream = listaPersonas.stream().filter(Persona::estaJubilado);
		
		//clase collect para convertir el flujo de elementos(stream) en una nueva lista o en un nuevo conjunto de datos
		return mistream.collect(Collectors.toList());

	}
}
