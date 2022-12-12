package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Ejemplo de c�mo convertir un array de String a un ArrayList.

Al igual que en la entrada anterior Desordenar elementos de un array, 
vamos a utilizar el m�todo asList(T� a) de la clase Arrays para convertir 
un array en un List.

Una vez convertido, al intentar a�adir un elemento m�s con el m�todo add, 
se genera la excepci�n UnsupportedOperationException. Esto se debe a 
que el m�todo Arrays.asList devuelve un objeto ArrayList de una 
clase est�tica privada dentro de Arrays (java.util.Arrays.ArrayList), 
no de la clase java.util.ArrayList.

Para crear un ArrayList �real�, al que se le puede a�adir elementos 
con el m�todo add, podemos utilizar el constructor ArrayList(Collection c), 
al que hay que pasarle como par�metro un objeto que implemente la interface Collection.

Aqu� s�, podemos pasar como par�metro un objeto java.util.Arrays.ArrayList, 
ya que implementa la interface Collection.

De esta manera, para convertir un array de String en un ArrayList 
utilizaremos:

List<String> arrayList = new ArrayList<String>(Arrays.asList(array));*/

public class ConvertirArrayEnArrayList {

	public static void main(String[] args) {
		String[] array = { "uno", "dos", "tres", "cuatro", "cinco", "seis" };

		System.out.println("M�todo Arrays.asList");
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
