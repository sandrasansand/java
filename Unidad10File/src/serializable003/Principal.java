package serializable003;
/*Ejemplo de serialización de una clase compuesta:
Programa java que escribe en un fichero tres objetos de tipo Alumno. Alumno es
una clase derivada de Persona y contiene un atributo Fecha:
*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Alumno a;
		Fecha f;

		try {
			fos = new FileOutputStream("/ficheros/alumnos.dat");
			salida = new ObjectOutputStream(fos);
			f= new Fecha(5,7,2021);
			a = new Alumno("74004005X", "Sandra Sáez", 37, f);
			// escribimos el obj en el fichero
			salida.writeObject(a);
			f= new Fecha(2,7,2021);
			a = new Alumno("74004005Z", "Paula Sáez", 34, f);
			salida.writeObject(a);
			f= new Fecha(2,8,2021);
			a = new Alumno("74004005Y", "Lucia Sáez", 38, f);
			salida.writeObject(a);
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} finally {
			if (fos != null || salida != null) {
				try {
					fos.close();
					salida.close();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}

			}
		}

	}

}
