package com.arquitecturajava.ejemplo11;

import java.util.Optional;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona2;

public class Principal11 {

	public static void main(String[] args) {

		
		ServicioPersona2 servicio= new ServicioPersona2();
		
		Optional<Persona> op= servicio.buscarPorNombre("miguel");
		
		if (op.isPresent()) {
			
			System.out.println(op.get().getApellidos());
		}
		


	}

}
