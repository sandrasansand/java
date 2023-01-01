package com.arquitecturajava.ejemplo3;

import java.util.function.Supplier;

import com.arquitecturajava.dominio.Persona;

public class Principal {

	public static void main(String[] args) {

		// devuelvo un objeto
		// recordemos que el supplier lo que hace es devolver algo
		// sin recibir nada
		Supplier<Persona> obtenerPersona = () -> new Persona("juan", "gomez", 20);

		Persona p = obtenerPersona.get();

		System.out.println(p.getNombre());

		ServicioFirma miservicio = new ServicioFirma(new Persona("juan", "sanchez", 30));
		// en un suplier que es un metodo que devuelve algo sin que pasemos nada
		// nos ayuda a reducir el codigo
		Supplier<String> s = miservicio::obtenerFirmaPersona;

		System.out.println("imprimiendo pagina 1");
		System.out.println(s.get());
		System.out.println("imprimiendo pagina 2");
		System.out.println(s.get());
		System.out.println("imprimiendo pagina 3");
		System.out.println(s.get());
		System.out.println("imprimiendo pagina 4");
		System.out.println(s.get());

	}

}
