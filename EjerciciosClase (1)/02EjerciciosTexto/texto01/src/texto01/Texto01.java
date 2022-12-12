package texto01;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
Programa Java que lee texto por teclado y lo escribe en un fichero de texto. La lectura 
de texto por teclado acaba cuando se lee la cadena FIN.

PrintWriter tiene los métodos siguientes:
                 close() flush() format() printf() print() println() write() 
mientras FileWriter tiene los métodos siguientes:
                 close() flush()                                     write() 
 */
public class Texto01 {

    public static void main(String[] args) throws IOException{//IOException se añade en FileWriter
        Scanner sc = new Scanner(System.in);
//Con PrintWriter
        PrintWriter salida = null;
        try {// si el fichero existe crea uno nuevo
            salida = new PrintWriter("c:/ficheros/datos.txt");
            String cadena;
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();
            
            while (!cadena.equalsIgnoreCase("FIN")) {//no diferencia mayusculas y minusculas
                salida.println(cadena);//va añadiendo al fichero los nuevos caracteres
//println termina la línea actual escribiendo la cadena de separación de línea
                cadena = sc.nextLine();
                //System.out.println(cadena);
            }
            salida.flush();//vacia el buffer
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {          
            salida.close();//cierra la conexión
        }
//Con FileWriter
        FileWriter salida2 = null;
        try {// si el fichero existe crea uno nuevo
            salida2= new FileWriter("c:/ficheros/datos2.txt");
            String cadena;
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida2.write(cadena);//cambiamos println por write
// write escribe una cadena sin los caracteres especiales  return              
                cadena = sc.nextLine();
            }
            salida2.flush();//vacia el buffer
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {          
            salida2.close();//cierra la conexión
        }
    }
}
