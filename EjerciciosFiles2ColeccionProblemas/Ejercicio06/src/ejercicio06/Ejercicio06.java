package ejercicio06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Escriba un método, de nombre clasificadorPalabrasLongitud, que reciba por parámetro 
 * el nombre de un archivo que contendrá un conjunto de palabras, cada una en una línea.
 * El método también recibirá un valor entero que se utilizará como valor de corte para
 * clasificar las palabras. Se recibirán también los nombres de los dos archivos donde
 * quedarán almacenadas, respectivamente, las palabras con longitud menor al valor de 
 * corte y el resto de las palabras. El método no capturará ninguna excepción.*/

public class Ejercicio06 
{
    public static void main(String[] args) 
    {
        String ruta = System.getProperty("user.dir");
        ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
        ruta += "\\";

        try {
            clasificadorPalabrasLongitud(new File(ruta + "clasificar.txt"),
                                        6,
                                        new File(ruta + "clasificadasG.txt"),
                                        new File(ruta + "clasificadasP.txt"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void 
    clasificadorPalabrasLongitud(File lista, int corte, File mayor, File menor) throws IOException
    {
        BufferedReader listaL;
        listaL = new BufferedReader(new FileReader(lista));
        //escritura secuencia de caracteres  2 obj FileW uno mayor/menor
        FileWriter mayorG = new FileWriter(mayor);
        FileWriter menorG = new FileWriter(menor);
        String linea = listaL.readLine();
        while (linea!=null) {
            if(linea.length()<corte){
                System.out.println("menor: "+linea);
                menorG.write(linea+"\r\n");
            }else{
                System.out.println("mayor: "+linea);
                mayorG.write(linea+"\r\n");
            }
            linea = listaL.readLine();
        }
        listaL.close();
        mayorG.close();
        menorG.close();
    }
}
