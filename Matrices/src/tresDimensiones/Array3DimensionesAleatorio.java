package tresDimensiones;
/*Crear un array de 3 dimensiones de números enteros. 
 * Pedir por teclado el valor de cada una de las dimensiones. 
 * Inicializarla con números aleatorios y visualizarlo por pantalla 
 * y nos diga la media de los elementos.

Para la lectura por teclado de las dimensiones utilizaremos 
la clase Scanner de la librería java.util.(método nextInt() para leer 
datos de tipo int).

Los elementos del array (del 0 al 10) los generaremos de forma 
aleatoria con el método la clase Random. Creamos un objeto 
de la clase (Random r = new Random()) y llamamos al método 
nextInt(int n) que nos devuelve un valor aleatorio comprendido 
entre el cero (incluido) y el valor n (excluido).

Para recorrer los elementos de un array de tres dimensiones 
necesitamos tres bucles anidados.

En el cálculo de la media (double), dividiendo la suma de 
los elementos (int) entre el número de elementos 
del array (int), deberemos hacer un casting.*/

import java.util.Random;
import java.util.Scanner;

public class Array3DimensionesAleatorio {

	public static void main(String[] args) {

		System.out.print("\n");
		int[][][] array3D;
		int x = pedirNumeroEntero("Introduce la 1ª dimensión: ");
		int y = pedirNumeroEntero("Introduce la 2ª dimensión: ");
		int z = pedirNumeroEntero("Introduce la 3ª dimensión: ");
		array3D = new int[x][y][z];
		inicializarArray3D(array3D);
		visualizar(array3D);

	}

	static int pedirNumeroEntero(String s) {
		int num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print(s);
			num = sc.nextInt();
			if (num <= 0) {
				System.out.println("La dimensión de la mtriz debe ser mayor a 0 ");
			}
		} while (num <= 0);
		return num;
	}

	static void inicializarArray3D(int[][][] pArray) {
		Random r = new Random();
		for (int i = 0; i < pArray.length; i++) {
			for (int j = 0; j < pArray[i].length; j++) {
				for (int k = 0; k < pArray[i][j].length; k++) {
					pArray[i][j][k] = r.nextInt(11);
				}
			}
		}
	}

	static void visualizar(int[][][] pArray) {
		int numElementos = 0, sumaElementos = 0;
		for (int i = 0; i < pArray.length; i++) {
			for (int j = 0; j < pArray[i].length; j++) {
				for (int k = 0; k < pArray[i][j].length; k++) {
					System.out.print("\t" + pArray[i][j][k]);
					numElementos++;
					sumaElementos += pArray[i][j][k];
				}
				System.out.print("\n");
			}
			System.out.print("\n\n");
		}
		System.out.printf("La media de los elementos es %.2f", (double) sumaElementos / numElementos);

	}
}
