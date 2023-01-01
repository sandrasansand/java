package com.arquitecturajava.ejemplo2;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal2 {

	public static void main(String[] args) {
		
		
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("pedro","gomez",30));
		listaPersonas.add(new Persona("ana","sanchez",40));
		listaPersonas.add(new Persona("gema","blanco",20));
		
		Stream<Persona> mistream=listaPersonas.stream();
		
		mistream.forEach((Persona p)-> {
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			
			
		});
	
	}

}
