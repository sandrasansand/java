package ejercicio14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Escriba un programa que verifique el funcionamiento de los tres ejercicios 
 * anteriores. */

public class Ejercicio14 
{
    public static void main(String[] args) 
    {
        String ruta = System.getProperty("user.dir");
        ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
        ruta += "\\";
        
        int referencias2[] = {1,2,3,4,5,6,7,8};
        double precios2[] = {200,61,34,480,50,120,245,38};
        File fichero5 = new File(ruta+"precios.txt");
        try {
            escribirArchivoPrecios(referencias2, precios2, fichero5);
            mostrarArchivoPrecios(fichero5);
            System.out.println();
            actualizarPrecios(fichero5);
            mostrarArchivoPrecios(fichero5);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void escribirArchivoPrecios(int referencias[], double precios[], File fichero)
                        throws IOException
    {
        FileWriter ficheroG = new FileWriter(fichero);
        int tamano = referencias.length;
        if(tamano == precios.length)
        {
            for(int i=0; i<tamano; i++)
            {
                ficheroG.write(referencias[i]+"->"+precios[i]+"\r\n");
            }
        }else{
            System.out.println("Error: Tamaños distintos");
        }
        ficheroG.close();
    }

    public static void actualizarPrecios(File fichero) throws IOException
    {
        BufferedReader ficheroL = new BufferedReader(new FileReader(fichero));
        String cadena = "";
        String temp[];
        String linea = ficheroL.readLine();
        while(linea!=null)
        {
            temp = linea.split("->");
            cadena += temp[0]+"->";
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

    public static void mostrarArchivoPrecios(File fichero) throws IOException
    {
        BufferedReader ficheroL = new BufferedReader(new FileReader(fichero));
        String linea = ficheroL.readLine();
        while(linea!=null)
        {
            System.out.println(linea);
            linea = ficheroL.readLine();
        }
        ficheroL.close();
    }    
}
