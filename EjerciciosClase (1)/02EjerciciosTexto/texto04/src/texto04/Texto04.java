package texto04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
Programa que lee el contenido del fichero datos.txt utilizando la clase Scanner.
*/
public class Texto04 {

    public static void main(String[] args) {
        File f = new File("c:/ficheros/datos.txt");//probar datos2
        String cadena;
        Scanner entrada = null;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {//mientras quedan datos por leer
                cadena = entrada.nextLine();
                System.out.println(cadena);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally{
            entrada.close();
        }   
    }
}
