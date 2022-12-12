package ejercicio01;
/* Escriba un programa que escriba los 100 primeros números naturales en un
 archivo de nombre numNaturales.txt */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 
{

    public static void main(String[] args) 
    {
    //leemos el directorio del programa, vamos uno atras y colgamos el fichero  
    String ruta = System.getProperty("user.dir");
    ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
    ruta += "\\";

    File directorio = new File(ruta+"numNaturales.txt"); //Definimos el archivo
    FileWriter fichero = null;//Definimos flujo para guardar

    try 
    {//Abrimos el flujo sobre el fichero a escribir. Si exite MACHACA, si no existe CREA
        fichero = new FileWriter(directorio); 
        int i=0;
        for(i=1;i<100;i++)
        {//Guardamos los datos al final de lo existente
            fichero.write(i+"\r\n"); 
        }
        fichero.write(i+""); //Meto último dato sin el \r\n
    } catch (IOException ex) 
    {
        System.out.println(ex.getMessage());
    } finally 
    {
        try 
        {
            fichero .close(); //Cerramos fichero
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
}
}
