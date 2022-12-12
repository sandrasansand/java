package serializable002;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Empleado e;

		try {
			fos = new FileOutputStream("/ficheros/empleados.dat");
			salida = new ObjectOutputStream(fos);

			e = new Empleado("74004005X", "Sandra Sáez", 37, 1200.40);
			// escribimos el obj en el fichero
			salida.writeObject(e);
			e = new Empleado("74004005Z", "Paula Sáez", 34, 1200.40);
			salida.writeObject(e);
			e = new Empleado("74004005Y", "Lucia Sáez", 38, 1200.40);
			salida.writeObject(e);
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
