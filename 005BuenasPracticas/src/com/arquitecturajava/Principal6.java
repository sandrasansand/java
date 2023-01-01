package com.arquitecturajava;

import java.io.File;

public class Principal6 {

	public static void main(String[] args) {

		File fichero = new File("./src");

		File[] ficheros = fichero.listFiles();

		for (File f : ficheros) {
//invoco el método recursivo
			imprimir(f);
		}

	}

	private static void imprimir(File fichero) {

		if (fichero.isDirectory()) {
			
			for (File f : fichero.listFiles()) {

				//que hacemos aqui emplear recursividad
				imprimir(f);
				
			}
			
		}else {
			System.out.println(fichero.getName());
			
		}
		
		

	}

}
