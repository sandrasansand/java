package filenamefilter;

import java.io.File;
import java.io.FilenameFilter;
/*El método list llama de forma automática al método accept para cada uno
de los archivos o directorios.

 * Vamos a crear un filtro para obtener todos los archivos que tiene una extensión
determinada.
Como dijimos antes, un filtro es un objeto de una clase que implementa el interface
FileNameFilter, por lo tanto tenemos que crear esta clase.
La clase se llamará Filtro y debe implementar el método accept de FilenameFilter.
En este caso como queremos saber si un archivo tiene una determinada extensión
el método accept lo podemos escribir utilizamos el método endsWith de la clase
String (Comprueba si la cadena termina con el sufijo pasado como parámetro).
*/
public class Filtro implements FilenameFilter {
 String extension;

public Filtro(String extension) {
	super();
	this.extension = extension;
}
//implementacion del método accept del interface FilenameFilter
 @Override
	public boolean accept(File dir, String name) {
		
		return name.endsWith(extension);
	}
}
