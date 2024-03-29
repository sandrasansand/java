package com.arquitecturajava.ejemplo8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Deporte;
import com.arquitecturajava.dominio.Persona;

public class Principal {

	public static void main(String[] args) {

		List<Persona> lista= new ArrayList<Persona>();
		
		Persona p1= new Persona ("isabel","gomez",20);
		p1.addDeporte(new Deporte("padel",30));
		p1.addDeporte(new Deporte("natacion",10));
		
		Persona p2= new Persona ("ana","blanco",80);
		p2.addDeporte(new Deporte("futbol",20));
		p2.addDeporte(new Deporte("tenis",8));
		
		
		Persona p3= new Persona ("pedro","marquez",70);
		p3.addDeporte(new Deporte("pesas",20));
		p3.addDeporte(new Deporte("ciclismo",10));
		
		Persona p4= new Persona ("maria","sanchez",30);
		p4.addDeporte(new Deporte("ciclismo",20));
		p4.addDeporte(new Deporte("padel",8));
		
		
		
		Persona p5= new Persona ("sof�a","marquez",40);
		p3.addDeporte(new Deporte("yoga",14));
		p3.addDeporte(new Deporte("ciclismo",10));
		
		Persona p6= new Persona ("maria","sanchez",66);
		p4.addDeporte(new Deporte("ciclismo",20));
		p4.addDeporte(new Deporte("padel",8));
		
		
		
		Persona p7= new Persona ("gabriel","perez",50);
		p7.addDeporte(new Deporte("yoga",15));
		p7.addDeporte(new Deporte("ciclismo",10));
		
		lista= Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		//la clave es un valor booleano que decide si cumpliamos la condicion o no
		Map<Boolean,List<Persona>> mapa=lista.stream().collect(Collectors.partitioningBy(Persona::estaJubilado));
		//los jubilados
		//mapa.get(true).stream().map(Persona::getNombre).forEach(System.out::println);
		//los no junilados
		mapa.get(false).stream().map(Persona::getNombre).forEach(System.out::println);
		
	
		
		
	}

}
