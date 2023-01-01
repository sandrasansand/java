package com.arquitecturajava.ejemplo3;
/*flatMap() aplana el stream() -> flujo horizontal*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.arquitecturajava.dominio.Deporte;
import com.arquitecturajava.dominio.Persona;

public class Principal {

	public static void main(String[] args) {

		List<Persona> lista= new ArrayList<Persona>();
		
		Persona p1= new Persona ("juan","gomez",20);
		p1.addDeporte(new Deporte("padel",30));
		p1.addDeporte(new Deporte("natacion",10));
		
		Persona p2= new Persona ("ana","blanco",20);
		p2.addDeporte(new Deporte("futbol",20));
		p2.addDeporte(new Deporte("tenis",8));
		
		
		Persona p3= new Persona ("pedro","marquez",20);
		p3.addDeporte(new Deporte("pesas",20));
		p3.addDeporte(new Deporte("ciclismo",10));
		
		Persona p4= new Persona ("maria","sanchez",20);
		p4.addDeporte(new Deporte("ciclismo",20));
		p4.addDeporte(new Deporte("padel",8));
		
		
		
		Persona p5= new Persona ("gabriel","marquez",50);
		p3.addDeporte(new Deporte("yoga",15));
		p3.addDeporte(new Deporte("ciclismo",10));
		
		Persona p6= new Persona ("maria","sanchez",20);
		p4.addDeporte(new Deporte("ciclismo",20));
		p4.addDeporte(new Deporte("padel",8));
		
		lista= Arrays.asList(p1,p2,p3,p4);
		
		//lista.stream().map(Persona::getNombre).forEach(System.out::println);
	
//lista de todos los deportes
		//lista.stream()
//flatmap es la operacion que aplana las listas internas de deportes y las convierten
// en un flujo de elementos de stream unico
		//.flatMap((p)->p.getDeportes().stream())
		//.map(d->d.getNombre())
		//.distinct()
		//.forEach(System.out::println);
	
		
//suma de las horas de padel		
		  int total=lista.stream() 
		  //lambda (p)->p.getDeportes()
		  .flatMap((p)->p.getDeportes().stream())
		  //predicate d->d.getNombre()
		  .filter(d->d.getNombre().equals("padel")) 
		  .mapToInt(Deporte::getHoras)
		  .sum();
		  
		  System.out.println(total);
		 
		
		
	}

}
