package ejemplo3;

import java.io.File;

/*Programa que muestra el contenido de un ejemplo3. En el ejemplo se
muestra el contenido del ejemplo3 actual.*/

public class Ejemplo3 {

	public static void main(String[] args) {
		File directorio = new File(".");//ejemplo3 actual
		String []lista = directorio.list();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

}
