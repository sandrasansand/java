package com.arquitecturajava.ejemplo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.ejemplo1.comparadores.ComparadorApellidos;
import com.arquitecturajava.ejemplo1.comparadores.ComparadorNombre;

public class Principal3 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));

		// listaPersonas.sort(new ComparadorNombre());
		
		listaPersonas.sort(new Comparator<Persona>() {

			public int compare(Persona p1, Persona p2) {

				if (p1.getEdad() == p2.getEdad()) {

					return 0;
				} else if (p1.getEdad() > p2.getEdad()) {
					return 1;
				} else {
					return -1;
				}

			}

		});
		for (Persona p : listaPersonas) {

			System.out.printf("persona : %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}
	}

}
