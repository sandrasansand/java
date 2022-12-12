package pkgejercicio07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* Escriba un método, de nombre ordenarArchivoAlfab, que reciba por parámetro el nombre
 * de un archivo para dejar sus líneas ordenadas alfabéticamente. La ordenación se 
 * realizará sin tener en cuenta que las letras en mayúsculas preceden a las minúsculas 
 * en el código Unicode.*/

public class Main 
{

    public static void main(String[] args) 
    {
        String ruta = System.getProperty("user.dir");
        ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
        ruta += "\\";


        File fichero = new File(ruta+"ordenarAlf.txt");
        try 
        {
            ordenarArchivoAlfab(fichero);
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    
        public static void ordenarArchivoAlfab(File fichero) throws IOException
        {
        ArrayList<String> lista = new ArrayList<String>();
        BufferedReader ficheroL;
        ficheroL = new BufferedReader(new FileReader(fichero));
        String linea = ficheroL.readLine();
        while (linea!=null) {
            lista.add(linea);
            linea = ficheroL.readLine();
        }
        ficheroL.close();
        
/* Para ordenar este ArrayList de menor a mayor, vamos a utilizar el método “sort” 
 * de la clase Collections:
 * Collections.sort(arrayListInt);
 * Con este método nos devolverá el ArrayList ordenado de menor a mayor, siendo la salida
 * la siguiente (en el proyecto que os podéis descargar, podéis ver los método que 
 * imprimen por pantalla los ArrayList) */
        
        Collections.sort(lista,String.CASE_INSENSITIVE_ORDER);
        FileWriter ficheroG = new FileWriter(fichero);
        Iterator it = lista.iterator();
        while(it.hasNext())
        {
            ficheroG.write((String)it.next()+"\r\n");
        }
        ficheroG.close();
    }


}
