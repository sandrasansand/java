package ejercicio15_21;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

// Ejercicio 15
public class PruebaFlujos2 
{
    //graba una lista de puntos como unicode utilizando separadores
    //recibe una lista de puntos y el nombre del fichero donde grabarlos
    public static void almacenarColPuntosEnArchivo(ArrayList<Punto> lista, File fichero) throws IOException
    {
        FileWriter f = new FileWriter(fichero);
        //Iterator permite desplazarse a través de una colección de objetos
        Iterator it = lista.iterator();
        while(it.hasNext())//devuelve true si quedan mas elementos
        {
            Punto punto = (Punto)it.next();//lee el siguiente objeto punto de la lista
            f.write(punto.obtenerCoordX()+"#");//se coloca el caracter # como separador
            f.write(punto.obtenerCoordY()+"#");
            f.write(punto.obtenerColor()+"\r\n");//final de registro
        }
        f.close();
    }
//Ejercicio 16
    //recibe un fichero y devuelve una lista de puntos
    public static ArrayList<Punto> obtenerArrayListDeArchivo(File fichero) throws IOException
    {
        BufferedReader ficheroL = new BufferedReader(new FileReader(fichero));
        ArrayList<Punto> lista = new ArrayList<Punto>();
        String temp[];
        String linea = ficheroL.readLine();
        while(linea != null)
        {
            temp = linea.split("#");
            lista.add(new Punto(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), temp[2]));
            linea = ficheroL.readLine();
        }
        return lista;
    }
//Ejercicio 18
    // recibe una lista de puntos y los almacena en un fichero persistente
    public static void almacenarColPuntosComoObjetos(ArrayList<Punto> lista, File fichero) throws IOException{        //Hay que hacer la clase Punto serializable
        //crea un fichero de salida y despues de objetos
        FileOutputStream fos=new FileOutputStream(fichero);
        ObjectOutputStream os=new ObjectOutputStream(fos);
        Iterator it = lista.iterator();
        while(it.hasNext())
        {
            Punto punto = (Punto)it.next();//graba la lista de puntos como objetos
            os.writeObject(punto);
        }
        os.close();
    }
//Ejercicio 19
    //recibe un fichero con objetos y crea una lista de objetos que devuelve
    public static ArrayList<Punto> obtenerArrayListDeArchivoComoObjeto(File fichero) throws IOException{
        ArrayList<Punto> lista = new ArrayList<Punto>();
        FileInputStream fos=new FileInputStream(fichero);
        ObjectInputStream os=new ObjectInputStream(fos);
        try
        {
            while(true)
            {
                lista.add((Punto)os.readObject());
            }
        }catch (EOFException ex) 
        { //Con esto detectamos que estamos al final
            os.close();
        }catch (ClassNotFoundException ex) 
        {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
// Ejercicio 20
    // graba todo el ArrayList que recibe como un archivo
    public static void escribirArrayListEnArchivo(ArrayList<Punto> lista, File fichero) throws IOException{
        FileOutputStream fos=new FileOutputStream(fichero);
        ObjectOutputStream os=new ObjectOutputStream(fos);
        os.writeObject(lista); 
        os.close();
    }
//Ejercicio 21
    // recibe un fichero que es un arraylist de objetos y lo convierte en una lista
    public static ArrayList<Punto> leerArrayListDeArchivo(File fichero) throws Exception{
        ArrayList lista = new ArrayList();
        FileInputStream fos=new FileInputStream(fichero);
        ObjectInputStream os=new ObjectInputStream(fos);
        lista = (ArrayList) os.readObject();//Solo hay que leer un objeto porque sabemos que solo hay uno
        os.close();
        return lista;
    }
}
