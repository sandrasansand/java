package com.arquitecturajava.ejemplo4;

import java.util.List;
import java.util.function.Predicate;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal {

	public static void main(String[] args) {

		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();
		Predicate<Persona> pPersona = (Persona p) -> p.getNombre().equals("pedro");
		Predicate<Persona> nuevo = pPersona.or((p) -> p.getNombre().equals("ana"))
				.or((p) -> p.getApellidos().equals("sanchez")).negate();
		lista.stream().filter(nuevo).map(Persona::getNombre).forEach(System.out::println);

	}

}
