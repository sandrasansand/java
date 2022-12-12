package ejercicio08;

import java.io.File;

/* Para los siguientes ejercicios se aconseja crear primero una carpeta en la unidad c:
 * del disco duro de nombre misArchivos. Se pide escribir un programa que muestre los
 * archivos y directorios contenidos en él. */

public class Ejercicio08 
{

    public static void main(String[] args) 
    {
        String ruta = System.getProperty("user.dir");
        ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
        ruta += "\\";
        
        File directorio = new File(ruta);
        String ficheros[];
        ficheros = directorio.list();
        for(int i=0;i<ficheros.length;i++)
        {
            System.out.println(ficheros[i]);
        }
    }
    
}
