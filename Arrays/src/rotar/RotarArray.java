package rotar;

import java.util.Arrays;
import java.util.Scanner;

/*En una entrada anterior, se realizó un programa que rotaba una posición
 *  a la izquierda un array (cada elemento pasaba a su posición anterior y el primer 
 *  elemento a la última posición).

En este caso vamos a realizar un programa más genérico, en el que se pida al usuario 
el número de posiciones y el sentido 
en el que se va a rotar. Vamos a tener para ello 4 métodos; dos en los que se rota 
una posición a la izquierda y una a la derecha; y otros 2 métodos que hacen llamadas  
n veces a los métodos anteriores respectivamente.

El usuario, además, debe introducir el número de elementos que tendrá el array. 
Los elementos los generamos de forma aleatoria con el método Math.random.

También tendremos métodos para pedir al usuario el número de rotaciones y el 
sentido de las mismas con sus validaciones correspondientes.

Visualizaremos el array mediante la clase Arrays, utilizando el método 
Arrays.toString(int[] a)*/

public class RotarArray {
	static Scanner sc = new Scanner(System.in);
	static int[] numeros;
	
//métodos
	void llenarArray() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}
	}

	void visualizarArray() {
		System.out.println(Arrays.toString(numeros) + "\n");
	}

	void inicializarArray() {
		int dimension = 0;
		while (dimension < 1) {
			System.out.println("Dimensión del array: ");
			dimension = sc.nextInt();
			if (dimension < 1) {
				System.out.println("Dimensón no válida");
			}
		}
		numeros = new int[dimension];
	}

	static int pedirNumRotaciones() {
		int numRotaciones = 0;
		 while (numRotaciones<1) {
	            System.out.print("Cantidad de rotaciones: ");
	            numRotaciones = sc.nextInt();
	            if(numRotaciones<1){
	                System.out.println("Cantidad no válida. Debe ser mayor de 0.\n");
	            }
	        }
		return numRotaciones;
	}

	static int pedirSentido() {
		int sentido = 0;
		do {
			System.out.println("Introduce el sentido de la rotación 1 izq 2 dcha: ");
			sentido = sc.nextInt();
			if (!(sentido == 1 || sentido == 2)) {
				System.out.println("Opción no válida");
			}

		} while (!(sentido == 1 || sentido == 2));

		return sentido;
	}

	void rotarIzqda1pos() {
		int aux = numeros[0];
		for (int i = 0; i < numeros.length - 1; i++) {
			numeros[i] = numeros[i + 1];
		}
		numeros[numeros.length - 1] = aux;
	}

	void rotarIzqda(int pos) {
		for (int i = 1; i <= pos; i++) {
			rotarIzqda1pos();
		}
	}

	void rotarDcha1pos() {
		int aux = numeros[numeros.length - 1];
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}
		numeros[0] = aux;
	}

	void rotarDcha(int pos) {
		for (int i = 1; i <= pos; i++) {
			rotarDcha1pos();
		}
	}

	public static void main(String[] args) {
		RotarArray rotar = new RotarArray();
		
		rotar.inicializarArray();
		rotar.llenarArray();
		rotar.visualizarArray();
		
		int numRotaciones = pedirNumRotaciones();
		int opcion = pedirSentido();
		if (opcion == 1) {
			rotar.rotarIzqda(numRotaciones);
		}else {
			rotar.rotarDcha(numRotaciones);
		}
		rotar.visualizarArray();
		
    }
		
	}

