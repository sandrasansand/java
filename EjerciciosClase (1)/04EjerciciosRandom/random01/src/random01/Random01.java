package random01;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
Programa Java que pide un número entero por teclado y lo añade al final de un fichero
binario enteros.dat que contiene números enteros. El programa utiliza un método mostrarFichero()
que se llama dos veces. La primera muestra el contenido del fichero antes de añadir el nuevo 
número y la segunda llamada muestra el fichero después de añadirlo. 
*/
public class Random01 {
    static Scanner sc = new Scanner(System.in);
    static RandomAccessFile fichero = null;

    public static void main(String[] args) {
        int numero;
        try {
            //se abre el fichero para lectura y escritura
            fichero = new RandomAccessFile("/ficheros/enteros.dat", "rw");
            mostrarFichero(); //muestra el contenido original del fichero
           // do{
            System.out.print("Introduce un número entero para añadir al final del fichero: ");
            numero = sc.nextInt(); //se lee el entero a añadir en el fichero
            fichero.seek(fichero.length()); //nos situamos al final del fichero
            fichero.writeInt(numero);       //se escribe el entero
            mostrarFichero();//muestra el contenido del fichero después de añadir el número
           // }while(numero>=0);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());//si no existe el fichero y abro r
        } catch (IOException ex) {
            System.out.println(ex.getMessage());//si el fichero esta en r y quiero grabar
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void mostrarFichero() {
        int n=1;
        try {
            fichero.seek(0); //nos situamos al principio
            while (true) {//la salida se produce por EOF no por true
                n = fichero.readInt();  //se lee  un entero del fichero
                System.out.println(n);  //se muestra en pantalla
            }
        } catch (EOFException e) {//excepcion de fin de fichero
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
