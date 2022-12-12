package elementosRepetidos;

import java.util.Arrays;
import java.util.Random;

/*Programa que muestra los elementos repetidos de un array.

Los números del array (del 1 al 20) los generaremos de forma 
aleatoria con el método la clase Random. Creamos un objeto de la clase 
(Random r = new Random()) y llamamos al método nextInt(int n) 
que nos devuelve un valor aleatorio comprendido entre el cero 
(incluido) y el valor n (excluido), por ello al número aleatorio 
resultante le sumamos 1.

Vamos a realizar el método para mostrar 
los elementos repetidos de dos formas distintas; 
mediante dos bucles anidados y una segunda, 
ordenando los elementos del array (Arrays.sort(int[] a)) 
y utilizando un único bucle.*/

public class ElementosRepetidosArray {

	public static void main(String[] args) {
		System.out.println();
		int[] numeros = new int[10];
		llenarArray(numeros);
		visualizar(numeros);
		System.out.println("\nArray no ordenado");
		mostrarRepetidos(numeros);
		System.out.println("\nArray ordenado");
		mostrarRepetidosOrdenados(numeros);
	}

	static void mostrarRepetidos(int[] pArray) {
		for (int i = 0; i < pArray.length - 1; i++) {
			for (int j = i + 1; j < pArray.length; j++) {
				if (pArray[i] == pArray[j]) {
					System.out.println("Elemento repetido: " + pArray[i]);
				}
			}
		}
	}

	static void mostrarRepetidosOrdenados(int[] pArray) {
		Arrays.sort(pArray);
		for (int i = 0; i < pArray.length - 1; i++) {
			if (pArray[i] == pArray[i + 1]) {
				System.out.println("Elemento repetido: " + pArray[i]);
			}
		}

	}

	static void visualizar(int[] pArray) {
		System.out.println(Arrays.toString(pArray));
	}

	static void llenarArray(int[] pArray) {
		Random r = new Random();
		for (int i = 0; i < pArray.length; i++) {
			pArray[i] = r.nextInt(20) + 1;
		}
	}
}
