package randomaccessfile;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*   Ejemplo de uso de un fichero de caracteres con acceso aleatorio.
Se pide por teclado una palabra, la busca el fichero de texto texto.txt y la modifica
escribiéndola en mayúsculas cada vez que aparece en el fichero.
Para hacer el cambio de la palabra por su equivalente en mayúsculas, el programa
lee el fichero por líneas. Para cada línea leída se comprueba si contiene la palabra
buscada y si es así se modifica y se sobrescribe la línea completa modificada.

*/
public class Random3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RandomAccessFile fichero = null;
		String cadena,palabra;
		long pos=0;
		StringBuilder auxBuilder;
		int indice;
		try {
//se abre el fichero para lectura escritura, 2d constructor
			fichero = new RandomAccessFile("/ficheros/texto.txt", "rw");
			
			//se pide por teclado la palabra a buscar
			System.out.println("Introduce la palabra: ");
			palabra = sc.nextLine();
			
			//lectura del fichero
			cadena = fichero.readLine();
			while (cadena != null) {// mientras no lleguemos al final del fichero
				indice = cadena.indexOf(palabra);//buscamos la palabra en la línea
				
				while (indice != -1) {//mientras el indice contenga esa palabra(x si estuviera repetida)
					//asigno la linea a un StringBuilder para modificarlo
					auxBuilder = new StringBuilder(cadena);
					//pincipio, final, remplazo
					auxBuilder.replace(indice, indice+palabra.length(), palabra.toUpperCase());
					cadena = auxBuilder.toString();
					
					//nos posicionamos al principio de la linea actual y sobrescribimos la línea completa
					//la posición donde empieza la línea actual esta en pos	
					//comprobamos si la palabra se repite en la linea
					fichero.seek(pos);
					fichero.writeBytes(cadena);
					
					indice = cadena.indexOf(palabra);				
				}
				pos= fichero.getFilePointer();//pos de la linea actual q vamos a leer
				cadena = fichero.readLine();//leemos línea
			}

			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
