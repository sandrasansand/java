package com.arquitecturajava.ejemplo2;

import java.util.List;
import java.util.function.Function;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal {

	public static void main(String[] args) {

		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();
		// la primera parte una un function y la segunda parte un consumer

		// si que tenemos un function
		Function<Persona, String> mapeo = (p) -> p.getNombre();

		// lista.stream().map((p)->p.getNombre()).forEach(System.out::println);
//		lista.stream()
//		.map(Principal::getNombre)
//		.map(Principal::capitalizar)
//		.map(Principal::formatear)
//		.forEach(System.out::println);

		Function<String, String> capitalizar = Principal::capitalizar;
		Function<String, String> formatear = Principal::formatear;

		Function<String, String> componer = capitalizar.andThen(formatear);

		lista.stream().map(Principal::getNombre).map(componer)

				.forEach(System.out::println);

	}

	// consumer
	public static void imprimirNombre(Persona persona) {

		System.out.println(persona.getNombre());
	}

	// lo que es el interface function (recibe algo y devuelve otra cosa)
	public static String getNombre(Persona persona) {

		return persona.getNombre();
	}

	// lo devuelte transformado
	public static String capitalizar(String texto) {

		return texto.substring(0, 1).toUpperCase() + texto.substring(1);

	}

	public static String formatear(String texto) {

		return "<" + texto + ">";
	}

}
