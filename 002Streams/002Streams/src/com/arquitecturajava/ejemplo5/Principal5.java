package com.arquitecturajava.ejemplo5;
/*
 * peek uso para ver ejecución del flujo de trabajo de cada stream
 * */
import java.util.ArrayList;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal5 {

	public static void main(String[] args) {
		
		
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("pedro","gomez",30));
		listaPersonas.add(new Persona("ana","sanchez",40));
		listaPersonas.add(new Persona("gema","blanco",20));
		listaPersonas.add(new Persona("david","alvarez",70));
		
		Stream<Persona> mistream=listaPersonas.stream();
		
		
		
		
		mistream
		// yo aqui imprimo el objeto
		.peek(System.out::println)
		.filter((Persona p)->p.getEdad()>20)
		.peek(System.out::println)
		.forEach(Principal5::imprimir);
	
	}
	
	public static void imprimir(Persona p) {
		
		System.out.println("*****************");
		System.out.println(p.getNombre());
		System.out.println("*****************");
		
	}

}
