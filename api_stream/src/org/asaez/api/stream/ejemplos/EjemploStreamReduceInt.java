package org.asaez.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
	public static void main(String[] args) {

		Stream<Integer> nombres = Stream.of(5, 10, 15, 20);
		
//		int res = nombres.reduce(0, (a, b) -> a + b);
//		System.out.println(res);
		
		int resultado = nombres.reduce(0, Integer::sum);
		System.out.println(resultado);

	}
}
