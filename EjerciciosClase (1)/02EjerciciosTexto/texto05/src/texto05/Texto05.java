package texto05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
Disponemos de un fichero de texto llamado enteros.txt que contiene números enteros. 
El siguiente programa lee los números y los muestra. Muestra también la cantidad de números 
leídos y su suma. 

Se utiliza el método hasNextInt() de Scanner para saber si quedan más enteros que 
leer en el fichero. 
La lectura acaba cuando no quedan más enteros (se ha llegado al final del fichero) o
cuando encuentra un carácter no válido como entero.
 */
public class Texto05 {

    public static void main(String[] args) {
        File f = new File("c:/ficheros/enteros.txt");
        int numero, suma = 0, cont = 0;
        Scanner entrada = null;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNextInt()) {
                   numero = entrada.nextInt();
                   System.out.println(numero);
                   suma = suma + numero;
                   cont++;                  
            }
            System.out.println("Número leídos: " + cont);
            System.out.println("Suma " + suma);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally{
            entrada.close();
        }
    }
}
