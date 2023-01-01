package com.arquitecturajava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
/*listando ficheros de ruta determinada empleando java8*/
public class Principal7 {

	public static void main(String[] args) {

		try {
			//haciendo de la ruta un Stream, invoco a la clase File de Java IO, Y EL Método walk camina por la ruta 
			Stream<Path> miStream= Files.walk(Paths.get("./src"));
			miStream
			//conversion a fichero del stream de ruta
			.map(Path::toFile)
			//si es fichero
			.filter(File::isFile)
			.map(File::getName)
			.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
