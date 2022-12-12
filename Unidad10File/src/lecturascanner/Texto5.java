package lecturascanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Disponemos de un fichero de texto llamado enteros.txt que contiene n�meros
enteros. El siguiente programa lee los n�meros y los muestra. Muestra tambi�n la
cantidad de n�meros le�dos y su suma.
Se utiliza el m�todo hasNextInt() de Scanner para saber si quedan m�s enteros
que leer en el fichero.
La lectura acaba cuando no quedan m�s enteros (se ha llegado al final del fichero)
o cuando encuentra un car�cter no v�lido como entero.
*/
public class Texto5 {

	public static void main(String[] args) {
		File f = new File("c:/ficheros/enteros.txt");
		int numero, suma = 0, cont = 0;
		Scanner entrada = null;
		try {
			entrada = new Scanner(f);
			while (entrada.hasNext()) {
				numero = (int) entrada.nextInt();
				System.out.println(numero);
				suma = suma + numero;
				cont++;
			}
			System.out.println("N�meros le�dos: " + cont);
			System.out.println("Suma: " + suma);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			entrada.close();

		}
	}
}
