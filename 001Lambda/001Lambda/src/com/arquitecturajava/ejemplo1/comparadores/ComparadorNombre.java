package com.arquitecturajava.ejemplo1.comparadores;

import java.util.Comparator;

import com.arquitecturajava.dominio.Persona;


// el mismo comparador pero usando un comparator
public class ComparadorNombre implements Comparator<Persona>{

	@Override
	public int compare(Persona persona1, Persona persona2) {
		// TODO Auto-generated method stub
		return persona1.getNombre().compareTo(persona2.getNombre());
	}

}
