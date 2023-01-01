package com.arquitecturajava.ejemplo6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.arquitecturajava.dominio.Persona;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));
		listaPersonas.add(new Persona("antonio", "perez", 70));

		
		//un metodo de referencia que es como una expresion lambda pero en una clase
		Predicate<Persona> filtroPedro= new FiltroPersonaNombre("pedro");
		Predicate<Persona> filtroPerezOrPedro=filtroPedro.or(Persona::estaJubilado);
		
		
		List<Persona> nueva= buscarPersonaConFiltro(filtroPerezOrPedro,listaPersonas);
		
		for (Persona p : nueva) {

			System.out.printf("persona : %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}

	}
	//necesito una funcion de filtrado
	public static List<Persona> buscarPersonaConFiltro(Predicate<Persona> filtro, List<Persona> milista) {

		List<Persona> listaFiltro = new ArrayList<Persona>();

		for (Persona p : milista) {

			if (filtro.test(p)) {
				listaFiltro.add(p);
			}

		}
		return listaFiltro;
	}

	

}
