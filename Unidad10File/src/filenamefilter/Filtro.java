package filenamefilter;

import java.io.File;
import java.io.FilenameFilter;
/*El m�todo list llama de forma autom�tica al m�todo accept para cada uno
de los archivos o directorios.

 * Vamos a crear un filtro para obtener todos los archivos que tiene una extensi�n
determinada.
Como dijimos antes, un filtro es un objeto de una clase que implementa el interface
FileNameFilter, por lo tanto tenemos que crear esta clase.
La clase se llamar� Filtro y debe implementar el m�todo accept de FilenameFilter.
En este caso como queremos saber si un archivo tiene una determinada extensi�n
el m�todo accept lo podemos escribir utilizamos el m�todo endsWith de la clase
String (Comprueba si la cadena termina con el sufijo pasado como par�metro).
*/
public class Filtro implements FilenameFilter {
 String extension;

public Filtro(String extension) {
	super();
	this.extension = extension;
}
//implementacion del m�todo accept del interface FilenameFilter
 @Override
	public boolean accept(File dir, String name) {
		
		return name.endsWith(extension);
	}
}
