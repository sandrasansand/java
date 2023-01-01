package com.arquitecturajava.ejemplo1;
import com.arquitecturajava.dominio.*;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		
		
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("pedro","gomez",30));
		listaPersonas.add(new Persona("ana","sanchez",40));
		listaPersonas.add(new Persona("gema","blanco",20));
		
		//hemos implementado el método CompareTo 
		//del interface Comparable solo permite ordenar por un campo
		Collections.sort(listaPersonas);
		
		for (Persona p: listaPersonas) {
			
			System.out.printf("persona : %s %s %s %n",p.getNombre(),p.getApellidos(),p.getEdad());
		}
	}

}
