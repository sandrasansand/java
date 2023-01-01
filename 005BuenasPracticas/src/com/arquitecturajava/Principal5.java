package com.arquitecturajava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import com.arquitecturajava.dominio.Factura;

public class Principal5 {

	public static void main(String[] args) {
		
		List<Factura> lista= new ArrayList<Factura>();
		Factura f;
		
		for (int i=0;i<10;i++) {
			
			f= new Factura(i,"concepto"+i, Math.round(Math.random()*10000));
			lista.add(f);
		}
		
		long t1=System.currentTimeMillis();
		//4 hilos de ejecución para agilizar la tarea
		ForkJoinPool tp= new ForkJoinPool(4);
		
		Optional<Double> total = null;
		try {
			total = tp.submit(()-> {
				
				return lista.parallelStream().map(Factura::getImporte).map(Principal5::duplicar).reduce(Double::sum);
			}).get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(total.isPresent())
		System.out.println(total.get());
		
		long t2= System.currentTimeMillis();
		
		System.out.println(t2-t1);
	}

	
	// esta bloqueando el thread principal
	public static double duplicar(double numero) {
		
		
		// estamos relentizando el programa
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numero*2;
	}
}
