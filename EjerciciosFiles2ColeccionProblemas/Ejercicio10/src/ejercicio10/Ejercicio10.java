package ejercicio10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Escriba un método, de nombre copiarArchivo, que reciba por parámetro dos rutas 
correspondientes a un archivo de origen y a un archivo de destino. El método 
copiará el archivo origen en la ubicación de destino. La ruta de destino de destino
puede consistir en un directorio o un archivo. En el primer caso, el archivo se 
copiará al directorio especificado manteniendo su nombre. En el segundo, se tomará
como nombre del archivo copia el que especifique este parámetro. Además el método 
recibirá un tercer parámetro que actuará como flag en caso de que en la ruta de 
destino exista el fichero a copiar. Si el flag esta a true se sobrescribirá el fichero,
en caso contrario no se copiará nada y se generará una excepción 
DestinoProtegidoException.*/

public class Ejercicio10 
{

    public static void main(String[] args) 
    {
        String ruta = System.getProperty("user.dir");
        ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
        ruta += "\\";
                
        try 
        {
            copiarArchivo(new File(ruta + "copia1.txt"), new File(ruta + "copia2.txt"), false);
            copiarArchivo(new File(ruta + "copia1.txt"), new File(ruta + "copia2.txt"), true);
            copiarArchivo(new File(ruta + "copia1.txt"), new File(ruta + "copia\\copia2.txt"), true);
            copiarArchivo(new File(ruta + "copia1.txt"), new File(ruta + "copia\\"), true);
            copiarArchivo(new File(ruta + "copia1.txt"), new File(ruta + "copia\\"), false);
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        } catch (DestinoProtegidoException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void copiarArchivo(File origen, File destino, boolean sobreescribe)
                            throws IOException, DestinoProtegidoException
    {
        if(!destino.isDirectory())
        {//Si es un archivo
            if(destino.exists())
            {  //Si existe...
                if(sobreescribe)
                {  //Si se puede sobreescribir
                    BufferedReader origenL = new BufferedReader(new FileReader(origen));
                    FileWriter destinoG = new FileWriter(destino);
                    String linea = origenL.readLine();
                    while (linea!=null) 
                    {
                        destinoG.write(linea);
                        linea = origenL.readLine();
                    }
                    origenL.close();
                    destinoG.close();
                }else
                {      //Si no se puede sobreescribir
                    throw new DestinoProtegidoException("Fichero protegido");
                }
            }else
            {  //Si no exite...
                BufferedReader origenL = new BufferedReader(new FileReader(origen));
                FileWriter destinoG = new FileWriter(destino);
                String linea = origenL.readLine();
                while (linea!=null) 
                {
                    destinoG.write(linea);
                    linea = origenL.readLine();
                }
                origenL.close();
                destinoG.close();
            }
        }else
        { //Si es un directorio
            destino = new File(destino.getAbsolutePath()+"\\"+origen.getName());//Le damos el mismo nombre
            if(destino.exists())
            {
                if(sobreescribe)
                {
                    BufferedReader origenL = new BufferedReader(new FileReader(origen));
                    FileWriter destinoG = new FileWriter(destino);
                    String linea = origenL.readLine();
                    while (linea!=null) 
                    {
                        destinoG.write(linea);
                        linea = origenL.readLine();
                    }
                    origenL.close();
                    destinoG.close();
                }else
                {
                    throw new DestinoProtegidoException("Fichero protegido");
                }
            }else
            {
                BufferedReader origenL = new BufferedReader(new FileReader(origen));
                FileWriter destinoG = new FileWriter(destino);
                String linea = origenL.readLine();
                while (linea!=null) 
                {
                    destinoG.write(linea);
                    linea = origenL.readLine();
                }
                origenL.close();
                destinoG.close();
            }
        }
    }
}
