package com.arquitecturajava.ejemplo8;

import java.util.Arrays;
import java.util.List;

import com.arquitecturajava.dominio.Documento;
import com.arquitecturajava.dominio.Versionable;

public class Principal {

	public static void main(String[] args) {

		Documento d1 = new Documento("java", 1);
		Documento d2 = new Documento("net", 1);
		Documento d3 = new Documento("python", 1);
		Documento d4 = new Documento("java", 2);
		List<Documento> lista = Arrays.asList(d1, d2, d3, d4);
		// reduccion
		// sobre un acumulador y un bioperator que es una especializacion del bifunction
		// en vez de acumular lo que use es el acumulador para
		// almacenar el elemento que tiene la versión mayor

		// Versionable.esMayor(d1, d2);
		d1.esMayor(d2);
		Documento mayor = lista.stream().reduce(d1, Versionable::esMayor);

		System.out.println(mayor.getTitulo());
		System.out.println(mayor.getVersion());

	}

}
