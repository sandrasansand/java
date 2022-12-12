package rotarIzquiera;

import java.util.Arrays;

/*Programa que dado un array de n�meros enteros rote 
 * sus posiciones a la izquierda. Cada elemento
 *  pasa a su posici�n anterior y el primer 
 *  elemento a la �ltima posici�n.

Ejemplo rotar array izquierda

Se ha a�adido un m�todo visualizar para poder ver los 
elementos del array.

Otra forma de poder visualizarlo es mediante la clase Arrays 
(aqu� vimos otro ejemplo), utilizando el m�todo Arrays.toString(int[] a). 
Incluye el array entre corchetes y separa sus elementos mediante comas.

No nos sirve, sin embargo, llamar 
al m�todo toString desde el propio array. 
De esta forma lo que mostramos es la direcci�n de memoria.*/

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
