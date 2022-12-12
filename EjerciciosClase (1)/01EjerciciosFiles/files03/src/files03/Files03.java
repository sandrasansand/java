package files03;

import java.io.File;
import java.io.IOException;
/**
Programa que muestra el contenido de un directorio. En el ejemplo se muestra el contenido 
del directorio actual.  Y un segundo directorio C:/ficheros
*/
public class Files03 {

    public static void main(String[] args) throws IOException  {
        File directorio = new File(".");  //directorio actual
        //File directorio = new File("../");  //directorio padre
        //devuelve un array de String con el nombre de los ficheros y directorios
        String[] lista = directorio.list();
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }        
         System.out.println("Directorio absoluto: "+directorio.getAbsolutePath()); //ruta completa del directorio actual
         System.out.println("Directorio canónico: " +directorio.getCanonicalPath());//ruta completa del directorio actual
        //diretorio c:/ficheros
        File directorio2 = new File("c:/ficheros");  //directorio ficheros
        String[] lista2 = directorio2.list();
        for (int i = 0; i < lista2.length; i++) {
            System.out.println(lista2[i]);
        }        
         System.out.println("Directorio absoluto: "+directorio2.getAbsolutePath()); //ruta completa del directorio actual
    
    }
}
    
