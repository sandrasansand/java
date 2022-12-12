package binariosfileoutputstream.escritura;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*Programa que lee enteros por teclado y los escribe en el fichero datos.dat. La
lectura de datos acaba cuando se introduce -1.
*/
public class Binarios1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		// a partir de un obj fileOutputStream se puede crear un DataOutput para
		// escribir datos tipo primitivo
		DataOutputStream salida = null;
		int n;

		try {
			fos = new FileOutputStream("c:/ficheros/datos.dat");// arroja exception FileNotFoundException
			salida = new DataOutputStream(fos);

			System.out.println("Introduce un número entero -1 para terminar:");
			n = sc.nextInt();
			do {
				salida.writeInt(n);// escribimos el n entero en el fichero . writeInt arroja exception IO
				System.out.print("Introduce -1 para acabar: ");
				sc.nextInt();
				
			} while (n != -1);
			 
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			if (salida != null) {
				try {
					salida.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
