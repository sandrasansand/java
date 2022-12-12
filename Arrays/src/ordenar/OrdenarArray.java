package ordenar;

import java.util.Arrays;
import java.util.Scanner;

/*Programa que pida al usuario un array de n�meros enteros y 
 * ordene los elementos de menor a mayor.

Hay numerosos algoritmos de ordenaci�n (Ver): burbuja, MergeSort, QuickSort�

En este caso no vamos a utilizar ninguno de estos algoritmos, 
si no que nos aprovecharemos del m�todo sort(int[] a)
 de la clase Arrays, al que se le pasa como el array a ordenar.

Para la lectura por teclado de los n�meros utilizaremos
la clase Scanner de la librer�a java.util.(m�todo nextInt() 
para leer datos de tipo int).*/
public class OrdenarArray {
	static Scanner sc = new Scanner(System.in);
	static int[] numeros;

	public static void main(String[] args) {

		numeros = new int[leerEntero("Introduce la dimensi�n del array: ")];
		llenarArray();
		System.out.println("\n\nArray");
		visualizar();
		System.out.println("\n\nArray ordenado");
		Arrays.sort(numeros);
		visualizar();

	}

	private static void llenarArray() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = leerEntero("Inserta el valor " + (i + 1) + ": ");
		}
	}

	private static void visualizar() {
		for (int num : numeros) {
			System.out.print(num + " ");
		}
	}

	private static int leerEntero(String s) {
		System.out.print(s);
		return sc.nextInt();
	}
}
