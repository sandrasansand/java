package com.arquitecturajava.ejemplo1;

import java.util.List;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;
/*skip() método de recorte lo que le pases en adelante*/
public class Principal {

	public static void main(String[] args) {

		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();
		
		//lista.stream().filter(p->p.getNombre().equals("ana")).map(Persona::getNombre).forEach(System.out::println);
	//desde el 3º en adelante skip(2) , limit(n elementos)
		//lista.stream().skip(2).forEach(Principal::mostrarPersona);
		lista.stream().skip(1).limit(2).filter(p->p.getEdad()>20).forEach(Principal::mostrarPersona);
		
	}
	
	public static void mostrarPersona(Persona persona) {
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellidos());
		System.out.println(persona.getEdad());
		
	}

	

}
