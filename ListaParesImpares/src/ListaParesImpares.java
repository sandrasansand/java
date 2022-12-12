import java.util.Scanner;

/*
1.1 Desarrolle un método que, recibiendo como parámetro un array de entrada con una
secuencia de números enteros, devuelva un nuevo array en el que primero aparezcan los
números pares que había en el array original y después aparezcan los números impares. En el
main de la aplicación se introducirá por teclado previamente el número de elementos del array
y los n elementos introducidos.
 */

public class ListaParesImpares {

	public static void main(String[] args) {
		// se introducirá por teclado previamente el número de elementos del array y los
		// n elementos introducidos.
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de elementos: ");
		int n = sc.nextInt();
		int[] lista = new int[n];
		for (int i = 0; i < n; i++) { // recorre lis n elem
			System.out.print("Elemento " + i + " ");
			lista[i] = sc.nextInt();// introducir valores en lista
		}

		ListaParesImpares.imprimir(lista);

		int[] lista1;
		lista1 = listaParesImpares(lista);
		imprimir(lista1);

		int[] lista2= listaImpares(lista);
		imprimir(lista2);

	}

	public static void imprimir(int[] lista) {
		for (int valor : lista) {
			System.out.print(valor + " ");
		}
		System.out.println("");
	}

	public static int[] listaParesImpares(int[] array) {
		int[] listaNueva = new int[array.length];
		int indiceListaNueva = 0;
		for (int valor : array) {
			if (valor % 2 == 0) {
				listaNueva[indiceListaNueva] = valor;
				indiceListaNueva++;

			}
		}
		for (int valor : array) {
			if (valor % 2 != 0) {
				listaNueva[indiceListaNueva] = valor;
				indiceListaNueva++;
			}
		}
		return listaNueva;
	}

	
	
	
	public static int[] listaImpares(int[] lista) {
		int contadorImpares = 0;
		for (int valor : lista) {
			if (valor %2 != 0) {
				contadorImpares++;
			}
		}
		int[] listaNueva = new int[contadorImpares];
		int j = 0; // nuevo indice
		for (int valor : lista) {
			listaNueva[j] = valor;
			j++;
		}
		return listaNueva;
	}
}
