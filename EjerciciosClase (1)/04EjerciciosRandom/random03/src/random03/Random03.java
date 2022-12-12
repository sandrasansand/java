package random03;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
Ejemplo de uso de un fichero de caracteres con acceso aleatorio.
Se pide por teclado una palabra, la busca el fichero de texto texto.txt y la modifica
escribiéndola en mayúsculas cada vez que aparece en el fichero.

Para hacer el cambio de la palabra por su equivalente en mayúsculas, el programa 
lee el fichero por líneas. Para cada línea leída se comprueba si contiene la palabra 
buscada y si es así se modifica y se sobrescribe la línea completa modificada.
*/
public class Random03 {
        static RandomAccessFile fichero = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //RandomAccessFile fichero = null;
        String palabra, cadena;
        StringBuilder auxBuilder;
        long pos = 0;
        int indice;
        try {
            //se abre el fichero para lectura/escritura
            fichero = new RandomAccessFile("/ficheros/texto.txt", "rw");
            mostrarFichero();
            fichero.seek(0);//posicionarlo en el origen porque ahora está en el final
            //Se pide la palabra a buscar
            System.out.print("Introduce palabra: ");
            palabra = sc.nextLine(); 
            
            //lectura del fichero
            cadena = fichero.readLine(); //leemos la primera línea
            while(cadena!=null){         //mientras no lleguemos al final del fichero
                indice = cadena.indexOf(palabra); //buscamos la palabra en la línea leída
                while(indice!=-1){ //mientras la línea contenga esa palabra (por si está repetida)
                    //paso la línea a un StringBuilder para modificarlo
                    auxBuilder = new StringBuilder(cadena);  
                    //System.out.println(indice);
                    //System.out.println(indice+palabra.length());
                    auxBuilder.replace(indice, indice+palabra.length(),	palabra.toUpperCase());
                    cadena = auxBuilder.toString();
                    
                    //nos posicionamos al principio de la línea actual y se sobrescribe la 
                    //línea completa
                    //La posición donde empieza la línea actual la estoy guardando 
                    //en la variable pos
                    fichero.seek(pos);
                    fichero.writeBytes(cadena);
                    
                    //compruebo si se repite la misma palabra en la línea
                    indice = cadena.indexOf(palabra); 
                }
                pos = fichero.getFilePointer(); //posición de la línea actual que voy a leer
                cadena = fichero.readLine();    //lectura de la línea
            }
            mostrarFichero();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally {
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
        String cadena;
        try {
            fichero.seek(0); //nos situamos al principio
            cadena = fichero.readLine();
            while (cadena!=null) {//en este caso readLine devuelve nul cuando EOF
                System.out.println(cadena);  //se muestra en pantalla
                cadena = fichero.readLine();  //se lee  un entero del fichero fichero
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
