package com.arquitecturajava.ejemplo9;

import java.util.List;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal9 {

	public static void main(String[] args) {

		ServicioPersona servicio = new ServicioPersona();
		//List<Persona> lista = servicio.buscarTodos();
		List<Persona> lista = servicio.buscarTodosJubilados();

		for (Persona p : lista) {

			System.out.println(p);
		}

	}

}
