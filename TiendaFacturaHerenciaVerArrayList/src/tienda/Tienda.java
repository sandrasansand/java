package tienda;

import java.util.ArrayList;

public class Tienda {

    public static void main(String[] args) 
    {
    //Creamos una lista de objetos Facturable    
    ArrayList<Facturable> facturas = new ArrayList<Facturable>();
    Facturable libro1=new Libro("Los tres mosqueteros","Dumas",10);
    Facturable libro2=new Libro("Guerra y Paz","Tolstoi",20);
    Facturable libro3=new Libro("El Jugador","Dostoievski",30);
    Facturable dvd1=new DVD("Indiana Jones","Harrison Ford",20);
    Facturable dvd2=new DVD("James Bond","Sean Connnery",40);
    Facturable dvd3=new DVD("Superman","Reeve",30);
    facturas.add(libro1);
    facturas.add(libro2);
    facturas.add(libro3);
    facturas.add(dvd1);
    facturas.add(dvd2);
    facturas.add(dvd3);
    
    System.out.println(dvd1);// llama a toString de DVD
    System.out.println();
    System.out.println("Inicio de Interface");
    
    Facturable libro4=new Libro("El Camino","Miguel Delibes",40);
    Facturable dvd4=new DVD("Batman","Michael Keaton",30);
    facturas.add(libro4);
    facturas.add(libro4);    
    libro4.ImprimeFactura();//llama a ImprimeFaactura de libro
    dvd4.ImprimeFactura();
    System.out.println();
    
    //añadimos herencia
     Facturable libro5;
     libro5=new Traduccion("Ana Karenina","Tolstoi",30,"Ruso");
     facturas.add(libro5);
     libro5.ImprimeFactura();//llama a ImprimeFactura de Libro
     
     System.out.println((Traduccion) libro5);//llama a toString de Traduccion
     
     System.out.println(libro5.toString());// lo mismo

     System.out.println();
     System.out.println("Imprimir lista: de facturas");
     for(Facturable f: facturas){
         f.ImprimeFactura();
     }
     
    }
}
