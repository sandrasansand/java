package ejercicio13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Escriba un método, de nombre mostrarArchivoPrecios, que reciba por parámetro el
 * nombre de un archivo que almacena una serie de referencias y precios de artículos.
 * El método leerá los valores el archivo y los mostrará por pantalla.*/

public class Ejercicio13 
{
    public static void main(String[] args) 
    {
        String ruta = System.getProperty("user.dir");
        ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
        ruta += "\\";
        
        File fichero = new File(ruta+"precios.txt");
        try 
        {
            mostrarArchivoPrecios(fichero);
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    public static void mostrarArchivoPrecios(File fichero) throws IOException
    {
        BufferedReader ficheroL = new BufferedReader(new FileReader(fichero));
        String temp[];
        String linea = ficheroL.readLine();// lee hasta final de registro \r\n
        while(linea!=null)
        {
            temp = linea.split("-");//divide en el caracter - temp[0], temp[1]..
            System.out.println(temp[0]+" --- "+ temp[1]);
            linea = ficheroL.readLine();
        }
        ficheroL.close();
    }  
}
