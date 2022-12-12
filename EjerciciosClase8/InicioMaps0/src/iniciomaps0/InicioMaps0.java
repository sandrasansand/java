package iniciomaps0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class InicioMaps0 {

	public static void main(String[] args) {
		// Map<String, String> mapa1 = new HashMap<String, String>();
		Map<String, String> mapa1 = new TreeMap<String, String>();
		mapa1.put("rojo", "red");
		mapa1.put("verde", "green");
		mapa1.put("azul", "blue");
		mapa1.put("blanco", "white");
		System.out.println("Listado completo de valores");
		for (String valor : mapa1.values())
			System.out.print(valor + " ");
		System.out.println();
		System.out.println();
		System.out.println("Listado completo de claves");// ordenado alfab por su clave
		for (String clave : mapa1.keySet())
			System.out.print(clave + " ");
		System.out.println();
		System.out.println();
		System.out.println("La traducción de 'rojo' es:" + mapa1.get("rojo"));
		if (mapa1.containsKey("negro"))
			System.out.println("No existe la clave 'negro'");
		System.out.println("La traducción de 'marron' es:" + mapa1.getOrDefault("marrón", "No existe la clave marrón"));
		mapa1.remove("rojo");
		System.out.println(mapa1);
		System.out.println("");
		// ******************* con iteradores ********************
		Iterator it = mapa1.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + "-" + mapa1.get(key));
		}
		System.out.println("");
	}
}
