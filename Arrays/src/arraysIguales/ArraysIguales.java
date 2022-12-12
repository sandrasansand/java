package arraysIguales;

import java.util.Arrays;

/*Indicar si dos arrays son iguales, si tienen los mismos elementos en el mismo orden.

En el método main crearemos distintos arrays y llamaremos al método 
	sonArraysIguales(int[] array1, int[] array2) 
que nos indica si los dos arrays son iguales o no.

En este método, en un primer lugar, 
comprobaremos que los dos arrays tengan la misma longitud. 
En caso afirmativo, los recorreremos comprobando cada posición 
mediante un for, que tiene dos condiciones que se deben cumplir 
para seguir en el bucle; no haber llegado al final del array (i<array1.length) 
y que la variable booleana (iguales) 
sea verdadera. En caso de que encuentre un elemento que no sea igual, 
la variable se pondrá a falsa, saliendo del bucle sin tener que llegar 
al final del array, mejorando la eficiencia.*/

public class ArraysIguales {

	public static void main(String[] args) {
		int[] array1 ={1, 3, 5, 7, 9};
		int[] array2 ={1, 3, 5, 7, 9};
		int[] array3 ={1, 3, 5, 6, 9};
		visualizar(array1);
		visualizar(array2);
		visualizar(array3);
		System.out.println("Arrays 1 y 2");
		sonArraysIguales(array1, array2);
		System.out.println("Arrays 1 y 3");
		sonArraysIguales(array1, array3);
	}
	public static void visualizar(int[] pArray) {
		System.out.println(Arrays.toString(pArray));
	}
	
	public static void sonArraysIguales(int[] array1, int[] array2) {
		boolean iguales =(array1.length == array2.length);
		if (iguales) {
			for (int i = 0; i < array1.length && iguales; i++) {
				if (array1[i] != array2[i] ) {
					iguales=false;
				}
			}
		}
		if (iguales) {
			System.out.println("Los dos arrays son iguales");
		}else {
			System.out.println("Los dos arrays son distintos");
		}
	}
}
