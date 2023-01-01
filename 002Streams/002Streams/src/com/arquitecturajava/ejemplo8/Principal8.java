package com.arquitecturajava.ejemplo8;
/*
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal8 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("pedro", "gomez", 30));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("gema", "blanco", 20));
		listaPersonas.add(new Persona("david", "alvarez", 70));

		Stream<Persona> mistream = listaPersonas.stream();
		
		//mistream.filter((p)->p.getEdad()>30).forEach(System.out::println);		
		
		//me devuelve una lista con ese filtrado-> para poder reutilizarla
		List<Persona> lista=mistream.filter((p)->p.getEdad()>30).collect(Collectors.toList());
		
		
		for(Persona p:lista) {
			
			System.out.println(p);
		}

	}

	public static void imprimir(int texto) {

		System.out.println("*****************");
		System.out.println(texto);
		System.out.println("*****************");

	}

}
