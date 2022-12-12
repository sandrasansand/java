package mediaMediana;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Programa que calcule la media y la mediana de un array 
 * de enteros inicializado de forma aleatoria.

Media se obtiene a partir de la suma de todos sus valores 
dividida entre el número de sumandos.
Mediana representa el valor de la variable de posición 
central en un conjunto de datos ordenados. Para calcularla:
– Ordenamos los datos de menor a mayor.

– Si la serie tiene un número impar de medidas la mediana 
es la puntuación central.

2, 3, 4, 4, 5, 5, 5, 6, 6 Me = 5

– Si la serie tiene un número par de 
puntuaciones la mediana es la media 
entre las dos puntuaciones centrales.

7, 8, 9, 10, 11, 12 Me = 9,5

Los números del array los generaremos de forma aleatoria 
con el método la clase Random. 
*/

public class MediaMedianaArrays {

	static int[] numeros;
	static int numElementos;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la dimensión del array");
		int dim = sc.nextInt();
		sc.close();
		numeros = new int[dim];
		numElementos = numeros.length;
		inicializar();
		visualizar();
		Arrays.sort(numeros);
		visualizar();
		System.out.println("La media es: ");
		System.out.println(calcularMedia());
		System.out.println("La mediana es: ");
		System.out.println(calcularMediana());

	}

	private static double calcularMediana() {
		double mediana;
		if (numElementos % 2 == 0) {
			int sumaMedios = numeros[numElementos / 2] + numeros[numElementos / 2 - 1];
			mediana = (double) sumaMedios / 2;
		} else {
			mediana = numeros[numElementos / 2];
		}

		return mediana;
	}

	private static double calcularMedia() {
		double media;
		int cont = 0;
		for (int i : numeros) {
			cont += i;
		}
		media = cont / numElementos;
		return media;
	}

	private static void visualizar() {
		System.out.println();
		for (int i = 0; i < numElementos; i++) {
			System.out.println(numeros[i] + " ");
		}
	}

	private static void inicializar() {
		Random r = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(100) + 1;
		}

	}
}
