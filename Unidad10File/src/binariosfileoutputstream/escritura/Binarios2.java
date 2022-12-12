package binariosfileoutputstream.escritura;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Programa Java que crea una matriz de elementos de tipo double y lee por teclado el
valor de sus elementos. A continuación escribe el contenido de la matriz en un
fichero. Al principio del fichero se escriben dos enteros con los valores del número
de filas y columnas de la matriz. Metodo escritura write()

*/
public class Binarios2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;//exc FileNotFound
		// a partir de un obj fileOutputStream se puede crear un DataOutput para
		// escribir datos tipo primitivo
		DataOutputStream salida = null; //IOException
		double[][] matriz;
		int filas, columnas, i, j;
		do {
			System.out.println("número de filas");
			filas = sc.nextInt();
		} while (filas <= 0);
		do {
			System.out.println("Número de columnas: ");
			columnas = sc.nextInt();
		} while (columnas <= 0);

		matriz = new double[filas][columnas];// se crea la matriz con f c

		for (i = 0; i < filas; i++) {// lectura de datos por teclado
			for (j = 0; j < columnas; j++) {
				System.out.println("matriz [" + i + "]" + "[" + j + "]:");
				matriz[i][j] = sc.nextDouble();
			}
		}
		try {
//crear el fichero de salida
			fos = new FileOutputStream("/ficheros/matriz.dat");// arroja exception FileNotFoundException
			salida = new DataOutputStream(fos);
//escribir numero de filas y columnas
			salida.writeInt(filas);
			salida.writeInt(columnas);
//escribir matriz en el fichero
			for (i = 0; i < filas; i++) {// lectura de datos por teclado
				for (j = 0; j < columnas; j++) {
					salida.writeDouble(matriz[i][j]);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				if (fos != null) {
					fos.close();

				}
				if (salida != null) {
					salida.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
