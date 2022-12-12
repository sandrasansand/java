package randomaccessfile;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*  Programa Java para modificar un entero dentro del fichero enteros.dat
con acceso aleatorio.
Para ello se pide la posición que ocupa el entero a modificar dentro del fichero, a
continuación se lee y muestra el valor actual, se pide el nuevo valor y finalmente se
escribe el nuevo valor en la posición indicada, modificando de esta forma el valor
antiguo por el nuevo.
La posición deberá estar comprendida entre 1 y el número de enteros que contiene
el fichero.
La cantidad de enteros que contiene el fichero se calcula asi:

*/
public class Random2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RandomAccessFile fichero = null;
		int numero, pos;
		long size;
		try {
//se abre el fichero para lectura escritura, 2d constructor
			fichero = new RandomAccessFile("/ficheros/enteros.dat", "rw");
//calculo cúantos enteros tiene el fichero
			size = fichero.length();
			size = size / 4;
			System.out.println("El fichero tiene " + size + "enteros");
//modificar el entero que se encuentra en una determinada posición
			do {
				System.out.println("Introducen una posición (>=1 y <=" + size + "):");
				pos = sc.nextInt();
			} while (pos < 1 || pos > size);
			pos--;// la pos 1 es la pos 0 decremento

			// nos situamos en la posición (byte de inicio) del entero a modificar
			// 1 entero = 4 bytes

			fichero.seek(pos * 4);

			// leemos y mostramos el valor actual
			System.out.println("Valor actual: " + fichero.readInt());
			numero = sc.nextInt();

			// nos volvemos a situar en la posición a modificar
			// esto es necesario porque después de la lectura que hemos realizado para
			// mostrar
			// el valor el puntero de lectura/escritura ha avanzado al siguiente entero del
			// fichero.
			// si no hacemos esto escribiremos sobre el siguiente entero

			fichero.seek(pos * 4);

			// escribimos el entero
			fichero.writeInt(numero);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
