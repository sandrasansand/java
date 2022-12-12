package elementosComunes;
/*Programa que dados dos arrays de números enteros, 
 * generados de forma aleatoria, muestre 
 * los elementos comunes a los dos.

Los números (del 1 al 50) los generaremos de forma 
aleatoria con el método la clase Random. 
Creamos un objeto de la clase (Random r = new Random()) 
y llamamos al método nextInt(int n) que 
nos devuelve un valor aleatorio comprendido 
entre el cero (incluido) y el valor n (excluido), 
por ello al número aleatorio resultante le sumamos 1.*/

import java.util.Arrays;
import java.util.Random;

public class ElementosComunesArrays {

	public static void main(String[] args) {
		System.out.println();
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		llenarArray(array1);
		llenarArray(array2);
		System.out.println("Array1 : " + Arrays.toString(array1));
		System.out.println("Array2 : " + Arrays.toString(array2));

		// elementos comunes
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println("Elemento común: " + array1[i]);
				}
			}
		}

	}

	public static void llenarArray(int[] pArray) {
		Random r = new Random();
		for (int i = 0; i < pArray.length; i++) {
			pArray[i] = r.nextInt(50) + 1;
		}

	}
}
