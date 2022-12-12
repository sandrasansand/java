package ejercicio02;
/* Escriba un método, de nombre obtenerSumaNumerosArchivo, que reciba por parámetro
 * el nombre de un archivo que almacenará una serie de cantidades enteras y 
 * positivas. El método leerá todos los valores del archivo, calculará su suma y 
 * la devolverá. No se capturará ninguna excepción. */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 
{
    public static void main(String[] args) 
    {
    String ruta = System.getProperty("user.dir");  //leemos directioro user del ficehro
    ruta = ruta.substring(0, ruta.lastIndexOf("\\")); // y lo colgamos uno atras
    ruta += "\\";

    File fichero = new File(ruta+"numNaturales.txt");  // defino el fichero que es un objeto de tipo file
    try {
        System.out.println(obtenersumaNumerosFichero(fichero));
    } catch (FileNotFoundException ex) 
    {
        System.out.println(ex.getMessage());
    } catch (IOException ex) 
    {
        System.out.println(ex.getMessage());
    }
    }
    
    public static int obtenersumaNumerosFichero(File fichero) 
            throws FileNotFoundException, IOException
    {
        BufferedReader ficheroL;
        int suma=0;
        //Fichero -> Buffer -> Objeto File
        ficheroL = new BufferedReader(new FileReader(fichero));     
        String linea = ficheroL.readLine(); //Leemos primera linea
        while (linea != null) 
        { //Hasta terminar fichero
            suma += Integer.parseInt(linea); //Suma cada linea
            linea = ficheroL.readLine();//Lee siguiente linea
        }
        ficheroL.close();
        return suma;
    }    
}
