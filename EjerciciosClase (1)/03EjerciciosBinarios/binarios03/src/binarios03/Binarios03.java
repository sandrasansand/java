package binarios03;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
Programa que lee el contenido del fichero creado en el Ejemplo 1. Utilizaremos un bucle 
infinito para leer los datos. Cuando se llega al final del fichero se lanza la excepción 
EOFException que se utiliza para salir del bucle while. 
*/
public class Binarios03 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int n;
        try {
            fis = new FileInputStream("/ficheros/datos.dat");
            entrada = new DataInputStream(fis);
            while (true) {    
                n = entrada.readInt();  //se lee  un entero del fichero
                System.out.println(n);  //se muestra en pantalla
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) { 
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
