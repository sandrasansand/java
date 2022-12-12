package serializable001;

import java.io.FileInputStream;
/*Ejemplo de lectura de objetos contenidos en un fichero en Java

Programa que lee los objetos del fichero creado en el Ejemplo 1.

Para leer los objetos contenidos en un fichero binario que han sido almacenados
mediante ObjectOutputStream se utiliza la clase ObjectInputStream derivada de
InputStream.
Un objeto ObjectInputStream se crea a partir de un objeto FileInputStream
asociado al fichero.
*/
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Principal2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream entrada = null;
		Persona p;

		try {
			
			fis = new FileInputStream("/ficheros/personas.dat");
			entrada = new ObjectInputStream(fis);

			// El casting es necesario 
			
			p = (Persona) entrada.readObject();
			while (p != null) {
				System.out.println("Nif " + p.getNif() + " Nombre " + p.getNombre() + " Edad " + p.getEdad());
				p= (Persona) entrada.readObject();
			}
//			System.out.println("Nif " + p.getNif() + "Nombre " + p.getNombre() + " Edad " + p.getEdad());
//			p = (Persona) entrada.readObject();
//			System.out.println("Nif " + p.getNif() + "Nombre " + p.getNombre() + " Edad " + p.getEdad());
//			p = (Persona) entrada.readObject();
//			System.out.println("Nif " + p.getNif() + "Nombre " + p.getNombre() + " Edad " + p.getEdad());
//			p = (Persona) entrada.readObject();
//			System.out.println("Nif " + p.getNif() + "Nombre " + p.getNombre() + " Edad " + p.getEdad());
//			p = (Persona) entrada.readObject();
//			System.out.println("Nif " + p.getNif() + "Nombre " + p.getNombre() + " Edad " + p.getEdad());
			
			

		} catch (FileNotFoundException e) {
			System.out.println("Archivo " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Entrada " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if ((fis != null) || (entrada != null)) {
				try {
					fis.close();
					entrada.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
