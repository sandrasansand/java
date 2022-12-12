package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Ejemplo de cómo convertir un array de String a un ArrayList.

Al igual que en la entrada anterior Desordenar elementos de un array, 
vamos a utilizar el método asList(T… a) de la clase Arrays para convertir 
un array en un List.

Una vez convertido, al intentar añadir un elemento más con el método add, 
se genera la excepción UnsupportedOperationException. Esto se debe a 
que el método Arrays.asList devuelve un objeto ArrayList de una 
clase estática privada dentro de Arrays (java.util.Arrays.ArrayList), 
no de la clase java.util.ArrayList.

Para crear un ArrayList “real”, al que se le puede añadir elementos 
con el método add, podemos utilizar el constructor ArrayList(Collection c), 
al que hay que pasarle como parámetro un objeto que implemente la interface Collection.

Aquí sí, podemos pasar como parámetro un objeto java.util.Arrays.ArrayList, 
ya que implementa la interface Collection.

De esta manera, para convertir un array de String en un ArrayList 
utilizaremos:

List<String> arrayList = new ArrayList<String>(Arrays.asList(array));*/

public class ConvertirArrayEnArrayList {

	public static void main(String[] args) {
		String[] array = { "uno", "dos", "tres", "cuatro", "cinco", "seis" };

		System.out.println("Método Arrays.asList");
		List<String> lista = Arrays.asList(array);

		try {
			lista.add("siete");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(lista);
		}

		System.out.println("Constructor ArrayList");
		List<String> lista2 = new ArrayList<String>(Arrays.asList(array));

		lista2.add("siete");
		System.out.println(lista2 + "\n");

		System.out.println("lista " + lista.getClass().getCanonicalName());
		System.out.println("lista2 " + lista2.getClass().getCanonicalName());
	}

}
