package serializable001;

/*Programa que escribe 3 objetos de tipo Persona en el fichero personas.dat.
Para escribir objetos en un fichero binario en Java se utiliza la clase ObjectOutputStream
derivada de OutputStream.
Un objeto ObjectOutputStream se crea a partir de un objeto FileOutputStream
asociado al fichero.
Para poder transformar el objeto en una secuencia de bytes, el objeto debe ser
serializable002.
Un objeto es serializable002 si su clase implementa la interface Serializable.
*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Persona p;

		try {
			// creamos fichero de datos
			fos = new FileOutputStream("/ficheros/personas.dat");
			salida = new ObjectOutputStream(fos);

			// creamos 1 obj persona
			p = new Persona("74004005X", "Sandra Sáez", 37);
			// escribimos el obj en el fichero
			salida.writeObject(p);
			p = new Persona("74004006X", "Ana Sáez", 40);
			salida.writeObject(p);
			p = new Persona("74004007X", "Lucia Sáez", 36);
			salida.writeObject(p);
			p = new Persona("74004008X", "Eva Sáez", 39);
			salida.writeObject(p);
		} catch (FileNotFoundException e) {
			System.out.println("Archivo " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Salida " + e.getMessage());
		} finally {
			if ((fos != null) || (salida != null)) {
				try {
					fos.close();
					salida.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
