package ejemplo5;

import java.io.File;
import java.io.IOException;

/* El siguiente programa muestra el contenido del directorio raíz de la
unidad actual de trabajo y de todos sus subdirectorios de forma recursiva. Para
cada directorio se muestran primero los archivos y a continuación las carpetas que
contienen de forma recursiva.
*/

public class Ejemplo5 {

	public static void main(String[] args) throws IOException {
		recorrerDirectorios("/");
	}

	public static void recorrerDirectorios(String ruta) {
		// obj file con la ruta del directorio
		File directorio = new File(ruta);
		// comprobación de si existe
		if (!directorio.exists()) {
			System.out.println("La ruta " + directorio.getAbsolutePath() + "no existe");
			return;
		}
		// comprobacion de si es un directorio
		if (!directorio.isDirectory()) {
			System.out.println("La ruta " + directorio.getAbsolutePath() + " no es un directorio");
			return;
		}
		System.out.println(directorio.getAbsolutePath());
		// obtnere todo el contenido del directorio mediante list
		File[] lista = directorio.listFiles();
		// recorrer directorio y mostrar archivos
		for (File file : lista) {
			if (file.isFile())
				System.out.println("Archivo -> " + file.getName());
		}
		// recorremos de nuevo el directorio para obtener los subdirectorios
		for (File file : lista) {
			// si es un directorio volvemos a llamar al método RECURSIVIDAD
			if (file.isDirectory()) {
				recorrerDirectorios(file.getAbsolutePath());
			}
		}
	}
}
