package randomaccessfile;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*  Programa Java para modificar un entero dentro del fichero enteros.dat
con acceso aleatorio.
Para ello se pide la posici�n que ocupa el entero a modificar dentro del fichero, a
continuaci�n se lee y muestra el valor actual, se pide el nuevo valor y finalmente se
escribe el nuevo valor en la posici�n indicada, modificando de esta forma el valor
antiguo por el nuevo.
La posici�n deber� estar comprendida entre 1 y el n�mero de enteros que contiene
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
//calculo c�antos enteros tiene el fichero
			size = fichero.length();
			size = size / 4;
			System.out.println("El fichero tiene " + size + "enteros");
//modificar el entero que se encuentra en una determinada posici�n
			do {
				System.out.println("Introducen una posici�n (>=1 y <=" + size + "):");
				pos = sc.nextInt();
			} while (pos < 1 || pos > size);
			pos--;// la pos 1 es la pos 0 decremento

			// nos situamos en la posici�n (byte de inicio) del entero a modificar
			// 1 entero = 4 bytes

			fichero.seek(pos * 4);

			// leemos y mostramos el valor actual
			System.out.println("Valor actual: " + fichero.readInt());
			numero = sc.nextInt();

			// nos volvemos a situar en la posici�n a modificar
			// esto es necesario porque despu�s de la lectura que hemos realizado para
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
