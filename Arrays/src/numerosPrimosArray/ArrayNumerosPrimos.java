package numerosPrimosArray;

import java.util.Random;

/*Programa que, dado un array de 10 enteros
(se inicializará con números aleatorios
entre el 0 y el 100), nos diga cuántos números primos contiene.

En Java podemos generar números aleatorios 
con la clase Math y con la clase Random.
En esta ocasión utilizaremos la clase 
Random de la librería java.util.

Creamos un objeto de la clase Random
(Random r = new Random()) y llamamos 
al método nextInt(int n) que nos 
devuelve un valor aleatorio comprendido
entre el cero (incluido)
y el valor n (excluido), 
por ello al número aleatorio 
resultante le sumamos 1 para poder alcanzar el
intervalo de 1 a 100 (r.next(100) + 1).*/
public class ArrayNumerosPrimos {
	static int numeros[];
	public static void main(String[] args) {
		numeros = new int[10];
		inicializar();
		int cont=0;
		for (int i = 0; i < numeros.length; i++) {
			if (esPrimo(numeros[i])) {
				System.out.println("Numero primo: " + numeros[i]);
				cont++;
			}
		}
		System.out.printf("%nTotal números primos: %d", cont);
	}

	private static boolean esPrimo(int num) {
		boolean primo = (num==1)?false:true;
		int divisor =2;
		while (primo && divisor <= Math.sqrt(num)) {
			if (num%divisor ==0) {
				primo=false;
			}
			divisor++;
		}
		return primo;
	}
	
	private static void inicializar() {
		Random r = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] =r.nextInt(100)+1;
		}
	}
	
}
