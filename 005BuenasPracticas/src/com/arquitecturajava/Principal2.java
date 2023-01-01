package com.arquitecturajava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Factura;

public class Principal2 {

	public static void main(String[] args) {
		
		List<Factura> lista= new ArrayList<Factura>();
		Factura f;
		
		for (int i=0;i<2_000_000;i++) {
			
			f= new Factura(i," concepto "+i, Math.round(Math.random()*10000));
			lista.add(f);
		}
		
		
		//genera a partir de un stream 
		// en la maquina virtual de java
		// una estructura para ejecutar siguientes invocaciones
		// sentencia preparada
		
		long t1= System.nanoTime();
		List<Double> nueva= lista.stream().map(Factura::getImporte).collect(Collectors.toList());
		long t2=System.nanoTime();
		
		
		long t5= System.nanoTime();
		List<Double> nueva3= lista.stream().map(Factura::getImporte).collect(Collectors.toList());
		long t6=System.nanoTime();
		
		System.out.println(t2-t1);
		
		//tarda bastante más
		long t3= System.nanoTime();
		List<Double> nueva2= lista.stream().sorted().map(Factura::getImporte).collect(Collectors.toList());
		long t4=System.nanoTime();
		
		System.out.println(t4-t3);
		
			
		
		
		
	}

}
