package randomaccessfile;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/* Programa Java que pide un número entero por teclado y lo añade al
final de un fichero binario enteros.dat que contiene números enteros. El programa
utiliza un método mostrarFichero() que se llama dos veces. La primera muestra el
contenido del fichero antes de añadir el nuevo número y la segunda llamada
muestra el fichero después de añadirlo.
*/
public class Random1 {

	static Scanner sc = new Scanner(System.in);
	static RandomAccessFile fichero = null;

	public static void main(String[] args) {
		int numero;

		try {
//se abre el fichero para lectura escritura, 2d constructor
			fichero = new RandomAccessFile("/ficheros/enteros.dat", "rw");
			mostrarFichero();
			System.out.println("Introduce un número entero para añadir al final del fichero: ");
			numero = sc.nextInt();
			fichero.seek(fichero.length());// nos situamos al final del fichero
			fichero.writeInt(numero);// escribimos el entero
			mostrarFichero();// volvemos a mostrar el fichero con el entero añadido al final
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

//metodo estatico para mostrar el fichero de enteros	
	public static void mostrarFichero() {
		int n;
		try {
			fichero.seek(0);// nos situamos al principio del fichero
			while (true) {
				n = fichero.readInt();// leemos un entero
				System.out.println(n);
			}
		} catch (EOFException e) {
			System.out.println("Fin de fichero");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
