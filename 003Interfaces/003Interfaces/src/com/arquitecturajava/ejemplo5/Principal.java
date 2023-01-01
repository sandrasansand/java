package com.arquitecturajava.ejemplo5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal {

	public static void main(String[] args) {

		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();

//		BiConsumer<Persona,Persona> biConsumidor=(Persona p1,Persona p2)->System.out.println(p1.getNombre()+","+ p2.getNombre());
//		
//		biConsumidor.accept(new Persona("pepe","perez",20), new Persona("ana","gomez",30));
//		diccionario clave,valor
		// clave es el nombre de la persona
		// valor es el objeto entero
		Map<String, Persona> mapa = lista.stream().collect(Collectors.toMap(Persona::getNombre, persona -> persona));
		// asociando un BiConsumer que es una funcion que recibe
		// dos parametros y no devuelve nada
		mapa.forEach(Principal::imprimirMapaPersona);

	}

	public static void imprimirMapaPersona(String clave, Persona persona) {

		System.out.printf("el nombre es %s y el apellido es %s %n", clave, persona.getApellidos());

	}

}
