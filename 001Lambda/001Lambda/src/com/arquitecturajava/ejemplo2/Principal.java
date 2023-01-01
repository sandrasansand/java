package com.arquitecturajava.ejemplo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arquitecturajava.dominio.Persona;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "azul", 20));

		List<Persona> nueva = buscarPersonaPorNombre("ana", listaPersonas);

		List<Persona> nueva2 = buscarPersonaPorApellido("azul", listaPersonas);

		System.out.println("************nombre***************");

		for (Persona p : nueva) {

			System.out.printf("persona : %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}

		System.out.println("************apellido***************");
		for (Persona p : nueva2) {

			System.out.printf("persona : %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}

	}

	public static List<Persona> buscarPersonaPorNombre(String nombre, List<Persona> milista) {

		List<Persona> listaFiltro = new ArrayList<Persona>();

		for (Persona p : milista) {

			if (p.getNombre().equals(nombre)) {
				listaFiltro.add(p);
			}

		}
		return listaFiltro;
	}

	public static List<Persona> buscarPersonaPorApellido(String apellido, List<Persona> milista) {

		List<Persona> listaFiltro = new ArrayList<Persona>();

		for (Persona p : milista) {

			if (p.getApellidos().equals(apellido)) {
				listaFiltro.add(p);
			}

		}
		return listaFiltro;
	}

}
