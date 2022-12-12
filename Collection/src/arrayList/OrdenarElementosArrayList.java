package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Ejemplo de cómo ordenar los elementos en un ArrayList.

Vamos a utilizar la clase Collections, clase con métodos 
estáticos para poder operar con colecciones de datos.

El método sort(List list) nos ordena en orden ascendente 
la lista que pasamos como parámetro (ordena alfabéticamente).

También tenemos el método, sort(List list, Comparator c) , 
que ordena la lista especificada según el orden que nos indica 
el comparador que le pasamos, que en este caso será el 
método reverseOrder().
Este método nos devuelve un objeto Comparator que nos ordena de 
forma inversa al orden natural en una colección que implemente 
la interfaz Comparable.

Nota: En esta entrada hemos tratado con datos String. 
Podríamos haber utilizado cualquier tipo primitivo de Java. 
En una próxima entrada del blog veremos como ordenar ArrayList de objetos.*/

public class OrdenarElementosArrayList {

	public static void main(String[] args) {

		List<String> colores = new ArrayList<String>();

		colores.add("verde");
		colores.add("naranja");
		colores.add("rojo");
		colores.add("amarillo");
		colores.add("azul");
		colores.add("violeta");
		colores.add("negro");
		colores.add("blanco");
		System.out.println(colores);//toString
		System.out.println("************");
//		System.out.println("Colores: ");
//		for (String cadena : colores) {
//			System.out.println(cadena);
//		}
		
		Collections.sort(colores);
		System.out.println("Colores ordenados");
		System.out.println(colores);
		
		Collections.sort(colores,Collections.reverseOrder());
		
		/* Otra forma en dos pasos
        Comparator comparador = Collections.reverseOrder();
        Collections.sort(colores, comparador);*/
		
		System.out.println("Colores ordenados inverso");
		System.out.println(colores);
	}
	
}
