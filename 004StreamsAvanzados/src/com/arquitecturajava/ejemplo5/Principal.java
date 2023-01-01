package com.arquitecturajava.ejemplo5;

/*Un stream() convierte un  ArrayList en un flujo de trabajo
 * mientras que Collectors hace la opearación contraria
 * recoje los items del flujo de trabajo del stream() y los
 * convierte en una nueva estructura de datos en este caso
 *  Collectors.toList() -> convierte el stream() en un ArrayList
 *  Collectors.toSet() -> lo convierte en un conjunto sin repetidos
 *  Collectors.toMap() -> genera una clave y valor // un diccionario sin repetidos
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Deporte;
import com.arquitecturajava.dominio.Persona;

public class Principal {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		Persona p1 = new Persona("juana", "gomez", 20);
		p1.addDeporte(new Deporte("padel", 30));
		p1.addDeporte(new Deporte("natacion", 10));

		Persona p2 = new Persona("ana", "blanco", 20);
		p2.addDeporte(new Deporte("futbol", 20));
		p2.addDeporte(new Deporte("tenis", 8));

		Persona p3 = new Persona("petra", "marquez", 40);
		p3.addDeporte(new Deporte("pesas", 20));
		p3.addDeporte(new Deporte("ciclismo", 10));

		Persona p4 = new Persona("maria", "sanchez", 30);
		p4.addDeporte(new Deporte("ciclismo", 20));
		p4.addDeporte(new Deporte("padel", 8));

		Persona p5 = new Persona("marta", "marquez", 50);
		p3.addDeporte(new Deporte("yoga", 15));
		p3.addDeporte(new Deporte("ciclismo", 10));

		Persona p6 = new Persona("maria", "sanchez", 35);
		p4.addDeporte(new Deporte("ciclismo", 20));
		p4.addDeporte(new Deporte("padel", 8));

		Persona p7 = new Persona("marta", "perez", 50);
		p7.addDeporte(new Deporte("yoga", 15));
		p7.addDeporte(new Deporte("ciclismo", 10));

		lista = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

		List<Persona> nueva = lista.stream().filter(p -> p.getEdad() > 30).collect(Collectors.toList());

//invoca el metodo equals(si comparten el mismo nombre) de la Clase Persona  y elimina repetidos
		// Set<Persona>
		// nueva=lista.stream().filter(p->p.getEdad()>30).collect(Collectors.toSet());

		for (Persona p : nueva) {

			System.out.println(p.getNombre());
		}

	}

}
