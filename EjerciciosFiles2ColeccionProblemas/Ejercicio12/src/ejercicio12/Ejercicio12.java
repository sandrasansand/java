package ejercicio12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Escriba un método, de nombre actualizarPrecios, que reciba por parámetro el nombre 
 * de un archivo que almacena un conjunto de parejas de valores correspondientes a una
 * referencia y su precio. El método actualizará los precios de forma que los superiores
 * a 100€ se decrementen en un 50% y los inferiores se incrementen en un 50%. El método 
 * capturará y tratará todas las excepciones que pueda producirse.
Nota: Es importante tener en cuenta que todos los desplazamientos dentro del fichero 
* se realizan en términos de bytes. ( 8 bytes ocupa un valor de tipo double).*/

public class Ejercicio12 
{
    public static void main(String[] args) 
    {
        String ruta = System.getProperty("user.dir");
        ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
        ruta += "\\";
        
        File fichero3 = new File(ruta+"precios.txt");
        try 
        {
            actualizarPrecios(fichero3);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void actualizarPrecios(File fichero) throws IOException
    {
        BufferedReader ficheroL = new BufferedReader(new FileReader(fichero));
        String cadena = "";
        String temp[];
        String linea = ficheroL.readLine();
        while(linea!=null)
        {
            temp = linea.split("-");
            cadena += temp[0]+"-";
            if(Double.parseDouble(temp[1])>100)
            {
                cadena += Double.toString(Double.parseDouble(temp[1])/2);
            }else
            {
                cadena += Double.toString(Double.parseDouble(temp[1])*2);
            }
            cadena += "\r\n";
            linea = ficheroL.readLine();
        }
        ficheroL.close();
        FileWriter ficheroG = new FileWriter(fichero);
        ficheroG.write(cadena);
        ficheroG.close();
    }    
}
