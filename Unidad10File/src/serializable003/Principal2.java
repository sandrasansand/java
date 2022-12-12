package serializable003;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*Programa Java que lee los objetos del fichero creado en el Ejemplo 3*/
public class Principal2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream entrada = null;
		Alumno a;
		// ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

		try {
			fis = new FileInputStream("/Ficheros/alumnos.dat");
			entrada = new ObjectInputStream(fis);
			a = (Alumno) entrada.readObject();

			while (a != null) {
				System.out.println("Alumno: " + a.getNif() + " " + a.getNombre() + " " + a.getFechaMatricula().getDia()
						+ "-" + a.getFechaMatricula().getMes() + "-" + a.getFechaMatricula().getAño());
				a = (Alumno) entrada.readObject();
			}
			// alumnos.add(a);
//			for (Alumno alumno : alumnos) {
//				System.out.println(alumnos);
//			}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado "+e.getMessage());
		} catch (IOException e) {
			System.out.println("No quedan Alumnos por mostrar "+e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null || entrada != null) {
				try {
					fis.close();
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}

}
