package ejercicio11;

/* Escriba un método, de nombre escribirArchivoPrecios, que reciba por parámetro 
 * un array de valores enteros correspondientes a referencias a artículos y un array
 * de valores reales correspondientes a los precios de los artículos. El método 
 * recibirá también el nombre de un archivo sobre le que se escribirá cada referencia
 * seguida de su precio. El método no capturará ninguna excepción.*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio11 
{

    public static void main(String[] args) 
    {
        String ruta = System.getProperty("user.dir");
        ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
        ruta += "\\";
        
        int referencias[] = {1,2,3,4,5,6,7,8};
        double precios[] = {200,61,34,480,50,120,245,38};
        File fichero = new File(ruta+"precios.txt");
        try 
        {
            escribirArchivoPrecios(referencias, precios, fichero);
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    public static void escribirArchivoPrecios
        (int referencias[], double precios[], File fichero) throws IOException
    {
        FileWriter ficheroG = new FileWriter(fichero);
        int tamano = referencias.length;
        if(tamano == precios.length)
        {
            for(int i=0; i<tamano; i++)
            {
                ficheroG.write(referencias[i]+"-"+precios[i]+"\r\n");
            }
        }else
        {
            System.out.println("Error: Tamaños distintos");
        }
        ficheroG.close();
    }  
}
