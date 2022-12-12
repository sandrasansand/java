package mayorMenor;

import java.util.Random;

/*Programa que, dado un array de 10 enteros (se inicializar� 
 * con n�meros aleatorios entre el -10 y el 10), muestre las
 *  posiciones del mayor valor y del menor valor.

Similar a un programa que se hizo anteriormente. 
En este caso guardamos tambi�n la posici�n dentro del array.

Los n�meros aleatorios se generar�n con la clase Random de la librer�a 
java.util llamando al m�todo nextInt(int n) que nos devuelve
 un valor aleatorio comprendido entre el cero (incluido)
 y el valor n (excluido).

Para conseguir un rango espec�fico nos servimos del la f�rmula:

int number = random.nextInt(max + 1 -min) + min;

En este caso, para conseguir aleatorios en el 
rango -10 y 10 lo lograremos con r.nextInt(21) � 10.
El mayor y el menor los inicializamos con el 1er valor del array
*/

public class ArrayMayorMenor {
	private static int[] numeros;

	public static void main(String[] args) {
		numeros = new int[10];
		llenarArray();
		visualizar();
		int mayor = numeros[0];
		int menor = numeros[0];
		int posMenor = 0, posMayor = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
				posMayor = i;
			} else {
				menor = numeros[i];
				posMenor = i;
			}

		}

		System.out.printf("%nEl mayor valor es el %d y est� en la posici�n %d" + " "
				+ "y el menor es el %d y est� en la posici�n %d.", mayor, posMayor, menor, posMenor);

	}

	private static void llenarArray() {
		Random r = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(21) - 10;
		}
	}

	private static void visualizar() {
		String cadena = "Array: ";
		for (int i = 0; i < numeros.length; i++) {
			cadena += numeros[i] + ",";
		}
		cadena = cadena.substring(0, cadena.length() - 2);
		System.out.println(cadena);
	}
}
