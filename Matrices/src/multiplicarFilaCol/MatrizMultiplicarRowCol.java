package multiplicarFilaCol;

import java.util.Scanner;

/*Programa que pida por teclado las dimensiones 
de una matriz cuadrada, inserte en cada posición 
de la matriz el resultado de multiplicar la fila y 
la columna de esa posición y visualizarla por pantalla.

Al tratarse de una matriz (array bidimensional) cuadrada, 
las dos dimensiones tienen el mismo valor, que se pedirá por teclado.

Para la lectura por teclado de la dimensión utilizaremos 
la clase Scanner de la librería java.util.(método nextInt() 
para leer datos de tipo int).*/

public class MatrizMultiplicarRowCol {

	public static void main(String[] args) {
		int[][] matriz;
		int dim = leerDimension();

		matriz = new int[dim][dim];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (i + 1) * (j + 1);
			}
		}
		visualizar(matriz);
	}

	static int leerDimension() {
		Scanner entrada = new Scanner(System.in);
		int dim = 0;
		do {
			System.out.println("Introduce la dimensión: ");
			dim = entrada.nextInt();
			if (dim <= 0) {
				System.out.println("Dimensión no  correcta ");
			}
		} while (dim <= 0);
		entrada.close();
		return dim;
	}

	static void visualizar(int[][] pMatriz) {
		for (int i = 0; i < pMatriz.length; i++) {
			for (int j = 0; j < pMatriz[i].length; j++) {
				System.out.print("\t" + pMatriz[i][j]);
			}
			System.out.println();
		}
	}
}
