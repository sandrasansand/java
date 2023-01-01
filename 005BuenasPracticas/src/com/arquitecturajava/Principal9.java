package com.arquitecturajava;
/*conversion de un fichero en un stream()*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Principal9 {

	public static void main(String[] args) {

		Pattern patron1= Pattern.compile(",");
		//expresión regular para filtrar los numeros
		Pattern patron2= Pattern.compile("[0-9]+");
		
		
		try {
			//lectura de fichero línea a línea
			Stream<String> stream= Files.lines(Paths.get("./texto.txt"));
			 stream
			//.forEach(System.out::println);
			 //convierte el stream() en items
			.flatMap(s->patron1.splitAsStream(s))
			//.forEach(System.out::println);
			//lo convertimos en un predicate
			.filter(patron2.asPredicate())
			//conversión a lista de números
			.map(Integer::parseInt)
			.reduce(Integer::sum)
			//sum me obliga a utilizar un Optional, por aquello de ifPresent
			.ifPresent(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

	
}
