package filenamefilter;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		File ruta = new File("temas/teoria");
		System.out.println("Archivos .pdf en el directorio " + ruta.getAbsolutePath());
		String[]lista = ruta.list(new Filtro(".pdf"));//se crea el filtro y se le pasa a la lista
		if (lista == null) {
			System.out.println("Total de archivos : o");
		} else {
			for (String string : lista) {
				System.out.println(string);
			}
			System.out.println("Total " + lista.length);
		}
	
	}

}
