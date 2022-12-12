package desordenar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*Programa que dada una serie de números enteros 
 * en un array, desordene / mezcle / baraje sus elementos.

Este programa vamos a realizarlo de dos formas distintas:

En la primera de ellas, recorreremos el array intercambiando 
los elementos de cada posición por otra posición generara de 
forma aleatoria con el método la clase Random. Creamos un objeto 
de la clase (Random r = new Random()) y llamamos al método nextInt(int n) 
que nos devuelve un valor aleatorio comprendido entre el cero (incluido) 
y el valor n (excluido), en este caso la longitud del array.

Para la segunda, utilizaremos el método shuffle(List list) 
de la clase Collections, que desordena los elementos de una lista.
Para poder utilizarlo, debemos transformar el array de enteros en una 
lista. Lo realizaremos mediante el método asList(T… a) de la clase Arrays.

A la hora de mostrar por pantalla el array de enteros, 
volveremos a utilizar este último método 
System.out.println(Arrays.asList(arrayEnteros)).

Otra forma de poder mostrar por pantalla es 
mediante el método toString(int[] a) de la misma 
clase Arrays System.out.println(Arrays.toString(arrayEnteros)).

Por último, pasamos la lista al array original de enteros 
con el método toArray(T[] a) de la clase List.*/

public class DesordenarArray {

	public static void main(String[] args) {

		Random r = new Random();
		Integer[] arrayEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// ((int [] enteros no se puede pasar a list))

		System.out.println(Arrays.asList(arrayEnteros));

		// 1º método : posición aleatoria
		for (int i = 0; i < arrayEnteros.length; i++) {
			int posAleatoria = r.nextInt(arrayEnteros.length);
			int temp = arrayEnteros[i];
			arrayEnteros[i] = arrayEnteros[posAleatoria];
			arrayEnteros[posAleatoria] = temp;
		}
		System.out.println(Arrays.toString(arrayEnteros));

		// 2º método: Collection.shuffle

		List<Integer> lista = Arrays.asList(arrayEnteros);
		Collections.shuffle(lista);
		System.out.println(lista);

		lista.toArray(arrayEnteros);
	}

}
