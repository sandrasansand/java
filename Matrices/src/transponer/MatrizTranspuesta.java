package transponer;

import java.util.Random;

/*Programa que dada una matriz de números enteros, muestre la matriz transpuesta.

Para transponer una matriz debemos intercambiar las filas por las columnas (Fuente: Wikipedia).

Ejemplo matrices transpuestas

Los elementos del array (del 1 al 25) los generaremos de forma aleatoria 
con el método la clase Random. Creamos un objeto de 
la clase (Random r = new Random()) y llamamos 
al método nextInt(int n) que nos devuelve un 
valor aleatorio comprendido entre el cero (incluido) 
y el valor n (excluido).

El programa vamos a realizarlo de dos formas distintas:

– Si se trata de una matriz cuadrada, es decir, si tiene 
tantas filas como columnas, utilizaremos el 
método transponerMatrizCuadrada(int[][] matriz). 
En este método vamos a sobrescribir los elementos 
de la matriz para obtener la matriz transpuesta.

– Otra forma, que nos vale tanto si la matriz es cuadrada 
como si no, crearemos una nueva matriz con las dimensiones invertidas.

int[][] transpuesta = new int[matriz[0].length][matriz.length]

Y utilizaremos el método transponerMatriz(int[][] matriz, int[][] transpuesta), 
utilizando la matriz original y la recién creada.*/

public class MatrizTranspuesta {

	public static void main(String[] args) {
		// Ejemplo para matriz cuadrada
		int[][] matrizCuadrada = new int[5][5];
		inicializar(matrizCuadrada);
		System.out.println("Matriz cuadrada original: ");
		visualizar(matrizCuadrada);

		transponerMatrizCuadrada(matrizCuadrada);
		System.out.println("Matriz cuadrada transpuesta: ");
		visualizar(matrizCuadrada);

		// Ejemplo para matriz cuadrada o no
		int[][] matriz = new int[5][3];
		int[][] transpuesta = new int[matriz[0].length][matriz.length];
		inicializar(matriz);
		System.out.println("Matriz original: ");
		visualizar(matriz);

		transponerMatriz(matriz, transpuesta);
		System.out.println("Matriz transpuesta: ");
		visualizar(transpuesta);
	}

	static void inicializar(int[][] matriz) {
		Random r = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(25) + 1;
			}
		}
	}

	static void visualizar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void transponerMatrizCuadrada(int[][] matriz) {
		int aux;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i > j) {
					aux = matriz[i][j];
					matriz[i][j] = matriz[j][i];
					matriz[j][i] = aux;
				}
			}
		}
	}

	static void transponerMatriz(int[][] matriz, int[][] transpuesta) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				transpuesta[j][i] = matriz[i][j];
			}
		}
	}

}
