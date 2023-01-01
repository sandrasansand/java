package com.arquitecturajava.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class ServicioPersona2 {

	static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	static {

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));
		listaPersonas.add(new Persona("david", "alvarez", 70));

	}

//	public Optional<Persona> buscarPorNombre(String nombre) {
//
//		Optional<Persona> nueva = Optional.empty();
//		for (Persona p : listaPersonas) {
//
//			if (p.getNombre().equals(nombre)) {
//
//				nueva = Optional.of(p);
//			}
//		}
//
//		return nueva;
//	}
	
	public Optional<Persona> buscarPorNombre(String nombre) {

		
		return listaPersonas.stream().filter((p)->p.getNombre().equals(nombre)).findFirst();
		
		
	}


}
