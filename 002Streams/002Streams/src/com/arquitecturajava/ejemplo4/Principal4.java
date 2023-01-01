package com.arquitecturajava.ejemplo4;

/*
 * uso de streams con la operación de filtrado
 * 
 * */
import java.util.ArrayList;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal4 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));
		listaPersonas.add(new Persona("david", "alvarez", 70));

		Stream<Persona> mistream = listaPersonas.stream();

		mistream
				// .filter((Persona p)->p.getEdad()>20)
				// inferencia de tipos
				// .filter( p->p.getEdad()>20)
				.filter(Persona::estaJubilado).forEach(Principal4::imprimir);

	}

	public static void imprimir(Persona p) {

		System.out.println("*****************");
		System.out.println(p.getNombre());
		System.out.println("*****************");

	}

}
