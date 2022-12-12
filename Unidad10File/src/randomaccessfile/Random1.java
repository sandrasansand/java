package randomaccessfile;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/* Programa Java que pide un n�mero entero por teclado y lo a�ade al
final de un fichero binario enteros.dat que contiene n�meros enteros. El programa
utiliza un m�todo mostrarFichero() que se llama dos veces. La primera muestra el
contenido del fichero antes de a�adir el nuevo n�mero y la segunda llamada
muestra el fichero despu�s de a�adirlo.
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
			System.out.println("Introduce un n�mero entero para a�adir al final del fichero: ");
			numero = sc.nextInt();
			fichero.seek(fichero.length());// nos situamos al final del fichero
			fichero.writeInt(numero);// escribimos el entero
			mostrarFichero();// volvemos a mostrar el fichero con el entero a�adido al final
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
