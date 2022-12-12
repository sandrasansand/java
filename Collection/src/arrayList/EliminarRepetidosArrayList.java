package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Ejemplo de c�mo eliminar elementos repetidos de un ArrayList.

Utilizaremos la clase HashSet, una de las implementaciones 
de la interface Set, que define una colecci�n que no puede 
contener elementos duplicados.

Esta clase tiene un constructor al que se le pasa como par�metro 
un objeto de tipo Collection, en nuestro caso el ArrayList del 
que queremos borrar los elementos repetidos. De esta forma 
eliminamos los repetidos.

Eliminamos todos los elementos del ArrayList 
con el m�todo clear(), para posteriormente, 
utilizar el m�todo addAll que a�ade un objeto de tipo de Collection 
al ArrayList.

Nota: Los elementos que se van a�adiendo 
al HashSet no tienen un orden espec�fico 
debido a que esta clase realiza un ordenamiento interno mediante el hashcode.*/

public class EliminarRepetidosArrayList {

	public static void main(String[] args) {

		List<String> colores = new ArrayList<String>();

		colores.add("verde");
		colores.add("rojo");
		colores.add("rojo");
		colores.add("amarillo");
		colores.add("azul");
		colores.add("azul");
		colores.add("azul");
		colores.add("blanco");
		System.out.println("Colores: ");
		for (String cadena : colores) {
			System.out.println(cadena);
		}
		// lista desordenada no admite repetidos hashcode
		Set<String> hashSet = new HashSet<String>(colores);// se pasa la lista como param
		colores.clear();
		colores.addAll(hashSet);

		System.out.println("Colores sin repetidos");
		for (String cadena : hashSet) {
			System.out.println(cadena);
		}
	}

}
