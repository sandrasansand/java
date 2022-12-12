package files06;

import java.io.File;
import java.io.FilenameFilter;
/**
El programa que utiliza el filtro para mostrar archivos que tienen una extensión determinada, 
en este caso los que tienen la extensión .pdf
*/
public class Files06 {
    public static void main(String[] args) {
        File ruta = new File("c:/ficheros/teoria");
        System.out.println("Archivos .pdf en el directorio " + ruta.getAbsolutePath());
        String[] lista = ruta.list(new Filtro(".pdf")); //se crea el filtro y se le pasa a list
        if (lista == null) {
            System.out.println("Total: 0 archivos");
        } else {
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
            System.out.println("Total: " + lista.length);
        }
    }
//Un filtro es un objeto de una clase que implementa el interface FilenameFilter  
    public static class Filtro implements FilenameFilter {
        String extension;
        Filtro(String extension) {
            this.extension = extension;
        }
//implementación del método accept del interface
//recibe el directorio donde se encuentra el archivo (objeto File) y el nombre del archivo (String)
//Prueba si se debe incluir un archivo especificado en una lista de archivos.        
        @Override
        public boolean accept(File ruta, String nombre) {
//endsWith es un metodo de la clase String que comprueba si la cadena termina con 
//el sufijo pasado como parámetro.   
            return nombre.endsWith(extension);
        }
    }
}
