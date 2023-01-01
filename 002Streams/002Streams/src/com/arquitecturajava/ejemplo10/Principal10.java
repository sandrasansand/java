package com.arquitecturajava.ejemplo10;

/*
 * permite gestionar la situación de devolución a null
 * un optional es una envoltura que envuelve a un obj
 * para checkear las situaciones donde no existe el obj
 * o está vacío
 * 
 * */
import java.util.Optional;

import com.arquitecturajava.dominio.Persona;

public class Principal10 {

	public static void main(String[] args) {

//		Persona p1=new Persona ("juan","sanchez",20);
//		//Persona p1=null;
//		if(p1!=null) {
//			System.out.println(p1.getNombre());
//		}

		// Optional<Persona> op1=Optional.empty();
		Optional<Persona> op1 = Optional.of(new Persona("juan", "sanchez", 20));
		if (op1.isPresent()) {

			System.out.println(op1.get().getNombre());
		}

	}

}
