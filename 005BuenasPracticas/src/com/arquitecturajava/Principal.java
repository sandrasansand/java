package com.arquitecturajava;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.dominio.Factura;

public class Principal {

	public static void main(String[] args) {
		
		List<Factura> lista= new ArrayList<Factura>();
		Factura f;
		
		for (int i=0;i<1_000_000;i++) {
			
			f= new Factura(i," concepto "+ i, Math.round(Math.random()*10000));
			lista.add(f);
		}
		//aparecen ordenadas por el campo del importe que es el campo del método compareTo de la Interface Comparable
		lista.stream().limit(10).sorted().forEach(System.out::println);
		

	}

}
