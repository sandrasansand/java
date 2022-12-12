package ejercicio04;

/* Escribir un método, de nombre leerCadenaDeArchivo, que reciba por parámetro el nombre 
 * de un archivo y devuelva un array con las cadenas que dicho archivo almacena. Se tendrá 
 * en cuenta que las distintas cadenas se separan en el archivo por un asterisco.
 * El método no capturará ninguna excepción que pueda producirse. LEER*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		String ruta = System.getProperty("user.dir");
		ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
		ruta += "\\";

		String lista2[] = null;
		try {
			//escribirCadenaDeArchivo(ruta, "cadenas.txt");
			lista2 = leerCadenaDeArchivo(ruta, "cadenas.txt");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		for (int i = 0; i < lista2.length; i++) {
			System.out.println(lista2[i]);
		}
	}

	public static String[] leerCadenaDeArchivo(String ruta, String nombre) throws IOException {
		File fichero = new File(ruta + nombre);
		// clase para leer las cadenas linea a linea
		BufferedReader ficheroL;
		ficheroL = new BufferedReader(new FileReader(fichero));
		String linea = ficheroL.readLine();
		ficheroL.close();
		return linea.split("\\*");
	}

	public static void escribirCadenaDeArchivo(String ruta, String nombre) throws IOException {
		Scanner sc = new Scanner(System.in);
		File fichero = new File(ruta + nombre);
		BufferedReader ficheroL;
		//Escritura
		FileWriter ficheroR = new FileWriter(fichero);
		String cadena;
		System.out.println("Introduce su texto. FIN para acabar");
		cadena = sc.nextLine();
		//Lectura
		String linea;
		ficheroL = new BufferedReader(new FileReader(fichero));
		
		//escritura en el fichero
		while (!cadena.equalsIgnoreCase("FIN")) {
			ficheroR.write(cadena);
			cadena = sc.nextLine();
		}
		//lectura mostrar pantalla contenido fichero
		linea = ficheroL.readLine();
		while (linea != null) {
			System.out.println(linea);
			linea = ficheroL.readLine();
		}
		ficheroL.close();
		ficheroR.close();

	}
}
