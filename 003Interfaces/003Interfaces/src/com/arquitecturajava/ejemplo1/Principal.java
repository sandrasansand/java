package com.arquitecturajava.ejemplo1;

import java.util.List;
import java.util.function.Consumer;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal {

	public static void main(String[] args) {

		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();
		Consumer<Persona> consumerNombre = (p) -> System.out.println(p.getNombre());
		Consumer<Persona> consumerApellidos = Principal::imprimirApellidos;
		Consumer<Persona> consumerCombinado = consumerNombre.andThen(consumerApellidos);

		// lista.stream().forEach(consumerNombre);
		lista.stream().forEach(consumerCombinado);

		// consumerApellidos.accept(new Persona("antonio","jimenez",50));
		// consumerCombinado.accept(new Persona ("antonio","jimenez",50));
	}

	// puede ser asociado a una funcion consumidora porque
	// recibe la persona y no devuelve nada
	public static void imprimirApellidos(Persona persona) {

		System.out.println(persona.getApellidos());
	}

	public static void imprimirNombre(Persona persona) {

		System.out.println(persona.getNombre());
	}

}
