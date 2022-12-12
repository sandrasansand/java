package numerosAleatorios;

import java.util.Random;

/*Programa que crea una matriz de 5 x 5, 
 * la inicialice con números aleatorios del 1 al 25 y 
 * posteriormente la visualice por pantalla.

Los números del array (del 1 al 25) los generaremos de forma 
aleatoria con el método la clase Random. 
Creamos un objeto de la clase (Random r = new Random()) 
y llamamos al método nextInt(int n) que nos devuelve un 
valor aleatorio comprendido entre el cero (incluido) 
y el valor n (excluido), por ello al número aleatorio 
resultante le sumamos 1.*/

public class MatrizNumerosAleatorios {

	public static void main(String[] args) {

		int[][] matrizNumeros = new int[5][5];
		inicializar(matrizNumeros);
		visualizar(matrizNumeros);
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

}
