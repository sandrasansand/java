package ejercicio09;

import java.io.File;
import java.io.FilenameFilter;

/*Escriba un programa que muestre los nombres de los archivos con extensión 
 * “.java” contenidos en el directorio c:\misArchivos 
 */
public class Ejercicio09 
{

    public static void main(String[] args) 
    {
    String ruta = "\\MisArchivos";
    File directorio = new File(ruta);
    File ficheros[];
    ficheros = directorio.listFiles();
    for(int i=0; i<ficheros.length; i++)
    {
        if(ficheros[i].isFile())
        { 
            String name = ficheros[i].getName(); 
/*La función .lastIndexOf() nos devuelve la última posición, mediante un número entero,
  de una cadena o un carácter dentro de una cadena de texto nada. En el caso de que el 
  carácter o la cadena no exista se devuelve un -1. */            
            int dot = name.lastIndexOf('.'); 
            String base, extension;
            if (dot==-1)
            {
                base=name;
                extension="";
            }
            else
            {
                base=name.substring(0,dot);
                extension=name.substring(dot+1);
            };
            if (extension.equals("java")) 
            {    
                System.out.println(ficheros[i].getName());
            }
           /*String f[] = ficheros[i].getName().split("\\.");
           if(f[1].equals("java"))
            {
                System.out.println(ficheros[i].getName());
            }*/
        }
    }
    }
 
}
