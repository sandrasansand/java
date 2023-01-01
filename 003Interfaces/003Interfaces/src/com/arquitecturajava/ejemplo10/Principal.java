package com.arquitecturajava.ejemplo10;
/* streams de tipo basico, para cada tipo java define uno, en este ej de enteros*/
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal {

	public static void main(String[] args) {

		IntStream mistream = IntStream.range(1, 10);
//enteros al cuadrado
		// mistream.map((n)->n*n).forEach(System.out::println);

		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();

		//utilizando reduce(0,(a,b) -> a+b) suma las edades del servico
		int total = lista
				.stream()
				.map(Persona::getEdad)
				.reduce(0, (a, b) -> a + b);
		
// mapToInt convierto el stream en un map de num enteros utilizando Optionals optional generico	
		// OptionalInt
		// oTotal=lista
		//.stream()
		//.mapToInt(Persona::getEdad)
		//.reduce(Integer::sum);

//		if(oTotal.isPresent()) {
//			
//			System.out.println(oTotal.getAsInt());
//		}

		//otra manera de hacer lo mismo más sencilla
		lista
		.stream()
		.mapToInt(Persona::getEdad)
		.reduce(Integer::sum)
		.ifPresent(System.out::println);

		System.out.println(total);

	}

}
