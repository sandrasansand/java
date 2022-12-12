package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Lectura de ficheros en Java La clase FileReader permite tener acceso al fichero
en modo lectura.La clase FileReader proporciona el método read() para leer caracteres del
fichero aunque lo normal es realizar la lectura mediante la clase BufferedReader.

Programa Java que lee el contenido del fichero creado en el ejemplo anterior. Linea a linea
 */
public class Texto2 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("c:/ficheros/datos.txt");
			BufferedReader entrada = new BufferedReader(fr);// para leer creo un obj BfRd apartir de un obj FileRd
			String cadena = entrada.readLine();
			while (cadena != null) {
				System.out.println(cadena);
				cadena = entrada.readLine();// metodos lecturas de la clase BfRder
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fr != null) {
					fr.close();// tenemos que cerrar el fichero cuando ya no se use
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
