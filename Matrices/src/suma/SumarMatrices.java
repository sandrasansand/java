package suma;
/*Programa que dadas dos matrices de números enteros de como resultado 
 * la matriz resultante de sumarlas.

La suma de matrices solo se puede realizar entre matrices 
de la misma dimensión, que tengan las mismas filas y las mismas columnas. 
(Fuente: Wikipedia).

Los elementos de la matriz (del 0 al 10) los generaremos de 
forma aleatoria con el método la clase Random. 
Creamos un objeto de la clase (Random r = new Random()) y 
llamamos al método nextInt(int n) 
que nos devuelve un valor aleatorio comprendido entre 
el cero (incluido) y el valor n (excluido).

Crearemos un método (int[][] sumaMatrices(int[][] pMatriz1, int[][] pMatriz2)) 
al que se le pasa como parámetros las dos matrices a sumar, 
y devuelve la matriz resultante o null en caso de que no se 
pueda realizar la suma.*/

import java.util.Random;

public class SumarMatrices {

	public static void main(String[] args) {
		int[][] matriz1 = new int[5][5];
		int[][] matriz2 = new int[5][5];
		inicializar(matriz1);
		System.out.println("MATRIZ 1");
		visualizar(matriz1);
		inicializar(matriz2);
		System.out.println("\nMATRIZ 2");
		visualizar(matriz2);

		int[][] matrizSuma =sumaMatrices(matriz1, matriz2);
		if (matrizSuma==null) {
			System.out.println("No se puede realizar la suma de matrices");
		}else {
			System.out.println("Matriz suma: ");
			visualizar(matrizSuma);
		}

	}

	static void inicializar(int[][] matriz) {
		Random r = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(11);
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

	static int[][] sumaMatrices(int[][] pMatriz1, int[][] pMatriz2) {
		int[][] matrizSuma;
		int filas1 = pMatriz1.length;
		int columnas1 = pMatriz1[0].length;
		int filas2 = pMatriz2.length;
		int columnas2 = pMatriz2[0].length;

		if (filas1 == filas2 && columnas1 == columnas2) {
			matrizSuma = new int[filas1][columnas1];
			for (int i = 0; i < pMatriz1.length; i++) {
				for (int j = 0; j < pMatriz1[0].length; j++) {
					matrizSuma[i][j] = pMatriz1[i][j] + pMatriz2[i][j];
				}
			}
			return matrizSuma;
		} else {
			return null;
		}

	}

}
