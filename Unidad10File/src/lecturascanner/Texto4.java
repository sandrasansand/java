package lecturascanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Ejemplo de lectura de un fichero de texto con Scanner:
Se utiliza el método hasNext() de Scanner para saber si quedan más datos que
leer en el fichero.
*/
public class Texto4 {

	public static void main(String[] args) {
		File f = new File("c:/ficheros/datos.txt");
		String cadena;
		Scanner entrada = null;
		try {
			entrada = new Scanner(f);
			while (entrada.hasNext()) {
				cadena = (String) entrada.nextLine();
				System.out.println(cadena);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			entrada.close();

		}
	}
}
