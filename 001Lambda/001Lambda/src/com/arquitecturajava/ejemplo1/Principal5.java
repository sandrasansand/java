package com.arquitecturajava.ejemplo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.ejemplo1.comparadores.ComparadorApellidos;
import com.arquitecturajava.ejemplo1.comparadores.ComparadorNombre;

public class Principal5 {

	public static void main(String[] args) {
		
		
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("pedro","gomez",30));
		listaPersonas.add(new Persona("ana","sanchez",40));
		listaPersonas.add(new Persona("gema","blanco",20));
		
		//esta es nuestra primera expresion lamdba sencilla o compacta
		//ya no necesitamos construir la clase comparadorNombre
		listaPersonas.sort((p1,p2)->p1.getNombre().compareTo(p2.getNombre()));
		
		
		
		for (Persona p: listaPersonas) {
			
			System.out.printf("persona : %s %s %s %n",p.getNombre(),p.getApellidos(),p.getEdad());
		}
	}

}
