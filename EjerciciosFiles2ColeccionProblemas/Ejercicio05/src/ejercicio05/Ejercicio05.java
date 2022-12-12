package ejercicio05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Escriba un método que, de nombre mostrarArchivoPantalla, que reciba por parámetro
 * el nombre de un archivo de texto y lo muestre por pantalla. El método no capturará 
 * ninguna excepción.  MOSTRAR*/

public class Ejercicio05 
{

    public static void main(String[] args) 
    {
        String ruta = System.getProperty("user.dir");
        ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
        ruta += "\\";
        try 
        {
            System.out.println(ruta);
            mostrarArchivoPantalla(ruta + "cadenas.txt");
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void mostrarArchivoPantalla(String ruta) throws IOException
    {
        File fichero = new File(ruta);
        BufferedReader ficheroL;
        //un obj BfReader permite leer linea a linea le pasamos un obj fileRd
        ficheroL = new BufferedReader(new FileReader(fichero));
        String linea = ficheroL.readLine();
        while (linea!=null) 
        {
            System.out.println(linea);
            linea = ficheroL.readLine();
        }
        ficheroL.close();
    }
}
