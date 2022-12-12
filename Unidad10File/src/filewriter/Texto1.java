package filewriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*Programa Java que lee texto por teclado y lo escribe en un fichero de texto. La
lectura de texto por teclado acaba cuando se lee la cadena FIN.
*/
public class Texto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter salida = null;

		try {
			//sobreescribe el texto almacenado, si no lo hubiera crea fichero
			salida = new PrintWriter("C:/ficheros/datos.txt");// arroja exception si no se puede crear o error

			String cadena;
			System.out.println("Introduce su texto. FIN para acabar");
			cadena = sc.nextLine();
			
			while (!cadena.equalsIgnoreCase("FIN")) {
				salida.println(cadena);
				cadena = sc.nextLine();
			}
			salida.flush();// vacio el flujo almacenado en el bufer.. escritura de la salida

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			salida.close();// cierro el flujo
		}

	}

}
