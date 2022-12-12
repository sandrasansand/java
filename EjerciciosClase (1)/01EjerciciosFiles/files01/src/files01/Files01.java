package files01;

import java.io.File;
import java.io.IOException;
/**
Se crea un objeto File ruta asociado al directorio c:/ficheros y un objeto File f asociado 
al fichero datos.txt que se encuentra en ese directorio. 
Si el fichero no existe se crea y si el directorio no existe se crea y a continuación se 
crea el fichero. Si el fichero existe se muestra el tamaño del mismo.
 */
public class Files01 {
/*NOTA si marcamos el path con / java lo interpreta como \ por ser caracter especial
 * otro modo sería poner \\
 */
    public static void main(String[] args) throws IOException  {
    //el objeto fichero o ruta se crea indepedientemente de la existencia del fichero o ruta   
      //File ruta = new File("c:/ficheros/");
        File ruta = new File("../ficheros");//crea un objeto con una ruta
        File f = new File(ruta, "datos.txt");//crea un objeto fichero en la ruta
        System.out.println("Ruta absoluta:  " +f.getAbsolutePath()); //ruta completa del objeto creado
        System.out.println("Ruta canonica:  " +f.getCanonicalPath()); //ruta completa del objeto creado
        System.out.println("Directorio padre: "+f.getParent()); //directorio padre de datos.txt completo
        System.out.println(ruta.getAbsolutePath());
        System.out.println(ruta.getParent());
        if (!f.exists()) { //se comprueba si el fichero y ruta existe o no
            System.out.println("Fichero " + f.getName() + " no existe");
            if (!ruta.exists()) {  //se comprueba si la ruta existe o no
                System.out.println("El directorio " + ruta.getName() + " no existe");
                if (ruta.mkdir()) { //se crea la ruta si no existe. Si se ha creado correctamente 
                    //solo un nivel. con mkdirs() se crean todos los niveles que falten
                    System.out.println("Directorio creado");
                    if (f.createNewFile()) {  //se crea el fichero. Si se ha creado correctamente
                        System.out.println("Fichero " + f.getName() + " creado");
                    } else {
                        System.out.println("No se ha podido crear " + f.getName());
                    }
                } else {
                    System.out.println("No se ha podido crear " + ruta.getName());
                }
            } else {  //si la ruta existe creamos el fichero
                if (f.createNewFile()) {
                    System.out.println("Fichero " + f.getName() + " creado");
                } else {
                    System.out.println("No se ha podido crear " + f.getName());
                }
            }
        } else { //el fichero existe. Mostramos el tamaño
            System.out.println("Fichero " + f.getName() + " existe");
            System.out.println("Tamaño " + f.length() + " bytes");
        }
    }
}
