package binariosfileoutputstream.lectura;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Programa Java que lee el contenido del fichero creado en el Ejemplo 2 matriz y lo muestra
por pantalla metodo lectura read().

*/
public class Binarios4 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		// a partir de un obj fileOutputStream se puede crear un DataOutput
		DataInputStream entrada = null;
		int columnas, filas, i, j;

		try {
			fis = new FileInputStream("/ficheros/matriz.dat");// arroja exception FileNotFoundException
			entrada = new DataInputStream(fis);
			
			filas= entrada.readInt();//lectura primer entero fichero
			columnas = entrada.readInt();//lectura segundo entero del fichero
			
			for (i = 0; i < filas; i++) {
				for(j = 0; j <columnas; j++) {// leemos los doubles y los mostramos por pantalla
					System.out.println( entrada.readDouble());
				}
				System.out.println();
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
