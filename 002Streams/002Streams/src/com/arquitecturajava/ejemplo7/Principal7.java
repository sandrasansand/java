package com.arquitecturajava.ejemplo7;

/*
 * reduce() -> agrupación de un flujo de obj en un obj final,
 * dependiendo del obj la agrupación es dif (int -> sumatorio)
 * devuelve 1 único obj-> acumulación
 * */
import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal7 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));
		listaPersonas.add(new Persona("david", "alvarez", 70));

		Stream<Persona> mistream = listaPersonas.stream();

		int resultado = mistream

				.mapToInt((Persona p) -> p.getEdad()).reduce(0, (edad1, edad2) -> edad1 + edad2);
		System.out.println(resultado);

		System.out.println("*************optional*****************");

		Stream<Persona> mistream2 = listaPersonas.stream();

		OptionalInt resultado2 = mistream2

				.mapToInt((Persona p) -> p.getEdad()).reduce((edad1, edad2) -> edad1 + edad2);

		// si yo con un filter elimino todos los elementos no hay forma de sumar nada
		// entonces??

		System.out.println(resultado2.getAsInt());

	}

	public static void imprimir(int texto) {

		System.out.println("*****************");
		System.out.println(texto);
		System.out.println("*****************");

	}

}
