package binariosfileoutputstream.lectura;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Programa que lee el contenido del fichero creado en el Ejemplo 1. Utilizaremos un
bucle infinito para leer los datos. Cuando se llega al final del fichero se lanza la
excepción EOFException que se utiliza para salir del bucle while.

*/
public class Binarios3 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		// a partir de un obj fileOutputStream se puede crear un DataOutput para
		// escribir datos tipo primitivo
		DataInputStream entrada = null;
		int n;

		try {
			fis = new FileInputStream("/ficheros/datos.dat");// arroja exception FileNotFoundException
			entrada = new DataInputStream(fis);

			while (true) {
				n = entrada.readInt();// leemos fichero
				System.out.print(n);// mostramos por pantalla
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (entrada != null) {
					entrada.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}
		}
	}

}
