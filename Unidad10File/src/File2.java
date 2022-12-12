/*Se crea un objeto File ruta asociado al ejemplo3 c:/ficheros y un objeto File f
asociado al fichero datos.txt que se encuentra en ese ejemplo3.
Si el fichero no existe se crea y si el ejemplo3 no existe se crea y a continuación se
crea el fichero. Si el fichero existe se muestra el tamaño del mismo.*/

import java.io.File;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		File ruta = new File("c:/ficheros");
		File f = new File(ruta, "datos.txt");
		System.out.println("ruta abs fichero: " + f.getAbsolutePath());
		System.out.println("Ejemplo4 padre del fichero: " + f.getParent());
		System.out.println("nombre del fichero: " + f.getName());
		System.out.println("ruta relativa : " + f.getPath());
		System.out.println("*************************************************");
		System.out.println("ruta abs : " + ruta.getAbsolutePath());
		System.out.println("Ejemplo4 padre : " + ruta.getParent());
		System.out.println("nombre  : " + ruta.getName());
		System.out.println("ruta relativa: " + ruta.getPath());

		if (!f.exists()) { // se comprueba si el fichero existe o no
			System.out.println("Fichero " + f.getName() + " no existe");
			if (!ruta.exists()) { // se comprueba si la ruta existe o no
				System.out.println("El ejemplo3 " + ruta.getName() + " no existe");
				if (ruta.mkdir()) { // se crea la ruta. Si se ha creado correctamente
					System.out.println("Ejemplo4 creado");
					if (f.createNewFile()) { // se crea el fichero. Si se ha creadocorrectamente
						System.out.println("Fichero " + f.getName() + " creado");
					} else {
						System.out.println("No se ha podido crear " + f.getName());
					}
				} else {
					System.out.println("No se ha podido crear " + ruta.getName());
				}
			} else { // si la ruta existe creamos el fichero
				if (f.createNewFile()) {
					System.out.println("Fichero " + f.getName() + " creado");
				} else {
					System.out.println("No se ha podido crear " + f.getName());
				}
			}
		} else { // el fichero existe. Mostramos el tamaño
			System.out.println("Fichero " + f.getName() + " existe");
			System.out.println("Tamaño " + f.length() + " bytes");
		}

	}
}
