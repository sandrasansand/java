package com.arquitecturajava.ejemplo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arquitecturajava.dominio.Persona;

public class Principal2 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));

		//List<Persona> nueva = buscarPersonaConFiltro(new FiltroPersonaNombre("pedro"), listaPersonas);
		//List<Persona> nueva = buscarPersonaConFiltro(new FiltroPersonaApellidos("blanco"), listaPersonas);
		//List<Persona> nueva= buscarPersonaConFiltro((p)->p.getApellidos().equals("blanco"),listaPersonas);
		List<Persona> nueva= buscarPersonaConFiltro((p)->p.getNombre().equals("ana"),listaPersonas);
		
		for (Persona p : nueva) {

			System.out.printf("persona : %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}

	}
	//necesito una funcion de filtrado
	public static List<Persona> buscarPersonaConFiltro(FiltroPersona filtro, List<Persona> milista) {

		List<Persona> listaFiltro = new ArrayList<Persona>();

		for (Persona p : milista) {

			if (filtro.test(p)) {
				listaFiltro.add(p);
			}

		}
		return listaFiltro;
	}

	

}
