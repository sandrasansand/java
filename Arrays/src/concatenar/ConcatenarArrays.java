package concatenar;

import java.util.Scanner;
/*Programa en el que se pidan al usuario dos arrays 
 * de números enteros y se construya el array resultado
 *  de concatenar los arrays.

Vamos a concatenar los arrays de 2 formas distintas. 
La primera de ellas de una forma más manual, y la segunda forma, 
utilizando el método arraycopy de la clase System.

Los parámetros que recibe el método arrayCopy
1. Array Origen
2. Posicion inicial array origen
3. Array destino
4. Posicion inicial array destino
5. Número de elementos a copiar del array origen 
al array destino

Para la lectura por teclado de los números 
utilizaremos la clase Scanner de la librería 
java.util.(método nextInt() para leer datos 
de tipo int).*/

public class ConcatenarArrays {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array1 = new int[leerEntero("Introduce la dimensón del 1er Array: ")];
		int[] array2 = new int[leerEntero("Introduce la dimensón del 2do Array: ")];
		// concatenar manualmente
		int[] arrayConcatenado = new int[array1.length + array2.length];

		System.out.println("Introduciendo los valores del 1er array: ");
		llenarArray(array1);
		visualizar(array1);
		System.out.println();
		System.out.println("Introduciendo los valores del 2do array: ");
		llenarArray(array2);
		visualizar(array2);
		System.out.println();
		concatenarArrays(array1, array2, arrayConcatenado);
		System.out.println("Array resultante: ");
		visualizar(arrayConcatenado);
	}

	private static void concatenarArrays(int[] array1, int[] array2, int[] arrayConcatenado) {
		for (int i = 0; i < array1.length; i++) {
			arrayConcatenado[i] = array1[i];
		}
		for (int i = 0, j = array1.length; i < array2.length; i++, j++) {
			arrayConcatenado[j] = array2[i];
		}
	}

	private static int leerEntero(String s) {
		System.out.println(s);
		int num = sc.nextInt();
		return num;
	}

	private static void llenarArray(int[] pArray) {
		for (int i = 0; i < pArray.length; i++) {
			pArray[i] = leerEntero("Intoduce el valor " + (i + 1) + ":");
		}
	}

	private static void visualizar(int[] pArray) {
		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i] + " ");
		}
	}

}
