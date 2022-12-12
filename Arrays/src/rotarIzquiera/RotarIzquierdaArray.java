package rotarIzquiera;

import java.util.Arrays;

/*Programa que dado un array de números enteros rote 
 * sus posiciones a la izquierda. Cada elemento
 *  pasa a su posición anterior y el primer 
 *  elemento a la última posición.

Ejemplo rotar array izquierda

Se ha añadido un método visualizar para poder ver los 
elementos del array.

Otra forma de poder visualizarlo es mediante la clase Arrays 
(aquí vimos otro ejemplo), utilizando el método Arrays.toString(int[] a). 
Incluye el array entre corchetes y separa sus elementos mediante comas.

No nos sirve, sin embargo, llamar 
al método toString desde el propio array. 
De esta forma lo que mostramos es la dirección de memoria.*/

public class RotarIzquierdaArray {

	private static int[] numeros = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		System.out.println();
		visualizar();

		rotarIzqda();
		System.out.println("\nArray rotado a la izquierda");
		visualizar();

		System.out.println("\n\ntoString: " + numeros.toString());
		System.out.println("\nArrays.toString: " + Arrays.toString(numeros));
	}

	private static void visualizar() {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " ");
		}
	}

	private static void rotarIzqda() {
		int aux = numeros[0];
		for (int i = 0; i < numeros.length - 1; i++) {
			numeros[i] = numeros[i + 1];
		}
		numeros[numeros.length - 1] = aux;
	}
}
