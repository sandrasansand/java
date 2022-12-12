package texto02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
Programa Java que lee el contenido del fichero creado en el ejemplo anterior.
*/
public class Texto02 {

    public static void main(String[] args) {
     FileReader fr = null;
        try {
//creamos un objeto FileReader conectado a un buffer. read() lee un solo caracter y readLine() una linea            
            fr = new FileReader("c:/ficheros/datos.txt");//probar con datos2 y ver que al no tener \n
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();//lee una cadena
            while (cadena != null) {
	        System.out.println(cadena);
                cadena = entrada.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}