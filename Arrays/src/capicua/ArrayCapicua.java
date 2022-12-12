package capicua;

import java.util.Scanner;

/*Programa en el que se pida al usuario
 *  un array de n�meros enteros e indique 
 *  en pantalla si dicho array es capic�a, 
 *  es decir, la secuencia de sus elementos
 *   es igual vista de delante hacia atr�s
 *    y de detr�s hacia delante.

Antes de crearlo, pedimos por teclado la 
dimensi�n que va a tener el array.

El m�todo que devuelve si es capic�a 
o no se ha desarrollado de dos formas 
distintas. Con un bucle for y otra con 
un bucle while.

Para la lectura por teclado de los n�meros
 utilizaremos la clase Scanner 
 de la librer�a java.util.(m�todo nextInt() 
 para leer datos de tipo int).*/
public class ArrayCapicua {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int dim = leerNumero("Introduce la dimensi�n del Array: ");
		int[] numeros = new int[dim];
		llenarArray(numeros);
		visualizar(numeros);
		System.out.println();
		if (esCapicua(numeros)) {
			System.out.println("El array es capicua");
		} else {
			System.out.println("El array no es capicua");
		}

	}

	private static int leerNumero(String s) {
		System.out.println(s);
		int num = sc.nextInt();
		return num;
	}

	private static void llenarArray(int[] pArray) {
		for (int i = 0; i < pArray.length; i++) {
			pArray[i] = leerNumero("Intoduce el valor " + (i + 1) + ":");
		}
	}

	private static void visualizar(int[] pArray) {
		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i] + " ");
		}
	}

	private static boolean esCapicua(int[] pArray) {
		boolean capicua = true;
		int aux = 0;
		while (aux < pArray.length / 2 && capicua) {
			if (pArray[aux] != pArray[pArray.length - 1 - aux]) {
				capicua = false;
			}
			aux++;
		}
		return capicua;
	}

}
