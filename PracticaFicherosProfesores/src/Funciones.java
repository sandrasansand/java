import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Funciones {

	public static void grabarGlobales(File globales) throws FileNotFoundException {
		PrintWriter p = new PrintWriter(globales);
		p.println(Profesor.getCurso() + "#" + String.valueOf(Profesor.getPagoPorHoraExtra()));
		p.flush();
		p.close();
	}

	public static void leerGlobales(File globales) throws FileNotFoundException, IOException {
		if (globales.exists() && globales.length() > 0) {
			BufferedReader f = new BufferedReader(new FileReader(globales));
			String linea;
			String[] temp;
			linea = f.readLine();

			temp = linea.split("#");
			String curso = temp[0];
			double pagoPorHoraExtra = Double.parseDouble(temp[1]);

			Profesor.setCurso(curso);
			Profesor.setPagoPorHoraExtra(pagoPorHoraExtra);
			System.out.println("Curso: " + curso);
			System.out.println("Precio hora extra: " + pagoPorHoraExtra);
		}
	}

	/*
	 * recibe una lista de profesores y los almacena en un fichero persistente único
	 * obj de la lista
	 */
	public static void grabarArrayListEnArchivoComoObjetos(ArrayList<Profesor> lista, File fichero) throws IOException {
		FileOutputStream fos = new FileOutputStream(fichero);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		// leeremos todos los objetos de la lista y los grabaremos como
		// objetos serializables
		os.writeObject(lista);
		os.close();
	}

	/* Recibe un fichero con objetos ArrayList y devuelve una lista */
	@SuppressWarnings("unchecked")
	public static ArrayList<Profesor> leerArrayListDearchivoDeObjetos(File fichero)
			throws FileNotFoundException, IOException {
		ArrayList<Profesor> lista = new ArrayList<Profesor>();
		FileInputStream f = new FileInputStream(fichero);
		ObjectInputStream os = new ObjectInputStream(f);
		try {
			lista = (ArrayList<Profesor>) os.readObject();
		} catch (EOFException e) {//fin de fichero
			os.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
}
