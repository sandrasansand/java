package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Lectura de ficheros en Java La clase FileReader permite tener acceso al fichero
en modo lectura.La clase FileReader proporciona el método read() para leer caracteres del
fichero aunque lo normal es realizar la lectura mediante la clase BufferedReader.

Programa Java que lee el contenido del fichero creado en el ejemplo anterior. CARACTER A CARACTER read()
 */
public class Texto3 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("c:/ficheros/datos.txt");
			BufferedReader entrada = new BufferedReader(fr);// para leer creo un obj BfRd apartir de un obj FileRd
			int car = entrada.read();
			while (car != -1) {
				System.out.print((char)car);
				car = entrada.read();// metodos lecturas de la clase BfRder
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
