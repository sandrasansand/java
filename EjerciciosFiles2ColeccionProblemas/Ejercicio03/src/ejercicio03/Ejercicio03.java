package ejercicio03;
/* Escriba un método, de nombre escribirCadenasEnArchivo, que reciba un array de cadenas de caracteres
 * y vuelque su contenido a un archivo cuyo nombre también se recibirá por parámetro. Las cadenas 
 * quedarán separadas en el archivo por un asterisco. El método no capturará ninguna excepción que pueda
 * producirse.*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 
{
    public static void main(String[] args) 
    {
    String ruta = System.getProperty("user.dir");
    ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
    ruta += "\\";
    
    String lista[] = new String[6];
    lista[0]="hola";
    lista[1]="que";
    lista[2]="tal";
    lista[3]="¿como";
    lista[4]="estas?";
    lista[5]="adios";
    try {
        escribirCadenasEnArchivo(ruta, "cadenas.txt", lista);
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
    }
    
    public static void escribirCadenasEnArchivo(String ruta, String nombre, String[] lista)
            throws IOException
    {
        File fichero = new File(ruta+nombre);
        FileWriter f = new FileWriter(fichero);
        for(int i=0;i<lista.length;i++)
        {
            if(i!=lista.length-1)
            {
                f.write(lista[i]+"*");
            }else
            {
                f.write(lista[i]);
            }
        }
        f.close();
    }
}
