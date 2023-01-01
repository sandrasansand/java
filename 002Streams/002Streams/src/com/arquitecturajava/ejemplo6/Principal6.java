package com.arquitecturajava.ejemplo6;
/*map() transf de un obj a otro, en este caso en una cadena/string. */
import java.util.ArrayList;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal6 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));
		listaPersonas.add(new Persona("david", "alvarez", 70));

		Stream<Persona> mistream = listaPersonas.stream();

		mistream

				.map((Persona p) -> p.getNombre())
				// esto falla
				// .forEach(System.out::println);
				.forEach(Principal6::imprimir);
	}

	public static void imprimir(Persona p) {

		System.out.println("*****************");
		System.out.println(p.getNombre());
		System.out.println("*****************");

	}

	public static void imprimir(String texto) {

		System.out.println("*****************");
		System.out.println(texto);
		System.out.println("*****************");

	}

}
