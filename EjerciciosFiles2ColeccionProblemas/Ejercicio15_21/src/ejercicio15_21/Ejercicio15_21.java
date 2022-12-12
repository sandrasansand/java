package ejercicio15_21;
/* 15. Considere la clase Punto que se adjunta
 * Se pide escribir una clase, de nombre PruebaFlujos2, donde se defina un método
 * estático de nombre almacenarColPuntosEnArchivo que reciba una colección de objetos
 * de la clase Punto. El método también recibirá por parámetro el nombre del archivo
 * donde almacenará los objetos de la colección. El método no capturará ninguna excepción.
 * 16. Añada a la clase anterior un método estático, de nombre obtenerArrayListDeArchivo,
 * que reciba por parámetro el nombre del archivo con los datos correspondientes a varios
 * objetos de la clase Punto. El método construirá y devolverá un objeto ArrayList<Punto>
 * con los datos obtenidos del fichero. El método no capturará ninguna excepción.
17. Añada a la clase anterior un método main() para comprobar el funcionamiento de los
* métodos estáticos de los dos ejercicios anteriores. Se crearán varios objetos Puntos 
* que se almacenaran en un array. A partir del array se obtendrá una colección para
* guardar sus elementos en un archivo. Para finalizar se obtendrá un objeto ArrayList<Punto>
* con los Puntos creados a partir de los datos almacenados en el archivo.
18. Escriba un método, de nombre almacenarColPuntosComoObjetos, que reciba por parámetro
* una colección de objetos Punto y el nombre del archivo donde se almacenarán.
* El método escribirá directamente cada objeto Punto al archivo.
19. Escriba un método, de nombre obtenerArrayListDeArchivoComoObjeto, que reciba por
* parámetro el nombre de un archivo donde se encuentran almacenados objetos de la clase
* Punto. El método leerá los objetos del archivo y los almacenará en un ArrayList que,
* finalmente será devuelto.
20. Escriba un método, de nombre escribirArrayListEnArchivo, que reciba por parámetro
* un objeto de ArrayList de objetos Puntos, así como el nombre del archivo donde será
* almacenado. El método almacenará directamente el objeto ArrayList. No se capturará
* ninguna excepción que pueda producirse.
21. Escriba un método, de nombre leerArrayListDeArchivo, que reciba por parámetro el
* nombre de un archivo que contiene un objeto ArrayList que almacena objetos de la clase
* Punto. El método leerá el objeto ArrayList del archivo y lo devolverá. No se capturará
* ninguna excepción que pueda producirse.
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio15_21 
{

public static void main(String[] args) 
{
    String ruta = System.getProperty("user.dir");
//se queda con el path actual y le quitamos el último \directorio
    ruta = ruta.substring(0, ruta.lastIndexOf("\\"));
    ruta += "\\";//le añadimos el caracter \

//Ejercicio 17
    System.out.println("Se almacena como texto unicode");
    ArrayList<Punto> lista1 = new ArrayList<Punto>();
    ArrayList<Punto> lista2 = new ArrayList<Punto>();
    //creamos tres puntos y los metemos en la lista
    lista1.add(new Punto(1,2,"rojo"));
    lista1.add(new Punto(3,7,"verde"));
    lista1.add(new Punto(4,1,"azul"));
    // creamos y abrimos un fichero de texto puntos1.txt
    File fichero = new File(ruta+"puntos1.txt");
    try 
    {   //convierte la lista en un fichero (ejercicio 16)
        PruebaFlujos2.almacenarColPuntosEnArchivo(lista1, fichero);
        //envía el fichero y recibe una lista2 (ejercicio 17)
        lista2=PruebaFlujos2.obtenerArrayListDeArchivo(fichero);
    } catch (IOException ex) 
    {
        System.out.println(ex.getMessage());
    }
    //leemos la lista de objetos y la imprimimos
    Iterator it = lista2.iterator();
    while(it.hasNext())//comprueba si quedan objetos
    {
        System.out.println(it.next());//lee el siguiente objeto y lo imprime
    }
    System.out.println();

//Ejercicios 18 a 19
    System.out.println("Se almacena cada elemento de la lista como objeto");
    ArrayList<Punto> lista3 = new ArrayList<Punto>();
    ArrayList<Punto> lista4 = new ArrayList<Punto>();
    lista3.add(new Punto(1,2,"rojo"));
    lista3.add(new Punto(3,7,"verde"));
    lista3.add(new Punto(4,1,"azul"));
    File fichero2 = new File(ruta+"puntos2.txt");
    try 
    {   //convierte la lista en un fichero de objetos (ejercicio 18)
        PruebaFlujos2.almacenarColPuntosComoObjetos(lista3, fichero2);
        //recibe un archivo y devuelve una lista4 de objetos
        lista4=PruebaFlujos2.obtenerArrayListDeArchivoComoObjeto(fichero2);
    } catch (IOException ex) 
    {
        System.out.println(ex.getMessage());
    }
    Iterator it2 = lista4.iterator();
    while(it2.hasNext())
    {
        System.out.println(it2.next());
    }

 // Ejercicios 20 a 21
    System.out.println();
    System.out.println("Se almacena como único elemento la lista");
    ArrayList<Punto> lista5 = new ArrayList<Punto>();
    ArrayList<Punto> lista6 = new ArrayList<Punto>();
    lista5.add(new Punto(1,2,"rojo"));
    lista5.add(new Punto(3,7,"verde"));
    lista5.add(new Punto(4,1,"azul"));
    File fichero3 = new File(ruta+"puntos3.txt");
    try {
        PruebaFlujos2.almacenarColPuntosComoObjetos(lista5, fichero3);
        lista6=PruebaFlujos2.obtenerArrayListDeArchivoComoObjeto(fichero3);
    } catch (IOException ex) 
    {
        System.out.println(ex.getMessage());
    }
    Iterator it3 = lista6.iterator();
    while(it3.hasNext())
    {
        System.out.println(it3.next());
    }
    
}
}
